/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.Trades;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 交易统计 每小时统计数据
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TradesRecord extends UpdatableRecordImpl<TradesRecord> implements Record13<Date, Byte, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1310125024;

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.ref_date</code>. 日期：例2018-09-05
     */
    public void setRefDate(Date value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.ref_date</code>. 日期：例2018-09-05
     */
    public Date getRefDate() {
        return (Date) get(0);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.hour</code>. 小时：10时
     */
    public void setHour(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.hour</code>. 小时：10时
     */
    public Byte getHour() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.uv</code>. 访客数
     */
    public void setUv(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.uv</code>. 访客数
     */
    public Integer getUv() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pv</code>. 访问量
     */
    public void setPv(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pv</code>. 访问量
     */
    public Integer getPv() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pay_user_num</code>. 付款人数（包括货到付款发货后的状态）
     */
    public void setPayUserNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pay_user_num</code>. 付款人数（包括货到付款发货后的状态）
     */
    public Integer getPayUserNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pay_order_num</code>. 付款订单数
     */
    public void setPayOrderNum(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pay_order_num</code>. 付款订单数
     */
    public Integer getPayOrderNum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pay_order_money</code>. 付款金额
     */
    public void setPayOrderMoney(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pay_order_money</code>. 付款金额
     */
    public BigDecimal getPayOrderMoney() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pay_goods_number</code>. 付款件数
     */
    public void setPayGoodsNumber(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pay_goods_number</code>. 付款件数
     */
    public Integer getPayGoodsNumber() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.pct</code>. 客单价
     */
    public void setPct(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.pct</code>. 客单价
     */
    public BigDecimal getPct() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.uv_pay_ratio</code>. 转化率
     */
    public void setUvPayRatio(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.uv_pay_ratio</code>. 转化率
     */
    public BigDecimal getUvPayRatio() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_trades.id</code>.
     */
    public void setId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_trades.id</code>.
     */
    public Integer getId() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Date, Byte, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Date, Byte, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field1() {
        return Trades.TRADES.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return Trades.TRADES.HOUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Trades.TRADES.UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Trades.TRADES.PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Trades.TRADES.PAY_USER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Trades.TRADES.PAY_ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Trades.TRADES.PAY_ORDER_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Trades.TRADES.PAY_GOODS_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return Trades.TRADES.PCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Trades.TRADES.UV_PAY_RATIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Trades.TRADES.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Trades.TRADES.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Trades.TRADES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component2() {
        return getHour();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPayUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPayOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPayOrderMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPayGoodsNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getPct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getUvPayRatio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getHour();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPayUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPayOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPayOrderMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPayGoodsNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getPct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getUvPayRatio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value1(Date value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value2(Byte value) {
        setHour(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value3(Integer value) {
        setUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value4(Integer value) {
        setPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value5(Integer value) {
        setPayUserNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value6(Integer value) {
        setPayOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value7(BigDecimal value) {
        setPayOrderMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value8(Integer value) {
        setPayGoodsNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value9(BigDecimal value) {
        setPct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value10(BigDecimal value) {
        setUvPayRatio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord value13(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradesRecord values(Date value1, Byte value2, Integer value3, Integer value4, Integer value5, Integer value6, BigDecimal value7, Integer value8, BigDecimal value9, BigDecimal value10, Timestamp value11, Timestamp value12, Integer value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TradesRecord
     */
    public TradesRecord() {
        super(Trades.TRADES);
    }

    /**
     * Create a detached, initialised TradesRecord
     */
    public TradesRecord(Date refDate, Byte hour, Integer uv, Integer pv, Integer payUserNum, Integer payOrderNum, BigDecimal payOrderMoney, Integer payGoodsNumber, BigDecimal pct, BigDecimal uvPayRatio, Timestamp createTime, Timestamp updateTime, Integer id) {
        super(Trades.TRADES);

        set(0, refDate);
        set(1, hour);
        set(2, uv);
        set(3, pv);
        set(4, payUserNum);
        set(5, payOrderNum);
        set(6, payOrderMoney);
        set(7, payGoodsNumber);
        set(8, pct);
        set(9, uvPayRatio);
        set(10, createTime);
        set(11, updateTime);
        set(12, id);
    }
}
