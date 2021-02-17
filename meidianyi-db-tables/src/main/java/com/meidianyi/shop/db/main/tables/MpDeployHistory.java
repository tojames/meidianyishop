/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.MpDeployHistoryRecord;

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
public class MpDeployHistory extends TableImpl<MpDeployHistoryRecord> {

    private static final long serialVersionUID = 1552866742;

    /**
     * The reference instance of <code>mini_main.b2c_mp_deploy_history</code>
     */
    public static final MpDeployHistory MP_DEPLOY_HISTORY = new MpDeployHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpDeployHistoryRecord> getRecordType() {
        return MpDeployHistoryRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.deploy_id</code>. 自增ID
     */
    public final TableField<MpDeployHistoryRecord, Integer> DEPLOY_ID = createField("deploy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "自增ID");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.bind_template_id</code>. 小程序模板Id
     */
    public final TableField<MpDeployHistoryRecord, Integer> BIND_TEMPLATE_ID = createField("bind_template_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "小程序模板Id");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.app_id</code>. 小程序app_id
     */
    public final TableField<MpDeployHistoryRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "小程序app_id");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.deploy_log</code>. 小程序模板部署日志
     */
    public final TableField<MpDeployHistoryRecord, String> DEPLOY_LOG = createField("deploy_log", org.jooq.impl.SQLDataType.CLOB, this, "小程序模板部署日志");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.deploy_time</code>. 小程序模板添加时间
     */
    public final TableField<MpDeployHistoryRecord, Timestamp> DEPLOY_TIME = createField("deploy_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "小程序模板添加时间");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.is_modify_domain</code>. 是否修改开发和业务域名，0未修改，1已修改
     */
    public final TableField<MpDeployHistoryRecord, Byte> IS_MODIFY_DOMAIN = createField("is_modify_domain", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否修改开发和业务域名，0未修改，1已修改");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.upload_state</code>. 上传状态，0未上传，1已上传
     */
    public final TableField<MpDeployHistoryRecord, Byte> UPLOAD_STATE = createField("upload_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "上传状态，0未上传，1已上传");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.last_upload_time</code>. 上传代码时间
     */
    public final TableField<MpDeployHistoryRecord, Timestamp> LAST_UPLOAD_TIME = createField("last_upload_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "上传代码时间");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.audit_id</code>. 最新的审核ID
     */
    public final TableField<MpDeployHistoryRecord, Long> AUDIT_ID = createField("audit_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "最新的审核ID");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.audit_state</code>. 审核状态，0未提交，1审核中，2审核成功 3审核失败
     */
    public final TableField<MpDeployHistoryRecord, Byte> AUDIT_STATE = createField("audit_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "审核状态，0未提交，1审核中，2审核成功 3审核失败");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.submit_audit_time</code>. 提交代码审核时间
     */
    public final TableField<MpDeployHistoryRecord, Timestamp> SUBMIT_AUDIT_TIME = createField("submit_audit_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "提交代码审核时间");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.audit_ok_time</code>. 审核通过时间
     */
    public final TableField<MpDeployHistoryRecord, Timestamp> AUDIT_OK_TIME = createField("audit_ok_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "审核通过时间");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.audit_fail_reason</code>. 未通过审核原因
     */
    public final TableField<MpDeployHistoryRecord, String> AUDIT_FAIL_REASON = createField("audit_fail_reason", org.jooq.impl.SQLDataType.VARCHAR(191), this, "未通过审核原因");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.publish_state</code>. 通过审核的小程序发布状态，0未发布，1已发布
     */
    public final TableField<MpDeployHistoryRecord, Byte> PUBLISH_STATE = createField("publish_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "通过审核的小程序发布状态，0未发布，1已发布");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.publish_time</code>. 程序发布时间
     */
    public final TableField<MpDeployHistoryRecord, Timestamp> PUBLISH_TIME = createField("publish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "程序发布时间");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.tester</code>. 小程序体验者列表,json存储
     */
    public final TableField<MpDeployHistoryRecord, String> TESTER = createField("tester", org.jooq.impl.SQLDataType.CLOB, this, "小程序体验者列表,json存储");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.test_qr_path</code>. 小程序体验二维码图片路径
     */
    public final TableField<MpDeployHistoryRecord, String> TEST_QR_PATH = createField("test_qr_path", org.jooq.impl.SQLDataType.VARCHAR(191), this, "小程序体验二维码图片路径");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.category</code>. 小程序可选类目,json存储
     */
    public final TableField<MpDeployHistoryRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.CLOB, this, "小程序可选类目,json存储");

    /**
     * The column <code>mini_main.b2c_mp_deploy_history.page_cfg</code>. 小程序页面配置,json存储
     */
    public final TableField<MpDeployHistoryRecord, String> PAGE_CFG = createField("page_cfg", org.jooq.impl.SQLDataType.CLOB, this, "小程序页面配置,json存储");

    /**
     * Create a <code>mini_main.b2c_mp_deploy_history</code> table reference
     */
    public MpDeployHistory() {
        this(DSL.name("b2c_mp_deploy_history"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_deploy_history</code> table reference
     */
    public MpDeployHistory(String alias) {
        this(DSL.name(alias), MP_DEPLOY_HISTORY);
    }

    /**
     * Create an aliased <code>mini_main.b2c_mp_deploy_history</code> table reference
     */
    public MpDeployHistory(Name alias) {
        this(alias, MP_DEPLOY_HISTORY);
    }

    private MpDeployHistory(Name alias, Table<MpDeployHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpDeployHistory(Name alias, Table<MpDeployHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpDeployHistory(Table<O> child, ForeignKey<O, MpDeployHistoryRecord> key) {
        super(child, key, MP_DEPLOY_HISTORY);
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
        return Arrays.<Index>asList(Indexes.MP_DEPLOY_HISTORY_BIND_TEMPLATE_ID, Indexes.MP_DEPLOY_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpDeployHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_DEPLOY_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpDeployHistoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_DEPLOY_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpDeployHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<MpDeployHistoryRecord>>asList(Keys.KEY_B2C_MP_DEPLOY_HISTORY_PRIMARY, Keys.KEY_B2C_MP_DEPLOY_HISTORY_BIND_TEMPLATE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDeployHistory as(String alias) {
        return new MpDeployHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDeployHistory as(Name alias) {
        return new MpDeployHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDeployHistory rename(String name) {
        return new MpDeployHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpDeployHistory rename(Name name) {
        return new MpDeployHistory(name, null);
    }
}
