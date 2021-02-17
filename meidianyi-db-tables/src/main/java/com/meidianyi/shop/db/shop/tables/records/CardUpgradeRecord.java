/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.CardUpgrade;

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
public class CardUpgradeRecord extends UpdatableRecordImpl<CardUpgradeRecord> implements Record12<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1458275226;

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.old_card_id</code>. 升级前卡id
     */
    public void setOldCardId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.old_card_id</code>. 升级前卡id
     */
    public Integer getOldCardId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.new_card_id</code>. 升级后卡id
     */
    public void setNewCardId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.new_card_id</code>. 升级后卡id
     */
    public Integer getNewCardId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.old_grade</code>. 升级前卡等级
     */
    public void setOldGrade(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.old_grade</code>. 升级前卡等级
     */
    public String getOldGrade() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.new_grade</code>. 升级后卡等级
     */
    public void setNewGrade(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.new_grade</code>. 升级后卡等级
     */
    public String getNewGrade() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.old_card_name</code>.
     */
    public void setOldCardName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.old_card_name</code>.
     */
    public String getOldCardName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.new_card_name</code>.
     */
    public void setNewCardName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.new_card_name</code>.
     */
    public String getNewCardName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.grade_condition</code>. 条件
     */
    public void setGradeCondition(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.grade_condition</code>. 条件
     */
    public String getGradeCondition() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.operate</code>. 操作备注
     */
    public void setOperate(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.operate</code>. 操作备注
     */
    public String getOperate() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_upgrade.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_upgrade.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
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
    public Row12<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CardUpgrade.CARD_UPGRADE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CardUpgrade.CARD_UPGRADE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CardUpgrade.CARD_UPGRADE.OLD_CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CardUpgrade.CARD_UPGRADE.NEW_CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CardUpgrade.CARD_UPGRADE.OLD_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CardUpgrade.CARD_UPGRADE.NEW_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CardUpgrade.CARD_UPGRADE.OLD_CARD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CardUpgrade.CARD_UPGRADE.NEW_CARD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CardUpgrade.CARD_UPGRADE.GRADE_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CardUpgrade.CARD_UPGRADE.OPERATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return CardUpgrade.CARD_UPGRADE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CardUpgrade.CARD_UPGRADE.UPDATE_TIME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getOldCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getNewCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOldGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNewGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOldCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNewCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getGradeCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOperate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOldCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNewCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOldGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNewGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOldCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNewCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getGradeCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOperate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value3(Integer value) {
        setOldCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value4(Integer value) {
        setNewCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value5(String value) {
        setOldGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value6(String value) {
        setNewGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value7(String value) {
        setOldCardName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value8(String value) {
        setNewCardName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value9(String value) {
        setGradeCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value10(String value) {
        setOperate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardUpgradeRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached CardUpgradeRecord
     */
    public CardUpgradeRecord() {
        super(CardUpgrade.CARD_UPGRADE);
    }

    /**
     * Create a detached, initialised CardUpgradeRecord
     */
    public CardUpgradeRecord(Integer id, Integer userId, Integer oldCardId, Integer newCardId, String oldGrade, String newGrade, String oldCardName, String newCardName, String gradeCondition, String operate, Timestamp createTime, Timestamp updateTime) {
        super(CardUpgrade.CARD_UPGRADE);

        set(0, id);
        set(1, userId);
        set(2, oldCardId);
        set(3, newCardId);
        set(4, oldGrade);
        set(5, newGrade);
        set(6, oldCardName);
        set(7, newCardName);
        set(8, gradeCondition);
        set(9, operate);
        set(10, createTime);
        set(11, updateTime);
    }
}
