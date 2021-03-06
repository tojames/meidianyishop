/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.ArticleCategory;

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
public class ArticleCategoryRecord extends UpdatableRecordImpl<ArticleCategoryRecord> implements Record5<Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 222849609;

    /**
     * Setter for <code>mini_main.b2c_article_category.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_article_category.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_article_category.category_name</code>.
     */
    public void setCategoryName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_article_category.category_name</code>.
     */
    public String getCategoryName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_article_category.use_footer_nav</code>. 是否用于底部导航
     */
    public void setUseFooterNav(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_article_category.use_footer_nav</code>. 是否用于底部导航
     */
    public Byte getUseFooterNav() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_article_category.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_article_category.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_article_category.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_article_category.update_time</code>. 更新时间
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
    public Row5<Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ArticleCategory.ARTICLE_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ArticleCategory.ARTICLE_CATEGORY.CATEGORY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ArticleCategory.ARTICLE_CATEGORY.USE_FOOTER_NAV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ArticleCategory.ARTICLE_CATEGORY.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ArticleCategory.ARTICLE_CATEGORY.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCategoryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getUseFooterNav();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getAddTime();
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
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCategoryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getUseFooterNav();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getAddTime();
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
    public ArticleCategoryRecord value1(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleCategoryRecord value2(String value) {
        setCategoryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleCategoryRecord value3(Byte value) {
        setUseFooterNav(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleCategoryRecord value4(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleCategoryRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleCategoryRecord values(Integer value1, String value2, Byte value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached ArticleCategoryRecord
     */
    public ArticleCategoryRecord() {
        super(ArticleCategory.ARTICLE_CATEGORY);
    }

    /**
     * Create a detached, initialised ArticleCategoryRecord
     */
    public ArticleCategoryRecord(Integer categoryId, String categoryName, Byte useFooterNav, Timestamp addTime, Timestamp updateTime) {
        super(ArticleCategory.ARTICLE_CATEGORY);

        set(0, categoryId);
        set(1, categoryName);
        set(2, useFooterNav);
        set(3, addTime);
        set(4, updateTime);
    }
}
