package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.Customer;
import com.cx.crm.query.CustomerQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-31
 */
public interface CustomerService extends IService<Customer> {

    //通过参数查询客户
    Map<String, Object> queryCustomersByParams(CustomerQuery customerQuery);

    //添加用户
    void saveCustomer(Customer customer);

    //更新用户
    void updateCustomer(Customer customer);

    //删除用户
    void deleteCustomer(Integer id);

    //通过定时任务添加流失客户
    void updateCustomerState();

    //查询客户贡献
    Map<String, Object> queryCustomerContributionByParams(CustomerQuery customerQuery);

    //获取数据显示在echarts折线图上
    Map<String, Object> countCustomerMake();

    //获取数据显示在echarts玫瑰图上
    Map<String, Object> countCustomerMake02();

    //获取数据显示在echarts折线图上
    Map<String, Object> countCustomerServe();

    //获取数据显示在echarts玫瑰图上
    Map<String, Object> countCustomerServe02();
}
