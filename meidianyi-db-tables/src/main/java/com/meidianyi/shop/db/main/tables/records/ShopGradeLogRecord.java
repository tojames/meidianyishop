/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.ShopGradeLog;

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
public class ShopGradeLogRecord extends UpdatableRecordImpl<ShopGradeLogRecord> implements Record9<Integer, Integer, String, Integer, Integer, BigDecimal, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2009656919;

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.shop_id</code>.
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.shop_id</code>.
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.shop_grade</code>. 店铺等级
     */
    public void setShopGrade(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.shop_grade</code>. 店铺等级
     */
    public String getShopGrade() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.max_sku_num</code>. SKU数量
     */
    public void setMaxSkuNum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.max_sku_num</code>. SKU数量
     */
    public Integer getMaxSkuNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.max_shop_num</code>. 店铺数量
     */
    public void setMaxShopNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.max_shop_num</code>. 店铺数量
     */
    public Integer getMaxShopNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.manage_fee</code>. 平台管理费百分比
     */
    public void setManageFee(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.manage_fee</code>. 平台管理费百分比
     */
    public BigDecimal getManageFee() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.flag</code>. 0:正常，1:删除
     */
    public void setFlag(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.flag</code>. 0:正常，1:删除
     */
    public Byte getFlag() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.in_time</code>.
     */
    public void setInTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.in_time</code>.
     */
    public Timestamp getInTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_grade_log.up_time</code>.
     */
    public void setUpTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_grade_log.up_time</code>.
     */
    public Timestamp getUpTime() {
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
    public Row9<Integer, Integer, String, Integer, Integer, BigDecimal, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, Integer, Integer, BigDecimal, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShopGradeLog.SHOP_GRADE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShopGradeLog.SHOP_GRADE_LOG.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShopGradeLog.SHOP_GRADE_LOG.SHOP_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShopGradeLog.SHOP_GRADE_LOG.MAX_SKU_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ShopGradeLog.SHOP_GRADE_LOG.MAX_SHOP_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return ShopGradeLog.SHOP_GRADE_LOG.MANAGE_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return ShopGradeLog.SHOP_GRADE_LOG.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ShopGradeLog.SHOP_GRADE_LOG.IN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ShopGradeLog.SHOP_GRADE_LOG.UP_TIME;
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
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getShopGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMaxSkuNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getMaxShopNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getManageFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getInTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpTime();
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
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShopGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMaxSkuNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getMaxShopNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getManageFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getInTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value3(String value) {
        setShopGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value4(Integer value) {
        setMaxSkuNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value5(Integer value) {
        setMaxShopNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value6(BigDecimal value) {
        setManageFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value7(Byte value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value8(Timestamp value) {
        setInTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord value9(Timestamp value) {
        setUpTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopGradeLogRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, BigDecimal value6, Byte value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached ShopGradeLogRecord
     */
    public ShopGradeLogRecord() {
        super(ShopGradeLog.SHOP_GRADE_LOG);
    }

    /**
     * Create a detached, initialised ShopGradeLogRecord
     */
    public ShopGradeLogRecord(Integer id, Integer shopId, String shopGrade, Integer maxSkuNum, Integer maxShopNum, BigDecimal manageFee, Byte flag, Timestamp inTime, Timestamp upTime) {
        super(ShopGradeLog.SHOP_GRADE_LOG);

        set(0, id);
        set(1, shopId);
        set(2, shopGrade);
        set(3, maxSkuNum);
        set(4, maxShopNum);
        set(5, manageFee);
        set(6, flag);
        set(7, inTime);
        set(8, upTime);
    }
}
