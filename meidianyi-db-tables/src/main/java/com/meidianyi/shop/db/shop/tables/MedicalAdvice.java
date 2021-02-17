/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.MedicalAdviceRecord;

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
 * 医嘱明细表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MedicalAdvice extends TableImpl<MedicalAdviceRecord> {

    private static final long serialVersionUID = -71057351;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_medical_advice</code>
     */
    public static final MedicalAdvice MEDICAL_ADVICE = new MedicalAdvice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MedicalAdviceRecord> getRecordType() {
        return MedicalAdviceRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.id</code>. 主键id
     */
    public final TableField<MedicalAdviceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.pos_code</code>. 医嘱单号
     */
    public final TableField<MedicalAdviceRecord, String> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医嘱单号");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.pos_detail_code</code>. 医嘱明细单号
     */
    public final TableField<MedicalAdviceRecord, String> POS_DETAIL_CODE = createField("pos_detail_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医嘱明细单号");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.diagnosis_name</code>. 诊断名称
     */
    public final TableField<MedicalAdviceRecord, String> DIAGNOSIS_NAME = createField("diagnosis_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "诊断名称");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.diagnosis_code</code>. 诊断编码
     */
    public final TableField<MedicalAdviceRecord, String> DIAGNOSIS_CODE = createField("diagnosis_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "诊断编码");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.diagnosis_content</code>. 诊断描述
     */
    public final TableField<MedicalAdviceRecord, String> DIAGNOSIS_CONTENT = createField("diagnosis_content", org.jooq.impl.SQLDataType.CLOB, this, "诊断描述");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.order_create_time</code>. 医嘱创建时间
     */
    public final TableField<MedicalAdviceRecord, Timestamp> ORDER_CREATE_TIME = createField("order_create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "医嘱创建时间");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.take_effect_time</code>. 医嘱生效时间
     */
    public final TableField<MedicalAdviceRecord, Timestamp> TAKE_EFFECT_TIME = createField("take_effect_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "医嘱生效时间");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.pos_content</code>. 医嘱内容
     */
    public final TableField<MedicalAdviceRecord, String> POS_CONTENT = createField("pos_content", org.jooq.impl.SQLDataType.CLOB, this, "医嘱内容");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_num</code>. 总量
     */
    public final TableField<MedicalAdviceRecord, Double> GOODS_NUM = createField("goods_num", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "总量");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_basic_unit</code>. 单位 例：500
     */
    public final TableField<MedicalAdviceRecord, String> GOODS_BASIC_UNIT = createField("goods_basic_unit", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "单位 例：500");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_quantity</code>. 单量 例:500
     */
    public final TableField<MedicalAdviceRecord, Double> GOODS_EQUIVALENT_QUANTITY = createField("goods_equivalent_quantity", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "单量 例:500");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_unit</code>. 单位(单量单位)例:ml
     */
    public final TableField<MedicalAdviceRecord, String> GOODS_EQUIVALENT_UNIT = createField("goods_equivalent_unit", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "单位(单量单位)例:ml");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_price</code>. 金额
     */
    public final TableField<MedicalAdviceRecord, Long> GOODS_PRICE = createField("goods_price", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "金额");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_use_frequency</code>. 使用频次
     */
    public final TableField<MedicalAdviceRecord, String> GOODS_USE_FREQUENCY = createField("goods_use_frequency", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "使用频次");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.goods_use_method</code>. 使用方法
     */
    public final TableField<MedicalAdviceRecord, String> GOODS_USE_METHOD = createField("goods_use_method", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "使用方法");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.doctor_memo</code>. 医师嘱托
     */
    public final TableField<MedicalAdviceRecord, String> DOCTOR_MEMO = createField("doctor_memo", org.jooq.impl.SQLDataType.CLOB, this, "医师嘱托");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.doctor</code>. 开嘱医师
     */
    public final TableField<MedicalAdviceRecord, String> DOCTOR = createField("doctor", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开嘱医师");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.basic_medical</code>. 是否表示当前医嘱明细是个药品 0:否、1:是
     */
    public final TableField<MedicalAdviceRecord, Byte> BASIC_MEDICAL = createField("basic_medical", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否表示当前医嘱明细是个药品 0:否、1:是");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.is_delete</code>. 删除标记
     */
    public final TableField<MedicalAdviceRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标记");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.create_time</code>. 生成时间
     */
    public final TableField<MedicalAdviceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "生成时间");

    /**
     * The column <code>mini_shop_471752.b2c_medical_advice.update_time</code>. 最后修改时间
     */
    public final TableField<MedicalAdviceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_medical_advice</code> table reference
     */
    public MedicalAdvice() {
        this(DSL.name("b2c_medical_advice"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_medical_advice</code> table reference
     */
    public MedicalAdvice(String alias) {
        this(DSL.name(alias), MEDICAL_ADVICE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_medical_advice</code> table reference
     */
    public MedicalAdvice(Name alias) {
        this(alias, MEDICAL_ADVICE);
    }

    private MedicalAdvice(Name alias, Table<MedicalAdviceRecord> aliased) {
        this(alias, aliased, null);
    }

    private MedicalAdvice(Name alias, Table<MedicalAdviceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("医嘱明细表"));
    }

    public <O extends Record> MedicalAdvice(Table<O> child, ForeignKey<O, MedicalAdviceRecord> key) {
        super(child, key, MEDICAL_ADVICE);
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
        return Arrays.<Index>asList(Indexes.MEDICAL_ADVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MedicalAdviceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEDICAL_ADVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MedicalAdviceRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MEDICAL_ADVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MedicalAdviceRecord>> getKeys() {
        return Arrays.<UniqueKey<MedicalAdviceRecord>>asList(Keys.KEY_B2C_MEDICAL_ADVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdvice as(String alias) {
        return new MedicalAdvice(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdvice as(Name alias) {
        return new MedicalAdvice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalAdvice rename(String name) {
        return new MedicalAdvice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalAdvice rename(Name name) {
        return new MedicalAdvice(name, null);
    }
}
