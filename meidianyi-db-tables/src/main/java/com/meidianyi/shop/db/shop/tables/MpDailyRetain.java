/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.MpDailyRetainRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 日留存
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpDailyRetain extends TableImpl<MpDailyRetainRecord> {

    private static final long serialVersionUID = 550706375;

    /**
     * The reference instance of <code>jmini_shop_666666.b2c_mp_daily_retain</code>
     */
    public static final MpDailyRetain MP_DAILY_RETAIN = new MpDailyRetain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpDailyRetainRecord> getRecordType() {
        return MpDailyRetainRecord.class;
    }

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.ref_date</code>. 时间，如："20180313"
     */
    public final TableField<MpDailyRetainRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(8).nullable(false), this, "时间，如：\"20180313\"");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.visit_uv_new</code>. 新增用户留存
     */
    public final TableField<MpDailyRetainRecord, String> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.CLOB, this, "新增用户留存");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.visit_uv</code>. 活跃用户留存
     */
    public final TableField<MpDailyRetainRecord, String> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.CLOB, this, "活跃用户留存");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.create_time</code>.
     */
    public final TableField<MpDailyRetainRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.update_time</code>. 最后修改时间
     */
    public final TableField<MpDailyRetainRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_daily_retain.id</code>.
     */
    public final TableField<MpDailyRetainRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jmini_shop_666666.b2c_mp_daily_retain</code> table reference
     */
    public MpDailyRetain() {
        this(DSL.name("b2c_mp_daily_retain"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_daily_retain</code> table reference
     */
    public MpDailyRetain(String alias) {
        this(DSL.name(alias), MP_DAILY_RETAIN);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_daily_retain</code> table reference
     */
    public MpDailyRetain(Name alias) {
        this(alias, MP_DAILY_RETAIN);
    }

    private MpDailyRetain(Name alias, Table<MpDailyRetainRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpDailyRetain(Name alias, Table<MpDailyRetainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("日留存"));
    }

    public <O extends Record> MpDailyRetain(Table<O> child, ForeignKey<O, MpDailyRetainRecord> key) {
        super(child, key, MP_DAILY_RETAIN);
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
        return Arrays.<Index>asList(Indexes.MP_DAILY_RETAIN_PRIMARY, Indexes.MP_DAILY_RETAIN_REF_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpDailyRetainRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_DAILY_RETAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpDailyRetainRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_DAILY_RETAIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpDailyRetainRecord>> getKeys() {
        return Arrays.<UniqueKey<MpDailyRetainRecord>>asList(Keys.KEY_B2C_MP_DAILY_RETAIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyRetain as(String alias) {
        return new MpDailyRetain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDailyRetain as(Name alias) {
        return new MpDailyRetain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyRetain rename(String name) {
        return new MpDailyRetain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDailyRetain rename(Name name) {
        return new MpDailyRetain(name, null);
    }
}
