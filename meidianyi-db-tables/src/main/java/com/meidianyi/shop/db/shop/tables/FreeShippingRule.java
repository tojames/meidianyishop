/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.FreeShippingRuleRecord;
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
public class FreeShippingRule extends TableImpl<FreeShippingRuleRecord> {

    private static final long serialVersionUID = 588030677;

    /**
     * The reference instance of <code>mini_shop_4748160.b2c_free_shipping_rule</code>
     */
    public static final FreeShippingRule FREE_SHIPPING_RULE = new FreeShippingRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FreeShippingRuleRecord> getRecordType() {
        return FreeShippingRuleRecord.class;
    }

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.id</code>.
     */
    public final TableField<FreeShippingRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.shipping_id</code>. 包邮活动ID
     */
    public final TableField<FreeShippingRuleRecord, Integer> SHIPPING_ID = createField("shipping_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "包邮活动ID");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.con_type</code>. 包邮条件 0满金额 1满件数
     */
    public final TableField<FreeShippingRuleRecord, Integer> CON_TYPE = createField("con_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "包邮条件 0满金额 1满件数");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.money</code>. 满金额
     */
    public final TableField<FreeShippingRuleRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "满金额");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.num</code>. 满件数
     */
    public final TableField<FreeShippingRuleRecord, Integer> NUM = createField("num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "满件数");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.area</code>. 包邮地区
     */
    public final TableField<FreeShippingRuleRecord, String> AREA = createField("area", org.jooq.impl.SQLDataType.CLOB, this, "包邮地区");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.area_list</code>. 包邮地区
     */
    public final TableField<FreeShippingRuleRecord, String> AREA_LIST = createField("area_list", org.jooq.impl.SQLDataType.CLOB, this, "包邮地区");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.area_text</code>. 包邮地区
     */
    public final TableField<FreeShippingRuleRecord, String> AREA_TEXT = createField("area_text", org.jooq.impl.SQLDataType.CLOB, this, "包邮地区");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.create_time</code>.
     */
    public final TableField<FreeShippingRuleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_4748160.b2c_free_shipping_rule.update_time</code>. 最后修改时间
     */
    public final TableField<FreeShippingRuleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_4748160.b2c_free_shipping_rule</code> table reference
     */
    public FreeShippingRule() {
        this(DSL.name("b2c_free_shipping_rule"), null);
    }

    /**
     * Create an aliased <code>mini_shop_4748160.b2c_free_shipping_rule</code> table reference
     */
    public FreeShippingRule(String alias) {
        this(DSL.name(alias), FREE_SHIPPING_RULE);
    }

    /**
     * Create an aliased <code>mini_shop_4748160.b2c_free_shipping_rule</code> table reference
     */
    public FreeShippingRule(Name alias) {
        this(alias, FREE_SHIPPING_RULE);
    }

    private FreeShippingRule(Name alias, Table<FreeShippingRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private FreeShippingRule(Name alias, Table<FreeShippingRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FreeShippingRule(Table<O> child, ForeignKey<O, FreeShippingRuleRecord> key) {
        super(child, key, FREE_SHIPPING_RULE);
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
        return Arrays.<Index>asList(Indexes.FREE_SHIPPING_RULE_PRIMARY, Indexes.FREE_SHIPPING_RULE_SHIPPING_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FreeShippingRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FREE_SHIPPING_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FreeShippingRuleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_FREE_SHIPPING_RULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FreeShippingRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<FreeShippingRuleRecord>>asList(Keys.KEY_B2C_FREE_SHIPPING_RULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRule as(String alias) {
        return new FreeShippingRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeShippingRule as(Name alias) {
        return new FreeShippingRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FreeShippingRule rename(String name) {
        return new FreeShippingRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FreeShippingRule rename(Name name) {
        return new FreeShippingRule(name, null);
    }
}
