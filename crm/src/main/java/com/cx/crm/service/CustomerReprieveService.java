package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerReprieve;
import com.cx.crm.query.CustomerReprQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-10
 */
public interface CustomerReprieveService extends IService<CustomerReprieve> {

    //查询暂缓数据
    Map<String, Object> queryCustomerReprsByParams(CustomerReprQuery customerReprQuery);

    //添加暂缓数据
    void saveCustomerRepr(CustomerReprieve customerReprieve);

    //更新暂缓数据
    void updateCustomerRepr(CustomerReprieve customerReprieve);

    //删除暂缓数据
    void deleteCustomerRepr(Integer id);
}
