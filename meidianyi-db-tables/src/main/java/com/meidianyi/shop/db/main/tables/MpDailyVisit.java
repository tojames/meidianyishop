/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.MpDailyVisitRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class MpDailyVisit extends TableImpl<MpDailyVisitRecord> {

    private static final long serialVersionUID = 141184387;

    /**
     * The reference instance of <code>mini_main.b2c_mp_daily_visit</code>
     */
    public static final MpDailyVisit MP_DAILY_VISIT = new MpDailyVisit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpDailyVisitRecord> getRecordType() {
        return MpDailyVisitRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.ref_date</code>. 时间： 如： "20180313"
     */
    public final TableField<MpDailyVisitRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(8).nullable(false), this, "时间： 如： \"20180313\"");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.session_cnt</code>. 打开次数
     */
    public final TableField<MpDailyVisitRecord, Integer> SESSION_CNT = createField("session_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "打开次数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_pv</code>. 访问次数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_PV = createField("visit_pv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问次数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_uv</code>. 访问人数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问人数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_uv_new</code>. 新用户数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "新用户数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_UV = createField("stay_time_uv", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "人均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_SESSION = createField("stay_time_session", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "次均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> VISIT_DEPTH = createField("visit_depth", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "平均访问深度 (浮点型)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.add_time</code>. 添加时间
     */
    public final TableField<MpDailyVisitRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.session_cnt_middle</code>. 打开次数
     */
    public final TableField<MpDailyVisitRecord, Integer> SESSION_CNT_MIDDLE = createField("session_cnt_middle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "打开次数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_pv_middle</code>. 访问次数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_PV_MIDDLE = createField("visit_pv_middle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问次数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_uv_middle</code>. 访问人数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV_MIDDLE = createField("visit_uv_middle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问人数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_uv_new_middle</code>. 新用户数
     */
    public final TableField<MpDailyVisitRecord, Integer> VISIT_UV_NEW_MIDDLE = createField("visit_uv_new_middle", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "新用户数");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_uv_middle</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_UV_MIDDLE = createField("stay_time_uv_middle", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "人均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_session_middle</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_SESSION_MIDDLE = createField("stay_time_session_middle", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "次均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_depth_middle</code>. 平均访问深度 (浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> VISIT_DEPTH_MIDDLE = createField("visit_depth_middle", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "平均访问深度 (浮点型)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_uv_total</code>. 停留时长 总和(浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_UV_TOTAL = createField("stay_time_uv_total", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "停留时长 总和(浮点型)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.stay_time_session_total</code>. 次均停留时长 总和(浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> STAY_TIME_SESSION_TOTAL = createField("stay_time_session_total", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "次均停留时长 总和(浮点型)");

    /**
     * The column <code>mini_main.b2c_mp_daily_visit.visit_depth_total</code>. 平均访问深度 总和(浮点型)
     */
    public final TableField<MpDailyVisitRecord, Double> VISIT_DEPTH_TOTAL = createField("visit_depth_total", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "平均访问深度 总和(浮点型)");

    /**
     * Create a <code>mini_main.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit() {
        this(DSL.name("b2c_mp_daily_visit"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit(String alias) {
        this(DSL.name(alias), MP_DAILY_VISIT);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_daily_visit</code> table reference
     */
    public MpDailyVisit(Name alias) {
        this(alias, MP_DAILY_VISIT);
    }

    private MpDailyVisit(Name alias, Table<MpDailyVisitRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpDailyVisit(Name alias, Table<MpDailyVisitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpDailyVisit(Table<O> child, ForeignKey<O, MpDailyVisitRecord> key) {
        super(child, key, MP_DAILY_VISIT);
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
    public MpDailyVisit as(String alias) {
        return new MpDailyVisit(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyVisit as(Name alias) {
        return new MpDailyVisit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyVisit rename(String name) {
        return new MpDailyVisit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyVisit rename(Name name) {
        return new MpDailyVisit(name, null);
    }
}
