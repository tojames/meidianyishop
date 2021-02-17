/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.ChannelStatistical;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class ChannelStatisticalRecord extends UpdatableRecordImpl<ChannelStatisticalRecord> implements Record20<Integer, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, Date, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1080402722;

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.page_id</code>.
     */
    public void setPageId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.page_id</code>.
     */
    public Integer getPageId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.goods_id</code>.
     */
    public void setGoodsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.goods_id</code>.
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_id</code>. 渠道id
     */
    public void setChannelId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_id</code>. 渠道id
     */
    public String getChannelId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_all_pv</code>.
     */
    public void setChannelAllPv(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_all_pv</code>.
     */
    public String getChannelAllPv() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_all_uv</code>.
     */
    public void setChannelAllUv(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_all_uv</code>.
     */
    public String getChannelAllUv() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_new_pv</code>.
     */
    public void setChannelNewPv(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_new_pv</code>.
     */
    public String getChannelNewPv() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_new_uv</code>.
     */
    public void setChannelNewUv(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_new_uv</code>.
     */
    public String getChannelNewUv() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_old_pv</code>.
     */
    public void setChannelOldPv(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_old_pv</code>.
     */
    public String getChannelOldPv() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.channel_old_uv</code>.
     */
    public void setChannelOldUv(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.channel_old_uv</code>.
     */
    public String getChannelOldUv() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.all_pv</code>.
     */
    public void setAllPv(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.all_pv</code>.
     */
    public String getAllPv() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.all_uv</code>.
     */
    public void setAllUv(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.all_uv</code>.
     */
    public String getAllUv() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.new_pv</code>.
     */
    public void setNewPv(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.new_pv</code>.
     */
    public String getNewPv() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.new_uv</code>.
     */
    public void setNewUv(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.new_uv</code>.
     */
    public String getNewUv() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.old_pv</code>.
     */
    public void setOldPv(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.old_pv</code>.
     */
    public String getOldPv() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.old_uv</code>.
     */
    public void setOldUv(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.old_uv</code>.
     */
    public String getOldUv() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.ref_date</code>. 2019-03-04
     */
    public void setRefDate(Date value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.ref_date</code>. 2019-03-04
     */
    public Date getRefDate() {
        return (Date) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.ref_type</code>. 1昨天 7天 30天
     */
    public void setRefType(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.ref_type</code>. 1昨天 7天 30天
     */
    public Byte getRefType() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_channel_statistical.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_channel_statistical.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, Date, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, Date, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChannelStatistical.CHANNEL_STATISTICAL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ChannelStatistical.CHANNEL_STATISTICAL.PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ChannelStatistical.CHANNEL_STATISTICAL.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_ALL_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_ALL_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_NEW_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_NEW_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_OLD_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CHANNEL_OLD_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ChannelStatistical.CHANNEL_STATISTICAL.ALL_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ChannelStatistical.CHANNEL_STATISTICAL.ALL_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ChannelStatistical.CHANNEL_STATISTICAL.NEW_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ChannelStatistical.CHANNEL_STATISTICAL.NEW_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ChannelStatistical.CHANNEL_STATISTICAL.OLD_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ChannelStatistical.CHANNEL_STATISTICAL.OLD_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field17() {
        return ChannelStatistical.CHANNEL_STATISTICAL.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field18() {
        return ChannelStatistical.CHANNEL_STATISTICAL.REF_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return ChannelStatistical.CHANNEL_STATISTICAL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return ChannelStatistical.CHANNEL_STATISTICAL.UPDATE_TIME;
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
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getChannelAllPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getChannelAllUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getChannelNewPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getChannelNewUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getChannelOldPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getChannelOldUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAllPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAllUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getNewPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getNewUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOldPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getOldUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component17() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component18() {
        return getRefType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
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
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getChannelAllPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getChannelAllUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getChannelNewPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getChannelNewUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getChannelOldPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getChannelOldUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAllPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAllUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getNewPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getNewUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOldPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getOldUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value17() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value18() {
        return getRefType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value2(Integer value) {
        setPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value4(String value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value5(String value) {
        setChannelAllPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value6(String value) {
        setChannelAllUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value7(String value) {
        setChannelNewPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value8(String value) {
        setChannelNewUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value9(String value) {
        setChannelOldPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value10(String value) {
        setChannelOldUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value11(String value) {
        setAllPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value12(String value) {
        setAllUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value13(String value) {
        setNewPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value14(String value) {
        setNewUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value15(String value) {
        setOldPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value16(String value) {
        setOldUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value17(Date value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value18(Byte value) {
        setRefType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value19(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord value20(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelStatisticalRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Date value17, Byte value18, Timestamp value19, Timestamp value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChannelStatisticalRecord
     */
    public ChannelStatisticalRecord() {
        super(ChannelStatistical.CHANNEL_STATISTICAL);
    }

    /**
     * Create a detached, initialised ChannelStatisticalRecord
     */
    public ChannelStatisticalRecord(Integer id, Integer pageId, Integer goodsId, String channelId, String channelAllPv, String channelAllUv, String channelNewPv, String channelNewUv, String channelOldPv, String channelOldUv, String allPv, String allUv, String newPv, String newUv, String oldPv, String oldUv, Date refDate, Byte refType, Timestamp createTime, Timestamp updateTime) {
        super(ChannelStatistical.CHANNEL_STATISTICAL);

        set(0, id);
        set(1, pageId);
        set(2, goodsId);
        set(3, channelId);
        set(4, channelAllPv);
        set(5, channelAllUv);
        set(6, channelNewPv);
        set(7, channelNewUv);
        set(8, channelOldPv);
        set(9, channelOldUv);
        set(10, allPv);
        set(11, allUv);
        set(12, newPv);
        set(13, newUv);
        set(14, oldPv);
        set(15, oldUv);
        set(16, refDate);
        set(17, refType);
        set(18, createTime);
        set(19, updateTime);
    }
}
