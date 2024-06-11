package com.cx.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.crm.pojo.Module;
import com.cx.crm.vo.ZTree;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @since 2024-05-29
 */
public interface ModuleMapper extends BaseMapper<Module> {

    //查询所有可授权资源
    List<ZTree> queryAllModules();
}
