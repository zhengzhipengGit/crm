package com.cx.crm.query;

import com.cx.base.BaseQuery;
import lombok.Data;

@Data
public class UserQuery extends BaseQuery {
    //姓名
    private String userName;
    //邮箱
    private String email;
    //电话
    private String phone;
}
