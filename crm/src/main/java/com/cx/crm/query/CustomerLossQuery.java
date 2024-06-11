package com.cx.crm.query;

import com.cx.base.BaseQuery;
import lombok.Data;

@Data
public class CustomerLossQuery extends BaseQuery {
    private String cusNo;

    private String cusName;

    private Integer state;

}
