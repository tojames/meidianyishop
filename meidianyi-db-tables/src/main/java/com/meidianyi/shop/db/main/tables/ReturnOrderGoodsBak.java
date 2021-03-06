/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.ReturnOrderGoodsBakRecord;

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
 * 退货商品表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReturnOrderGoodsBak extends TableImpl<ReturnOrderGoodsBakRecord> {

    private static final long serialVersionUID = 2022172423;

    /**
     * The reference instance of <code>mini_main.b2c_return_order_goods_bak</code>
     */
    public static final ReturnOrderGoodsBak RETURN_ORDER_GOODS_BAK = new ReturnOrderGoodsBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReturnOrderGoodsBakRecord> getRecordType() {
        return ReturnOrderGoodsBakRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.id</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.shop_id</code>. 店铺id
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.rec_id</code>. 订单商品表的id
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGER, this, "订单商品表的id");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.ret_id</code>. 退货记录表的id
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> RET_ID = createField("ret_id", org.jooq.impl.SQLDataType.INTEGER, this, "退货记录表的id");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.order_sn</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_id</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_name</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, String> GOODS_NAME = createField("goods_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.product_id</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_number</code>. 退货商品数量
     */
    public final TableField<ReturnOrderGoodsBakRecord, Short> GOODS_NUMBER = createField("goods_number", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "退货商品数量");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.market_price</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, BigDecimal> MARKET_PRICE = createField("market_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_price</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, BigDecimal> GOODS_PRICE = createField("goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_attr</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, String> GOODS_ATTR = createField("goods_attr", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.send_number</code>. 发货商品数量
     */
    public final TableField<ReturnOrderGoodsBakRecord, Short> SEND_NUMBER = createField("send_number", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "发货商品数量");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.return_money</code>. 实际退款金额
     */
    public final TableField<ReturnOrderGoodsBakRecord, BigDecimal> RETURN_MONEY = createField("return_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "实际退款金额");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.discounted_goods_price</code>. 实际退款金额
     */
    public final TableField<ReturnOrderGoodsBakRecord, BigDecimal> DISCOUNTED_GOODS_PRICE = createField("discounted_goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "实际退款金额");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.goods_img</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, String> GOODS_IMG = createField("goods_img", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.success</code>. 0代表退货申请被拒绝，1代表正在退货中，2代表退货成功
     */
    public final TableField<ReturnOrderGoodsBakRecord, Byte> SUCCESS = createField("success", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "0代表退货申请被拒绝，1代表正在退货中，2代表退货成功");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.create_time</code>.
     */
    public final TableField<ReturnOrderGoodsBakRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_return_order_goods_bak.update_time</code>. 最后修改时间
     */
    public final TableField<ReturnOrderGoodsBakRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_main.b2c_return_order_goods_bak</code> table reference
     */
    public ReturnOrderGoodsBak() {
        this(DSL.name("b2c_return_order_goods_bak"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_return_order_goods_bak</code> table reference
     */
    public ReturnOrderGoodsBak(String alias) {
        this(DSL.name(alias), RETURN_ORDER_GOODS_BAK);
    }

    /**
     * Create an aliased <code>mini_main.b2c_return_order_goods_bak</code> table reference
     */
    public ReturnOrderGoodsBak(Name alias) {
        this(alias, RETURN_ORDER_GOODS_BAK);
    }

    private ReturnOrderGoodsBak(Name alias, Table<ReturnOrderGoodsBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReturnOrderGoodsBak(Name alias, Table<ReturnOrderGoodsBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("退货商品表"));
    }

    public <O extends Record> ReturnOrderGoodsBak(Table<O> child, ForeignKey<O, ReturnOrderGoodsBakRecord> key) {
        super(child, key, RETURN_ORDER_GOODS_BAK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RETURN_ORDER_GOODS_BAK_GOODS_ID, Indexes.RETURN_ORDER_GOODS_BAK_ORDER_SN, Indexes.RETURN_ORDER_GOODS_BAK_PRIMARY, Indexes.RETURN_ORDER_GOODS_BAK_REC_ID, Indexes.RETURN_ORDER_GOODS_BAK_RET_ID, Indexes.RETURN_ORDER_GOODS_BAK_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReturnOrderGoodsBakRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RETURN_ORDER_GOODS_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReturnOrderGoodsBakRecord> getPrimaryKey() {
        return Keys.KEY_B2C_RETURN_ORDER_GOODS_BAK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReturnOrderGoodsBakRecord>> getKeys() {
        return Arrays.<UniqueKey<ReturnOrderGoodsBakRecord>>asList(Keys.KEY_B2C_RETURN_ORDER_GOODS_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnOrderGoodsBak as(String alias) {
        return new ReturnOrderGoodsBak(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnOrderGoodsBak as(Name alias) {
        return new ReturnOrderGoodsBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnOrderGoodsBak rename(String name) {
        return new ReturnOrderGoodsBak(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnOrderGoodsBak rename(Name name) {
        return new ReturnOrderGoodsBak(name, null);
    }
}
