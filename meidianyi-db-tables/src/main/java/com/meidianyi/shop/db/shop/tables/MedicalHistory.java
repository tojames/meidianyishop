/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.MedicalHistoryRecord;

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
 * 病历表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MedicalHistory extends TableImpl<MedicalHistoryRecord> {

    private static final long serialVersionUID = 1048752598;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_medical_history</code>
     */
    public static final MedicalHistory MEDICAL_HISTORY = new MedicalHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MedicalHistoryRecord> getRecordType() {
        return MedicalHistoryRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.id</code>. 主键id
     */
    public final TableField<MedicalHistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.case_history_code</code>. 确定一个病历的编号
     */
    public final TableField<MedicalHistoryRecord, String> CASE_HISTORY_CODE = createField("case_history_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "确定一个病历的编号");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.pos_code</code>. 确定一个医嘱的编号
     */
    public final TableField<MedicalHistoryRecord, String> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "确定一个医嘱的编号");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.patient_id</code>. 患者id
     */
    public final TableField<MedicalHistoryRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "患者id");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.patient_name</code>. 患者名
     */
    public final TableField<MedicalHistoryRecord, String> PATIENT_NAME = createField("patient_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "患者名");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.user_id</code>. 用户id
     */
    public final TableField<MedicalHistoryRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.sex</code>. 0：男、1：女
     */
    public final TableField<MedicalHistoryRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：男、1：女");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.age</code>. 年龄
     */
    public final TableField<MedicalHistoryRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "年龄");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.department_id</code>. 就诊科id
     */
    public final TableField<MedicalHistoryRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "就诊科id");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.department_name</code>. 就诊科室(门诊)名称
     */
    public final TableField<MedicalHistoryRecord, String> DEPARTMENT_NAME = createField("department_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "就诊科室(门诊)名称");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.out_patient_code</code>. 门诊号
     */
    public final TableField<MedicalHistoryRecord, String> OUT_PATIENT_CODE = createField("out_patient_code", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "门诊号");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.allergy_history</code>. 过敏史
     */
    public final TableField<MedicalHistoryRecord, String> ALLERGY_HISTORY = createField("allergy_history", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "过敏史");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.patient_complain</code>. 病人主诉
     */
    public final TableField<MedicalHistoryRecord, String> PATIENT_COMPLAIN = createField("patient_complain", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "病人主诉");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.disease_history</code>. 病史
     */
    public final TableField<MedicalHistoryRecord, String> DISEASE_HISTORY = createField("disease_history", org.jooq.impl.SQLDataType.CLOB, this, "病史");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.physical_examination</code>. 体格检查
     */
    public final TableField<MedicalHistoryRecord, String> PHYSICAL_EXAMINATION = createField("physical_examination", org.jooq.impl.SQLDataType.CLOB, this, "体格检查");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.auxiliary_physical_examination</code>. 辅助检查
     */
    public final TableField<MedicalHistoryRecord, String> AUXILIARY_PHYSICAL_EXAMINATION = createField("auxiliary_physical_examination", org.jooq.impl.SQLDataType.CLOB, this, "辅助检查");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.diagnosis_content</code>. 诊断
     */
    public final TableField<MedicalHistoryRecord, String> DIAGNOSIS_CONTENT = createField("diagnosis_content", org.jooq.impl.SQLDataType.CLOB, this, "诊断");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.diagnosis_suggestion</code>. 诊疗处理意见
     */
    public final TableField<MedicalHistoryRecord, String> DIAGNOSIS_SUGGESTION = createField("diagnosis_suggestion", org.jooq.impl.SQLDataType.CLOB, this, "诊疗处理意见");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.doctor_code</code>. 医师编码
     */
    public final TableField<MedicalHistoryRecord, String> DOCTOR_CODE = createField("doctor_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师编码");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.doctor_name</code>. 医师姓名
     */
    public final TableField<MedicalHistoryRecord, String> DOCTOR_NAME = createField("doctor_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师姓名");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.visit_time</code>. 病人就诊时间
     */
    public final TableField<MedicalHistoryRecord, Timestamp> VISIT_TIME = createField("visit_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "病人就诊时间");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.is_delete</code>. 删除标记
     */
    public final TableField<MedicalHistoryRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标记");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.create_time</code>. 生成时间
     */
    public final TableField<MedicalHistoryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "生成时间");

    /**
     * The column <code>mini_shop_471752.b2c_medical_history.update_time</code>. 最后修改时间
     */
    public final TableField<MedicalHistoryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_medical_history</code> table reference
     */
    public MedicalHistory() {
        this(DSL.name("b2c_medical_history"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_medical_history</code> table reference
     */
    public MedicalHistory(String alias) {
        this(DSL.name(alias), MEDICAL_HISTORY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_medical_history</code> table reference
     */
    public MedicalHistory(Name alias) {
        this(alias, MEDICAL_HISTORY);
    }

    private MedicalHistory(Name alias, Table<MedicalHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MedicalHistory(Name alias, Table<MedicalHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("病历表"));
    }

    public <O extends Record> MedicalHistory(Table<O> child, ForeignKey<O, MedicalHistoryRecord> key) {
        super(child, key, MEDICAL_HISTORY);
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
        return Arrays.<Index>asList(Indexes.MEDICAL_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MedicalHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEDICAL_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MedicalHistoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MEDICAL_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MedicalHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<MedicalHistoryRecord>>asList(Keys.KEY_B2C_MEDICAL_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalHistory as(String alias) {
        return new MedicalHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalHistory as(Name alias) {
        return new MedicalHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalHistory rename(String name) {
        return new MedicalHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalHistory rename(Name name) {
        return new MedicalHistory(name, null);
    }
}
