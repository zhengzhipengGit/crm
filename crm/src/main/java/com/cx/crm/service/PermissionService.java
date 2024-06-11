package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.Permission;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-29
 */
public interface PermissionService extends IService<Permission> {

    //通过用户id查询权限
    List<String> queryUserHasRoleIdsHasModuleIds(Integer userId);
}
