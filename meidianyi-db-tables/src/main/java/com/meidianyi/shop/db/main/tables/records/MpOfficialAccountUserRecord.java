/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.MpOfficialAccountUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class MpOfficialAccountUserRecord extends UpdatableRecordImpl<MpOfficialAccountUserRecord> implements Record14<Integer, String, String, Integer, Byte, String, Byte, String, String, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = 2124276862;

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.rec_id</code>.
     */
    public void setRecId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.rec_id</code>.
     */
    public Integer getRecId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.openid</code>. 用户的标识，对当前公众号唯一
     */
    public void setOpenid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.openid</code>. 用户的标识，对当前公众号唯一
     */
    public String getOpenid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.app_id</code>. 授权公众号appId
     */
    public void setAppId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.app_id</code>. 授权公众号appId
     */
    public String getAppId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.sys_id</code>. 系统账户ID
     */
    public void setSysId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.sys_id</code>. 系统账户ID
     */
    public Integer getSysId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.subscribe</code>. 是否订阅，为0代表此用户没有关注该公众号，拉取不到其余信息。
     */
    public void setSubscribe(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.subscribe</code>. 是否订阅，为0代表此用户没有关注该公众号，拉取不到其余信息。
     */
    public Byte getSubscribe() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.nickname</code>.
     */
    public void setNickname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.nickname</code>.
     */
    public String getNickname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.sex</code>. 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public void setSex(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.sex</code>. 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public Byte getSex() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.language</code>. 用户的语言，简体中文为zh_CN
     */
    public void setLanguage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.language</code>. 用户的语言，简体中文为zh_CN
     */
    public String getLanguage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.city</code>. 用户所在城市
     */
    public void setCity(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.city</code>. 用户所在城市
     */
    public String getCity() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.province</code>. 用户所在省份
     */
    public void setProvince(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.province</code>. 用户所在省份
     */
    public String getProvince() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.country</code>. 用户所在国家
     */
    public void setCountry(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.country</code>. 用户所在国家
     */
    public String getCountry() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.headimgurl</code>. 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    public void setHeadimgurl(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.headimgurl</code>. 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    public String getHeadimgurl() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.subscribe_time</code>. 用户关注时间，如果用户曾多次关注，则取最后关注时间
     */
    public void setSubscribeTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.subscribe_time</code>. 用户关注时间，如果用户曾多次关注，则取最后关注时间
     */
    public Timestamp getSubscribeTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_official_account_user.unionid</code>. 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     */
    public void setUnionid(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_official_account_user.unionid</code>. 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     */
    public String getUnionid() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, Byte, String, Byte, String, String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, Byte, String, Byte, String, String, String, String, String, Timestamp, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.REC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.OPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.SUBSCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.HEADIMGURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.SUBSCRIBE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER.UNIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getSubscribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getHeadimgurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getSubscribeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getUnionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getSubscribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getHeadimgurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getSubscribeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getUnionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value1(Integer value) {
        setRecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value2(String value) {
        setOpenid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value3(String value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value4(Integer value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value5(Byte value) {
        setSubscribe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value6(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value7(Byte value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value8(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value9(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value10(String value) {
        setProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value11(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value12(String value) {
        setHeadimgurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value13(Timestamp value) {
        setSubscribeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord value14(String value) {
        setUnionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpOfficialAccountUserRecord values(Integer value1, String value2, String value3, Integer value4, Byte value5, String value6, Byte value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, String value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpOfficialAccountUserRecord
     */
    public MpOfficialAccountUserRecord() {
        super(MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER);
    }

    /**
     * Create a detached, initialised MpOfficialAccountUserRecord
     */
    public MpOfficialAccountUserRecord(Integer recId, String openid, String appId, Integer sysId, Byte subscribe, String nickname, Byte sex, String language, String city, String province, String country, String headimgurl, Timestamp subscribeTime, String unionid) {
        super(MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER);

        set(0, recId);
        set(1, openid);
        set(2, appId);
        set(3, sysId);
        set(4, subscribe);
        set(5, nickname);
        set(6, sex);
        set(7, language);
        set(8, city);
        set(9, province);
        set(10, country);
        set(11, headimgurl);
        set(12, subscribeTime);
        set(13, unionid);
    }
}
