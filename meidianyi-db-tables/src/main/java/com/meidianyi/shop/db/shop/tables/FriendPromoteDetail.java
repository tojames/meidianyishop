/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.FriendPromoteDetailRecord;

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
public class FriendPromoteDetail extends TableImpl<FriendPromoteDetailRecord> {

    private static final long serialVersionUID = -874937583;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_friend_promote_detail</code>
     */
    public static final FriendPromoteDetail FRIEND_PROMOTE_DETAIL = new FriendPromoteDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FriendPromoteDetailRecord> getRecordType() {
        return FriendPromoteDetailRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.id</code>.
     */
    public final TableField<FriendPromoteDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.launch_id</code>. 助力活动发起id
     */
    public final TableField<FriendPromoteDetailRecord, Integer> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "助力活动发起id");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.user_id</code>. 助力会员id
     */
    public final TableField<FriendPromoteDetailRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "助力会员id");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.promote_id</code>. 助力活动id
     */
    public final TableField<FriendPromoteDetailRecord, Integer> PROMOTE_ID = createField("promote_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "助力活动id");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.promote_value</code>. 助力值
     */
    public final TableField<FriendPromoteDetailRecord, Integer> PROMOTE_VALUE = createField("promote_value", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "助力值");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.create_time</code>. 助力时间
     */
    public final TableField<FriendPromoteDetailRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "助力时间");

    /**
     * The column <code>mini_shop_471752.b2c_friend_promote_detail.update_time</code>. 更新时间
     */
    public final TableField<FriendPromoteDetailRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>mini_shop_471752.b2c_friend_promote_detail</code> table reference
     */
    public FriendPromoteDetail() {
        this(DSL.name("b2c_friend_promote_detail"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_friend_promote_detail</code> table reference
     */
    public FriendPromoteDetail(String alias) {
        this(DSL.name(alias), FRIEND_PROMOTE_DETAIL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_friend_promote_detail</code> table reference
     */
    public FriendPromoteDetail(Name alias) {
        this(alias, FRIEND_PROMOTE_DETAIL);
    }

    private FriendPromoteDetail(Name alias, Table<FriendPromoteDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private FriendPromoteDetail(Name alias, Table<FriendPromoteDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FriendPromoteDetail(Table<O> child, ForeignKey<O, FriendPromoteDetailRecord> key) {
        super(child, key, FRIEND_PROMOTE_DETAIL);
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
        return Arrays.<Index>asList(Indexes.FRIEND_PROMOTE_DETAIL_LAUNCH_ID, Indexes.FRIEND_PROMOTE_DETAIL_PRIMARY, Indexes.FRIEND_PROMOTE_DETAIL_PROMOTE_ID, Indexes.FRIEND_PROMOTE_DETAIL_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FriendPromoteDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FRIEND_PROMOTE_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FriendPromoteDetailRecord> getPrimaryKey() {
        return Keys.KEY_B2C_FRIEND_PROMOTE_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FriendPromoteDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<FriendPromoteDetailRecord>>asList(Keys.KEY_B2C_FRIEND_PROMOTE_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetail as(String alias) {
        return new FriendPromoteDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetail as(Name alias) {
        return new FriendPromoteDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FriendPromoteDetail rename(String name) {
        return new FriendPromoteDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FriendPromoteDetail rename(Name name) {
        return new FriendPromoteDetail(name, null);
    }
}
