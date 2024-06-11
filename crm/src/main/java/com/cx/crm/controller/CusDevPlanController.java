package com.cx.crm.controller;


import com.cx.base.BaseController;
import com.cx.base.ResultInfo;
import com.cx.crm.pojo.CusDevPlan;
import com.cx.crm.query.CusDevPlanQuery;
import com.cx.crm.service.CusDevPlanService;
import com.cx.crm.service.SaleChanceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @since 2024-05-17
 */

@RequestMapping("/cus_dev_plan")
@Controller
public class CusDevPlanController extends BaseController {

    @Resource
    private SaleChanceService saleChanceService;

    @Resource
    private CusDevPlanService cusDevPlanService;


    @ApiOperation("营销开发页")
    @GetMapping("index")
    public String index() {
        return "cusDevPlan/cus_dev_plan";
    }


    //获取当前用户的分配项的数据
    @ApiOperation("点击(详情/完成)弹出显示框的数据")
    @GetMapping("toCusDevPlanDataPage")
    public String toCusDevPlanDataPage(Integer sid, Model model) {
        model.addAttribute("saleChance", saleChanceService.getById(sid));
        return "cusDevPlan/cus_dev_plan_data";
    }

    @ApiOperation("条件查询")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryCusDevPlansByParams(CusDevPlanQuery cusDevPlanQuery) {
        return cusDevPlanService.queryCusDevPlansByParams(cusDevPlanQuery);
    }


    @ApiOperation("添加计划工作")
    @PostMapping("save")
    @ResponseBody
    public ResultInfo saveCusDevPlan(CusDevPlan cusDevPlan) {
        cusDevPlanService.saveCusDevPlan(cusDevPlan);
        return success("计划项数据添加成功");
    }

    @ApiOperation("更新计划项")
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateCusDevPlan(CusDevPlan cusDevPlan) {
        cusDevPlanService.updateCusDevPlan(cusDevPlan);
        return success("计划项数据更新成功");
    }

    @ApiOperation("删除计划项")
    @PostMapping("delete")
    @ResponseBody
    public ResultInfo deleteCusDevPlan(Integer id) {
        cusDevPlanService.deleteCusDevPlan(id);
        return success("计划项数据删除成功");
    }


    @ApiOperation("获得当前用户的计划数据（详情/开发选项）")
    @GetMapping("addOrUpdateCusDevPlanPage")
    public String addOrUpdateCusDevPlanPage(Integer sid, Integer id, Model model) {
        model.addAttribute("sid", sid);
        model.addAttribute("cusDevPlan", cusDevPlanService.getById(id));
        return "cusDevPlan/add_update";
    }

}
