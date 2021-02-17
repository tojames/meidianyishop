/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.ServiceOrder;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


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
public class ServiceOrderRecord extends UpdatableRecordImpl<ServiceOrderRecord> {

    private static final long serialVersionUID = 1584525313;

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.order_id</code>. 订单id
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.order_id</code>. 订单id
     */
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.store_id</code>. 门店id
     */
    public void setStoreId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.store_id</code>. 门店id
     */
    public Integer getStoreId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.order_status</code>. 订单状态 0：待服务，1：已取消，2：已完成
     */
    public void setOrderStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.order_status</code>. 订单状态 0：待服务，1：已取消，2：已完成
     */
    public Byte getOrderStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.order_status_name</code>. 订单状态名称
     */
    public void setOrderStatusName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.order_status_name</code>. 订单状态名称
     */
    public String getOrderStatusName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.subscriber</code>. 预约人姓名
     */
    public void setSubscriber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.subscriber</code>. 预约人姓名
     */
    public String getSubscriber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.mobile</code>. 手机号
     */
    public void setMobile(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.mobile</code>. 手机号
     */
    public String getMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.service_id</code>. 服务id
     */
    public void setServiceId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.service_id</code>. 服务id
     */
    public Integer getServiceId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.technician_id</code>. 预约技师id
     */
    public void setTechnicianId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.technician_id</code>. 预约技师id
     */
    public Integer getTechnicianId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.technician_name</code>. 技师名称
     */
    public void setTechnicianName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.technician_name</code>. 技师名称
     */
    public String getTechnicianName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.service_date</code>. 预约日期
     */
    public void setServiceDate(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.service_date</code>. 预约日期
     */
    public String getServiceDate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.service_period</code>. 预约时段
     */
    public void setServicePeriod(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.service_period</code>. 预约时段
     */
    public String getServicePeriod() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.add_message</code>. 客户留言
     */
    public void setAddMessage(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.add_message</code>. 客户留言
     */
    public String getAddMessage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.admin_message</code>. 商家备注
     */
    public void setAdminMessage(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.admin_message</code>. 商家备注
     */
    public String getAdminMessage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.verify_code</code>. 核销自提码
     */
    public void setVerifyCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.verify_code</code>. 核销自提码
     */
    public String getVerifyCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.verify_admin</code>. 核销人
     */
    public void setVerifyAdmin(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.verify_admin</code>. 核销人
     */
    public String getVerifyAdmin() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.pay_code</code>. 支付代号
     */
    public void setPayCode(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.pay_code</code>. 支付代号
     */
    public String getPayCode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.pay_name</code>. 支付名称
     */
    public void setPayName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.pay_name</code>. 支付名称
     */
    public String getPayName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.pay_sn</code>. 支付流水号
     */
    public void setPaySn(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.pay_sn</code>. 支付流水号
     */
    public String getPaySn() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.money_paid</code>. 订单应付金额
     */
    public void setMoneyPaid(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.money_paid</code>. 订单应付金额
     */
    public BigDecimal getMoneyPaid() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.discount</code>. 券抵扣金额
     */
    public void setDiscount(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.discount</code>. 券抵扣金额
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.coupon_id</code>. 优惠券id
     */
    public void setCouponId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.coupon_id</code>. 优惠券id
     */
    public Integer getCouponId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.order_amount</code>. 订单总金额
     */
    public void setOrderAmount(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.order_amount</code>. 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.pay_time</code>. 支付时间
     */
    public void setPayTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.pay_time</code>. 支付时间
     */
    public Timestamp getPayTime() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.cancelled_time</code>. 取消时间
     */
    public void setCancelledTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.cancelled_time</code>. 取消时间
     */
    public Timestamp getCancelledTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.finished_time</code>. 订单完成时间
     */
    public void setFinishedTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.finished_time</code>. 订单完成时间
     */
    public Timestamp getFinishedTime() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.del_flag</code>. 删除
     */
    public void setDelFlag(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.del_flag</code>. 删除
     */
    public Byte getDelFlag() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.verify_type</code>. 核销方式 0是店家核销 1是用户
     */
    public void setVerifyType(Byte value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.verify_type</code>. 核销方式 0是店家核销 1是用户
     */
    public Byte getVerifyType() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.cancel_reason</code>. 取消原因
     */
    public void setCancelReason(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.cancel_reason</code>. 取消原因
     */
    public String getCancelReason() {
        return (String) get(30);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.type</code>. 创建类型 0用户创建 1后台
     */
    public void setType(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.type</code>. 创建类型 0用户创建 1后台
     */
    public Byte getType() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.verify_pay</code>. 核销支付方式 0门店买单 1会员卡 2余额
     */
    public void setVerifyPay(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.verify_pay</code>. 核销支付方式 0门店买单 1会员卡 2余额
     */
    public Byte getVerifyPay() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.ali_trade_no</code>. 支付宝交易单号
     */
    public void setAliTradeNo(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.ali_trade_no</code>. 支付宝交易单号
     */
    public String getAliTradeNo() {
        return (String) get(33);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(34, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(34);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(35, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(35);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.member_card_no</code>. 会员卡NO
     */
    public void setMemberCardNo(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.member_card_no</code>. 会员卡NO
     */
    public String getMemberCardNo() {
        return (String) get(36);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.member_card_balance</code>. 会员卡消费金额
     */
    public void setMemberCardBalance(BigDecimal value) {
        set(37, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.member_card_balance</code>. 会员卡消费金额
     */
    public BigDecimal getMemberCardBalance() {
        return (BigDecimal) get(37);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_order.use_account</code>. 用户消费余额
     */
    public void setUseAccount(BigDecimal value) {
        set(38, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_order.use_account</code>. 用户消费余额
     */
    public BigDecimal getUseAccount() {
        return (BigDecimal) get(38);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceOrderRecord
     */
    public ServiceOrderRecord() {
        super(ServiceOrder.SERVICE_ORDER);
    }

    /**
     * Create a detached, initialised ServiceOrderRecord
     */
    public ServiceOrderRecord(Integer orderId, Integer storeId, String orderSn, Integer userId, Byte orderStatus, String orderStatusName, String subscriber, String mobile, Integer serviceId, Integer technicianId, String technicianName, String serviceDate, String servicePeriod, String addMessage, String adminMessage, String verifyCode, String verifyAdmin, String payCode, String payName, String paySn, BigDecimal moneyPaid, BigDecimal discount, Integer couponId, BigDecimal orderAmount, Timestamp payTime, Timestamp cancelledTime, Timestamp finishedTime, String prepayId, Byte delFlag, Byte verifyType, String cancelReason, Byte type, Byte verifyPay, String aliTradeNo, Timestamp createTime, Timestamp updateTime, String memberCardNo, BigDecimal memberCardBalance, BigDecimal useAccount) {
        super(ServiceOrder.SERVICE_ORDER);

        set(0, orderId);
        set(1, storeId);
        set(2, orderSn);
        set(3, userId);
        set(4, orderStatus);
        set(5, orderStatusName);
        set(6, subscriber);
        set(7, mobile);
        set(8, serviceId);
        set(9, technicianId);
        set(10, technicianName);
        set(11, serviceDate);
        set(12, servicePeriod);
        set(13, addMessage);
        set(14, adminMessage);
        set(15, verifyCode);
        set(16, verifyAdmin);
        set(17, payCode);
        set(18, payName);
        set(19, paySn);
        set(20, moneyPaid);
        set(21, discount);
        set(22, couponId);
        set(23, orderAmount);
        set(24, payTime);
        set(25, cancelledTime);
        set(26, finishedTime);
        set(27, prepayId);
        set(28, delFlag);
        set(29, verifyType);
        set(30, cancelReason);
        set(31, type);
        set(32, verifyPay);
        set(33, aliTradeNo);
        set(34, createTime);
        set(35, updateTime);
        set(36, memberCardNo);
        set(37, memberCardBalance);
        set(38, useAccount);
    }
}
