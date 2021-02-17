/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.MpWeeklyVisitRecord;

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
public class MpWeeklyVisit extends TableImpl<MpWeeklyVisitRecord> {

    private static final long serialVersionUID = -1427341667;

    /**
     * The reference instance of <code>mini_main.b2c_mp_weekly_visit</code>
     */
    public static final MpWeeklyVisit MP_WEEKLY_VISIT = new MpWeeklyVisit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpWeeklyVisitRecord> getRecordType() {
        return MpWeeklyVisitRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.ref_date</code>. 时间，如："20180306-20180312"
     */
    public final TableField<MpWeeklyVisitRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(20).nullable(false), this, "时间，如：\"20180306-20180312\"");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.session_cnt</code>. 打开次数
     */
    public final TableField<MpWeeklyVisitRecord, Integer> SESSION_CNT = createField("session_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "打开次数");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.visit_pv</code>. 访问次数
     */
    public final TableField<MpWeeklyVisitRecord, Integer> VISIT_PV = createField("visit_pv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问次数");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.visit_uv</code>. 访问人数
     */
    public final TableField<MpWeeklyVisitRecord, Integer> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问人数");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.visit_uv_new</code>. 新用户数
     */
    public final TableField<MpWeeklyVisitRecord, Integer> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "新用户数");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpWeeklyVisitRecord, Double> STAY_TIME_UV = createField("stay_time_uv", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "人均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpWeeklyVisitRecord, Double> STAY_TIME_SESSION = createField("stay_time_session", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "次均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public final TableField<MpWeeklyVisitRecord, Double> VISIT_DEPTH = createField("visit_depth", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "平均访问深度 (浮点型)");

    /**
     * The column <code>mini_main.b2c_mp_weekly_visit.add_time</code>. 添加时间
     */
    public final TableField<MpWeeklyVisitRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * Create a <code>mini_main.b2c_mp_weekly_visit</code> table reference
     */
    public MpWeeklyVisit() {
        this(DSL.name("b2c_mp_weekly_visit"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_weekly_visit</code> table reference
     */
    public MpWeeklyVisit(String alias) {
        this(DSL.name(alias), MP_WEEKLY_VISIT);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_weekly_visit</code> table reference
     */
    public MpWeeklyVisit(Name alias) {
        this(alias, MP_WEEKLY_VISIT);
    }

    private MpWeeklyVisit(Name alias, Table<MpWeeklyVisitRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpWeeklyVisit(Name alias, Table<MpWeeklyVisitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpWeeklyVisit(Table<O> child, ForeignKey<O, MpWeeklyVisitRecord> key) {
        super(child, key, MP_WEEKLY_VISIT);
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
    public MpWeeklyVisit as(String alias) {
        return new MpWeeklyVisit(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpWeeklyVisit as(Name alias) {
        return new MpWeeklyVisit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyVisit rename(String name) {
        return new MpWeeklyVisit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyVisit rename(Name name) {
        return new MpWeeklyVisit(name, null);
    }
}
