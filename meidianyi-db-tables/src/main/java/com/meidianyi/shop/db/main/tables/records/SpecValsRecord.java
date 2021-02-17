/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.SpecVals;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SpecValsRecord extends UpdatableRecordImpl<SpecValsRecord> implements Record5<Integer, Integer, String, Byte, Integer> {

    private static final long serialVersionUID = -1481767243;

    /**
     * Setter for <code>mini_main.b2c_spec_vals.specvalid</code>.
     */
    public void setSpecvalid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_spec_vals.specvalid</code>.
     */
    public Integer getSpecvalid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_spec_vals.spec_id</code>.
     */
    public void setSpecId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_spec_vals.spec_id</code>.
     */
    public Integer getSpecId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_spec_vals.specvalname</code>.
     */
    public void setSpecvalname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_spec_vals.specvalname</code>.
     */
    public String getSpecvalname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_spec_vals.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_spec_vals.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_spec_vals.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_spec_vals.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
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
    public Row5<Integer, Integer, String, Byte, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Byte, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SpecVals.SPEC_VALS.SPECVALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SpecVals.SPEC_VALS.SPEC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SpecVals.SPEC_VALS.SPECVALNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return SpecVals.SPEC_VALS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SpecVals.SPEC_VALS.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSpecvalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSpecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSpecvalname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSpecvalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSpecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSpecvalname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord value1(Integer value) {
        setSpecvalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord value2(Integer value) {
        setSpecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord value3(String value) {
        setSpecvalname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord value4(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord value5(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecValsRecord values(Integer value1, Integer value2, String value3, Byte value4, Integer value5) {
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
     * Create a detached SpecValsRecord
     */
    public SpecValsRecord() {
        super(SpecVals.SPEC_VALS);
    }

    /**
     * Create a detached, initialised SpecValsRecord
     */
    public SpecValsRecord(Integer specvalid, Integer specId, String specvalname, Byte delFlag, Integer shopId) {
        super(SpecVals.SPEC_VALS);

        set(0, specvalid);
        set(1, specId);
        set(2, specvalname);
        set(3, delFlag);
        set(4, shopId);
    }
}