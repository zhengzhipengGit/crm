package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.Datadic;
import com.cx.crm.query.DataDicQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-12
 */
public interface DatadicService extends IService<Datadic> {

    //查询字典
    Map<String, Object> queryDataDicByParams(DataDicQuery dataDicQuery);

    //添加
    void saveDataDic(Datadic datadic);

    //更新记录
    void updateDataDic(Datadic datadic);

    //批量删除
    void deleteDataDic(Integer[] ids);
}
