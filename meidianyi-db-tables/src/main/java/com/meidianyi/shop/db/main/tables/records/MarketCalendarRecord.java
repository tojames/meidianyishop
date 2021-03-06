/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.MarketCalendar;

import java.sql.Date;
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
public class MarketCalendarRecord extends UpdatableRecordImpl<MarketCalendarRecord> implements Record8<Integer, String, Date, String, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1697781740;

    /**
     * Setter for <code>mini_main.b2c_market_calendar.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.event_name</code>. 事件名称
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.event_name</code>. 事件名称
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.event_time</code>. 事件时间
     */
    public void setEventTime(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.event_time</code>. 事件时间
     */
    public Date getEventTime() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.event_desc</code>. 事件说明
     */
    public void setEventDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.event_desc</code>. 事件说明
     */
    public String getEventDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.pub_flag</code>. 发布状态：0未发布，1已发布
     */
    public void setPubFlag(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.pub_flag</code>. 发布状态：0未发布，1已发布
     */
    public Byte getPubFlag() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.del_flag</code>. 是否已删除：0否，1是
     */
    public void setDelFlag(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.del_flag</code>. 是否已删除：0否，1是
     */
    public Byte getDelFlag() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_market_calendar.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_market_calendar.update_time</code>. 更新时间
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Date, String, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Date, String, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MarketCalendar.MARKET_CALENDAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MarketCalendar.MARKET_CALENDAR.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return MarketCalendar.MARKET_CALENDAR.EVENT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MarketCalendar.MARKET_CALENDAR.EVENT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return MarketCalendar.MARKET_CALENDAR.PUB_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return MarketCalendar.MARKET_CALENDAR.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MarketCalendar.MARKET_CALENDAR.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MarketCalendar.MARKET_CALENDAR.UPDATE_TIME;
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
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getEventTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEventDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getPubFlag();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getEventTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEventDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getPubFlag();
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
    public MarketCalendarRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value3(Date value) {
        setEventTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value4(String value) {
        setEventDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value5(Byte value) {
        setPubFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value6(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketCalendarRecord values(Integer value1, String value2, Date value3, String value4, Byte value5, Byte value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached MarketCalendarRecord
     */
    public MarketCalendarRecord() {
        super(MarketCalendar.MARKET_CALENDAR);
    }

    /**
     * Create a detached, initialised MarketCalendarRecord
     */
    public MarketCalendarRecord(Integer id, String eventName, Date eventTime, String eventDesc, Byte pubFlag, Byte delFlag, Timestamp createTime, Timestamp updateTime) {
        super(MarketCalendar.MARKET_CALENDAR);

        set(0, id);
        set(1, eventName);
        set(2, eventTime);
        set(3, eventDesc);
        set(4, pubFlag);
        set(5, delFlag);
        set(6, createTime);
        set(7, updateTime);
    }
}
