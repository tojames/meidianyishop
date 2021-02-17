/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.DoctorCommentRecord;

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
 * 医师评价和打分
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorComment extends TableImpl<DoctorCommentRecord> {

    private static final long serialVersionUID = 139539859;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_doctor_comment</code>
     */
    public static final DoctorComment DOCTOR_COMMENT = new DoctorComment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DoctorCommentRecord> getRecordType() {
        return DoctorCommentRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.id</code>.
     */
    public final TableField<DoctorCommentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.user_id</code>. 用户id
     */
    public final TableField<DoctorCommentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.user_name</code>. 用户昵称
     */
    public final TableField<DoctorCommentRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用户昵称");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.patient_id</code>. 患者id
     */
    public final TableField<DoctorCommentRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "患者id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.patient_name</code>. 患者名称
     */
    public final TableField<DoctorCommentRecord, String> PATIENT_NAME = createField("patient_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "患者名称");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.doctor_id</code>. 医师id
     */
    public final TableField<DoctorCommentRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "医师id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.doctor_code</code>. 医师院内编码
     */
    public final TableField<DoctorCommentRecord, String> DOCTOR_CODE = createField("doctor_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "医师院内编码");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.doctor_name</code>. 医师名称
     */
    public final TableField<DoctorCommentRecord, String> DOCTOR_NAME = createField("doctor_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "医师名称");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.order_id</code>. 订单id
     */
    public final TableField<DoctorCommentRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.order_sn</code>. 订单编号
     */
    public final TableField<DoctorCommentRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.im_session_id</code>. 会话id
     */
    public final TableField<DoctorCommentRecord, Integer> IM_SESSION_ID = createField("im_session_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会话id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.stars</code>. 评价星级1~5
     */
    public final TableField<DoctorCommentRecord, Byte> STARS = createField("stars", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("5", org.jooq.impl.SQLDataType.TINYINT)), this, "评价星级1~5");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.is_anonymou</code>. 匿名状态 0.未匿名；1.匿名
     */
    public final TableField<DoctorCommentRecord, Byte> IS_ANONYMOU = createField("is_anonymou", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "匿名状态 0.未匿名；1.匿名");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.tag</code>. 评价标签
     */
    public final TableField<DoctorCommentRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "评价标签");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.comm_note</code>. 评论内容
     */
    public final TableField<DoctorCommentRecord, String> COMM_NOTE = createField("comm_note", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "评论内容");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.top</code>. 置顶
     */
    public final TableField<DoctorCommentRecord, Integer> TOP = createField("top", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "置顶");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.audit_status</code>. 0:未审批,1:审批通过,2:审批未通过
     */
    public final TableField<DoctorCommentRecord, Byte> AUDIT_STATUS = createField("audit_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未审批,1:审批通过,2:审批未通过");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.is_delete</code>.
     */
    public final TableField<DoctorCommentRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.create_time</code>.
     */
    public final TableField<DoctorCommentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_comment.update_time</code>. 最后修改时间
     */
    public final TableField<DoctorCommentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_doctor_comment</code> table reference
     */
    public DoctorComment() {
        this(DSL.name("b2c_doctor_comment"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_comment</code> table reference
     */
    public DoctorComment(String alias) {
        this(DSL.name(alias), DOCTOR_COMMENT);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_comment</code> table reference
     */
    public DoctorComment(Name alias) {
        this(alias, DOCTOR_COMMENT);
    }

    private DoctorComment(Name alias, Table<DoctorCommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private DoctorComment(Name alias, Table<DoctorCommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("医师评价和打分"));
    }

    public <O extends Record> DoctorComment(Table<O> child, ForeignKey<O, DoctorCommentRecord> key) {
        super(child, key, DOCTOR_COMMENT);
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
        return Arrays.<Index>asList(Indexes.DOCTOR_COMMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DoctorCommentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DOCTOR_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DoctorCommentRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DOCTOR_COMMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DoctorCommentRecord>> getKeys() {
        return Arrays.<UniqueKey<DoctorCommentRecord>>asList(Keys.KEY_B2C_DOCTOR_COMMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorComment as(String alias) {
        return new DoctorComment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorComment as(Name alias) {
        return new DoctorComment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorComment rename(String name) {
        return new DoctorComment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorComment rename(Name name) {
        return new DoctorComment(name, null);
    }
}
