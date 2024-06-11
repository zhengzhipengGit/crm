package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CustomerLoss;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-10
 */
public interface CustomerLossMapper extends BaseMapper<CustomerLoss> {

    //多条件查询
    List<CustomerLoss> selectByParams(BaseQuery baseQuery) throws DataAccessException;


}
