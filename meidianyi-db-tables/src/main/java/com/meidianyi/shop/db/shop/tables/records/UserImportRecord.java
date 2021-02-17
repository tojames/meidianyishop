/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UserImport;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class UserImportRecord extends UpdatableRecordImpl<UserImportRecord> implements Record10<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> {

    private static final long serialVersionUID = -1179832729;

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.card_id</code>. 会员卡ID
     */
    public void setCardId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.card_id</code>. 会员卡ID
     */
    public String getCardId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.total_num</code>. 总数
     */
    public void setTotalNum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.total_num</code>. 总数
     */
    public Integer getTotalNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.success_num</code>. 成功数
     */
    public void setSuccessNum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.success_num</code>. 成功数
     */
    public Integer getSuccessNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.tag_id</code>. 标签ID
     */
    public void setTagId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.tag_id</code>. 标签ID
     */
    public Integer getTagId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.group_id</code>. 分销员分组ID
     */
    public void setGroupId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.group_id</code>. 分销员分组ID
     */
    public Integer getGroupId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_8984736.b2c_user_import.del_time</code>.
     */
    public void setDelTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_8984736.b2c_user_import.del_time</code>.
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(9);
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
    public Row10<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Byte, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserImport.USER_IMPORT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserImport.USER_IMPORT.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserImport.USER_IMPORT.TOTAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserImport.USER_IMPORT.SUCCESS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserImport.USER_IMPORT.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return UserImport.USER_IMPORT.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserImport.USER_IMPORT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return UserImport.USER_IMPORT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return UserImport.USER_IMPORT.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return UserImport.USER_IMPORT.DEL_TIME;
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
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTotalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getSuccessNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getDelTime();
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
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTotalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSuccessNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value2(String value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value3(Integer value) {
        setTotalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value4(Integer value) {
        setSuccessNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value5(Integer value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value6(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value9(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord value10(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImportRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8, Byte value9, Timestamp value10) {
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
     * Create a detached UserImportRecord
     */
    public UserImportRecord() {
        super(UserImport.USER_IMPORT);
    }

    /**
     * Create a detached, initialised UserImportRecord
     */
    public UserImportRecord(Integer id, String cardId, Integer totalNum, Integer successNum, Integer tagId, Integer groupId, Timestamp createTime, Timestamp updateTime, Byte delFlag, Timestamp delTime) {
        super(UserImport.USER_IMPORT);

        set(0, id);
        set(1, cardId);
        set(2, totalNum);
        set(3, successNum);
        set(4, tagId);
        set(5, groupId);
        set(6, createTime);
        set(7, updateTime);
        set(8, delFlag);
        set(9, delTime);
    }
}