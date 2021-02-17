/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.LotteryRecordRecord;

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
public class LotteryRecord extends TableImpl<LotteryRecordRecord> {

    private static final long serialVersionUID = -1510159698;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_lottery_record</code>
     */
    public static final LotteryRecord LOTTERY_RECORD = new LotteryRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LotteryRecordRecord> getRecordType() {
        return LotteryRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.id</code>.
     */
    public final TableField<LotteryRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.user_id</code>. 用户编号
     */
    public final TableField<LotteryRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户编号");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_id</code>. 抽奖编号
     */
    public final TableField<LotteryRecordRecord, Integer> LOTTERY_ID = createField("lottery_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "抽奖编号");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_source</code>. 抽奖来源:1.登录2.支付
     */
    public final TableField<LotteryRecordRecord, Byte> LOTTERY_SOURCE = createField("lottery_source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "抽奖来源:1.登录2.支付");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_act_id</code>. 抽奖来源id
     */
    public final TableField<LotteryRecordRecord, Integer> LOTTERY_ACT_ID = createField("lottery_act_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "抽奖来源id");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.chance_source</code>. 抽奖机会来源
     */
    public final TableField<LotteryRecordRecord, Byte> CHANCE_SOURCE = createField("chance_source", org.jooq.impl.SQLDataType.TINYINT, this, "抽奖机会来源");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_cost</code>. 抽奖花费积分
     */
    public final TableField<LotteryRecordRecord, String> LOTTERY_COST = createField("lottery_cost", org.jooq.impl.SQLDataType.VARCHAR(32), this, "抽奖花费积分");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_grade</code>. 中奖等级：0未中奖，1一等奖，2二等奖，3三等奖，4四等奖
     */
    public final TableField<LotteryRecordRecord, Byte> LOTTERY_GRADE = createField("lottery_grade", org.jooq.impl.SQLDataType.TINYINT, this, "中奖等级：0未中奖，1一等奖，2二等奖，3三等奖，4四等奖");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_type</code>. 奖励类型
     */
    public final TableField<LotteryRecordRecord, Byte> LOTTERY_TYPE = createField("lottery_type", org.jooq.impl.SQLDataType.TINYINT, this, "奖励类型");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_award</code>. 获得奖励
     */
    public final TableField<LotteryRecordRecord, String> LOTTERY_AWARD = createField("lottery_award", org.jooq.impl.SQLDataType.VARCHAR(60), this, "获得奖励");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.award_info</code>. 中奖信息
     */
    public final TableField<LotteryRecordRecord, String> AWARD_INFO = createField("award_info", org.jooq.impl.SQLDataType.VARCHAR(500), this, "中奖信息");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.prd_id</code>. 商品（规格）编号
     */
    public final TableField<LotteryRecordRecord, Integer> PRD_ID = createField("prd_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品（规格）编号");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.present_status</code>. 赠品状态:0.待领取，1：已领取，2.已过期
     */
    public final TableField<LotteryRecordRecord, Byte> PRESENT_STATUS = createField("present_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "赠品状态:0.待领取，1：已领取，2.已过期");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.order_sn</code>. 关联订单
     */
    public final TableField<LotteryRecordRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(60), this, "关联订单");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.lottery_expired_time</code>. 赠品过期时间
     */
    public final TableField<LotteryRecordRecord, Timestamp> LOTTERY_EXPIRED_TIME = createField("lottery_expired_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "赠品过期时间");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.create_time</code>.
     */
    public final TableField<LotteryRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_lottery_record.update_time</code>. 最后修改时间
     */
    public final TableField<LotteryRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_lottery_record</code> table reference
     */
    public LotteryRecord() {
        this(DSL.name("b2c_lottery_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_lottery_record</code> table reference
     */
    public LotteryRecord(String alias) {
        this(DSL.name(alias), LOTTERY_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_lottery_record</code> table reference
     */
    public LotteryRecord(Name alias) {
        this(alias, LOTTERY_RECORD);
    }

    private LotteryRecord(Name alias, Table<LotteryRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private LotteryRecord(Name alias, Table<LotteryRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LotteryRecord(Table<O> child, ForeignKey<O, LotteryRecordRecord> key) {
        super(child, key, LOTTERY_RECORD);
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
        return Arrays.<Index>asList(Indexes.LOTTERY_RECORD_LOTTERY_ID, Indexes.LOTTERY_RECORD_PRIMARY, Indexes.LOTTERY_RECORD_USER_LOTTERY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LotteryRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOTTERY_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LotteryRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_LOTTERY_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LotteryRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<LotteryRecordRecord>>asList(Keys.KEY_B2C_LOTTERY_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecord as(String alias) {
        return new LotteryRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecord as(Name alias) {
        return new LotteryRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LotteryRecord rename(String name) {
        return new LotteryRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LotteryRecord rename(Name name) {
        return new LotteryRecord(name, null);
    }
}