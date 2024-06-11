package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CustomerServe;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-11
 */
public interface CustomerServeMapper extends BaseMapper<CustomerServe> {

    //多条件查询
    List<CustomerServe> selectByParams(BaseQuery baseQuery) throws DataAccessException;

}
