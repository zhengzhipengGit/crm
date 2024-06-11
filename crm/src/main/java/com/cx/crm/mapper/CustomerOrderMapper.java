package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CustomerOrder;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-31
 */
public interface CustomerOrderMapper extends BaseMapper<CustomerOrder> {

    //多条件查询
    List<CustomerOrder> selectByParams(BaseQuery baseQuery) throws DataAccessException;

    //查询所有订单
    Map<String, Object> queryCustomerOrderByOrderId(Integer orderId);

    //查询单个订单
    CustomerOrder queryLastCustomerOrderByCusId(Integer cusId);

}
