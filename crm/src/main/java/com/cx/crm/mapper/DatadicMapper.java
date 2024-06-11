package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.Datadic;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-12
 */
public interface DatadicMapper extends BaseMapper<Datadic> {

    //多条件查询
    List<Datadic> selectByParams(BaseQuery baseQuery) throws DataAccessException;

}