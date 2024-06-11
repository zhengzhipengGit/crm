package com.cx.crm.controller;

import com.cx.base.BaseController;
import com.cx.base.ResultInfo;
import com.cx.crm.pojo.CustomerReprieve;
import com.cx.crm.query.CustomerReprQuery;
import com.cx.crm.service.CustomerReprieveService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("customer_rep")
public class CustomerReprieveController extends BaseController {

    @Resource
    private CustomerReprieveService customerReprService;

    @ApiOperation("暂缓流失客户列表")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryCustomerReprsByParams(CustomerReprQuery customerReprQuery) {
        return customerReprService.queryCustomerReprsByParams(customerReprQuery);
    }


    @ApiOperation("添加暂缓记录")
    @PostMapping("save")
    @ResponseBody
    public ResultInfo saveCustomerRepr(CustomerReprieve customerReprieve) {
        customerReprService.saveCustomerRepr(customerReprieve);
        return success("暂缓记录添加成功!");
    }

    @ApiOperation("更新暂缓记录")
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateCustomerRepr(CustomerReprieve customerReprieve) {
        customerReprService.updateCustomerRepr(customerReprieve);
        return success("暂缓记录更新成功!");
    }

    @ApiOperation("删除暂缓记录")
    @PostMapping("delete")
    @ResponseBody
    public ResultInfo deleteCustomerRepr(Integer id) {
        customerReprService.deleteCustomerRepr(id);
        return success("暂缓记录删除成功!");
    }
}
