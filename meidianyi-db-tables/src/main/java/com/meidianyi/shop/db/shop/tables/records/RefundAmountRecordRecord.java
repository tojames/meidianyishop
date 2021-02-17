/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.RefundAmountRecord;

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
public class RefundAmountRecordRecord extends UpdatableRecordImpl<RefundAmountRecordRecord> implements Record9<Integer, String, Integer, String, BigDecimal, Timestamp, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1657286713;

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.rec_id</code>.
     */
    public void setRecId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.rec_id</code>.
     */
    public Integer getRecId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.order_sn</code>.
     */
    public void setOrderSn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.order_sn</code>.
     */
    public String getOrderSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.refund_field</code>. 订单退款字段：member_card_balance,score_discount,money_paid,use_account
     */
    public void setRefundField(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.refund_field</code>. 订单退款字段：member_card_balance,score_discount,money_paid,use_account
     */
    public String getRefundField() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.refund_money</code>. 退款金额
     */
    public void setRefundMoney(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.refund_money</code>. 退款金额
     */
    public BigDecimal getRefundMoney() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.refund_time</code>. 订单退款时间
     */
    public void setRefundTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.refund_time</code>. 订单退款时间
     */
    public Timestamp getRefundTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.ret_id</code>. b2c_return_order的ret_id
     */
    public void setRetId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.ret_id</code>. b2c_return_order的ret_id
     */
    public Integer getRetId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_refund_amount_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_refund_amount_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
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
    public Row9<Integer, String, Integer, String, BigDecimal, Timestamp, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, String, BigDecimal, Timestamp, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.REC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.REFUND_FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.REFUND_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.REFUND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.RET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return RefundAmountRecord.REFUND_AMOUNT_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRecId();
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
    public String component4() {
        return getRefundField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getRefundMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getRefundTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRecId();
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
    public String value4() {
        return getRefundField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getRefundMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getRefundTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value1(Integer value) {
        setRecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value2(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value4(String value) {
        setRefundField(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value5(BigDecimal value) {
        setRefundMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value6(Timestamp value) {
        setRefundTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value7(Integer value) {
        setRetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecordRecord values(Integer value1, String value2, Integer value3, String value4, BigDecimal value5, Timestamp value6, Integer value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached RefundAmountRecordRecord
     */
    public RefundAmountRecordRecord() {
        super(RefundAmountRecord.REFUND_AMOUNT_RECORD);
    }

    /**
     * Create a detached, initialised RefundAmountRecordRecord
     */
    public RefundAmountRecordRecord(Integer recId, String orderSn, Integer userId, String refundField, BigDecimal refundMoney, Timestamp refundTime, Integer retId, Timestamp createTime, Timestamp updateTime) {
        super(RefundAmountRecord.REFUND_AMOUNT_RECORD);

        set(0, recId);
        set(1, orderSn);
        set(2, userId);
        set(3, refundField);
        set(4, refundMoney);
        set(5, refundTime);
        set(6, retId);
        set(7, createTime);
        set(8, updateTime);
    }
}
