/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.VirtualOrderRefundRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class VirtualOrderRefundRecordRecord extends UpdatableRecordImpl<VirtualOrderRefundRecordRecord> implements Record9<Integer, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Byte> {

    private static final long serialVersionUID = -241902181;

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.order_sn</code>.
     */
    public void setOrderSn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.order_sn</code>.
     */
    public String getOrderSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.use_score</code>. 退款积分
     */
    public void setUseScore(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.use_score</code>. 退款积分
     */
    public Integer getUseScore() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.use_account</code>. 退款余额
     */
    public void setUseAccount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.use_account</code>. 退款余额
     */
    public BigDecimal getUseAccount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.money_paid</code>. 退款现金
     */
    public void setMoneyPaid(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.money_paid</code>. 退款现金
     */
    public BigDecimal getMoneyPaid() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.member_card_balance</code>. 退款会员卡余额
     */
    public void setMemberCardBalance(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.member_card_balance</code>. 退款会员卡余额
     */
    public BigDecimal getMemberCardBalance() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.refund_time</code>. 订单退款时间
     */
    public void setRefundTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.refund_time</code>. 订单退款时间
     */
    public Timestamp getRefundTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_virtual_order_refund_record.is_success</code>. 处理状态，1：退款失败，2：退款成功
     */
    public void setIsSuccess(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_virtual_order_refund_record.is_success</code>. 处理状态，1：退款失败，2：退款成功
     */
    public Byte getIsSuccess() {
        return (Byte) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.USE_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.USE_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.MONEY_PAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.MEMBER_CARD_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.REFUND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD.IS_SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUseScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getUseAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getMoneyPaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMemberCardBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getRefundTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getIsSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUseScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getUseAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getMoneyPaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMemberCardBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getRefundTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIsSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value2(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value4(Integer value) {
        setUseScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value5(BigDecimal value) {
        setUseAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value6(BigDecimal value) {
        setMoneyPaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value7(BigDecimal value) {
        setMemberCardBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value8(Timestamp value) {
        setRefundTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord value9(Byte value) {
        setIsSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualOrderRefundRecordRecord values(Integer value1, String value2, Integer value3, Integer value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Timestamp value8, Byte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VirtualOrderRefundRecordRecord
     */
    public VirtualOrderRefundRecordRecord() {
        super(VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD);
    }

    /**
     * Create a detached, initialised VirtualOrderRefundRecordRecord
     */
    public VirtualOrderRefundRecordRecord(Integer id, String orderSn, Integer userId, Integer useScore, BigDecimal useAccount, BigDecimal moneyPaid, BigDecimal memberCardBalance, Timestamp refundTime, Byte isSuccess) {
        super(VirtualOrderRefundRecord.VIRTUAL_ORDER_REFUND_RECORD);

        set(0, id);
        set(1, orderSn);
        set(2, userId);
        set(3, useScore);
        set(4, useAccount);
        set(5, moneyPaid);
        set(6, memberCardBalance);
        set(7, refundTime);
        set(8, isSuccess);
    }
}