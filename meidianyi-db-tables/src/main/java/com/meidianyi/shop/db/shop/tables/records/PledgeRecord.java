/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.Pledge;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 服务承诺表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PledgeRecord extends UpdatableRecordImpl<PledgeRecord> implements Record10<Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Byte, Integer> {

    private static final long serialVersionUID = -1015744446;

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.id</code>. ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.id</code>. ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.pledge_name</code>. 承诺名称
     */
    public void setPledgeName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.pledge_name</code>. 承诺名称
     */
    public String getPledgeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.pledge_logo</code>. 服务承诺的图标
     */
    public void setPledgeLogo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.pledge_logo</code>. 服务承诺的图标
     */
    public String getPledgeLogo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.pledge_content</code>. 服务承诺的说明
     */
    public void setPledgeContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.pledge_content</code>. 服务承诺的说明
     */
    public String getPledgeContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.state</code>. 开启状态1:开启，0:关闭
     */
    public void setState(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.state</code>. 开启状态1:开启，0:关闭
     */
    public Byte getState() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.del_flag</code>. 删除标识：0未删除，1已删除
     */
    public void setDelFlag(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.del_flag</code>. 删除标识：0未删除，1已删除
     */
    public Byte getDelFlag() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.type</code>. 商品范围:1全部商品,2指定商品
     */
    public void setType(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.type</code>. 商品范围:1全部商品,2指定商品
     */
    public Byte getType() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_pledge.level</code>. 商品优先级
     */
    public void setLevel(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_pledge.level</code>. 商品优先级
     */
    public Integer getLevel() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Byte, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Timestamp, Timestamp, Byte, Byte, Byte, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Pledge.PLEDGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Pledge.PLEDGE.PLEDGE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Pledge.PLEDGE.PLEDGE_LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Pledge.PLEDGE.PLEDGE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Pledge.PLEDGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Pledge.PLEDGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Pledge.PLEDGE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Pledge.PLEDGE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Pledge.PLEDGE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Pledge.PLEDGE.LEVEL;
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
        return getPledgeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPledgeLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPledgeContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getState();
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
    public Byte component9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getLevel();
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
        return getPledgeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPledgeLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPledgeContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getState();
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
    public Byte value9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value2(String value) {
        setPledgeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value3(String value) {
        setPledgeLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value4(String value) {
        setPledgeContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value7(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value8(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value9(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord value10(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PledgeRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, Byte value7, Byte value8, Byte value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PledgeRecord
     */
    public PledgeRecord() {
        super(Pledge.PLEDGE);
    }

    /**
     * Create a detached, initialised PledgeRecord
     */
    public PledgeRecord(Integer id, String pledgeName, String pledgeLogo, String pledgeContent, Timestamp createTime, Timestamp updateTime, Byte state, Byte delFlag, Byte type, Integer level) {
        super(Pledge.PLEDGE);

        set(0, id);
        set(1, pledgeName);
        set(2, pledgeLogo);
        set(3, pledgeContent);
        set(4, createTime);
        set(5, updateTime);
        set(6, state);
        set(7, delFlag);
        set(8, type);
        set(9, level);
    }
}
