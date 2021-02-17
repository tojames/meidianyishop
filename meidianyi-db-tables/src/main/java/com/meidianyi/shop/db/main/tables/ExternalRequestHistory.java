/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.ExternalRequestHistoryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 外部接口请求记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExternalRequestHistory extends TableImpl<ExternalRequestHistoryRecord> {

    private static final long serialVersionUID = 1690248580;

    /**
     * The reference instance of <code>mini_main.b2c_external_request_history</code>
     */
    public static final ExternalRequestHistory EXTERNAL_REQUEST_HISTORY = new ExternalRequestHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExternalRequestHistoryRecord> getRecordType() {
        return ExternalRequestHistoryRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_external_request_history.id</code>. 主键id
     */
    public final TableField<ExternalRequestHistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>mini_main.b2c_external_request_history.app_id</code>. 对接类型
     */
    public final TableField<ExternalRequestHistoryRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "对接类型");

    /**
     * The column <code>mini_main.b2c_external_request_history.shop_id</code>. 店铺id
     */
    public final TableField<ExternalRequestHistoryRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺id");

    /**
     * The column <code>mini_main.b2c_external_request_history.service_name</code>. 请求服务方法
     */
    public final TableField<ExternalRequestHistoryRecord, String> SERVICE_NAME = createField("service_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "请求服务方法");

    /**
     * The column <code>mini_main.b2c_external_request_history.error_code</code>. 请求结果状态码
     */
    public final TableField<ExternalRequestHistoryRecord, Integer> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "请求结果状态码");

    /**
     * The column <code>mini_main.b2c_external_request_history.request_param</code>.
     */
    public final TableField<ExternalRequestHistoryRecord, String> REQUEST_PARAM = createField("request_param", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_main.b2c_external_request_history.is_delete</code>. 删除标记
     */
    public final TableField<ExternalRequestHistoryRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标记");

    /**
     * The column <code>mini_main.b2c_external_request_history.create_time</code>. 生成时间
     */
    public final TableField<ExternalRequestHistoryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "生成时间");

    /**
     * The column <code>mini_main.b2c_external_request_history.update_time</code>. 最后修改时间
     */
    public final TableField<ExternalRequestHistoryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_main.b2c_external_request_history</code> table reference
     */
    public ExternalRequestHistory() {
        this(DSL.name("b2c_external_request_history"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_external_request_history</code> table reference
     */
    public ExternalRequestHistory(String alias) {
        this(DSL.name(alias), EXTERNAL_REQUEST_HISTORY);
    }

    /**
     * Create an aliased <code>mini_main.b2c_external_request_history</code> table reference
     */
    public ExternalRequestHistory(Name alias) {
        this(alias, EXTERNAL_REQUEST_HISTORY);
    }

    private ExternalRequestHistory(Name alias, Table<ExternalRequestHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExternalRequestHistory(Name alias, Table<ExternalRequestHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("外部接口请求记录表"));
    }

    public <O extends Record> ExternalRequestHistory(Table<O> child, ForeignKey<O, ExternalRequestHistoryRecord> key) {
        super(child, key, EXTERNAL_REQUEST_HISTORY);
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
        return Arrays.<Index>asList(Indexes.EXTERNAL_REQUEST_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExternalRequestHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXTERNAL_REQUEST_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExternalRequestHistoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_EXTERNAL_REQUEST_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExternalRequestHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ExternalRequestHistoryRecord>>asList(Keys.KEY_B2C_EXTERNAL_REQUEST_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalRequestHistory as(String alias) {
        return new ExternalRequestHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalRequestHistory as(Name alias) {
        return new ExternalRequestHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExternalRequestHistory rename(String name) {
        return new ExternalRequestHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExternalRequestHistory rename(Name name) {
        return new ExternalRequestHistory(name, null);
    }
}