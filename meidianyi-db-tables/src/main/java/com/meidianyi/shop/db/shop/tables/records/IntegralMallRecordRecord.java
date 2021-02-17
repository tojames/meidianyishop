/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.IntegralMallRecord;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 积分商城用户兑换记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IntegralMallRecordRecord extends UpdatableRecordImpl<IntegralMallRecordRecord> implements Record12<Integer, Integer, String, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = 1088211502;

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.integral_mall_define_id</code>. 积分商城活动定义表id
     */
    public void setIntegralMallDefineId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.integral_mall_define_id</code>. 积分商城活动定义表id
     */
    public Integer getIntegralMallDefineId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.product_id</code>. 产品规格id
     */
    public void setProductId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.product_id</code>. 产品规格id
     */
    public Integer getProductId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.score</code>. 消费积分
     */
    public void setScore(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.score</code>. 消费积分
     */
    public Integer getScore() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.number</code>. 兑换数量
     */
    public void setNumber(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.number</code>. 兑换数量
     */
    public Short getNumber() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.money</code>. 消耗现金
     */
    public void setMoney(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.money</code>. 消耗现金
     */
    public BigDecimal getMoney() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_6797286.b2c_integral_mall_record.del_flag</code>. 1为删除状态
     */
    public void setDelFlag(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_6797286.b2c_integral_mall_record.del_flag</code>. 1为删除状态
     */
    public Byte getDelFlag() {
        return (Byte) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.INTEGRAL_MALL_DEFINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return IntegralMallRecord.INTEGRAL_MALL_RECORD.DEL_FLAG;
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
    public Integer component2() {
        return getIntegralMallDefineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getDelFlag();
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
    public Integer value2() {
        return getIntegralMallDefineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value2(Integer value) {
        setIntegralMallDefineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value3(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value5(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value6(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value7(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value8(Short value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value9(BigDecimal value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord value12(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegralMallRecordRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, Short value8, BigDecimal value9, Timestamp value10, Timestamp value11, Byte value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IntegralMallRecordRecord
     */
    public IntegralMallRecordRecord() {
        super(IntegralMallRecord.INTEGRAL_MALL_RECORD);
    }

    /**
     * Create a detached, initialised IntegralMallRecordRecord
     */
    public IntegralMallRecordRecord(Integer id, Integer integralMallDefineId, String orderSn, Integer userId, Integer goodsId, Integer productId, Integer score, Short number, BigDecimal money, Timestamp createTime, Timestamp updateTime, Byte delFlag) {
        super(IntegralMallRecord.INTEGRAL_MALL_RECORD);

        set(0, id);
        set(1, integralMallDefineId);
        set(2, orderSn);
        set(3, userId);
        set(4, goodsId);
        set(5, productId);
        set(6, score);
        set(7, number);
        set(8, money);
        set(9, createTime);
        set(10, updateTime);
        set(11, delFlag);
    }
}
