package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerLoss;
import com.cx.crm.query.CustomerLossQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-10
 */
public interface CustomerLossService extends IService<CustomerLoss> {

    //查询流失数据
    Map<String, Object> queryCustomerLossByParams(CustomerLossQuery customerLossQuery);

    //更新流失顾客
    void updateCustomerLossStateById(Integer id, String lossReason);
}
