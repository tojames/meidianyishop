/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.ChargeRenew;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ChargeRenewRecord extends UpdatableRecordImpl<ChargeRenewRecord> implements Record11<Integer, Integer, Integer, String, Integer, String, Timestamp, String, Byte, Byte, String> {

    private static final long serialVersionUID = -1783737934;

    /**
     * Setter for <code>mini_main.b2c_charge_renew.id</code>. 申请ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.id</code>. 申请ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.apply_id</code>. 申请用户的ID
     */
    public void setApplyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.apply_id</code>. 申请用户的ID
     */
    public Integer getApplyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.apply_name</code>. 申请用户名称
     */
    public void setApplyName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.apply_name</code>. 申请用户名称
     */
    public String getApplyName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.sys_id</code>. 所属账号的ID
     */
    public void setSysId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.sys_id</code>. 所属账号的ID
     */
    public Integer getSysId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.shop_name</code>. 店铺名称
     */
    public void setShopName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.shop_name</code>. 店铺名称
     */
    public String getShopName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.created</code>. 创建时间
     */
    public void setCreated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.created</code>. 创建时间
     */
    public Timestamp getCreated() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.apply_mod</code>. 点击模块
     */
    public void setApplyMod(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.apply_mod</code>. 点击模块
     */
    public String getApplyMod() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.apply_type</code>. 申请类型 0升级 1续费
     */
    public void setApplyType(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.apply_type</code>. 申请类型 0升级 1续费
     */
    public Byte getApplyType() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.contact</code>. 申请类型 0未联系 1已联系
     */
    public void setContact(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.contact</code>. 申请类型 0未联系 1已联系
     */
    public Byte getContact() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_charge_renew.desc</code>. 备注
     */
    public void setDesc(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_charge_renew.desc</code>. 备注
     */
    public String getDesc() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, String, Integer, String, Timestamp, String, Byte, Byte, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, String, Integer, String, Timestamp, String, Byte, Byte, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChargeRenew.CHARGE_RENEW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ChargeRenew.CHARGE_RENEW.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ChargeRenew.CHARGE_RENEW.APPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ChargeRenew.CHARGE_RENEW.APPLY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ChargeRenew.CHARGE_RENEW.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ChargeRenew.CHARGE_RENEW.SHOP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ChargeRenew.CHARGE_RENEW.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ChargeRenew.CHARGE_RENEW.APPLY_MOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return ChargeRenew.CHARGE_RENEW.APPLY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return ChargeRenew.CHARGE_RENEW.CONTACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ChargeRenew.CHARGE_RENEW.DESC;
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
    public Integer component3() {
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getApplyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getShopName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getApplyMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getApplyType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDesc();
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
    public Integer value3() {
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getApplyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getShopName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getApplyMod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getApplyType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value3(Integer value) {
        setApplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value4(String value) {
        setApplyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value5(Integer value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value6(String value) {
        setShopName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value7(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value8(String value) {
        setApplyMod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value9(Byte value) {
        setApplyType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value10(Byte value) {
        setContact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord value11(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChargeRenewRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, String value6, Timestamp value7, String value8, Byte value9, Byte value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChargeRenewRecord
     */
    public ChargeRenewRecord() {
        super(ChargeRenew.CHARGE_RENEW);
    }

    /**
     * Create a detached, initialised ChargeRenewRecord
     */
    public ChargeRenewRecord(Integer id, Integer shopId, Integer applyId, String applyName, Integer sysId, String shopName, Timestamp created, String applyMod, Byte applyType, Byte contact, String desc) {
        super(ChargeRenew.CHARGE_RENEW);

        set(0, id);
        set(1, shopId);
        set(2, applyId);
        set(3, applyName);
        set(4, sysId);
        set(5, shopName);
        set(6, created);
        set(7, applyMod);
        set(8, applyType);
        set(9, contact);
        set(10, desc);
    }
}
