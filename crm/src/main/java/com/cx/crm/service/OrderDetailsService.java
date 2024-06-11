package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.OrderDetails;
import com.cx.crm.query.OrderDetailsQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-31
 */
public interface OrderDetailsService extends IService<OrderDetails> {

    //查询订单记录
    Map<String, Object> queryOrderDetailsByParams(OrderDetailsQuery orderDetailsQuery);
}
