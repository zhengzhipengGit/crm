package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.Role;
import com.cx.crm.query.RoleQuery;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-26
 */
public interface RoleService extends IService<Role> {

    //查找用户角色
    List<Map<String, Object>> queryAllRoles(Integer userId);

    //通过传入条件查询角色
    Map<String, Object> queryRolesByParams(RoleQuery roleQuery);

    //添加角色
    void saveRole(Role role);

    //更新角色
    void updateRole(Role role);

    //删除角色
    void deleteRole(Integer id);

    //角色授权（mids：资源id ，roleId：角色id）
    void addGrant(Integer[] mids, Integer roleId);
}
