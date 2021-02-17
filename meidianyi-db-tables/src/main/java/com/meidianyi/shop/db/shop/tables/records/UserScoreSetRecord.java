/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UserScoreSet;

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
public class UserScoreSetRecord extends UpdatableRecordImpl<UserScoreSetRecord> implements Record14<Integer, Integer, String, Byte, Byte, String, String, String, Integer, Byte, String, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = -235556863;

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.score_name</code>. 购买:buy,评价:comment,兑换:convert
     */
    public void setScoreName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.score_name</code>. 购买:buy,评价:comment,兑换:convert
     */
    public String getScoreName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.status</code>. 0:未启用,1:启用
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.status</code>. 0:未启用,1:启用
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.two_status</code>.
     */
    public void setTwoStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.two_status</code>.
     */
    public Byte getTwoStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.set_val</code>.
     */
    public void setSetVal(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.set_val</code>.
     */
    public String getSetVal() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.set_val2</code>.
     */
    public void setSetVal2(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.set_val2</code>.
     */
    public String getSetVal2() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.set_val3</code>.
     */
    public void setSetVal3(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.set_val3</code>.
     */
    public String getSetVal3() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.sign_val</code>. 签到积分
     */
    public void setSignVal(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.sign_val</code>. 签到积分
     */
    public Integer getSignVal() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.sign_date</code>. 签到天数
     */
    public void setSignDate(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.sign_date</code>. 签到天数
     */
    public Byte getSignDate() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.desc</code>.
     */
    public void setDesc(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.desc</code>.
     */
    public String getDesc() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_score_set.growth_flag</code>. 0:不送成长值，1：送成长值
     */
    public void setGrowthFlag(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_score_set.growth_flag</code>. 0:不送成长值，1：送成长值
     */
    public Byte getGrowthFlag() {
        return (Byte) get(13);
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
    public Row14<Integer, Integer, String, Byte, Byte, String, String, String, Integer, Byte, String, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Byte, Byte, String, String, String, Integer, Byte, String, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserScoreSet.USER_SCORE_SET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserScoreSet.USER_SCORE_SET.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserScoreSet.USER_SCORE_SET.SCORE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UserScoreSet.USER_SCORE_SET.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return UserScoreSet.USER_SCORE_SET.TWO_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserScoreSet.USER_SCORE_SET.SET_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserScoreSet.USER_SCORE_SET.SET_VAL2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UserScoreSet.USER_SCORE_SET.SET_VAL3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return UserScoreSet.USER_SCORE_SET.SIGN_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return UserScoreSet.USER_SCORE_SET.SIGN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UserScoreSet.USER_SCORE_SET.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return UserScoreSet.USER_SCORE_SET.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return UserScoreSet.USER_SCORE_SET.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return UserScoreSet.USER_SCORE_SET.GROWTH_FLAG;
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
        return getScoreName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getTwoStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSetVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSetVal2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSetVal3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getSignVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getSignDate();
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
    public Timestamp component12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getGrowthFlag();
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
        return getScoreName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getTwoStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSetVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSetVal2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSetVal3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSignVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getSignDate();
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
    public Timestamp value12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getGrowthFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value3(String value) {
        setScoreName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value5(Byte value) {
        setTwoStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value6(String value) {
        setSetVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value7(String value) {
        setSetVal2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value8(String value) {
        setSetVal3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value9(Integer value) {
        setSignVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value10(Byte value) {
        setSignDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value11(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value12(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord value14(Byte value) {
        setGrowthFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSetRecord values(Integer value1, Integer value2, String value3, Byte value4, Byte value5, String value6, String value7, String value8, Integer value9, Byte value10, String value11, Timestamp value12, Timestamp value13, Byte value14) {
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
     * Create a detached UserScoreSetRecord
     */
    public UserScoreSetRecord() {
        super(UserScoreSet.USER_SCORE_SET);
    }

    /**
     * Create a detached, initialised UserScoreSetRecord
     */
    public UserScoreSetRecord(Integer id, Integer shopId, String scoreName, Byte status, Byte twoStatus, String setVal, String setVal2, String setVal3, Integer signVal, Byte signDate, String desc, Timestamp createTime, Timestamp updateTime, Byte growthFlag) {
        super(UserScoreSet.USER_SCORE_SET);

        set(0, id);
        set(1, shopId);
        set(2, scoreName);
        set(3, status);
        set(4, twoStatus);
        set(5, setVal);
        set(6, setVal2);
        set(7, setVal3);
        set(8, signVal);
        set(9, signDate);
        set(10, desc);
        set(11, createTime);
        set(12, updateTime);
        set(13, growthFlag);
    }
}
