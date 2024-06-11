package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerContact;
import com.cx.crm.query.CustomerContactQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-01
 */
public interface CustomerContactService extends IService<CustomerContact> {

    //查询所有交往记录
    Map<String, Object> selectAll(CustomerContactQuery customerContactQuery);

    //添加用户
    void saveCustomerContact(CustomerContact customerContact);

    //更新用户
    void updateCustomerContact(CustomerContact customerContact);

    //删除用户
    void deleteCustomerContact(Integer id);


}
