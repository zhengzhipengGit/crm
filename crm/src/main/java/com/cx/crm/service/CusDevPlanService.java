package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.CusDevPlan;
import com.cx.crm.query.CusDevPlanQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-17
 */
public interface CusDevPlanService extends IService<CusDevPlan> {

    //通过条件查询当前用户被分配的记录
    Map<String, Object> queryCusDevPlansByParams(CusDevPlanQuery cusDevPlanQuery);

    //新增开发计划
    void saveCusDevPlan(CusDevPlan cusDevPlan);

    //编辑更新开发计划
    void updateCusDevPlan(CusDevPlan cusDevPlan);

    //删除一项开发计划
    void deleteCusDevPlan(Integer id);
}
