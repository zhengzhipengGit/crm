package com.cx.crm.controller;


import com.cx.base.BaseController;
import com.cx.crm.pojo.CustomerOrderQuery;
import com.cx.crm.service.CustomerOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @since 2024-05-31
 */
@Controller
@RequestMapping("order")
public class CustomerOrderController extends BaseController {

    @Resource
    private CustomerOrderService customerOrderService;

    @ApiOperation("顾客所有订单")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryCustomerOrdersByParams(CustomerOrderQuery customerOrderQuery) {
        return customerOrderService.queryCustomerOrdersByParams(customerOrderQuery);
    }
}
