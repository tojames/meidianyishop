/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.MpWeeklyRetainRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 周留存
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpWeeklyRetain extends TableImpl<MpWeeklyRetainRecord> {

    private static final long serialVersionUID = 56020095;

    /**
     * The reference instance of <code>jmini_shop_666666.b2c_mp_weekly_retain</code>
     */
    public static final MpWeeklyRetain MP_WEEKLY_RETAIN = new MpWeeklyRetain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpWeeklyRetainRecord> getRecordType() {
        return MpWeeklyRetainRecord.class;
    }

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.ref_date</code>. 时间，如："20180306-20180312"
     */
    public final TableField<MpWeeklyRetainRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(20).nullable(false), this, "时间，如：\"20180306-20180312\"");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.visit_uv_new</code>. 新增用户留存
     */
    public final TableField<MpWeeklyRetainRecord, String> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.CLOB, this, "新增用户留存");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.visit_uv</code>. 活跃用户留存
     */
    public final TableField<MpWeeklyRetainRecord, String> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.CLOB, this, "活跃用户留存");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.create_time</code>.
     */
    public final TableField<MpWeeklyRetainRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.update_time</code>. 最后修改时间
     */
    public final TableField<MpWeeklyRetainRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_weekly_retain.id</code>.
     */
    public final TableField<MpWeeklyRetainRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jmini_shop_666666.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain() {
        this(DSL.name("b2c_mp_weekly_retain"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain(String alias) {
        this(DSL.name(alias), MP_WEEKLY_RETAIN);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain(Name alias) {
        this(alias, MP_WEEKLY_RETAIN);
    }

    private MpWeeklyRetain(Name alias, Table<MpWeeklyRetainRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpWeeklyRetain(Name alias, Table<MpWeeklyRetainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("周留存"));
    }

    public <O extends Record> MpWeeklyRetain(Table<O> child, ForeignKey<O, MpWeeklyRetainRecord> key) {
        super(child, key, MP_WEEKLY_RETAIN);
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
        return Arrays.<Index>asList(Indexes.MP_WEEKLY_RETAIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpWeeklyRetainRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_WEEKLY_RETAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpWeeklyRetainRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_WEEKLY_RETAIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpWeeklyRetainRecord>> getKeys() {
        return Arrays.<UniqueKey<MpWeeklyRetainRecord>>asList(Keys.KEY_B2C_MP_WEEKLY_RETAIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpWeeklyRetain as(String alias) {
        return new MpWeeklyRetain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpWeeklyRetain as(Name alias) {
        return new MpWeeklyRetain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyRetain rename(String name) {
        return new MpWeeklyRetain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyRetain rename(Name name) {
        return new MpWeeklyRetain(name, null);
    }
}