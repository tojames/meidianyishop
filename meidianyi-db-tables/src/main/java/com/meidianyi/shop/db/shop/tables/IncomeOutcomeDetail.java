/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.IncomeOutcomeDetailRecord;

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
public class IncomeOutcomeDetail extends TableImpl<IncomeOutcomeDetailRecord> {

    private static final long serialVersionUID = 369946442;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_income_outcome_detail</code>
     */
    public static final IncomeOutcomeDetail INCOME_OUTCOME_DETAIL = new IncomeOutcomeDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IncomeOutcomeDetailRecord> getRecordType() {
        return IncomeOutcomeDetailRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.id</code>.
     */
    public final TableField<IncomeOutcomeDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.req_id</code>.
     */
    public final TableField<IncomeOutcomeDetailRecord, Integer> REQ_ID = createField("req_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.shop_id</code>. 店铺id
     */
    public final TableField<IncomeOutcomeDetailRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_sn</code>. 支付流水号
     */
    public final TableField<IncomeOutcomeDetailRecord, String> PAY_SN = createField("pay_sn", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付流水号");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_code</code>. 支付宝:alipay,微信：？，...
     */
    public final TableField<IncomeOutcomeDetailRecord, String> PAY_CODE = createField("pay_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付宝:alipay,微信：？，...");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_code_alias</code>. 支付宝:alipay,微信：？，...
     */
    public final TableField<IncomeOutcomeDetailRecord, String> PAY_CODE_ALIAS = createField("pay_code_alias", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付宝:alipay,微信：？，...");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_act_name</code>. 支付说明
     */
    public final TableField<IncomeOutcomeDetailRecord, String> PAY_ACT_NAME = createField("pay_act_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付说明");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_act_time</code>. 交易付款时间
     */
    public final TableField<IncomeOutcomeDetailRecord, Timestamp> PAY_ACT_TIME = createField("pay_act_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易付款时间");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.income_amount</code>. 收入金额
     */
    public final TableField<IncomeOutcomeDetailRecord, BigDecimal> INCOME_AMOUNT = createField("income_amount", org.jooq.impl.SQLDataType.DECIMAL(15, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "收入金额");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.outcome_amount</code>. 支出金额
     */
    public final TableField<IncomeOutcomeDetailRecord, BigDecimal> OUTCOME_AMOUNT = createField("outcome_amount", org.jooq.impl.SQLDataType.DECIMAL(15, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "支出金额");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_fee</code>. 手续费
     */
    public final TableField<IncomeOutcomeDetailRecord, BigDecimal> PAY_FEE = createField("pay_fee", org.jooq.impl.SQLDataType.DECIMAL(15, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "手续费");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.total_surplus_amount</code>. 余额
     */
    public final TableField<IncomeOutcomeDetailRecord, BigDecimal> TOTAL_SURPLUS_AMOUNT = createField("total_surplus_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "余额");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.trade_no</code>. 各平台交易号
     */
    public final TableField<IncomeOutcomeDetailRecord, String> TRADE_NO = createField("trade_no", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "各平台交易号");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.order_sn</code>. 网站订单号
     */
    public final TableField<IncomeOutcomeDetailRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "网站订单号");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.order_comp_status</code>. 订单完成状态1：已完成，2:未完成
     */
    public final TableField<IncomeOutcomeDetailRecord, Byte> ORDER_COMP_STATUS = createField("order_comp_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "订单完成状态1：已完成，2:未完成");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.update_order_status_time</code>. 更新订单状态时间
     */
    public final TableField<IncomeOutcomeDetailRecord, Timestamp> UPDATE_ORDER_STATUS_TIME = createField("update_order_status_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新订单状态时间");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_type</code>. 支付类型 1:收入，2：支出
     */
    public final TableField<IncomeOutcomeDetailRecord, Byte> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "支付类型 1:收入，2：支出");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.pay_type_name</code>. 支付类型名称
     */
    public final TableField<IncomeOutcomeDetailRecord, String> PAY_TYPE_NAME = createField("pay_type_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付类型名称");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.remark</code>. 自定义备注
     */
    public final TableField<IncomeOutcomeDetailRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.CLOB, this, "自定义备注");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.no_settle_flag</code>. 是否参与结算 0:参入，1：不参与
     */
    public final TableField<IncomeOutcomeDetailRecord, Byte> NO_SETTLE_FLAG = createField("no_settle_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否参与结算 0:参入，1：不参与");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.create_time</code>.
     */
    public final TableField<IncomeOutcomeDetailRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_income_outcome_detail.update_time</code>. 最后修改时间
     */
    public final TableField<IncomeOutcomeDetailRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_income_outcome_detail</code> table reference
     */
    public IncomeOutcomeDetail() {
        this(DSL.name("b2c_income_outcome_detail"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_income_outcome_detail</code> table reference
     */
    public IncomeOutcomeDetail(String alias) {
        this(DSL.name(alias), INCOME_OUTCOME_DETAIL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_income_outcome_detail</code> table reference
     */
    public IncomeOutcomeDetail(Name alias) {
        this(alias, INCOME_OUTCOME_DETAIL);
    }

    private IncomeOutcomeDetail(Name alias, Table<IncomeOutcomeDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private IncomeOutcomeDetail(Name alias, Table<IncomeOutcomeDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IncomeOutcomeDetail(Table<O> child, ForeignKey<O, IncomeOutcomeDetailRecord> key) {
        super(child, key, INCOME_OUTCOME_DETAIL);
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
        return Arrays.<Index>asList(Indexes.INCOME_OUTCOME_DETAIL_ORDER_SN, Indexes.INCOME_OUTCOME_DETAIL_PAY_CODE, Indexes.INCOME_OUTCOME_DETAIL_PAY_SN, Indexes.INCOME_OUTCOME_DETAIL_PAY_TYPE, Indexes.INCOME_OUTCOME_DETAIL_PRIMARY, Indexes.INCOME_OUTCOME_DETAIL_SHOP_ID, Indexes.INCOME_OUTCOME_DETAIL_TRADE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IncomeOutcomeDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INCOME_OUTCOME_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IncomeOutcomeDetailRecord> getPrimaryKey() {
        return Keys.KEY_B2C_INCOME_OUTCOME_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IncomeOutcomeDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<IncomeOutcomeDetailRecord>>asList(Keys.KEY_B2C_INCOME_OUTCOME_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncomeOutcomeDetail as(String alias) {
        return new IncomeOutcomeDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncomeOutcomeDetail as(Name alias) {
        return new IncomeOutcomeDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IncomeOutcomeDetail rename(String name) {
        return new IncomeOutcomeDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IncomeOutcomeDetail rename(Name name) {
        return new IncomeOutcomeDetail(name, null);
    }
}