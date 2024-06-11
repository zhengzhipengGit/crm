package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CustomerContact;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-01
 */
public interface CustomerContactMapper extends BaseMapper<CustomerContact> {

    //多条件查询
    List<CustomerContact> selectAll(BaseQuery baseQuery) throws DataAccessException;

}
