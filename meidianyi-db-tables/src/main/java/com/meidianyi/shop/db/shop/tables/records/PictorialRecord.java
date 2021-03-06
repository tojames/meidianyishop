/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.Pictorial;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
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
public class PictorialRecord extends UpdatableRecordImpl<PictorialRecord> implements Record11<Integer, Byte, String, String, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1424841813;

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.action</code>. 海报类型： 1：普通 2 ：拼团 3：砍价 4：表单 5:拼团分享
     */
    public void setAction(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.action</code>. 海报类型： 1：普通 2 ：拼团 3：砍价 4：表单 5:拼团分享
     */
    public Byte getAction() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.path</code>. 海报路径
     */
    public void setPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.path</code>. 海报路径
     */
    public String getPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.rule</code>. 生成触发规则
     */
    public void setRule(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.rule</code>. 生成触发规则
     */
    public String getRule() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.identity_id</code>. 关联id： 例如：goods_id, page_id
     */
    public void setIdentityId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.identity_id</code>. 关联id： 例如：goods_id, page_id
     */
    public Integer getIdentityId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.activity_id</code>. 活动id
     */
    public void setActivityId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.activity_id</code>. 活动id
     */
    public Integer getActivityId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.del_flag</code>. 删除标记： 1：删除
     */
    public void setDelFlag(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.del_flag</code>. 删除标记： 1：删除
     */
    public Byte getDelFlag() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.del_time</code>.
     */
    public void setDelTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.del_time</code>.
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pictorial.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pictorial.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
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
    public Row11<Integer, Byte, String, String, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Byte, String, String, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Pictorial.PICTORIAL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return Pictorial.PICTORIAL.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Pictorial.PICTORIAL.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Pictorial.PICTORIAL.RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Pictorial.PICTORIAL.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Pictorial.PICTORIAL.IDENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Pictorial.PICTORIAL.ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Pictorial.PICTORIAL.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Pictorial.PICTORIAL.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Pictorial.PICTORIAL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Pictorial.PICTORIAL.UPDATE_TIME;
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
    public Byte component2() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getActivityId();
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
    public Timestamp component9() {
        return getDelTime();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getActivityId();
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
    public Timestamp value9() {
        return getDelTime();
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
    public PictorialRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value2(Byte value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value3(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value4(String value) {
        setRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value6(Integer value) {
        setIdentityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value7(Integer value) {
        setActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value8(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value9(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictorialRecord values(Integer value1, Byte value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Byte value8, Timestamp value9, Timestamp value10, Timestamp value11) {
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
     * Create a detached PictorialRecord
     */
    public PictorialRecord() {
        super(Pictorial.PICTORIAL);
    }

    /**
     * Create a detached, initialised PictorialRecord
     */
    public PictorialRecord(Integer id, Byte action, String path, String rule, Integer userId, Integer identityId, Integer activityId, Byte delFlag, Timestamp delTime, Timestamp createTime, Timestamp updateTime) {
        super(Pictorial.PICTORIAL);

        set(0, id);
        set(1, action);
        set(2, path);
        set(3, rule);
        set(4, userId);
        set(5, identityId);
        set(6, activityId);
        set(7, delFlag);
        set(8, delTime);
        set(9, createTime);
        set(10, updateTime);
    }
}
