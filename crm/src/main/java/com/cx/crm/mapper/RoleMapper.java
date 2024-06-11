package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.base.BaseQuery;
import com.cx.crm.pojo.Role;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-26
 */
public interface RoleMapper extends BaseMapper<Role> {

    //查找用户角色
    List<Map<String, Object>> queryAllRoles(Integer userId);

    //多条件查询
    List<Role> selectByParams(BaseQuery baseQuery) throws DataAccessException;
}
