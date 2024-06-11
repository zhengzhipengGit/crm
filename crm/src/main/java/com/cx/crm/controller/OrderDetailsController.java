package com.cx.crm.controller;


import com.cx.base.BaseController;
import com.cx.crm.query.OrderDetailsQuery;
import com.cx.crm.service.OrderDetailsService;
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
@RequestMapping("order_details")
public class OrderDetailsController extends BaseController {

    @Resource
    private OrderDetailsService orderDetailsService;

    @ApiOperation("订单详情")
    @GetMapping("list")
    @ResponseBody
    public Map<String, Object> queryDetailsByParams(OrderDetailsQuery orderDetailsQuery) {
        return orderDetailsService.queryOrderDetailsByParams(orderDetailsQuery);
    }
}
