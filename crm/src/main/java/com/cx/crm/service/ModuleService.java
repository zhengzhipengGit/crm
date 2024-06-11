package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.Module;
import com.cx.crm.vo.ZTree;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-29
 */
public interface ModuleService extends IService<Module> {

    //查询传入角色拥有的权限，放回类型为z-tree
    List<ZTree> queryAllModules(Integer roleId);

    //查询整张菜单表数据
    Map<String, Object> queryModules();

    //添加菜单项
    void saveModule(Module module);

    //编辑更新菜单
    void updateModule(Module module);

    //删除菜单项
    void deleteModule(Integer mid);

}
