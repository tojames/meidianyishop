/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.FirstSpecialGoodsRecord;

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
public class FirstSpecialGoods extends TableImpl<FirstSpecialGoodsRecord> {

    private static final long serialVersionUID = 530585911;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_first_special_goods</code>
     */
    public static final FirstSpecialGoods FIRST_SPECIAL_GOODS = new FirstSpecialGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FirstSpecialGoodsRecord> getRecordType() {
        return FirstSpecialGoodsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.id</code>.
     */
    public final TableField<FirstSpecialGoodsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.first_special_id</code>. 限时减价活动ID
     */
    public final TableField<FirstSpecialGoodsRecord, Integer> FIRST_SPECIAL_ID = createField("first_special_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "限时减价活动ID");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.goods_id</code>. 商品ID
     */
    public final TableField<FirstSpecialGoodsRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.discount</code>. 打几折
     */
    public final TableField<FirstSpecialGoodsRecord, BigDecimal> DISCOUNT = createField("discount", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "打几折");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.reduce_price</code>. 减多少钱
     */
    public final TableField<FirstSpecialGoodsRecord, BigDecimal> REDUCE_PRICE = createField("reduce_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "减多少钱");

    /**
     * The column <code>mini_shop_471752.b2c_first_special_goods.goods_price</code>. 折后价格
     */
    public final TableField<FirstSpecialGoodsRecord, BigDecimal> GOODS_PRICE = createField("goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "折后价格");

    /**
     * Create a <code>mini_shop_471752.b2c_first_special_goods</code> table reference
     */
    public FirstSpecialGoods() {
        this(DSL.name("b2c_first_special_goods"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_first_special_goods</code> table reference
     */
    public FirstSpecialGoods(String alias) {
        this(DSL.name(alias), FIRST_SPECIAL_GOODS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_first_special_goods</code> table reference
     */
    public FirstSpecialGoods(Name alias) {
        this(alias, FIRST_SPECIAL_GOODS);
    }

    private FirstSpecialGoods(Name alias, Table<FirstSpecialGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FirstSpecialGoods(Name alias, Table<FirstSpecialGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FirstSpecialGoods(Table<O> child, ForeignKey<O, FirstSpecialGoodsRecord> key) {
        super(child, key, FIRST_SPECIAL_GOODS);
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
        return Arrays.<Index>asList(Indexes.FIRST_SPECIAL_GOODS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FirstSpecialGoodsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FIRST_SPECIAL_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FirstSpecialGoodsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_FIRST_SPECIAL_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FirstSpecialGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<FirstSpecialGoodsRecord>>asList(Keys.KEY_B2C_FIRST_SPECIAL_GOODS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstSpecialGoods as(String alias) {
        return new FirstSpecialGoods(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstSpecialGoods as(Name alias) {
        return new FirstSpecialGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FirstSpecialGoods rename(String name) {
        return new FirstSpecialGoods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FirstSpecialGoods rename(Name name) {
        return new FirstSpecialGoods(name, null);
    }
}
