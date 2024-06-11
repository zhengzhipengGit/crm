package com.cx.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.crm.mapper.CustomerLossMapper;
import com.cx.crm.mapper.CustomerMapper;
import com.cx.crm.pojo.CustomerLoss;
import com.cx.crm.query.CustomerLossQuery;
import com.cx.crm.service.CustomerLossService;
import com.cx.crm.utils.AssertUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @since 2024-05-10
 */
@Service
public class CustomerLossServiceImpl extends ServiceImpl<CustomerLossMapper, CustomerLoss> implements CustomerLossService {

    @Resource
    private CustomerLossMapper customerLossMapper;

    @Resource
    private CustomerMapper customerMapper;

    //查询流失数据
    public Map<String, Object> queryCustomerLossByParams(CustomerLossQuery customerLossQuery) {
        Map<String, Object> map = new HashMap<String, Object>();
        PageHelper.startPage(customerLossQuery.getPage(), customerLossQuery.getLimit());
        PageInfo<CustomerLoss> pageInfo = new PageInfo<CustomerLoss>(customerLossMapper.selectByParams(customerLossQuery));
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    //添加流失顾客
    public void updateCustomerLossStateById(Integer id, String lossReason) {
        CustomerLoss customerLoss = customerLossMapper.selectById(id);
        AssertUtil.isTrue(null == customerLoss, "待流失的客户记录不存在!");
        customerLoss.setState(0);// 0.确认流失
        customerLoss.setLossReason(lossReason);
        customerLoss.setConfirmLossTime(new Date());
        customerLoss.setUpdateDate(new Date());

        AssertUtil.isTrue(customerLossMapper.updateById(customerLoss) < 1, "确认流失失败!");
    }
}
