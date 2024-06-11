package com.cx.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.crm.pojo.User;
import com.cx.crm.query.UserQuery;
import com.cx.crm.vo.loginUser;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @since 2024-05-14
 */
public interface UserService extends IService<User> {

    //登录逻辑
    loginUser login(String userName, String userPwd);

    //修改用户信息逻辑
    void updateUserInfo(Integer userId, String userOldPwd, String newPwd, String confirmPwd);

    //查询所有销售人员
    List<Map<String, Object>> queryAllSales();

    //查询用户
    Map<String, Object> queryUsersByParams(UserQuery userQuery);

    //添加用户
    void saveUser(User user);

    //角色更新操作
    void updateUser(User user);

    //批量删除
    void deleteUserByIds(Integer[] ids);


    //查询所有客户经理
    List<Map<String, Object>> queryAllCustomerManager();
}
