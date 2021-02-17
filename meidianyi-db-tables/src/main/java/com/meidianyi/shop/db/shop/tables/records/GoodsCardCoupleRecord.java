/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.GoodsCardCouple;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class GoodsCardCoupleRecord extends UpdatableRecordImpl<GoodsCardCoupleRecord> implements Record6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1785790243;

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.id</code>. 会员卡专属商品关联id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.id</code>. 会员卡专属商品关联id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.card_id</code>. 会员卡ID
     */
    public void setCardId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.card_id</code>. 会员卡ID
     */
    public Integer getCardId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.gcta_id</code>. 商品或类型id
     */
    public void setGctaId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.gcta_id</code>. 商品或类型id
     */
    public Integer getGctaId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.type</code>. 标签关联类型： 1：关联商品 2：关联商家分类 3：关联平台分类
     */
    public void setType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.type</code>. 标签关联类型： 1：关联商品 2：关联商家分类 3：关联平台分类
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jmini_shop_444801.b2c_goods_card_couple.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_444801.b2c_goods_card_couple.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.GCTA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return GoodsCardCouple.GOODS_CARD_COUPLE.UPDATE_TIME;
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
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGctaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getType();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGctaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getType();
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
    public GoodsCardCoupleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord value2(Integer value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord value3(Integer value) {
        setGctaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord value4(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCoupleRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GoodsCardCoupleRecord
     */
    public GoodsCardCoupleRecord() {
        super(GoodsCardCouple.GOODS_CARD_COUPLE);
    }

    /**
     * Create a detached, initialised GoodsCardCoupleRecord
     */
    public GoodsCardCoupleRecord(Integer id, Integer cardId, Integer gctaId, Byte type, Timestamp createTime, Timestamp updateTime) {
        super(GoodsCardCouple.GOODS_CARD_COUPLE);

        set(0, id);
        set(1, cardId);
        set(2, gctaId);
        set(3, type);
        set(4, createTime);
        set(5, updateTime);
    }
}
