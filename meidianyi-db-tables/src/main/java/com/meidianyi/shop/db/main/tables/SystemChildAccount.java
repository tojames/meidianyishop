/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.SystemChildAccountRecord;

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
public class SystemChildAccount extends TableImpl<SystemChildAccountRecord> {

    private static final long serialVersionUID = -1952530292;

    /**
     * The reference instance of <code>mini_main.b2c_system_child_account</code>
     */
    public static final SystemChildAccount SYSTEM_CHILD_ACCOUNT = new SystemChildAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemChildAccountRecord> getRecordType() {
        return SystemChildAccountRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_system_child_account.account_id</code>.
     */
    public final TableField<SystemChildAccountRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_system_child_account.system_user_id</code>. 店铺ID
     */
    public final TableField<SystemChildAccountRecord, Integer> SYSTEM_USER_ID = createField("system_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_system_child_account.account_name</code>. 子账号用户名
     */
    public final TableField<SystemChildAccountRecord, String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "子账号用户名");

    /**
     * The column <code>mini_main.b2c_system_child_account.account_pwd</code>. 子账号密码
     */
    public final TableField<SystemChildAccountRecord, String> ACCOUNT_PWD = createField("account_pwd", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "子账号密码");

    /**
     * The column <code>mini_main.b2c_system_child_account.role_id</code>. 角色ID
     */
    public final TableField<SystemChildAccountRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "角色ID");

    /**
     * The column <code>mini_main.b2c_system_child_account.create_time</code>.
     */
    public final TableField<SystemChildAccountRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_system_child_account.mobile</code>. 手机号
     */
    public final TableField<SystemChildAccountRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "手机号");

    /**
     * Create a <code>mini_main.b2c_system_child_account</code> table reference
     */
    public SystemChildAccount() {
        this(DSL.name("b2c_system_child_account"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_child_account</code> table reference
     */
    public SystemChildAccount(String alias) {
        this(DSL.name(alias), SYSTEM_CHILD_ACCOUNT);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_child_account</code> table reference
     */
    public SystemChildAccount(Name alias) {
        this(alias, SYSTEM_CHILD_ACCOUNT);
    }

    private SystemChildAccount(Name alias, Table<SystemChildAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemChildAccount(Name alias, Table<SystemChildAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SystemChildAccount(Table<O> child, ForeignKey<O, SystemChildAccountRecord> key) {
        super(child, key, SYSTEM_CHILD_ACCOUNT);
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
        return Arrays.<Index>asList(Indexes.SYSTEM_CHILD_ACCOUNT_ACCOUNT_NAME, Indexes.SYSTEM_CHILD_ACCOUNT_PRIMARY, Indexes.SYSTEM_CHILD_ACCOUNT_SYSTEM_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SystemChildAccountRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SYSTEM_CHILD_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SystemChildAccountRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SYSTEM_CHILD_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SystemChildAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemChildAccountRecord>>asList(Keys.KEY_B2C_SYSTEM_CHILD_ACCOUNT_PRIMARY, Keys.KEY_B2C_SYSTEM_CHILD_ACCOUNT_ACCOUNT_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemChildAccount as(String alias) {
        return new SystemChildAccount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemChildAccount as(Name alias) {
        return new SystemChildAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemChildAccount rename(String name) {
        return new SystemChildAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemChildAccount rename(Name name) {
        return new SystemChildAccount(name, null);
    }
}
