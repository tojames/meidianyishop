/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.PackageGoodsCart;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PackageGoodsCartRecord extends UpdatableRecordImpl<PackageGoodsCartRecord> implements Record9<Integer, Integer, Integer, Byte, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1425091186;

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.package_id</code>. 一口价活动id
     */
    public void setPackageId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.package_id</code>. 一口价活动id
     */
    public Integer getPackageId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.group_id</code>. 商品组id
     */
    public void setGroupId(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.group_id</code>. 商品组id
     */
    public Byte getGroupId() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.product_id</code>. 产品id
     */
    public void setProductId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.product_id</code>. 产品id
     */
    public Integer getProductId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.goods_number</code>. 商品数量
     */
    public void setGoodsNumber(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.goods_number</code>. 商品数量
     */
    public Integer getGoodsNumber() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_package_goods_cart.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_package_goods_cart.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Byte, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Byte, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.PACKAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.GOODS_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return PackageGoodsCart.PACKAGE_GOODS_CART.UPDATE_TIME;
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
        return getPackageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getGoodsNumber();
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
        return getPackageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getGoodsNumber();
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
    public PackageGoodsCartRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value3(Integer value) {
        setPackageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value4(Byte value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value5(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value6(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value7(Integer value) {
        setGoodsNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageGoodsCartRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Integer value5, Integer value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PackageGoodsCartRecord
     */
    public PackageGoodsCartRecord() {
        super(PackageGoodsCart.PACKAGE_GOODS_CART);
    }

    /**
     * Create a detached, initialised PackageGoodsCartRecord
     */
    public PackageGoodsCartRecord(Integer id, Integer userId, Integer packageId, Byte groupId, Integer goodsId, Integer productId, Integer goodsNumber, Timestamp createTime, Timestamp updateTime) {
        super(PackageGoodsCart.PACKAGE_GOODS_CART);

        set(0, id);
        set(1, userId);
        set(2, packageId);
        set(3, groupId);
        set(4, goodsId);
        set(5, productId);
        set(6, goodsNumber);
        set(7, createTime);
        set(8, updateTime);
    }
}