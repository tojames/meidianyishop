/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.ServiceSchedule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ServiceScheduleRecord extends UpdatableRecordImpl<ServiceScheduleRecord> implements Record8<Byte, Integer, String, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -484792553;

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.schedule_id</code>. 排班id
     */
    public void setScheduleId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.schedule_id</code>. 排班id
     */
    public Byte getScheduleId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.store_id</code>.
     */
    public void setStoreId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.schedule_name</code>. 排班名称
     */
    public void setScheduleName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.schedule_name</code>. 排班名称
     */
    public String getScheduleName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.begcreate_time</code>. 开始时间
     */
    public void setBegcreateTime(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.begcreate_time</code>. 开始时间
     */
    public String getBegcreateTime() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.end_time</code>. 结束时间
     */
    public void setEndTime(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.end_time</code>. 结束时间
     */
    public String getEndTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.del_flag</code>. 0正常，1删除
     */
    public void setDelFlag(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.del_flag</code>. 0正常，1删除
     */
    public Byte getDelFlag() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_service_schedule.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_service_schedule.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Byte, Integer, String, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Byte, Integer, String, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return ServiceSchedule.SERVICE_SCHEDULE.SCHEDULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ServiceSchedule.SERVICE_SCHEDULE.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ServiceSchedule.SERVICE_SCHEDULE.SCHEDULE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServiceSchedule.SERVICE_SCHEDULE.BEGCREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ServiceSchedule.SERVICE_SCHEDULE.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ServiceSchedule.SERVICE_SCHEDULE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ServiceSchedule.SERVICE_SCHEDULE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ServiceSchedule.SERVICE_SCHEDULE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component1() {
        return getScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getScheduleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBegcreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getScheduleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBegcreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value1(Byte value) {
        setScheduleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value2(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value3(String value) {
        setScheduleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value4(String value) {
        setBegcreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value5(String value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value6(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceScheduleRecord values(Byte value1, Integer value2, String value3, String value4, String value5, Byte value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceScheduleRecord
     */
    public ServiceScheduleRecord() {
        super(ServiceSchedule.SERVICE_SCHEDULE);
    }

    /**
     * Create a detached, initialised ServiceScheduleRecord
     */
    public ServiceScheduleRecord(Byte scheduleId, Integer storeId, String scheduleName, String begcreateTime, String endTime, Byte delFlag, Timestamp createTime, Timestamp updateTime) {
        super(ServiceSchedule.SERVICE_SCHEDULE);

        set(0, scheduleId);
        set(1, storeId);
        set(2, scheduleName);
        set(3, begcreateTime);
        set(4, endTime);
        set(5, delFlag);
        set(6, createTime);
        set(7, updateTime);
    }
}
