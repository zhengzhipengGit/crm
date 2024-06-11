package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.SaleChance;
import com.cx.crm.query.SaleChanceQuery;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-17
 */
public interface SaleChanceService extends IService<SaleChance> {

    //通过传入参数查询营销机会
    Map<String, Object> querySaleChanceByParams(SaleChanceQuery saleChanceQuery);

    //添加营销机会
    void saveSaleChance(SaleChance saleChance);

    //更新营销机会记录
    void updateSaleChance(SaleChance saleChance);

    //批量删除
    void deleteSaleChance(Integer[] ids);

    //更新开发结果
    void updateSaleChanceDevResult(Integer id, Integer devResult);


}
