/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.RefundAmountRecordRecord;

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
public class RefundAmountRecord extends TableImpl<RefundAmountRecordRecord> {

    private static final long serialVersionUID = -679698979;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_refund_amount_record</code>
     */
    public static final RefundAmountRecord REFUND_AMOUNT_RECORD = new RefundAmountRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RefundAmountRecordRecord> getRecordType() {
        return RefundAmountRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.rec_id</code>.
     */
    public final TableField<RefundAmountRecordRecord, Integer> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.order_sn</code>.
     */
    public final TableField<RefundAmountRecordRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.user_id</code>.
     */
    public final TableField<RefundAmountRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.refund_field</code>. 订单退款字段：member_card_balance,score_discount,money_paid,use_account
     */
    public final TableField<RefundAmountRecordRecord, String> REFUND_FIELD = createField("refund_field", org.jooq.impl.SQLDataType.VARCHAR(20), this, "订单退款字段：member_card_balance,score_discount,money_paid,use_account");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.refund_money</code>. 退款金额
     */
    public final TableField<RefundAmountRecordRecord, BigDecimal> REFUND_MONEY = createField("refund_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退款金额");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.refund_time</code>. 订单退款时间
     */
    public final TableField<RefundAmountRecordRecord, Timestamp> REFUND_TIME = createField("refund_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "订单退款时间");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.ret_id</code>. b2c_return_order的ret_id
     */
    public final TableField<RefundAmountRecordRecord, Integer> RET_ID = createField("ret_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "b2c_return_order的ret_id");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.create_time</code>.
     */
    public final TableField<RefundAmountRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_refund_amount_record.update_time</code>. 最后修改时间
     */
    public final TableField<RefundAmountRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_refund_amount_record</code> table reference
     */
    public RefundAmountRecord() {
        this(DSL.name("b2c_refund_amount_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_refund_amount_record</code> table reference
     */
    public RefundAmountRecord(String alias) {
        this(DSL.name(alias), REFUND_AMOUNT_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_refund_amount_record</code> table reference
     */
    public RefundAmountRecord(Name alias) {
        this(alias, REFUND_AMOUNT_RECORD);
    }

    private RefundAmountRecord(Name alias, Table<RefundAmountRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private RefundAmountRecord(Name alias, Table<RefundAmountRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RefundAmountRecord(Table<O> child, ForeignKey<O, RefundAmountRecordRecord> key) {
        super(child, key, REFUND_AMOUNT_RECORD);
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
        return Arrays.<Index>asList(Indexes.REFUND_AMOUNT_RECORD_ORDER_SN, Indexes.REFUND_AMOUNT_RECORD_PRIMARY, Indexes.REFUND_AMOUNT_RECORD_RET_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RefundAmountRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REFUND_AMOUNT_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RefundAmountRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_REFUND_AMOUNT_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RefundAmountRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<RefundAmountRecordRecord>>asList(Keys.KEY_B2C_REFUND_AMOUNT_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecord as(String alias) {
        return new RefundAmountRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RefundAmountRecord as(Name alias) {
        return new RefundAmountRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RefundAmountRecord rename(String name) {
        return new RefundAmountRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RefundAmountRecord rename(Name name) {
        return new RefundAmountRecord(name, null);
    }
}