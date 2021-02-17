/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.ImSession;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 问诊会话记录一次医生和患者的在线会话
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImSessionRecord extends UpdatableRecordImpl<ImSessionRecord> implements Record16<Integer, Integer, Integer, Integer, Integer, Byte, Integer, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1555902420;

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.doctor_id</code>. 医师在我方库内id值
     */
    public void setDoctorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.doctor_id</code>. 医师在我方库内id值
     */
    public Integer getDoctorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.department_id</code>. 科室id
     */
    public void setDepartmentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.department_id</code>. 科室id
     */
    public Integer getDepartmentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.user_id</code>. 小程序发起会话用户id
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.user_id</code>. 小程序发起会话用户id
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.patient_id</code>. 本次诊疗的患者id
     */
    public void setPatientId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.patient_id</code>. 本次诊疗的患者id
     */
    public Integer getPatientId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.session_status</code>. 会话状态 0待支付，1医师待接诊，2会话中，3会话取消，4会话结束，5续诊，6会话终止
     */
    public void setSessionStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.session_status</code>. 会话状态 0待支付，1医师待接诊，2会话中，3会话取消，4会话结束，5续诊，6会话终止
     */
    public Byte getSessionStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.continue_session_count</code>. 可继续问诊次数
     */
    public void setContinueSessionCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.continue_session_count</code>. 可继续问诊次数
     */
    public Integer getContinueSessionCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.order_sn</code>. 会话关联的订单sn
     */
    public void setOrderSn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.order_sn</code>. 会话关联的订单sn
     */
    public String getOrderSn() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.receive_start_time</code>. 医师接诊时间
     */
    public void setReceiveStartTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.receive_start_time</code>. 医师接诊时间
     */
    public Timestamp getReceiveStartTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.limit_time</code>. 医生接诊后会话截止时间点
     */
    public void setLimitTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.limit_time</code>. 医生接诊后会话截止时间点
     */
    public Timestamp getLimitTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.weight_factor</code>. 权重因子,用于不同状态排序使用
     */
    public void setWeightFactor(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.weight_factor</code>. 权重因子,用于不同状态排序使用
     */
    public Byte getWeightFactor() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.evaluate_status</code>. 评价状态 0 不可评价 1可评价 2已评价
     */
    public void setEvaluateStatus(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.evaluate_status</code>. 评价状态 0 不可评价 1可评价 2已评价
     */
    public Byte getEvaluateStatus() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.ready_to_on_akc_time</code>. 接诊响应时间
     */
    public void setReadyToOnAkcTime(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.ready_to_on_akc_time</code>. 接诊响应时间
     */
    public Integer getReadyToOnAkcTime() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.is_delete</code>. 删除标记
     */
    public void setIsDelete(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.is_delete</code>. 删除标记
     */
    public Byte getIsDelete() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.create_time</code>. 生成时间
     */
    public void setCreateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.create_time</code>. 生成时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Byte, Integer, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Byte, Integer, String, Timestamp, Timestamp, Byte, Byte, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ImSession.IM_SESSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ImSession.IM_SESSION.DOCTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ImSession.IM_SESSION.DEPARTMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ImSession.IM_SESSION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ImSession.IM_SESSION.PATIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ImSession.IM_SESSION.SESSION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ImSession.IM_SESSION.CONTINUE_SESSION_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ImSession.IM_SESSION.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ImSession.IM_SESSION.RECEIVE_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ImSession.IM_SESSION.LIMIT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return ImSession.IM_SESSION.WEIGHT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return ImSession.IM_SESSION.EVALUATE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ImSession.IM_SESSION.READY_TO_ON_AKC_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return ImSession.IM_SESSION.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return ImSession.IM_SESSION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return ImSession.IM_SESSION.UPDATE_TIME;
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
    public Integer component2() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getSessionStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getContinueSessionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getReceiveStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getLimitTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getWeightFactor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getEvaluateStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getReadyToOnAkcTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
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
    public Integer value2() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getSessionStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getContinueSessionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getReceiveStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getLimitTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getWeightFactor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getEvaluateStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getReadyToOnAkcTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value2(Integer value) {
        setDoctorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value3(Integer value) {
        setDepartmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value5(Integer value) {
        setPatientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value6(Byte value) {
        setSessionStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value7(Integer value) {
        setContinueSessionCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value8(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value9(Timestamp value) {
        setReceiveStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value10(Timestamp value) {
        setLimitTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value11(Byte value) {
        setWeightFactor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value12(Byte value) {
        setEvaluateStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value13(Integer value) {
        setReadyToOnAkcTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value14(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value15(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord value16(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Byte value6, Integer value7, String value8, Timestamp value9, Timestamp value10, Byte value11, Byte value12, Integer value13, Byte value14, Timestamp value15, Timestamp value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImSessionRecord
     */
    public ImSessionRecord() {
        super(ImSession.IM_SESSION);
    }

    /**
     * Create a detached, initialised ImSessionRecord
     */
    public ImSessionRecord(Integer id, Integer doctorId, Integer departmentId, Integer userId, Integer patientId, Byte sessionStatus, Integer continueSessionCount, String orderSn, Timestamp receiveStartTime, Timestamp limitTime, Byte weightFactor, Byte evaluateStatus, Integer readyToOnAkcTime, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(ImSession.IM_SESSION);

        set(0, id);
        set(1, doctorId);
        set(2, departmentId);
        set(3, userId);
        set(4, patientId);
        set(5, sessionStatus);
        set(6, continueSessionCount);
        set(7, orderSn);
        set(8, receiveStartTime);
        set(9, limitTime);
        set(10, weightFactor);
        set(11, evaluateStatus);
        set(12, readyToOnAkcTime);
        set(13, isDelete);
        set(14, createTime);
        set(15, updateTime);
    }
}
