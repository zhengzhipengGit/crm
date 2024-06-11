package com.cx.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.crm.mapper.CustomerOrderMapper;
import com.cx.crm.pojo.CustomerOrder;
import com.cx.crm.pojo.CustomerOrderQuery;
import com.cx.crm.service.CustomerOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @since 2024-05-31
 */
@Service
public class CustomerOrderServiceImpl extends ServiceImpl<CustomerOrderMapper, CustomerOrder> implements CustomerOrderService {

    @Resource
    private CustomerOrderMapper orderMapper;

    //查询所有订单
    public Map<String, Object> queryCustomerOrdersByParams(CustomerOrderQuery customerOrderQueryQuery) {
        Map<String, Object> map = new HashMap<String, Object>();
        PageHelper.startPage(customerOrderQueryQuery.getPage(), customerOrderQueryQuery.getLimit());
        PageInfo<CustomerOrder> pageInfo = new PageInfo<CustomerOrder>(orderMapper.selectByParams(customerOrderQueryQuery));
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    //查询单个订单
    public Map<String, Object> queryCustomerOrderByOrderId(Integer orderId) {
        return orderMapper.queryCustomerOrderByOrderId(orderId);
    }
}
