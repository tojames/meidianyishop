package com.meidianyi.shop.common.pojo.main.table;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
/**
 * @author chenjie
 * @date 2020年09月03日
 */
public class StoreAccountDo implements Serializable {

    private static final long serialVersionUID = 1506322881;

    private Integer   accountId;
    private Integer   shopId;
    private Integer   sysId;
    private String    mobile;
    private String    accountName;
    private Timestamp createTime;
    private Byte      accountType;
    private Byte      status;
    private Byte      delFlag;
    private String    accountPasswd;
    private String    storeList;
    private Timestamp updateTime;
    private Integer   userId;
    private String    userToken;
    private String    officialOpenId;
    private Byte      isBind;
    private Byte      isPharmacist;
    private String    signature;
    private Timestamp authTime;
}