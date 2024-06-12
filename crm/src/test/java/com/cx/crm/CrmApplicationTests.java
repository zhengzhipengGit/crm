package com.cx.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cx.crm.mapper.CusDevPlanMapper;
import com.cx.crm.mapper.SaleChanceMapper;
import com.cx.crm.mapper.UserMapper;
import com.cx.crm.service.UserService;

import javax.annotation.Resource;

@SpringBootTest
class CrmApplicationTests {

    @Resource
    SaleChanceMapper saleChanceMapper;

    @Resource
    CusDevPlanMapper cusDevPlanMapper;

    @Resource
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        //SaleChanceQuery saleChanceQuery = new SaleChanceQuery();

        //SaleChance saleChance = saleChanceMapper.selectById(1);
        //System.out.println(saleChance);
        //List<SaleChance> saleChances = saleChanceMapper.selectByParams(saleChanceQuery);
        //User user = cusDevPlanMapper.test();
        //System.out.println(user);
    }

}
