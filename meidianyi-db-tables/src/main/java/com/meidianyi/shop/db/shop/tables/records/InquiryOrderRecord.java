/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.InquiryOrder;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 问诊订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InquiryOrderRecord extends UpdatableRecordImpl<InquiryOrderRecord> {

    private static final long serialVersionUID = -1835727592;

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_id</code>. 订单id
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_id</code>. 订单id
     */
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_status</code>. 订单状态0待付款 1待接诊 2接诊中 3已完成 4已退款 5已取消 6待退款 7部分退款
     */
    public void setOrderStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_status</code>. 订单状态0待付款 1待接诊 2接诊中 3已完成 4已退款 5已取消 6待退款 7部分退款
     */
    public Byte getOrderStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.doctor_id</code>. 医师id
     */
    public void setDoctorId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.doctor_id</code>. 医师id
     */
    public Integer getDoctorId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.doctor_name</code>. 医师名称
     */
    public void setDoctorName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.doctor_name</code>. 医师名称
     */
    public String getDoctorName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.department_id</code>. 科室id
     */
    public void setDepartmentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.department_id</code>. 科室id
     */
    public Integer getDepartmentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.department_name</code>. 医师科室
     */
    public void setDepartmentName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.department_name</code>. 医师科室
     */
    public String getDepartmentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_mobile</code>. 患者手机号码
     */
    public void setPatientMobile(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_mobile</code>. 患者手机号码
     */
    public String getPatientMobile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_name</code>. 患者名称
     */
    public void setPatientName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_name</code>. 患者名称
     */
    public String getPatientName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_sex</code>. 性别 0：未知 1：男 2：女
     */
    public void setPatientSex(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_sex</code>. 性别 0：未知 1：男 2：女
     */
    public Byte getPatientSex() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_birthday</code>. 出生年月
     */
    public void setPatientBirthday(Date value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_birthday</code>. 出生年月
     */
    public Date getPatientBirthday() {
        return (Date) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_code</code>. 证件号码
     */
    public void setPatientIdentityCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_code</code>. 证件号码
     */
    public String getPatientIdentityCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public void setPatientIdentityType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.patient_identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public Byte getPatientIdentityType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_code</code>. 支付代号
     */
    public void setPayCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_code</code>. 支付代号
     */
    public String getPayCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_name</code>. 支付名称
     */
    public void setPayName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_name</code>. 支付名称
     */
    public String getPayName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_sn</code>. 支付流水号
     */
    public void setPaySn(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_sn</code>. 支付流水号
     */
    public String getPaySn() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.order_amount</code>. 订单总金额
     */
    public void setOrderAmount(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.order_amount</code>. 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.pay_time</code>. 支付时间
     */
    public void setPayTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.pay_time</code>. 支付时间
     */
    public Timestamp getPayTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.refund_money</code>. 已退款金额
     */
    public void setRefundMoney(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.refund_money</code>. 已退款金额
     */
    public BigDecimal getRefundMoney() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.limit_time</code>. 医生接诊后会话截止时间点
     */
    public void setLimitTime(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.limit_time</code>. 医生接诊后会话截止时间点
     */
    public Timestamp getLimitTime() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.cancelled_time</code>. 取消时间
     */
    public void setCancelledTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.cancelled_time</code>. 取消时间
     */
    public Timestamp getCancelledTime() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.finished_time</code>. 订单完成时间
     */
    public void setFinishedTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.finished_time</code>. 订单完成时间
     */
    public Timestamp getFinishedTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.description_disease</code>. 病情描述
     */
    public void setDescriptionDisease(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.description_disease</code>. 病情描述
     */
    public String getDescriptionDisease() {
        return (String) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.image_url</code>. 病情描述image
     */
    public void setImageUrl(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.image_url</code>. 病情描述image
     */
    public String getImageUrl() {
        return (String) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.rebate_proportion</code>. 返利比例
     */
    public void setRebateProportion(BigDecimal value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.rebate_proportion</code>. 返利比例
     */
    public BigDecimal getRebateProportion() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.total_rebate_money</code>. 返利金额
     */
    public void setTotalRebateMoney(BigDecimal value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.total_rebate_money</code>. 返利金额
     */
    public BigDecimal getTotalRebateMoney() {
        return (BigDecimal) get(29);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_proportion</code>. 平台返利比例
     */
    public void setPlatformRebateProportion(BigDecimal value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_proportion</code>. 平台返利比例
     */
    public BigDecimal getPlatformRebateProportion() {
        return (BigDecimal) get(30);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_money</code>. 平台返利比例
     */
    public void setPlatformRebateMoney(BigDecimal value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_money</code>. 平台返利比例
     */
    public BigDecimal getPlatformRebateMoney() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.is_delete</code>. 删除
     */
    public void setIsDelete(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.is_delete</code>. 删除
     */
    public Byte getIsDelete() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.settlement_flag</code>. 结算标志：0：未结算，1：已结算
     */
    public void setSettlementFlag(Byte value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.settlement_flag</code>. 结算标志：0：未结算，1：已结算
     */
    public Byte getSettlementFlag() {
        return (Byte) get(33);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(34, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(34);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_inquiry_order.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(35, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_inquiry_order.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(35);
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
     * Create a detached InquiryOrderRecord
     */
    public InquiryOrderRecord() {
        super(InquiryOrder.INQUIRY_ORDER);
    }

    /**
     * Create a detached, initialised InquiryOrderRecord
     */
    public InquiryOrderRecord(Integer orderId, Integer shopId, String orderSn, Integer userId, Byte orderStatus, Integer doctorId, String doctorName, Integer departmentId, String departmentName, Integer patientId, String patientMobile, String patientName, Byte patientSex, Date patientBirthday, String patientIdentityCode, Byte patientIdentityType, String payCode, String payName, String paySn, String prepayId, BigDecimal orderAmount, Timestamp payTime, BigDecimal refundMoney, Timestamp limitTime, Timestamp cancelledTime, Timestamp finishedTime, String descriptionDisease, String imageUrl, BigDecimal rebateProportion, BigDecimal totalRebateMoney, BigDecimal platformRebateProportion, BigDecimal platformRebateMoney, Byte isDelete, Byte settlementFlag, Timestamp createTime, Timestamp updateTime) {
        super(InquiryOrder.INQUIRY_ORDER);

        set(0, orderId);
        set(1, shopId);
        set(2, orderSn);
        set(3, userId);
        set(4, orderStatus);
        set(5, doctorId);
        set(6, doctorName);
        set(7, departmentId);
        set(8, departmentName);
        set(9, patientId);
        set(10, patientMobile);
        set(11, patientName);
        set(12, patientSex);
        set(13, patientBirthday);
        set(14, patientIdentityCode);
        set(15, patientIdentityType);
        set(16, payCode);
        set(17, payName);
        set(18, paySn);
        set(19, prepayId);
        set(20, orderAmount);
        set(21, payTime);
        set(22, refundMoney);
        set(23, limitTime);
        set(24, cancelledTime);
        set(25, finishedTime);
        set(26, descriptionDisease);
        set(27, imageUrl);
        set(28, rebateProportion);
        set(29, totalRebateMoney);
        set(30, platformRebateProportion);
        set(31, platformRebateMoney);
        set(32, isDelete);
        set(33, settlementFlag);
        set(34, createTime);
        set(35, updateTime);
    }
}
