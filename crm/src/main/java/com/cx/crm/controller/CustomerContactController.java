package com.cx.crm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cx.base.BaseController;
import com.cx.base.ResultInfo;
import com.cx.crm.pojo.CustomerContact;
import com.cx.crm.query.CustomerContactQuery;
import com.cx.crm.service.CustomerContactService;
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
 * @since 2024-05-01
 */
@Controller
@RequestMapping("/customer_contact")
public class CustomerContactController extends BaseController {

    @Resource
    private CustomerContactService customerContactService;

    @ApiOperation("交往记录管理")
    @GetMapping("customerContactPage")
    public String customerContactPage(Integer cid, Model model) {
        model.addAttribute("customerContact", customerContactService.getOne(new QueryWrapper<CustomerContact>().eq("cus_id", cid)));
        model.addAttribute("cusId", cid);
        return "customerContact/customer_contact";
    }

    @ApiOperation("添加/更新页")
    @GetMapping("addOrUpdateCustomerContactPage")
    public String addOrUpdateCustomerContactPage(Integer cusId, Integer id, Model model) {
        model.addAttribute("customerContact", customerContactService.getById(id));
        //传入客户id，如果是add操作需要该参数
        model.addAttribute("cusId", cusId);
        //System.out.println(customerService.getById(id));
        return "customerContact/add_update";
    }

    @ApiOperation("查询所有交往记录")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryCustomersByParams(CustomerContactQuery customerContactQuery) {
        //System.out.println("=========="+customerContactService.selectAll(customerContactQuery));
        return customerContactService.selectAll(customerContactQuery);
    }

    @ApiOperation("添加记录")
    @PostMapping("save")
    @ResponseBody
    public ResultInfo saveCustomer(CustomerContact customerContact) {
        customerContactService.saveCustomerContact(customerContact);
        return success("客户交往记录添加成功!");
    }

    @ApiOperation("编辑交往记录")
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateCustomer(CustomerContact customerContact) {
        System.out.println(customerContact);
        customerContactService.updateCustomerContact(customerContact);
        return success("客户记录更新成功!");
    }

    @ApiOperation("删除记录")
    @PostMapping("delete")
    @ResponseBody
    public ResultInfo deleteCustomer(Integer id) {
        customerContactService.deleteCustomerContact(id);
        return success("客户记录删除成功!");
    }

}
