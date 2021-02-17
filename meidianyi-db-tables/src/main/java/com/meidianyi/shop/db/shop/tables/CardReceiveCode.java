/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


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

import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.CardReceiveCodeRecord;


/**
 * 会员卡领取码表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CardReceiveCode extends TableImpl<CardReceiveCodeRecord> {

    private static final long serialVersionUID = -1786743329;

    /**
     * The reference instance of <code>mini_shop_8984736.b2c_card_receive_code</code>
     */
    public static final CardReceiveCode CARD_RECEIVE_CODE = new CardReceiveCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardReceiveCodeRecord> getRecordType() {
        return CardReceiveCodeRecord.class;
    }

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.id</code>.
     */
    public final TableField<CardReceiveCodeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.card_id</code>. 卡号id
     */
    public final TableField<CardReceiveCodeRecord, Integer> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "卡号id");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.batch_id</code>. 批次id
     */
    public final TableField<CardReceiveCodeRecord, Integer> BATCH_ID = createField("batch_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "批次id");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.group_id</code>. 分组id
     */
    public final TableField<CardReceiveCodeRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "分组id");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.code</code>. 领取码
     */
    public final TableField<CardReceiveCodeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(15), this, "领取码");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.card_no</code>. 卡号
     */
    public final TableField<CardReceiveCodeRecord, String> CARD_NO = createField("card_no", org.jooq.impl.SQLDataType.VARCHAR(30), this, "卡号");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.card_pwd</code>. 卡密码
     */
    public final TableField<CardReceiveCodeRecord, String> CARD_PWD = createField("card_pwd", org.jooq.impl.SQLDataType.VARCHAR(20), this, "卡密码");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.user_id</code>. 领取人
     */
    public final TableField<CardReceiveCodeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "领取人");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.receive_time</code>. 领取时间
     */
    public final TableField<CardReceiveCodeRecord, Timestamp> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "领取时间");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.error_msg</code>. 错误说明
     */
    public final TableField<CardReceiveCodeRecord, String> ERROR_MSG = createField("error_msg", org.jooq.impl.SQLDataType.VARCHAR(200), this, "错误说明");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.status</code>. 1: 可用 0：禁用
     */
    public final TableField<CardReceiveCodeRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1: 可用 0：禁用");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.del_flag</code>.
     */
    public final TableField<CardReceiveCodeRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.del_time</code>. 删除时间
     */
    public final TableField<CardReceiveCodeRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "删除时间");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.create_time</code>.
     */
    public final TableField<CardReceiveCodeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_8984736.b2c_card_receive_code.update_time</code>. 最后修改时间
     */
    public final TableField<CardReceiveCodeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_8984736.b2c_card_receive_code</code> table reference
     */
    public CardReceiveCode() {
        this(DSL.name("b2c_card_receive_code"), null);
    }

    /**
     * Create an aliased <code>mini_shop_8984736.b2c_card_receive_code</code> table reference
     */
    public CardReceiveCode(String alias) {
        this(DSL.name(alias), CARD_RECEIVE_CODE);
    }

    /**
     * Create an aliased <code>mini_shop_8984736.b2c_card_receive_code</code> table reference
     */
    public CardReceiveCode(Name alias) {
        this(alias, CARD_RECEIVE_CODE);
    }

    private CardReceiveCode(Name alias, Table<CardReceiveCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CardReceiveCode(Name alias, Table<CardReceiveCodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("会员卡领取码表"));
    }

    public <O extends Record> CardReceiveCode(Table<O> child, ForeignKey<O, CardReceiveCodeRecord> key) {
        super(child, key, CARD_RECEIVE_CODE);
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
        return Arrays.<Index>asList(Indexes.CARD_RECEIVE_CODE_BATCH_ID, Indexes.CARD_RECEIVE_CODE_CARD_ID, Indexes.CARD_RECEIVE_CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CardReceiveCodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CARD_RECEIVE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CardReceiveCodeRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CARD_RECEIVE_CODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CardReceiveCodeRecord>> getKeys() {
        return Arrays.<UniqueKey<CardReceiveCodeRecord>>asList(Keys.KEY_B2C_CARD_RECEIVE_CODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCode as(String alias) {
        return new CardReceiveCode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardReceiveCode as(Name alias) {
        return new CardReceiveCode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CardReceiveCode rename(String name) {
        return new CardReceiveCode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CardReceiveCode rename(Name name) {
        return new CardReceiveCode(name, null);
    }
}
