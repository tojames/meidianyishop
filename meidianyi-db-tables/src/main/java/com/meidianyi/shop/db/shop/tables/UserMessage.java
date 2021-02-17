/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.UserMessageRecord;

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
 * 用户消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMessage extends TableImpl<UserMessageRecord> {

    private static final long serialVersionUID = 1867076946;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_message</code>
     */
    public static final UserMessage USER_MESSAGE = new UserMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserMessageRecord> getRecordType() {
        return UserMessageRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_id</code>.
     */
    public final TableField<UserMessageRecord, Integer> MESSAGE_ID = createField("message_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_name</code>. 消息名称，系统消息名称为日期
     */
    public final TableField<UserMessageRecord, String> MESSAGE_NAME = createField("message_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "消息名称，系统消息名称为日期");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_content</code>. 消息内容
     */
    public final TableField<UserMessageRecord, String> MESSAGE_CONTENT = createField("message_content", org.jooq.impl.SQLDataType.CLOB, this, "消息内容");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_type</code>. 消息类型 0：系统消息、1：订单消息、2：会话消息 默认0
     */
    public final TableField<UserMessageRecord, Byte> MESSAGE_TYPE = createField("message_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "消息类型 0：系统消息、1：订单消息、2：会话消息 默认0");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.receiver_id</code>. 接收者id
     */
    public final TableField<UserMessageRecord, Integer> RECEIVER_ID = createField("receiver_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "接收者id");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.receiver_name</code>. 接收者姓名
     */
    public final TableField<UserMessageRecord, String> RECEIVER_NAME = createField("receiver_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "接收者姓名");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.sender_id</code>. 发送者id
     */
    public final TableField<UserMessageRecord, Integer> SENDER_ID = createField("sender_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "发送者id");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.sender_name</code>. 发送者姓名
     */
    public final TableField<UserMessageRecord, String> SENDER_NAME = createField("sender_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "发送者姓名");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_status</code>. 消息状态 0：未读、1：已读、3：置顶消息 默认0
     */
    public final TableField<UserMessageRecord, Byte> MESSAGE_STATUS = createField("message_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "消息状态 0：未读、1：已读、3：置顶消息 默认0");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_time</code>. 消息创建时间
     */
    public final TableField<UserMessageRecord, Timestamp> MESSAGE_TIME = createField("message_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "消息创建时间");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_relevance_id</code>. 消息关联订单，会话id
     */
    public final TableField<UserMessageRecord, Integer> MESSAGE_RELEVANCE_ID = createField("message_relevance_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "消息关联订单，会话id");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_relevance_order_sn</code>. 消息关联会话订单sn
     */
    public final TableField<UserMessageRecord, String> MESSAGE_RELEVANCE_ORDER_SN = createField("message_relevance_order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "消息关联会话订单sn");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.message_chat_status</code>. 会话消息状态
     */
    public final TableField<UserMessageRecord, Byte> MESSAGE_CHAT_STATUS = createField("message_chat_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "会话消息状态");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.is_delete</code>. 删除
     */
    public final TableField<UserMessageRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.create_time</code>.
     */
    public final TableField<UserMessageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_message.update_time</code>. 最后修改时间
     */
    public final TableField<UserMessageRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_message</code> table reference
     */
    public UserMessage() {
        this(DSL.name("b2c_user_message"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_message</code> table reference
     */
    public UserMessage(String alias) {
        this(DSL.name(alias), USER_MESSAGE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_message</code> table reference
     */
    public UserMessage(Name alias) {
        this(alias, USER_MESSAGE);
    }

    private UserMessage(Name alias, Table<UserMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMessage(Name alias, Table<UserMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户消息表"));
    }

    public <O extends Record> UserMessage(Table<O> child, ForeignKey<O, UserMessageRecord> key) {
        super(child, key, USER_MESSAGE);
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
        return Arrays.<Index>asList(Indexes.USER_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserMessageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserMessageRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_MESSAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<UserMessageRecord>>asList(Keys.KEY_B2C_USER_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMessage as(String alias) {
        return new UserMessage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMessage as(Name alias) {
        return new UserMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMessage rename(String name) {
        return new UserMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMessage rename(Name name) {
        return new UserMessage(name, null);
    }
}
