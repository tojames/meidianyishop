/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.MpDistributionVisit;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 访问分布
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpDistributionVisitRecord extends UpdatableRecordImpl<MpDistributionVisitRecord> implements Record5<String, String, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -917601054;

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_distribution_visit.ref_date</code>. 时间，如："20180313"
     */
    public void setRefDate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_distribution_visit.ref_date</code>. 时间，如："20180313"
     */
    public String getRefDate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_distribution_visit.list</code>. 存入所有类型的指标情况
     */
    public void setList(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_distribution_visit.list</code>. 存入所有类型的指标情况
     */
    public String getList() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_distribution_visit.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_distribution_visit.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_distribution_visit.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_distribution_visit.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_distribution_visit.id</code>.
     */
    public void setId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_distribution_visit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MpDistributionVisit.MP_DISTRIBUTION_VISIT.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpDistributionVisit.MP_DISTRIBUTION_VISIT.LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MpDistributionVisit.MP_DISTRIBUTION_VISIT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MpDistributionVisit.MP_DISTRIBUTION_VISIT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MpDistributionVisit.MP_DISTRIBUTION_VISIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord value1(String value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord value2(String value) {
        setList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord value5(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpDistributionVisitRecord values(String value1, String value2, Timestamp value3, Timestamp value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpDistributionVisitRecord
     */
    public MpDistributionVisitRecord() {
        super(MpDistributionVisit.MP_DISTRIBUTION_VISIT);
    }

    /**
     * Create a detached, initialised MpDistributionVisitRecord
     */
    public MpDistributionVisitRecord(String refDate, String list, Timestamp createTime, Timestamp updateTime, Integer id) {
        super(MpDistributionVisit.MP_DISTRIBUTION_VISIT);

        set(0, refDate);
        set(1, list);
        set(2, createTime);
        set(3, updateTime);
        set(4, id);
    }
}
