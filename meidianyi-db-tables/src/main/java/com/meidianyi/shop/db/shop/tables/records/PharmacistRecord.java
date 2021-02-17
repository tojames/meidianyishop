/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.Pharmacist;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 药师表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PharmacistRecord extends UpdatableRecordImpl<PharmacistRecord> implements Record10<Integer, Byte, String, String, String, Byte, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1666699471;

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.sex</code>. 0位置 1男 2 女
     */
    public void setSex(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.sex</code>. 0位置 1男 2 女
     */
    public Byte getSex() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.certificate_code</code>. 药师资格编码
     */
    public void setCertificateCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.certificate_code</code>. 药师资格编码
     */
    public String getCertificateCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.professional_code</code>. 药师职业编码
     */
    public void setProfessionalCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.professional_code</code>. 药师职业编码
     */
    public String getProfessionalCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.mobile</code>. 手机号
     */
    public void setMobile(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.mobile</code>. 手机号
     */
    public String getMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.status</code>. 是否启用 1启用 0禁用
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.status</code>. 是否启用 1启用 0禁用
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.signature</code>. 药师签名
     */
    public void setSignature(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.signature</code>. 药师签名
     */
    public String getSignature() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pharmacist.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pharmacist.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Byte, String, String, String, Byte, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Byte, String, String, String, Byte, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Pharmacist.PHARMACIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return Pharmacist.PHARMACIST.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Pharmacist.PHARMACIST.CERTIFICATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Pharmacist.PHARMACIST.PROFESSIONAL_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Pharmacist.PHARMACIST.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return Pharmacist.PHARMACIST.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Pharmacist.PHARMACIST.SIGNATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Pharmacist.PHARMACIST.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Pharmacist.PHARMACIST.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Pharmacist.PHARMACIST.UPDATE_TIME;
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
    public Byte component2() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCertificateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProfessionalCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
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
    public Byte value2() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCertificateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProfessionalCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value2(Byte value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value3(String value) {
        setCertificateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value4(String value) {
        setProfessionalCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value5(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value7(String value) {
        setSignature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value8(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PharmacistRecord values(Integer value1, Byte value2, String value3, String value4, String value5, Byte value6, String value7, Byte value8, Timestamp value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PharmacistRecord
     */
    public PharmacistRecord() {
        super(Pharmacist.PHARMACIST);
    }

    /**
     * Create a detached, initialised PharmacistRecord
     */
    public PharmacistRecord(Integer id, Byte sex, String certificateCode, String professionalCode, String mobile, Byte status, String signature, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(Pharmacist.PHARMACIST);

        set(0, id);
        set(1, sex);
        set(2, certificateCode);
        set(3, professionalCode);
        set(4, mobile);
        set(5, status);
        set(6, signature);
        set(7, isDelete);
        set(8, createTime);
        set(9, updateTime);
    }
}
