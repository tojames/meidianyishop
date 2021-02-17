/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.FirstSpecialProductRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class FirstSpecialProduct extends TableImpl<FirstSpecialProductRecord> {

    private static final long serialVersionUID = 1776474763;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_first_special_product</code>
     */
    public static final FirstSpecialProduct FIRST_SPECIAL_PRODUCT = new FirstSpecialProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FirstSpecialProductRecord> getRecordType() {
        return FirstSpecialProductRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_first_special_product.id</code>.
     */
    public final TableField<FirstSpecialProductRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_product.first_special_id</code>. 限时减价活动ID
     */
    public final TableField<FirstSpecialProductRecord, Integer> FIRST_SPECIAL_ID = createField("first_special_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "限时减价活动ID");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_product.goods_id</code>. 商品ID
     */
    public final TableField<FirstSpecialProductRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_product.prd_id</code>. 规格id
     */
    public final TableField<FirstSpecialProductRecord, Integer> PRD_ID = createField("prd_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "规格id");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_product.prd_price</code>. 折后价格
     */
    public final TableField<FirstSpecialProductRecord, BigDecimal> PRD_PRICE = createField("prd_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "折后价格");

    /**
     * Create a <code>mini_shop_471752.b2c_first_special_product</code> table reference
     */
    public FirstSpecialProduct() {
        this(DSL.name("b2c_first_special_product"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_first_special_product</code> table reference
     */
    public FirstSpecialProduct(String alias) {
        this(DSL.name(alias), FIRST_SPECIAL_PRODUCT);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_first_special_product</code> table reference
     */
    public FirstSpecialProduct(Name alias) {
        this(alias, FIRST_SPECIAL_PRODUCT);
    }

    private FirstSpecialProduct(Name alias, Table<FirstSpecialProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private FirstSpecialProduct(Name alias, Table<FirstSpecialProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FirstSpecialProduct(Table<O> child, ForeignKey<O, FirstSpecialProductRecord> key) {
        super(child, key, FIRST_SPECIAL_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FIRST_SPECIAL_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FirstSpecialProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FIRST_SPECIAL_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FirstSpecialProductRecord> getPrimaryKey() {
        return Keys.KEY_B2C_FIRST_SPECIAL_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FirstSpecialProductRecord>> getKeys() {
        return Arrays.<UniqueKey<FirstSpecialProductRecord>>asList(Keys.KEY_B2C_FIRST_SPECIAL_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstSpecialProduct as(String alias) {
        return new FirstSpecialProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstSpecialProduct as(Name alias) {
        return new FirstSpecialProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FirstSpecialProduct rename(String name) {
        return new FirstSpecialProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FirstSpecialProduct rename(Name name) {
        return new FirstSpecialProduct(name, null);
    }
}
