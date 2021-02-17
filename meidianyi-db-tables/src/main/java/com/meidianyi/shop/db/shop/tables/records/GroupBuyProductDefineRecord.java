/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.GroupBuyProductDefine;

import java.math.BigDecimal;
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
public class GroupBuyProductDefineRecord extends UpdatableRecordImpl<GroupBuyProductDefineRecord> implements Record10<Integer, Integer, Integer, BigDecimal, Short, Short, BigDecimal, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 238609751;

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.activity_id</code>. 拼团定义id
     */
    public void setActivityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.activity_id</code>. 拼团定义id
     */
    public Integer getActivityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.product_id</code>. 商品规格id
     */
    public void setProductId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.product_id</code>. 商品规格id
     */
    public Integer getProductId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.group_price</code>. 拼团价
     */
    public void setGroupPrice(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.group_price</code>. 拼团价
     */
    public BigDecimal getGroupPrice() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.stock</code>. 库存
     */
    public void setStock(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.stock</code>. 库存
     */
    public Short getStock() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.sale_num</code>. 销量
     */
    public void setSaleNum(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.sale_num</code>. 销量
     */
    public Short getSaleNum() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.grouper_price</code>. 团长优惠价
     */
    public void setGrouperPrice(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.grouper_price</code>. 团长优惠价
     */
    public BigDecimal getGrouperPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_group_buy_product_define.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_group_buy_product_define.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(9);
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
    public Row10<Integer, Integer, Integer, BigDecimal, Short, Short, BigDecimal, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, BigDecimal, Short, Short, BigDecimal, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.GROUP_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.SALE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.GROUPER_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE.GOODS_ID;
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getGroupPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getSaleNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getGrouperPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getGoodsId();
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getGroupPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getSaleNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getGrouperPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value2(Integer value) {
        setActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value3(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value4(BigDecimal value) {
        setGroupPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value5(Short value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value6(Short value) {
        setSaleNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value7(BigDecimal value) {
        setGrouperPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord value10(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupBuyProductDefineRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, Short value5, Short value6, BigDecimal value7, Timestamp value8, Timestamp value9, Integer value10) {
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
     * Create a detached GroupBuyProductDefineRecord
     */
    public GroupBuyProductDefineRecord() {
        super(GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE);
    }

    /**
     * Create a detached, initialised GroupBuyProductDefineRecord
     */
    public GroupBuyProductDefineRecord(Integer id, Integer activityId, Integer productId, BigDecimal groupPrice, Short stock, Short saleNum, BigDecimal grouperPrice, Timestamp createTime, Timestamp updateTime, Integer goodsId) {
        super(GroupBuyProductDefine.GROUP_BUY_PRODUCT_DEFINE);

        set(0, id);
        set(1, activityId);
        set(2, productId);
        set(3, groupPrice);
        set(4, stock);
        set(5, saleNum);
        set(6, grouperPrice);
        set(7, createTime);
        set(8, updateTime);
        set(9, goodsId);
    }
}