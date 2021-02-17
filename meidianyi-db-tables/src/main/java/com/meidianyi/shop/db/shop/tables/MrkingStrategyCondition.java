/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.MrkingStrategyConditionRecord;

import java.math.BigDecimal;
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
public class MrkingStrategyCondition extends TableImpl<MrkingStrategyConditionRecord> {

    private static final long serialVersionUID = -1507154037;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_mrking_strategy_condition</code>
     */
    public static final MrkingStrategyCondition MRKING_STRATEGY_CONDITION = new MrkingStrategyCondition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MrkingStrategyConditionRecord> getRecordType() {
        return MrkingStrategyConditionRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.id</code>.
     */
    public final TableField<MrkingStrategyConditionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.strategy_id</code>.
     */
    public final TableField<MrkingStrategyConditionRecord, Integer> STRATEGY_ID = createField("strategy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.full_money</code>. 满多少金额
     */
    public final TableField<MrkingStrategyConditionRecord, BigDecimal> FULL_MONEY = createField("full_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "满多少金额");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.reduce_money</code>. 减多少钱
     */
    public final TableField<MrkingStrategyConditionRecord, BigDecimal> REDUCE_MONEY = createField("reduce_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "减多少钱");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.amount</code>. 满几件或第几件（第X件打折）
     */
    public final TableField<MrkingStrategyConditionRecord, Integer> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "满几件或第几件（第X件打折）");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.discount</code>. 打几折
     */
    public final TableField<MrkingStrategyConditionRecord, BigDecimal> DISCOUNT = createField("discount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "打几折");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.create_time</code>.
     */
    public final TableField<MrkingStrategyConditionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_mrking_strategy_condition.update_time</code>. 最后修改时间
     */
    public final TableField<MrkingStrategyConditionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_mrking_strategy_condition</code> table reference
     */
    public MrkingStrategyCondition() {
        this(DSL.name("b2c_mrking_strategy_condition"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_mrking_strategy_condition</code> table reference
     */
    public MrkingStrategyCondition(String alias) {
        this(DSL.name(alias), MRKING_STRATEGY_CONDITION);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_mrking_strategy_condition</code> table reference
     */
    public MrkingStrategyCondition(Name alias) {
        this(alias, MRKING_STRATEGY_CONDITION);
    }

    private MrkingStrategyCondition(Name alias, Table<MrkingStrategyConditionRecord> aliased) {
        this(alias, aliased, null);
    }

    private MrkingStrategyCondition(Name alias, Table<MrkingStrategyConditionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MrkingStrategyCondition(Table<O> child, ForeignKey<O, MrkingStrategyConditionRecord> key) {
        super(child, key, MRKING_STRATEGY_CONDITION);
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
        return Arrays.<Index>asList(Indexes.MRKING_STRATEGY_CONDITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MrkingStrategyConditionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MRKING_STRATEGY_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MrkingStrategyConditionRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MRKING_STRATEGY_CONDITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MrkingStrategyConditionRecord>> getKeys() {
        return Arrays.<UniqueKey<MrkingStrategyConditionRecord>>asList(Keys.KEY_B2C_MRKING_STRATEGY_CONDITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrkingStrategyCondition as(String alias) {
        return new MrkingStrategyCondition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrkingStrategyCondition as(Name alias) {
        return new MrkingStrategyCondition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MrkingStrategyCondition rename(String name) {
        return new MrkingStrategyCondition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MrkingStrategyCondition rename(Name name) {
        return new MrkingStrategyCondition(name, null);
    }
}
