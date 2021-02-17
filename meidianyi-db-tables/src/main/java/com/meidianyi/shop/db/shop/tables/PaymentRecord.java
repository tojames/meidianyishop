/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.PaymentRecordRecord;

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
public class PaymentRecord extends TableImpl<PaymentRecordRecord> {

    private static final long serialVersionUID = 1215152292;

    /**
     * The reference instance of <code>mini_shop_6797286.b2c_payment_record</code>
     */
    public static final PaymentRecord PAYMENT_RECORD = new PaymentRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecordRecord> getRecordType() {
        return PaymentRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.id</code>.
     */
    public final TableField<PaymentRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.shop_id</code>. 店铺id
     */
    public final TableField<PaymentRecordRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.pay_sn</code>. 支付流水号
     */
    public final TableField<PaymentRecordRecord, String> PAY_SN = createField("pay_sn", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付流水号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.pay_code</code>. 支付宝:alipay,微信：？，...
     */
    public final TableField<PaymentRecordRecord, String> PAY_CODE = createField("pay_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付宝:alipay,微信：？，...");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.pay_code_alias</code>. 支付宝:alipay,微信：？，...
     */
    public final TableField<PaymentRecordRecord, String> PAY_CODE_ALIAS = createField("pay_code_alias", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付宝:alipay,微信：？，...");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.trade_no</code>. 各平台交易号
     */
    public final TableField<PaymentRecordRecord, String> TRADE_NO = createField("trade_no", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "各平台交易号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.trdae_status</code>. 交易状态0:成功，其它失败
     */
    public final TableField<PaymentRecordRecord, Byte> TRDAE_STATUS = createField("trdae_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.TINYINT)), this, "交易状态0:成功，其它失败");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.trdae_origin_status</code>. 原始交易状态
     */
    public final TableField<PaymentRecordRecord, String> TRDAE_ORIGIN_STATUS = createField("trdae_origin_status", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "原始交易状态");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.subject</code>. 商品名称
     */
    public final TableField<PaymentRecordRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商品名称");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.quantity</code>. 购买数量
     */
    public final TableField<PaymentRecordRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "购买数量");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.order_sn</code>. 网站订单号
     */
    public final TableField<PaymentRecordRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "网站订单号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.main_order_sn</code>. 网站主订单号
     */
    public final TableField<PaymentRecordRecord, String> MAIN_ORDER_SN = createField("main_order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "网站主订单号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.total_fee</code>. 交易金额
     */
    public final TableField<PaymentRecordRecord, BigDecimal> TOTAL_FEE = createField("total_fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "交易金额");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.buyer_id</code>. 买家支付用户号
     */
    public final TableField<PaymentRecordRecord, String> BUYER_ID = createField("buyer_id", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "买家支付用户号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.buyer_account</code>. 各平台买家支付账号
     */
    public final TableField<PaymentRecordRecord, String> BUYER_ACCOUNT = createField("buyer_account", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "各平台买家支付账号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.seller_id</code>. 收款方用户号
     */
    public final TableField<PaymentRecordRecord, String> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "收款方用户号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.seller_account</code>. 各平台收款方支付账号
     */
    public final TableField<PaymentRecordRecord, String> SELLER_ACCOUNT = createField("seller_account", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "各平台收款方支付账号");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.gmt_create</code>. 支付交易创建时间
     */
    public final TableField<PaymentRecordRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP, this, "支付交易创建时间");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.notify_time</code>. 通知时间
     */
    public final TableField<PaymentRecordRecord, Timestamp> NOTIFY_TIME = createField("notify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "通知时间");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.gmt_pay_time</code>. 交易付款时间
     */
    public final TableField<PaymentRecordRecord, Timestamp> GMT_PAY_TIME = createField("gmt_pay_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易付款时间");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.gmt_close_time</code>. 交易关闭时间
     */
    public final TableField<PaymentRecordRecord, Timestamp> GMT_CLOSE_TIME = createField("gmt_close_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易关闭时间");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.create_time</code>. 插入时间
     */
    public final TableField<PaymentRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "插入时间");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.remark1</code>. 自定义备注  建议用于存储原始数据
     */
    public final TableField<PaymentRecordRecord, String> REMARK1 = createField("remark1", org.jooq.impl.SQLDataType.CLOB, this, "自定义备注  建议用于存储原始数据");

    /**
     * The column <code>mini_shop_6797286.b2c_payment_record.remark2</code>. 自定义备注
     */
    public final TableField<PaymentRecordRecord, String> REMARK2 = createField("remark2", org.jooq.impl.SQLDataType.CLOB, this, "自定义备注");

    /**
     * Create a <code>mini_shop_6797286.b2c_payment_record</code> table reference
     */
    public PaymentRecord() {
        this(DSL.name("b2c_payment_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_6797286.b2c_payment_record</code> table reference
     */
    public PaymentRecord(String alias) {
        this(DSL.name(alias), PAYMENT_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_6797286.b2c_payment_record</code> table reference
     */
    public PaymentRecord(Name alias) {
        this(alias, PAYMENT_RECORD);
    }

    private PaymentRecord(Name alias, Table<PaymentRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentRecord(Name alias, Table<PaymentRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PaymentRecord(Table<O> child, ForeignKey<O, PaymentRecordRecord> key) {
        super(child, key, PAYMENT_RECORD);
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
        return Arrays.<Index>asList(Indexes.PAYMENT_RECORD_ORDER_SN, Indexes.PAYMENT_RECORD_PAY_CODE, Indexes.PAYMENT_RECORD_PAY_SN, Indexes.PAYMENT_RECORD_PRIMARY, Indexes.PAYMENT_RECORD_SELLER_ACCOUNT, Indexes.PAYMENT_RECORD_TRADE_NO, Indexes.PAYMENT_RECORD_TRDAE_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PaymentRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYMENT_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PAYMENT_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentRecordRecord>>asList(Keys.KEY_B2C_PAYMENT_RECORD_PRIMARY, Keys.KEY_B2C_PAYMENT_RECORD_PAY_SN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord as(String alias) {
        return new PaymentRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord as(Name alias) {
        return new PaymentRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentRecord rename(String name) {
        return new PaymentRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentRecord rename(Name name) {
        return new PaymentRecord(name, null);
    }
}