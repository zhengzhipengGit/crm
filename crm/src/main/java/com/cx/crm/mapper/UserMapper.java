package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.User;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-14
 */
public interface UserMapper extends BaseMapper<User> {

    //查询所有销售人员
    List<Map<String, Object>> queryAllSales();

    //多条件查询
    List<User> selectByParams(BaseQuery baseQuery) throws DataAccessException;

    //通过名字查询用户
    User queryUserByUserName(String userName);


    //查询所有客户经理
    List<Map<String, Object>> queryAllCustomerManager();

}
