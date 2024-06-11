package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.CusDevPlan;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-17
 */
public interface CusDevPlanMapper extends BaseMapper<CusDevPlan> {

    //多条件查询
    List<CusDevPlan> selectByParams(BaseQuery baseQuery) throws DataAccessException;


}
