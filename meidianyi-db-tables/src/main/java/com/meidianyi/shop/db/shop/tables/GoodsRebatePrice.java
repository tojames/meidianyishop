/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.GoodsRebatePriceRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class GoodsRebatePrice extends TableImpl<GoodsRebatePriceRecord> {

    private static final long serialVersionUID = 110947125;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods_rebate_price</code>
     */
    public static final GoodsRebatePrice GOODS_REBATE_PRICE = new GoodsRebatePrice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsRebatePriceRecord> getRecordType() {
        return GoodsRebatePriceRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.id</code>.
     */
    public final TableField<GoodsRebatePriceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.goods_id</code>. 商品id
     */
    public final TableField<GoodsRebatePriceRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER, this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.product_id</code>.
     */
    public final TableField<GoodsRebatePriceRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.advise_price</code>.
     */
    public final TableField<GoodsRebatePriceRecord, BigDecimal> ADVISE_PRICE = createField("advise_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.min_price</code>.
     */
    public final TableField<GoodsRebatePriceRecord, BigDecimal> MIN_PRICE = createField("min_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.max_price</code>.
     */
    public final TableField<GoodsRebatePriceRecord, BigDecimal> MAX_PRICE = createField("max_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.create_time</code>.
     */
    public final TableField<GoodsRebatePriceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.update_time</code>. 最后修改时间
     */
    public final TableField<GoodsRebatePriceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_goods_rebate_price.del_flag</code>.
     */
    public final TableField<GoodsRebatePriceRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_goods_rebate_price</code> table reference
     */
    public GoodsRebatePrice() {
        this(DSL.name("b2c_goods_rebate_price"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_rebate_price</code> table reference
     */
    public GoodsRebatePrice(String alias) {
        this(DSL.name(alias), GOODS_REBATE_PRICE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_rebate_price</code> table reference
     */
    public GoodsRebatePrice(Name alias) {
        this(alias, GOODS_REBATE_PRICE);
    }

    private GoodsRebatePrice(Name alias, Table<GoodsRebatePriceRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsRebatePrice(Name alias, Table<GoodsRebatePriceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsRebatePrice(Table<O> child, ForeignKey<O, GoodsRebatePriceRecord> key) {
        super(child, key, GOODS_REBATE_PRICE);
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
        return Arrays.<Index>asList(Indexes.GOODS_REBATE_PRICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsRebatePriceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_REBATE_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsRebatePriceRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_REBATE_PRICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsRebatePriceRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsRebatePriceRecord>>asList(Keys.KEY_B2C_GOODS_REBATE_PRICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRebatePrice as(String alias) {
        return new GoodsRebatePrice(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRebatePrice as(Name alias) {
        return new GoodsRebatePrice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsRebatePrice rename(String name) {
        return new GoodsRebatePrice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsRebatePrice rename(Name name) {
        return new GoodsRebatePrice(name, null);
    }
}