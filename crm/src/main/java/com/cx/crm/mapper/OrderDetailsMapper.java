package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.OrderDetails;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-31
 */
public interface OrderDetailsMapper extends BaseMapper<OrderDetails> {

    //多条件查询
    List<OrderDetails> selectByParams(BaseQuery baseQuery) throws DataAccessException;

}
