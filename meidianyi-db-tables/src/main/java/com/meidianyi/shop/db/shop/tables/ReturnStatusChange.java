/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.ReturnStatusChangeRecord;

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
public class ReturnStatusChange extends TableImpl<ReturnStatusChangeRecord> {

    private static final long serialVersionUID = 640343813;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_return_status_change</code>
     */
    public static final ReturnStatusChange RETURN_STATUS_CHANGE = new ReturnStatusChange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReturnStatusChangeRecord> getRecordType() {
        return ReturnStatusChangeRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.id</code>.
     */
    public final TableField<ReturnStatusChangeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.ret_id</code>. 退货申请id
     */
    public final TableField<ReturnStatusChangeRecord, Integer> RET_ID = createField("ret_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "退货申请id");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.user_id</code>. 用户id
     */
    public final TableField<ReturnStatusChangeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.type</code>. 0 商家触发   1是用户触发  2系统自动处理
     */
    public final TableField<ReturnStatusChangeRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT, this, "0 商家触发   1是用户触发  2系统自动处理");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.status</code>. 更改状态
     */
    public final TableField<ReturnStatusChangeRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "更改状态");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.order_sn</code>. 订单号
     */
    public final TableField<ReturnStatusChangeRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "订单号");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.create_time</code>.
     */
    public final TableField<ReturnStatusChangeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.update_time</code>. 最后修改时间
     */
    public final TableField<ReturnStatusChangeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_return_status_change.desc</code>. 备注
     */
    public final TableField<ReturnStatusChangeRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.CLOB, this, "备注");

    /**
     * Create a <code>mini_shop_471752.b2c_return_status_change</code> table reference
     */
    public ReturnStatusChange() {
        this(DSL.name("b2c_return_status_change"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_return_status_change</code> table reference
     */
    public ReturnStatusChange(String alias) {
        this(DSL.name(alias), RETURN_STATUS_CHANGE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_return_status_change</code> table reference
     */
    public ReturnStatusChange(Name alias) {
        this(alias, RETURN_STATUS_CHANGE);
    }

    private ReturnStatusChange(Name alias, Table<ReturnStatusChangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReturnStatusChange(Name alias, Table<ReturnStatusChangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReturnStatusChange(Table<O> child, ForeignKey<O, ReturnStatusChangeRecord> key) {
        super(child, key, RETURN_STATUS_CHANGE);
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
        return Arrays.<Index>asList(Indexes.RETURN_STATUS_CHANGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReturnStatusChangeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RETURN_STATUS_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReturnStatusChangeRecord> getPrimaryKey() {
        return Keys.KEY_B2C_RETURN_STATUS_CHANGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReturnStatusChangeRecord>> getKeys() {
        return Arrays.<UniqueKey<ReturnStatusChangeRecord>>asList(Keys.KEY_B2C_RETURN_STATUS_CHANGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnStatusChange as(String alias) {
        return new ReturnStatusChange(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnStatusChange as(Name alias) {
        return new ReturnStatusChange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnStatusChange rename(String name) {
        return new ReturnStatusChange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReturnStatusChange rename(Name name) {
        return new ReturnStatusChange(name, null);
    }
}
