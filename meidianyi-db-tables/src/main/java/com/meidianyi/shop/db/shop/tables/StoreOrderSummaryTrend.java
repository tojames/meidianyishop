/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.StoreOrderSummaryTrendRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
 * 门店数据概览
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreOrderSummaryTrend extends TableImpl<StoreOrderSummaryTrendRecord> {

    private static final long serialVersionUID = 1978244893;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_store_order_summary_trend</code>
     */
    public static final StoreOrderSummaryTrend STORE_ORDER_SUMMARY_TREND = new StoreOrderSummaryTrend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreOrderSummaryTrendRecord> getRecordType() {
        return StoreOrderSummaryTrendRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.id</code>.
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.ref_date</code>. 2018-09-04
     */
    public final TableField<StoreOrderSummaryTrendRecord, Date> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "2018-09-04");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.type</code>. 1,7,30,90
     */
    public final TableField<StoreOrderSummaryTrendRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "1,7,30,90");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.store_id</code>. 门店ID
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER, this, "门店ID");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_user_num</code>. 付款人数
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> ORDER_PAY_USER_NUM = createField("order_pay_user_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "付款人数");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.total_paid_money</code>. 消费金额
     */
    public final TableField<StoreOrderSummaryTrendRecord, BigDecimal> TOTAL_PAID_MONEY = createField("total_paid_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "消费金额");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.order_pay_num</code>. 成交订单数
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> ORDER_PAY_NUM = createField("order_pay_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "成交订单数");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.order_num</code>. 下单数
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "下单数");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.order_user_num</code>. 下单人数
     */
    public final TableField<StoreOrderSummaryTrendRecord, Integer> ORDER_USER_NUM = createField("order_user_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "下单人数");

    /**
     * The column <code>mini_shop_471752.b2c_store_order_summary_trend.create_time</code>.
     */
    public final TableField<StoreOrderSummaryTrendRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_store_order_summary_trend</code> table reference
     */
    public StoreOrderSummaryTrend() {
        this(DSL.name("b2c_store_order_summary_trend"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_store_order_summary_trend</code> table reference
     */
    public StoreOrderSummaryTrend(String alias) {
        this(DSL.name(alias), STORE_ORDER_SUMMARY_TREND);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_store_order_summary_trend</code> table reference
     */
    public StoreOrderSummaryTrend(Name alias) {
        this(alias, STORE_ORDER_SUMMARY_TREND);
    }

    private StoreOrderSummaryTrend(Name alias, Table<StoreOrderSummaryTrendRecord> aliased) {
        this(alias, aliased, null);
    }

    private StoreOrderSummaryTrend(Name alias, Table<StoreOrderSummaryTrendRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("门店数据概览"));
    }

    public <O extends Record> StoreOrderSummaryTrend(Table<O> child, ForeignKey<O, StoreOrderSummaryTrendRecord> key) {
        super(child, key, STORE_ORDER_SUMMARY_TREND);
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
        return Arrays.<Index>asList(Indexes.STORE_ORDER_SUMMARY_TREND_PRIMARY, Indexes.STORE_ORDER_SUMMARY_TREND_REF_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StoreOrderSummaryTrendRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STORE_ORDER_SUMMARY_TREND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoreOrderSummaryTrendRecord> getPrimaryKey() {
        return Keys.KEY_B2C_STORE_ORDER_SUMMARY_TREND_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoreOrderSummaryTrendRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreOrderSummaryTrendRecord>>asList(Keys.KEY_B2C_STORE_ORDER_SUMMARY_TREND_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrend as(String alias) {
        return new StoreOrderSummaryTrend(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreOrderSummaryTrend as(Name alias) {
        return new StoreOrderSummaryTrend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreOrderSummaryTrend rename(String name) {
        return new StoreOrderSummaryTrend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreOrderSummaryTrend rename(Name name) {
        return new StoreOrderSummaryTrend(name, null);
    }
}
