/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.ShopFreeExperience;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ShopFreeExperienceRecord extends UpdatableRecordImpl<ShopFreeExperienceRecord> implements Record12<Integer, String, String, String, Integer, String, Timestamp, Byte, Integer, String, String, Integer> {

    private static final long serialVersionUID = 155757688;

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.fe_id</code>.
     */
    public void setFeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.fe_id</code>.
     */
    public Integer getFeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.company</code>. 公司
     */
    public void setCompany(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.company</code>. 公司
     */
    public String getCompany() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.contact</code>. 联系人
     */
    public void setContact(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.contact</code>. 联系人
     */
    public String getContact() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.mobile</code>. 电话
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.mobile</code>. 电话
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.province_id</code>.
     */
    public void setProvinceId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.province_id</code>.
     */
    public Integer getProvinceId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.content</code>. 留言
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.content</code>. 留言
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.ask_time</code>. 申请时间
     */
    public void setAskTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.ask_time</code>. 申请时间
     */
    public Timestamp getAskTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.is_deal</code>. 1:已查看
     */
    public void setIsDeal(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.is_deal</code>. 1:已查看
     */
    public Byte getIsDeal() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.shop_id</code>. 开通店铺ID
     */
    public void setShopId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.shop_id</code>. 开通店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.desc</code>. 备注
     */
    public void setDesc(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.desc</code>. 备注
     */
    public String getDesc() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.source</code>. 来源shop_id
     */
    public void setSource(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.source</code>. 来源shop_id
     */
    public String getSource() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_free_experience.user_id</code>. 用户ID
     */
    public void setUserId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_free_experience.user_id</code>. 用户ID
     */
    public Integer getUserId() {
        return (Integer) get(11);
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
    public Row12<Integer, String, String, String, Integer, String, Timestamp, Byte, Integer, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, Timestamp, Byte, Integer, String, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.FE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.CONTACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.PROVINCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.ASK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.IS_DEAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ShopFreeExperience.SHOP_FREE_EXPERIENCE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getProvinceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getAskTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getIsDeal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getProvinceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getAskTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsDeal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value1(Integer value) {
        setFeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value2(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value3(String value) {
        setContact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value5(Integer value) {
        setProvinceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value7(Timestamp value) {
        setAskTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value8(Byte value) {
        setIsDeal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value9(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value10(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value11(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord value12(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopFreeExperienceRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, Timestamp value7, Byte value8, Integer value9, String value10, String value11, Integer value12) {
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
     * Create a detached ShopFreeExperienceRecord
     */
    public ShopFreeExperienceRecord() {
        super(ShopFreeExperience.SHOP_FREE_EXPERIENCE);
    }

    /**
     * Create a detached, initialised ShopFreeExperienceRecord
     */
    public ShopFreeExperienceRecord(Integer feId, String company, String contact, String mobile, Integer provinceId, String content, Timestamp askTime, Byte isDeal, Integer shopId, String desc, String source, Integer userId) {
        super(ShopFreeExperience.SHOP_FREE_EXPERIENCE);

        set(0, feId);
        set(1, company);
        set(2, contact);
        set(3, mobile);
        set(4, provinceId);
        set(5, content);
        set(6, askTime);
        set(7, isDeal);
        set(8, shopId);
        set(9, desc);
        set(10, source);
        set(11, userId);
    }
}
