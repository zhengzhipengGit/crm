package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CustomerLinkman;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-01
 */
public interface CustomerLinkmanService extends IService<CustomerLinkman> {

    //更新联系人
    void updateCustomerLinkman(CustomerLinkman customerLinkman);
}
