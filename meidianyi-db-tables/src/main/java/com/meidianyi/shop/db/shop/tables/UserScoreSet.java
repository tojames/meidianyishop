/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.UserScoreSetRecord;

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
public class UserScoreSet extends TableImpl<UserScoreSetRecord> {

    private static final long serialVersionUID = 809444767;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_score_set</code>
     */
    public static final UserScoreSet USER_SCORE_SET = new UserScoreSet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserScoreSetRecord> getRecordType() {
        return UserScoreSetRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.id</code>.
     */
    public final TableField<UserScoreSetRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.shop_id</code>. 店铺id
     */
    public final TableField<UserScoreSetRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.score_name</code>. 购买:buy,评价:comment,兑换:convert
     */
    public final TableField<UserScoreSetRecord, String> SCORE_NAME = createField("score_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "购买:buy,评价:comment,兑换:convert");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.status</code>. 0:未启用,1:启用
     */
    public final TableField<UserScoreSetRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未启用,1:启用");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.two_status</code>.
     */
    public final TableField<UserScoreSetRecord, Byte> TWO_STATUS = createField("two_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.set_val</code>.
     */
    public final TableField<UserScoreSetRecord, String> SET_VAL = createField("set_val", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.set_val2</code>.
     */
    public final TableField<UserScoreSetRecord, String> SET_VAL2 = createField("set_val2", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.set_val3</code>.
     */
    public final TableField<UserScoreSetRecord, String> SET_VAL3 = createField("set_val3", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.sign_val</code>. 签到积分
     */
    public final TableField<UserScoreSetRecord, Integer> SIGN_VAL = createField("sign_val", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "签到积分");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.sign_date</code>. 签到天数
     */
    public final TableField<UserScoreSetRecord, Byte> SIGN_DATE = createField("sign_date", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "签到天数");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.desc</code>.
     */
    public final TableField<UserScoreSetRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.create_time</code>.
     */
    public final TableField<UserScoreSetRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.update_time</code>. 最后修改时间
     */
    public final TableField<UserScoreSetRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_user_score_set.growth_flag</code>. 0:不送成长值，1：送成长值
     */
    public final TableField<UserScoreSetRecord, Byte> GROWTH_FLAG = createField("growth_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:不送成长值，1：送成长值");

    /**
     * Create a <code>mini_shop_471752.b2c_user_score_set</code> table reference
     */
    public UserScoreSet() {
        this(DSL.name("b2c_user_score_set"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_score_set</code> table reference
     */
    public UserScoreSet(String alias) {
        this(DSL.name(alias), USER_SCORE_SET);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_score_set</code> table reference
     */
    public UserScoreSet(Name alias) {
        this(alias, USER_SCORE_SET);
    }

    private UserScoreSet(Name alias, Table<UserScoreSetRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserScoreSet(Name alias, Table<UserScoreSetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserScoreSet(Table<O> child, ForeignKey<O, UserScoreSetRecord> key) {
        super(child, key, USER_SCORE_SET);
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
        return Arrays.<Index>asList(Indexes.USER_SCORE_SET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserScoreSetRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_SCORE_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserScoreSetRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_SCORE_SET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserScoreSetRecord>> getKeys() {
        return Arrays.<UniqueKey<UserScoreSetRecord>>asList(Keys.KEY_B2C_USER_SCORE_SET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSet as(String alias) {
        return new UserScoreSet(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserScoreSet as(Name alias) {
        return new UserScoreSet(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserScoreSet rename(String name) {
        return new UserScoreSet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserScoreSet rename(Name name) {
        return new UserScoreSet(name, null);
    }
}
