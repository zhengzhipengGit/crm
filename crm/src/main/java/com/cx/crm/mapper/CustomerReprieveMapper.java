package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CustomerReprieve;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-10
 */
public interface CustomerReprieveMapper extends BaseMapper<CustomerReprieve> {

    //多条件查询
    List<CustomerReprieve> selectByParams(BaseQuery baseQuery) throws DataAccessException;

}
