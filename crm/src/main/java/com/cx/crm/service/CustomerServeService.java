package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerServe;
import com.cx.crm.query.CustomerServeQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-11
 */
public interface CustomerServeService extends IService<CustomerServe> {

    //查询客户服务
    Map<String, Object> queryCustomerServesByParams(CustomerServeQuery customerServeQuery);

    //添加服务
    void saveCustomerServe(CustomerServe customerServe);

    //更新服务进程
    void updateCustomerServe(CustomerServe customerServe);
}
