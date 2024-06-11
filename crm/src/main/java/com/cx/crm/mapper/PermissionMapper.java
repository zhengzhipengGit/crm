package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.crm.pojo.Permission;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-29
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    //通过传入角色id查询该角色被授权的资源
    List<Integer> queryRoleAllModIds(Integer roleId);

    //通过用户id查询该用户被授权得资源
    List<String> queryUserHasRoleIdsHasModuleIds(Integer userId);
}
