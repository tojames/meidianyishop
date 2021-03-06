/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.AppAuthRecord;

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
 * 应用授权表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppAuth extends TableImpl<AppAuthRecord> {

    private static final long serialVersionUID = -1187277139;

    /**
     * The reference instance of <code>mini_main.b2c_app_auth</code>
     */
    public static final AppAuth APP_AUTH = new AppAuth();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppAuthRecord> getRecordType() {
        return AppAuthRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_app_auth.id</code>.
     */
    public final TableField<AppAuthRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.sys_id</code>.
     */
    public final TableField<AppAuthRecord, Integer> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.shop_id</code>. 店铺ID
     */
    public final TableField<AppAuthRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_app_auth.app_id</code>. 对接类型
     */
    public final TableField<AppAuthRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "对接类型");

    /**
     * The column <code>mini_main.b2c_app_auth.session_key</code>. 授权key,最后一个s字符后面的字符串表示店铺id
     */
    public final TableField<AppAuthRecord, String> SESSION_KEY = createField("session_key", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权key,最后一个s字符后面的字符串表示店铺id");

    /**
     * The column <code>mini_main.b2c_app_auth.request_location</code>. 对方接口请求地址
     */
    public final TableField<AppAuthRecord, String> REQUEST_LOCATION = createField("request_location", org.jooq.impl.SQLDataType.VARCHAR(512), this, "对方接口请求地址");

    /**
     * The column <code>mini_main.b2c_app_auth.request_protocol</code>. 对方请求协议 0 http，1 https
     */
    public final TableField<AppAuthRecord, Byte> REQUEST_PROTOCOL = createField("request_protocol", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "对方请求协议 0 http，1 https");

    /**
     * The column <code>mini_main.b2c_app_auth.status</code>. 1：启用 0：禁用
     */
    public final TableField<AppAuthRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1：启用 0：禁用");

    /**
     * The column <code>mini_main.b2c_app_auth.create_time</code>.
     */
    public final TableField<AppAuthRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.update_time</code>. 最后修改时间
     */
    public final TableField<AppAuthRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth() {
        this(DSL.name("b2c_app_auth"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth(String alias) {
        this(DSL.name(alias), APP_AUTH);
    }

    /**
     * Create an aliased <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth(Name alias) {
        this(alias, APP_AUTH);
    }

    private AppAuth(Name alias, Table<AppAuthRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppAuth(Name alias, Table<AppAuthRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("应用授权表"));
    }

    public <O extends Record> AppAuth(Table<O> child, ForeignKey<O, AppAuthRecord> key) {
        super(child, key, APP_AUTH);
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
        return Arrays.<Index>asList(Indexes.APP_AUTH_PRIMARY, Indexes.APP_AUTH_SESSION_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AppAuthRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APP_AUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppAuthRecord> getPrimaryKey() {
        return Keys.KEY_B2C_APP_AUTH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppAuthRecord>> getKeys() {
        return Arrays.<UniqueKey<AppAuthRecord>>asList(Keys.KEY_B2C_APP_AUTH_PRIMARY, Keys.KEY_B2C_APP_AUTH_SESSION_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAuth as(String alias) {
        return new AppAuth(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAuth as(Name alias) {
        return new AppAuth(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAuth rename(String name) {
        return new AppAuth(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAuth rename(Name name) {
        return new AppAuth(name, null);
    }
}
