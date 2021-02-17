/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;



import java.sql.Timestamp;

import javax.annotation.Generated;

import com.meidianyi.shop.db.main.tables.ShopLogistics;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 店铺物流信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShopLogisticsRecord extends UpdatableRecordImpl<ShopLogisticsRecord> implements Record8<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = 569701342;

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.shop_id</code>. 店铺Id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.shop_id</code>. 店铺Id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.logistic_name</code>. 快递公司名称
     */
    public void setLogisticName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.logistic_name</code>. 快递公司名称
     */
    public String getLogisticName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.logistic_type</code>. 快递100type字段
     */
    public void setLogisticType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.logistic_type</code>. 快递100type字段
     */
    public String getLogisticType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.shipping_code</code>.
     */
    public void setShippingCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.shipping_code</code>.
     */
    public String getShippingCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>jmini_main.b2c_shop_logistics.del_flag</code>. 0:未删除，1:已删除
     */
    public void setDelFlag(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_main.b2c_shop_logistics.del_flag</code>. 0:未删除，1:已删除
     */
    public Byte getDelFlag() {
        return (Byte) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShopLogistics.SHOP_LOGISTICS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShopLogistics.SHOP_LOGISTICS.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShopLogistics.SHOP_LOGISTICS.LOGISTIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ShopLogistics.SHOP_LOGISTICS.LOGISTIC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ShopLogistics.SHOP_LOGISTICS.SHIPPING_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ShopLogistics.SHOP_LOGISTICS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ShopLogistics.SHOP_LOGISTICS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ShopLogistics.SHOP_LOGISTICS.DEL_FLAG;
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
        return getLogisticName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLogisticType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getShippingCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
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
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLogisticName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLogisticType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShippingCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value3(String value) {
        setLogisticName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value4(String value) {
        setLogisticType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value5(String value) {
        setShippingCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord value8(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopLogisticsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Byte value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopLogisticsRecord
     */
    public ShopLogisticsRecord() {
        super(ShopLogistics.SHOP_LOGISTICS);
    }

    /**
     * Create a detached, initialised ShopLogisticsRecord
     */
    public ShopLogisticsRecord(Integer id, Integer shopId, String logisticName, String logisticType, String shippingCode, Timestamp createTime, Timestamp updateTime, Byte delFlag) {
        super(ShopLogistics.SHOP_LOGISTICS);

        set(0, id);
        set(1, shopId);
        set(2, logisticName);
        set(3, logisticType);
        set(4, shippingCode);
        set(5, createTime);
        set(6, updateTime);
        set(7, delFlag);
    }
}
