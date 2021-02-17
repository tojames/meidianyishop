/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UserPromotionLanguage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class UserPromotionLanguageRecord extends UpdatableRecordImpl<UserPromotionLanguageRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1743302648;

    /**
     * Setter for <code>jmini_shop_471752.b2c_user_promotion_language.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_user_promotion_language.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_user_promotion_language.lan_id</code>. 推广语关联ID
     */
    public void setLanId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_user_promotion_language.lan_id</code>. 推广语关联ID
     */
    public Integer getLanId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_user_promotion_language.user_id</code>. 会员ID
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_user_promotion_language.user_id</code>. 会员ID
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_user_promotion_language.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_user_promotion_language.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_user_promotion_language.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_user_promotion_language.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserPromotionLanguage.USER_PROMOTION_LANGUAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserPromotionLanguage.USER_PROMOTION_LANGUAGE.LAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserPromotionLanguage.USER_PROMOTION_LANGUAGE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserPromotionLanguage.USER_PROMOTION_LANGUAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserPromotionLanguage.USER_PROMOTION_LANGUAGE.UPDATE_TIME;
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
        return getLanId();
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
    public Timestamp component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
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
    public Integer value2() {
        return getLanId();
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
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord value2(Integer value) {
        setLanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPromotionLanguageRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPromotionLanguageRecord
     */
    public UserPromotionLanguageRecord() {
        super(UserPromotionLanguage.USER_PROMOTION_LANGUAGE);
    }

    /**
     * Create a detached, initialised UserPromotionLanguageRecord
     */
    public UserPromotionLanguageRecord(Integer id, Integer lanId, Integer userId, Timestamp createTime, Timestamp updateTime) {
        super(UserPromotionLanguage.USER_PROMOTION_LANGUAGE);

        set(0, id);
        set(1, lanId);
        set(2, userId);
        set(3, createTime);
        set(4, updateTime);
    }
}
