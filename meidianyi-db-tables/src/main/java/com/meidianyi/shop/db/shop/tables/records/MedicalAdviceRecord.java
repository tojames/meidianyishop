/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.MedicalAdvice;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MedicalAdviceRecord extends UpdatableRecordImpl<MedicalAdviceRecord> implements Record22<Integer, String, String, String, String, String, Timestamp, Timestamp, String, Double, String, Double, String, Long, String, String, String, String, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 811102894;

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.pos_code</code>. 医嘱单号
     */
    public void setPosCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.pos_code</code>. 医嘱单号
     */
    public String getPosCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.pos_detail_code</code>. 医嘱明细单号
     */
    public void setPosDetailCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.pos_detail_code</code>. 医嘱明细单号
     */
    public String getPosDetailCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_name</code>. 诊断名称
     */
    public void setDiagnosisName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_name</code>. 诊断名称
     */
    public String getDiagnosisName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_code</code>. 诊断编码
     */
    public void setDiagnosisCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_code</code>. 诊断编码
     */
    public String getDiagnosisCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_content</code>. 诊断描述
     */
    public void setDiagnosisContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.diagnosis_content</code>. 诊断描述
     */
    public String getDiagnosisContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.order_create_time</code>. 医嘱创建时间
     */
    public void setOrderCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.order_create_time</code>. 医嘱创建时间
     */
    public Timestamp getOrderCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.take_effect_time</code>. 医嘱生效时间
     */
    public void setTakeEffectTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.take_effect_time</code>. 医嘱生效时间
     */
    public Timestamp getTakeEffectTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.pos_content</code>. 医嘱内容
     */
    public void setPosContent(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.pos_content</code>. 医嘱内容
     */
    public String getPosContent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_num</code>. 总量
     */
    public void setGoodsNum(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_num</code>. 总量
     */
    public Double getGoodsNum() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_basic_unit</code>. 单位 例：500
     */
    public void setGoodsBasicUnit(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_basic_unit</code>. 单位 例：500
     */
    public String getGoodsBasicUnit() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_quantity</code>. 单量 例:500
     */
    public void setGoodsEquivalentQuantity(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_quantity</code>. 单量 例:500
     */
    public Double getGoodsEquivalentQuantity() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_unit</code>. 单位(单量单位)例:ml
     */
    public void setGoodsEquivalentUnit(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_equivalent_unit</code>. 单位(单量单位)例:ml
     */
    public String getGoodsEquivalentUnit() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_price</code>. 金额
     */
    public void setGoodsPrice(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_price</code>. 金额
     */
    public Long getGoodsPrice() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_use_frequency</code>. 使用频次
     */
    public void setGoodsUseFrequency(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_use_frequency</code>. 使用频次
     */
    public String getGoodsUseFrequency() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.goods_use_method</code>. 使用方法
     */
    public void setGoodsUseMethod(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.goods_use_method</code>. 使用方法
     */
    public String getGoodsUseMethod() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.doctor_memo</code>. 医师嘱托
     */
    public void setDoctorMemo(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.doctor_memo</code>. 医师嘱托
     */
    public String getDoctorMemo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.doctor</code>. 开嘱医师
     */
    public void setDoctor(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.doctor</code>. 开嘱医师
     */
    public String getDoctor() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.basic_medical</code>. 是否表示当前医嘱明细是个药品 0:否、1:是
     */
    public void setBasicMedical(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.basic_medical</code>. 是否表示当前医嘱明细是个药品 0:否、1:是
     */
    public Byte getBasicMedical() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.is_delete</code>. 删除标记
     */
    public void setIsDelete(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.is_delete</code>. 删除标记
     */
    public Byte getIsDelete() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.create_time</code>. 生成时间
     */
    public void setCreateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.create_time</code>. 生成时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_medical_advice.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_medical_advice.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, String, String, String, String, String, Timestamp, Timestamp, String, Double, String, Double, String, Long, String, String, String, String, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, String, String, String, String, String, Timestamp, Timestamp, String, Double, String, Double, String, Long, String, String, String, String, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MedicalAdvice.MEDICAL_ADVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MedicalAdvice.MEDICAL_ADVICE.POS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MedicalAdvice.MEDICAL_ADVICE.POS_DETAIL_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MedicalAdvice.MEDICAL_ADVICE.DIAGNOSIS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MedicalAdvice.MEDICAL_ADVICE.DIAGNOSIS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MedicalAdvice.MEDICAL_ADVICE.DIAGNOSIS_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MedicalAdvice.MEDICAL_ADVICE.ORDER_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MedicalAdvice.MEDICAL_ADVICE.TAKE_EFFECT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MedicalAdvice.MEDICAL_ADVICE.POS_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_BASIC_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_EQUIVALENT_QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_EQUIVALENT_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_USE_FREQUENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return MedicalAdvice.MEDICAL_ADVICE.GOODS_USE_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return MedicalAdvice.MEDICAL_ADVICE.DOCTOR_MEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return MedicalAdvice.MEDICAL_ADVICE.DOCTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field19() {
        return MedicalAdvice.MEDICAL_ADVICE.BASIC_MEDICAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field20() {
        return MedicalAdvice.MEDICAL_ADVICE.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return MedicalAdvice.MEDICAL_ADVICE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field22() {
        return MedicalAdvice.MEDICAL_ADVICE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPosCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPosDetailCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDiagnosisName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDiagnosisCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDiagnosisContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getOrderCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getTakeEffectTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPosContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component10() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getGoodsBasicUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getGoodsEquivalentQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getGoodsEquivalentUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getGoodsPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getGoodsUseFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getGoodsUseMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getDoctorMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getDoctor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component19() {
        return getBasicMedical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component20() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component22() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPosCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPosDetailCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDiagnosisName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDiagnosisCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDiagnosisContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getOrderCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getTakeEffectTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPosContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getGoodsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getGoodsBasicUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getGoodsEquivalentQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getGoodsEquivalentUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getGoodsPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getGoodsUseFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getGoodsUseMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getDoctorMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getDoctor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value19() {
        return getBasicMedical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value20() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value22() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value2(String value) {
        setPosCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value3(String value) {
        setPosDetailCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value4(String value) {
        setDiagnosisName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value5(String value) {
        setDiagnosisCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value6(String value) {
        setDiagnosisContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value7(Timestamp value) {
        setOrderCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value8(Timestamp value) {
        setTakeEffectTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value9(String value) {
        setPosContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value10(Double value) {
        setGoodsNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value11(String value) {
        setGoodsBasicUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value12(Double value) {
        setGoodsEquivalentQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value13(String value) {
        setGoodsEquivalentUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value14(Long value) {
        setGoodsPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value15(String value) {
        setGoodsUseFrequency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value16(String value) {
        setGoodsUseMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value17(String value) {
        setDoctorMemo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value18(String value) {
        setDoctor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value19(Byte value) {
        setBasicMedical(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value20(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value21(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord value22(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalAdviceRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, Timestamp value8, String value9, Double value10, String value11, Double value12, String value13, Long value14, String value15, String value16, String value17, String value18, Byte value19, Byte value20, Timestamp value21, Timestamp value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MedicalAdviceRecord
     */
    public MedicalAdviceRecord() {
        super(MedicalAdvice.MEDICAL_ADVICE);
    }

    /**
     * Create a detached, initialised MedicalAdviceRecord
     */
    public MedicalAdviceRecord(Integer id, String posCode, String posDetailCode, String diagnosisName, String diagnosisCode, String diagnosisContent, Timestamp orderCreateTime, Timestamp takeEffectTime, String posContent, Double goodsNum, String goodsBasicUnit, Double goodsEquivalentQuantity, String goodsEquivalentUnit, Long goodsPrice, String goodsUseFrequency, String goodsUseMethod, String doctorMemo, String doctor, Byte basicMedical, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(MedicalAdvice.MEDICAL_ADVICE);

        set(0, id);
        set(1, posCode);
        set(2, posDetailCode);
        set(3, diagnosisName);
        set(4, diagnosisCode);
        set(5, diagnosisContent);
        set(6, orderCreateTime);
        set(7, takeEffectTime);
        set(8, posContent);
        set(9, goodsNum);
        set(10, goodsBasicUnit);
        set(11, goodsEquivalentQuantity);
        set(12, goodsEquivalentUnit);
        set(13, goodsPrice);
        set(14, goodsUseFrequency);
        set(15, goodsUseMethod);
        set(16, doctorMemo);
        set(17, doctor);
        set(18, basicMedical);
        set(19, isDelete);
        set(20, createTime);
        set(21, updateTime);
    }
}
