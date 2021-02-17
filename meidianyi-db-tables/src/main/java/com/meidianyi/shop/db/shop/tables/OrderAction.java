/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.OrderActionRecord;

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
 * 订单操作表 b2c_order_action
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderAction extends TableImpl<OrderActionRecord> {

    private static final long serialVersionUID = -757257760;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_order_action</code>
     */
    public static final OrderAction ORDER_ACTION = new OrderAction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderActionRecord> getRecordType() {
        return OrderActionRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_order_action.action_id</code>.
     */
    public final TableField<OrderActionRecord, Integer> ACTION_ID = createField("action_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.shop_id</code>. 店铺id
     */
    public final TableField<OrderActionRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.order_id</code>.
     */
    public final TableField<OrderActionRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.order_sn</code>.
     */
    public final TableField<OrderActionRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.action_user</code>.
     */
    public final TableField<OrderActionRecord, String> ACTION_USER = createField("action_user", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.user_id</code>.
     */
    public final TableField<OrderActionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.user_cid</code>.
     */
    public final TableField<OrderActionRecord, String> USER_CID = createField("user_cid", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.user_openid</code>.
     */
    public final TableField<OrderActionRecord, String> USER_OPENID = createField("user_openid", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.order_status</code>.
     */
    public final TableField<OrderActionRecord, Byte> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.action_note</code>.
     */
    public final TableField<OrderActionRecord, String> ACTION_NOTE = createField("action_note", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.account_id</code>. 操作人门店账户id
     */
    public final TableField<OrderActionRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "操作人门店账户id");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.create_time</code>.
     */
    public final TableField<OrderActionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_action.update_time</code>. 最后修改时间
     */
    public final TableField<OrderActionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_order_action</code> table reference
     */
    public OrderAction() {
        this(DSL.name("b2c_order_action"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_action</code> table reference
     */
    public OrderAction(String alias) {
        this(DSL.name(alias), ORDER_ACTION);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_action</code> table reference
     */
    public OrderAction(Name alias) {
        this(alias, ORDER_ACTION);
    }

    private OrderAction(Name alias, Table<OrderActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderAction(Name alias, Table<OrderActionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("订单操作表 b2c_order_action"));
    }

    public <O extends Record> OrderAction(Table<O> child, ForeignKey<O, OrderActionRecord> key) {
        super(child, key, ORDER_ACTION);
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
        return Arrays.<Index>asList(Indexes.ORDER_ACTION_ORDER_ID, Indexes.ORDER_ACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderActionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderActionRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ORDER_ACTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderActionRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderActionRecord>>asList(Keys.KEY_B2C_ORDER_ACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderAction as(String alias) {
        return new OrderAction(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderAction as(Name alias) {
        return new OrderAction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderAction rename(String name) {
        return new OrderAction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderAction rename(Name name) {
        return new OrderAction(name, null);
    }
}
