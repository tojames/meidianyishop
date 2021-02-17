/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.service.pojo.shop.decoration;


import java.io.Serializable;
import java.sql.Timestamp;

import com.meidianyi.shop.common.foundation.util.Page;

import lombok.Data;


/**
 * @author lixinguo
 */
@Data
public class XcxCustomerPageVo implements Serializable {

    private static final long serialVersionUID = -623202346;

    private Integer currentPage;
    private Integer pageRows;

    private Integer   pageId;
    private Integer   shopId;
    private String    pageName;
    private Byte      pageType;
    private Byte      pageEnabled;
    private Byte      pageTplType;
    private String    pageContent;
    private String    pagePublishContent;
    private Byte      pageState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   catId;
    private String    name;
	public Object intoMap() {
		// TODO Auto-generated method stub
		return null;
	}


   
}
