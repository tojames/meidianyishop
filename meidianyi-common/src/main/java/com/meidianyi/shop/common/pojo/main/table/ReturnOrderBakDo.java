/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.common.pojo.main.table;


import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 退回订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Data
public class ReturnOrderBakDo implements Serializable {

    private static final long serialVersionUID = -833413811;

    private Integer    retId;
    private Integer    orderId;
    private String     orderSn;
    private String     returnOrderSn;
    private Integer    shopId;
    private Integer    userId;
    private Integer    goodsId;
    private Byte       refundStatus;
    private BigDecimal money;
    private BigDecimal shippingFee;
    private Byte       returnType;
    private Byte       reasonType;
    private String     reasonDesc;
    private String     shippingType;
    private String     shippingNo;
    private String     goodsImages;
    private String     voucherImages;
    private String     phone;
    private Timestamp  applyTime;
    private Timestamp  applyPassTime;
    private Timestamp  applyNotPassTime;
    private Timestamp  shippingOrRefundTime;
    private Timestamp  refundSuccessTime;
    private Timestamp  refundRefuseTime;
    private Timestamp  refundCancelTime;
    private String     applyNotPassReason;
    private String     refundRefuseReason;
    private String     returnAddress;
    private String     merchantTelephone;
    private String     consignee;
    private String     zipCode;
    private String     currency;
    private Timestamp  createTime;
    private Timestamp  updateTime;
    private Byte       isAutoReturn;
    private Byte       returnSource;
    private Byte       returnSourceType;

}
