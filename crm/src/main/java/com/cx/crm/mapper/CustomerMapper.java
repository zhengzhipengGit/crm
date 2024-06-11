package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.Customer;
import com.cx.crm.query.CustomerQuery;
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
public interface CustomerMapper extends BaseMapper<Customer> {

    //多条件查询
    List<Customer> selectByParams(BaseQuery baseQuery) throws DataAccessException;

    //查询流失的客户
    List<Customer> queryLossCustomers();

    //更新客户状态
    int updateCustomerStateByIds(List<Integer> lossCusIds);

    //查询客户贡献
    List<Map<String, Object>> queryCustomerContributionByParams(CustomerQuery customerQuery);

    //统计客户构成
    List<Map<String, Object>> countCustomerMake();

    //统计客户服务
    List<Map<String, Object>> countCustomerServe();

}
