/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.ChannelStatisticalRecord;

import java.sql.Date;
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
public class ChannelStatistical extends TableImpl<ChannelStatisticalRecord> {

    private static final long serialVersionUID = 41372915;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_channel_statistical</code>
     */
    public static final ChannelStatistical CHANNEL_STATISTICAL = new ChannelStatistical();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelStatisticalRecord> getRecordType() {
        return ChannelStatisticalRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.id</code>.
     */
    public final TableField<ChannelStatisticalRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.page_id</code>.
     */
    public final TableField<ChannelStatisticalRecord, Integer> PAGE_ID = createField("page_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.goods_id</code>.
     */
    public final TableField<ChannelStatisticalRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_id</code>. 渠道id
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_ID = createField("channel_id", org.jooq.impl.SQLDataType.CLOB, this, "渠道id");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_all_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_ALL_PV = createField("channel_all_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_all_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_ALL_UV = createField("channel_all_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_new_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_NEW_PV = createField("channel_new_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_new_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_NEW_UV = createField("channel_new_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_old_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_OLD_PV = createField("channel_old_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.channel_old_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> CHANNEL_OLD_UV = createField("channel_old_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.all_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> ALL_PV = createField("all_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.all_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> ALL_UV = createField("all_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.new_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> NEW_PV = createField("new_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.new_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> NEW_UV = createField("new_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.old_pv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> OLD_PV = createField("old_pv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.old_uv</code>.
     */
    public final TableField<ChannelStatisticalRecord, String> OLD_UV = createField("old_uv", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.ref_date</code>. 2019-03-04
     */
    public final TableField<ChannelStatisticalRecord, Date> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "2019-03-04");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.ref_type</code>. 1昨天 7天 30天
     */
    public final TableField<ChannelStatisticalRecord, Byte> REF_TYPE = createField("ref_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1昨天 7天 30天");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.create_time</code>.
     */
    public final TableField<ChannelStatisticalRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_channel_statistical.update_time</code>. 最后修改时间
     */
    public final TableField<ChannelStatisticalRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_channel_statistical</code> table reference
     */
    public ChannelStatistical() {
        this(DSL.name("b2c_channel_statistical"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_channel_statistical</code> table reference
     */
    public ChannelStatistical(String alias) {
        this(DSL.name(alias), CHANNEL_STATISTICAL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_channel_statistical</code> table reference
     */
    public ChannelStatistical(Name alias) {
        this(alias, CHANNEL_STATISTICAL);
    }

    private ChannelStatistical(Name alias, Table<ChannelStatisticalRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChannelStatistical(Name alias, Table<ChannelStatisticalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChannelStatistical(Table<O> child, ForeignKey<O, ChannelStatisticalRecord> key) {
        super(child, key, CHANNEL_STATISTICAL);
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
        return Arrays.<Index>asList(Indexes.CHANNEL_STATISTICAL_PRIMARY, Indexes.CHANNEL_STATISTICAL_REF_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChannelStatisticalRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CHANNEL_STATISTICAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChannelStatisticalRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CHANNEL_STATISTICAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChannelStatisticalRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelStatisticalRecord>>asList(Keys.KEY_B2C_CHANNEL_STATISTICAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatistical as(String alias) {
        return new ChannelStatistical(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatistical as(Name alias) {
        return new ChannelStatistical(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChannelStatistical rename(String name) {
        return new ChannelStatistical(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChannelStatistical rename(Name name) {
        return new ChannelStatistical(name, null);
    }
}
