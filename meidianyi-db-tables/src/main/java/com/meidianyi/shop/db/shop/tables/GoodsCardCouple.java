/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.tables.records.GoodsCardCoupleRecord;

import java.sql.Timestamp;
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
public class GoodsCardCouple extends TableImpl<GoodsCardCoupleRecord> {

    private static final long serialVersionUID = 1965776640;

    /**
     * The reference instance of <code>jmini_shop_444801.b2c_goods_card_couple</code>
     */
    public static final GoodsCardCouple GOODS_CARD_COUPLE = new GoodsCardCouple();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsCardCoupleRecord> getRecordType() {
        return GoodsCardCoupleRecord.class;
    }

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.id</code>. 会员卡专属商品关联id
     */
    public final TableField<GoodsCardCoupleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "会员卡专属商品关联id");

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.card_id</code>. 会员卡ID
     */
    public final TableField<GoodsCardCoupleRecord, Integer> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会员卡ID");

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.gcta_id</code>. 商品或类型id
     */
    public final TableField<GoodsCardCoupleRecord, Integer> GCTA_ID = createField("gcta_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品或类型id");

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.type</code>. 标签关联类型： 1：关联商品 2：关联商家分类 3：关联平台分类
     */
    public final TableField<GoodsCardCoupleRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "标签关联类型： 1：关联商品 2：关联商家分类 3：关联平台分类");

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.create_time</code>.
     */
    public final TableField<GoodsCardCoupleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_444801.b2c_goods_card_couple.update_time</code>. 最后修改时间
     */
    public final TableField<GoodsCardCoupleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>jmini_shop_444801.b2c_goods_card_couple</code> table reference
     */
    public GoodsCardCouple() {
        this(DSL.name("b2c_goods_card_couple"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_444801.b2c_goods_card_couple</code> table reference
     */
    public GoodsCardCouple(String alias) {
        this(DSL.name(alias), GOODS_CARD_COUPLE);
    }

    /**
     * Create an aliased <code>jmini_shop_444801.b2c_goods_card_couple</code> table reference
     */
    public GoodsCardCouple(Name alias) {
        this(alias, GOODS_CARD_COUPLE);
    }

    private GoodsCardCouple(Name alias, Table<GoodsCardCoupleRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsCardCouple(Name alias, Table<GoodsCardCoupleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsCardCouple(Table<O> child, ForeignKey<O, GoodsCardCoupleRecord> key) {
        super(child, key, GOODS_CARD_COUPLE);
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
        return Arrays.<Index>asList(Indexes.GOODS_CARD_COUPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsCardCoupleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_CARD_COUPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsCardCoupleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_CARD_COUPLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsCardCoupleRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsCardCoupleRecord>>asList(Keys.KEY_B2C_GOODS_CARD_COUPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCouple as(String alias) {
        return new GoodsCardCouple(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsCardCouple as(Name alias) {
        return new GoodsCardCouple(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsCardCouple rename(String name) {
        return new GoodsCardCouple(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsCardCouple rename(Name name) {
        return new GoodsCardCouple(name, null);
    }
}
