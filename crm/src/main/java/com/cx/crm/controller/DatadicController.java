package com.cx.crm.controller;


import com.cx.base.BaseController;
import com.cx.base.ResultInfo;
import com.cx.crm.pojo.Datadic;
import com.cx.crm.query.DataDicQuery;
import com.cx.crm.service.DatadicService;
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
 * @since 2024-05-12
 */
@Controller
@RequestMapping("/dataDic")
public class DatadicController extends BaseController {

    @Resource
    private DatadicService datadicService;

    @GetMapping("index")
    public String index() {
        return "dataDic/dataDic";
    }

    @ApiOperation("字典列表")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryDataDicByParams(DataDicQuery dataDicQuery) {
        return datadicService.queryDataDicByParams(dataDicQuery);
    }

    @ApiOperation("转发到更新或添加页面")
    @GetMapping("addOrUpdateDataDicPage")
    public String addOrUpdateSaleChancePage(Integer id, Model model) {
        if (null != id) {
            model.addAttribute("DataDic", datadicService.getById(id));
        }
        return "dataDic/add_update";
    }

    @ApiOperation("新增")
    @PostMapping("save")
    @ResponseBody
    public ResultInfo saveDataDic(Datadic datadic) {
        //保存记录
        datadicService.saveDataDic(datadic);
        return success("数据添加成功");
    }

    @ApiOperation("更新内容")
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateDataDic(Datadic datadic) {
        datadicService.updateDataDic(datadic);
        return success("数据更新成功");
    }

    @ApiOperation("删除记录")
    @PostMapping("delete")
    @ResponseBody
    public ResultInfo deleteDataDic(Integer[] ids) {
        datadicService.deleteDataDic(ids);
        return success("数据删除成功!");
    }
}
