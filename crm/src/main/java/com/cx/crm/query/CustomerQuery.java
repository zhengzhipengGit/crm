package com.cx.crm.query;

import com.cx.base.BaseQuery;
import lombok.Data;

@Data
public class CustomerQuery extends BaseQuery {

    private String Name;

    private String customerId;

    private String level;


    private String time;

    // 金额区间  1:0-1000   2:1000-3000  3:3000-5000 4:5000+
    private Integer type;


}
