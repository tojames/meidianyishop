/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.tables.records.CardConsumerRecord;

import java.math.BigDecimal;
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
public class CardConsumer extends TableImpl<CardConsumerRecord> {

    private static final long serialVersionUID = 1487884932;

    /**
     * The reference instance of <code>jmini_shop_444801.b2c_card_consumer</code>
     */
    public static final CardConsumer CARD_CONSUMER = new CardConsumer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardConsumerRecord> getRecordType() {
        return CardConsumerRecord.class;
    }

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.id</code>.
     */
    public final TableField<CardConsumerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.user_id</code>. 用户id
     */
    public final TableField<CardConsumerRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.card_id</code>. 会员卡id
     */
    public final TableField<CardConsumerRecord, Integer> CARD_ID = createField("card_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "会员卡id");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.money</code>. 消费的卡余额
     */
    public final TableField<CardConsumerRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "消费的卡余额");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.count</code>. 消费次数
     */
    public final TableField<CardConsumerRecord, Short> COUNT = createField("count", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "消费次数");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.type</code>. 消费类型 0是普通卡 1限次卡
     */
    public final TableField<CardConsumerRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "消费类型 0是普通卡 1限次卡");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.reason_id</code>. 充值原因模板id
     */
    public final TableField<CardConsumerRecord, String> REASON_ID = createField("reason_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "充值原因模板id");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.reason</code>. 消费原因
     */
    public final TableField<CardConsumerRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(191), this, "消费原因");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.message</code>. 备注
     */
    public final TableField<CardConsumerRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.card_no</code>. 会员卡号
     */
    public final TableField<CardConsumerRecord, String> CARD_NO = createField("card_no", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "会员卡号");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.exchang_count</code>. 兑换次数
     */
    public final TableField<CardConsumerRecord, Short> EXCHANG_COUNT = createField("exchang_count", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "兑换次数");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.order_sn</code>. 订单号
     */
    public final TableField<CardConsumerRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单号");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.create_time</code>.
     */
    public final TableField<CardConsumerRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_444801.b2c_card_consumer.update_time</code>. 最后修改时间
     */
    public final TableField<CardConsumerRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>jmini_shop_444801.b2c_card_consumer</code> table reference
     */
    public CardConsumer() {
        this(DSL.name("b2c_card_consumer"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_444801.b2c_card_consumer</code> table reference
     */
    public CardConsumer(String alias) {
        this(DSL.name(alias), CARD_CONSUMER);
    }

    /**
     * Create an aliased <code>jmini_shop_444801.b2c_card_consumer</code> table reference
     */
    public CardConsumer(Name alias) {
        this(alias, CARD_CONSUMER);
    }

    private CardConsumer(Name alias, Table<CardConsumerRecord> aliased) {
        this(alias, aliased, null);
    }

    private CardConsumer(Name alias, Table<CardConsumerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CardConsumer(Table<O> child, ForeignKey<O, CardConsumerRecord> key) {
        super(child, key, CARD_CONSUMER);
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
        return Arrays.<Index>asList(Indexes.CARD_CONSUMER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CardConsumerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CARD_CONSUMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CardConsumerRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CARD_CONSUMER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CardConsumerRecord>> getKeys() {
        return Arrays.<UniqueKey<CardConsumerRecord>>asList(Keys.KEY_B2C_CARD_CONSUMER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardConsumer as(String alias) {
        return new CardConsumer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardConsumer as(Name alias) {
        return new CardConsumer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CardConsumer rename(String name) {
        return new CardConsumer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CardConsumer rename(Name name) {
        return new CardConsumer(name, null);
    }
}