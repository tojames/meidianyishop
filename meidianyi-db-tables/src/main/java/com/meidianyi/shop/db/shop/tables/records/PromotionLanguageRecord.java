/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.PromotionLanguage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PromotionLanguageRecord extends UpdatableRecordImpl<PromotionLanguageRecord> implements Record7<Integer, String, String, Timestamp, Timestamp, Byte, Byte> {

    private static final long serialVersionUID = -1931112256;

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.title</code>. 推广语标题
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.title</code>. 推广语标题
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.promotion_language</code>. 推广语
     */
    public void setPromotionLanguage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.promotion_language</code>. 推广语
     */
    public String getPromotionLanguage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.is_block</code>. 是否停用：0否，1是
     */
    public void setIsBlock(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.is_block</code>. 是否停用：0否，1是
     */
    public Byte getIsBlock() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>jmini_shop_471752.b2c_promotion_language.del_flag</code>. 是否停用：0否，1是
     */
    public void setDelFlag(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_471752.b2c_promotion_language.del_flag</code>. 是否停用：0否，1是
     */
    public Byte getDelFlag() {
        return (Byte) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Timestamp, Timestamp, Byte, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Timestamp, Timestamp, Byte, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PromotionLanguage.PROMOTION_LANGUAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PromotionLanguage.PROMOTION_LANGUAGE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PromotionLanguage.PROMOTION_LANGUAGE.PROMOTION_LANGUAGE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return PromotionLanguage.PROMOTION_LANGUAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return PromotionLanguage.PROMOTION_LANGUAGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return PromotionLanguage.PROMOTION_LANGUAGE.IS_BLOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return PromotionLanguage.PROMOTION_LANGUAGE.DEL_FLAG;
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPromotionLanguage();
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
    public Byte component6() {
        return getIsBlock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
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
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPromotionLanguage();
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
    public Byte value6() {
        return getIsBlock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value3(String value) {
        setPromotionLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value6(Byte value) {
        setIsBlock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord value7(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguageRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5, Byte value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PromotionLanguageRecord
     */
    public PromotionLanguageRecord() {
        super(PromotionLanguage.PROMOTION_LANGUAGE);
    }

    /**
     * Create a detached, initialised PromotionLanguageRecord
     */
    public PromotionLanguageRecord(Integer id, String title, String promotionLanguage, Timestamp createTime, Timestamp updateTime, Byte isBlock, Byte delFlag) {
        super(PromotionLanguage.PROMOTION_LANGUAGE);

        set(0, id);
        set(1, title);
        set(2, promotionLanguage);
        set(3, createTime);
        set(4, updateTime);
        set(5, isBlock);
        set(6, delFlag);
    }
}
