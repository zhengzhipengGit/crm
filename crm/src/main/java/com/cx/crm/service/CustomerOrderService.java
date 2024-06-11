package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerOrder;
import com.cx.crm.pojo.CustomerOrderQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-31
 */
public interface CustomerOrderService extends IService<CustomerOrder> {

    //查询所有订单
    Map<String, Object> queryCustomerOrdersByParams(CustomerOrderQuery customerOrderQueryQuery);

    //查询单个订单
    Map<String, Object> queryCustomerOrderByOrderId(Integer orderId);
}
