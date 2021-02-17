/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UserGoodsRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class UserGoodsRecordRecord extends UpdatableRecordImpl<UserGoodsRecordRecord> implements Record17<Long, Integer, Integer, Integer, Short, String, String, String, String, String, String, String, String, String, Short, Timestamp, Timestamp> {

    private static final long serialVersionUID = 423399791;

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.active_id</code>. 活动id
     */
    public void setActiveId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.active_id</code>. 活动id
     */
    public Integer getActiveId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.active_type</code>. 活动类型
     */
    public void setActiveType(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.active_type</code>. 活动类型
     */
    public Short getActiveType() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.user_ip</code>. 用户ip
     */
    public void setUserIp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.user_ip</code>. 用户ip
     */
    public String getUserIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.province_code</code>. 省
     */
    public void setProvinceCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.province_code</code>. 省
     */
    public String getProvinceCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.province</code>. 省
     */
    public void setProvince(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.province</code>. 省
     */
    public String getProvince() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.city_code</code>. 市
     */
    public void setCityCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.city_code</code>. 市
     */
    public String getCityCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.city</code>. 市
     */
    public void setCity(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.city</code>. 市
     */
    public String getCity() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.district_code</code>. 区
     */
    public void setDistrictCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.district_code</code>. 区
     */
    public String getDistrictCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.district</code>. 区
     */
    public void setDistrict(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.district</code>. 区
     */
    public String getDistrict() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.lat</code>. 经度
     */
    public void setLat(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.lat</code>. 经度
     */
    public String getLat() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.lng</code>. 纬度
     */
    public void setLng(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.lng</code>. 纬度
     */
    public String getLng() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.count</code>. 次数
     */
    public void setCount(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.count</code>. 次数
     */
    public Short getCount() {
        return (Short) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_goods_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_goods_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, Integer, Integer, Integer, Short, String, String, String, String, String, String, String, String, String, Short, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, Integer, Integer, Integer, Short, String, String, String, String, String, String, String, String, String, Short, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserGoodsRecord.USER_GOODS_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserGoodsRecord.USER_GOODS_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserGoodsRecord.USER_GOODS_RECORD.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserGoodsRecord.USER_GOODS_RECORD.ACTIVE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return UserGoodsRecord.USER_GOODS_RECORD.ACTIVE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserGoodsRecord.USER_GOODS_RECORD.USER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserGoodsRecord.USER_GOODS_RECORD.PROVINCE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UserGoodsRecord.USER_GOODS_RECORD.PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UserGoodsRecord.USER_GOODS_RECORD.CITY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UserGoodsRecord.USER_GOODS_RECORD.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UserGoodsRecord.USER_GOODS_RECORD.DISTRICT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UserGoodsRecord.USER_GOODS_RECORD.DISTRICT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return UserGoodsRecord.USER_GOODS_RECORD.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UserGoodsRecord.USER_GOODS_RECORD.LNG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field15() {
        return UserGoodsRecord.USER_GOODS_RECORD.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return UserGoodsRecord.USER_GOODS_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return UserGoodsRecord.USER_GOODS_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUserId();
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
    public Integer component4() {
        return getActiveId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getActiveType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProvinceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCityCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDistrictCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDistrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getLng();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component15() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
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
    public Integer value4() {
        return getActiveId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getActiveType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProvinceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCityCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDistrictCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDistrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLng();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value15() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value4(Integer value) {
        setActiveId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value5(Short value) {
        setActiveType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value6(String value) {
        setUserIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value7(String value) {
        setProvinceCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value8(String value) {
        setProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value9(String value) {
        setCityCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value10(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value11(String value) {
        setDistrictCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value12(String value) {
        setDistrict(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value13(String value) {
        setLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value14(String value) {
        setLng(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value15(Short value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value16(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord value17(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGoodsRecordRecord values(Long value1, Integer value2, Integer value3, Integer value4, Short value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Short value15, Timestamp value16, Timestamp value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGoodsRecordRecord
     */
    public UserGoodsRecordRecord() {
        super(UserGoodsRecord.USER_GOODS_RECORD);
    }

    /**
     * Create a detached, initialised UserGoodsRecordRecord
     */
    public UserGoodsRecordRecord(Long id, Integer userId, Integer goodsId, Integer activeId, Short activeType, String userIp, String provinceCode, String province, String cityCode, String city, String districtCode, String district, String lat, String lng, Short count, Timestamp createTime, Timestamp updateTime) {
        super(UserGoodsRecord.USER_GOODS_RECORD);

        set(0, id);
        set(1, userId);
        set(2, goodsId);
        set(3, activeId);
        set(4, activeType);
        set(5, userIp);
        set(6, provinceCode);
        set(7, province);
        set(8, cityCode);
        set(9, city);
        set(10, districtCode);
        set(11, district);
        set(12, lat);
        set(13, lng);
        set(14, count);
        set(15, createTime);
        set(16, updateTime);
    }
}
