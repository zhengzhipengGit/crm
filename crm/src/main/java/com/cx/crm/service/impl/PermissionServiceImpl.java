package com.cx.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.crm.mapper.PermissionMapper;
import com.cx.crm.pojo.Permission;
import com.cx.crm.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @since 2024-05-29
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {


    @Resource
    private PermissionMapper permissionMapper;

    //通过传入用户id查询该用户被授权的资源
    public List<String> queryUserHasRoleIdsHasModuleIds(Integer userId) {
        return permissionMapper.queryUserHasRoleIdsHasModuleIds(userId);
    }

}
