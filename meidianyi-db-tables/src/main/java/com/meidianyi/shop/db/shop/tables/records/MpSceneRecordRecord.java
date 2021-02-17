/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.MpSceneRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 小程序初始化场景值
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpSceneRecordRecord extends UpdatableRecordImpl<MpSceneRecordRecord> implements Record10<Integer, String, String, Short, String, String, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1502530553;

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.path</code>. 打开小程序的路径
     */
    public void setPath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.path</code>. 打开小程序的路径
     */
    public String getPath() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.path_query</code>. 打开小程序的query
     */
    public void setPathQuery(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.path_query</code>. 打开小程序的query
     */
    public String getPathQuery() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.scene</code>. 场景值
     */
    public void setScene(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.scene</code>. 场景值
     */
    public Short getScene() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.share_ticket</code>. 转发的ticket
     */
    public void setShareTicket(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.share_ticket</code>. 转发的ticket
     */
    public String getShareTicket() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.referrer_info</code>. referrer信息
     */
    public void setReferrerInfo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.referrer_info</code>. referrer信息
     */
    public String getReferrerInfo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.count</code>. 记录次数
     */
    public void setCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.count</code>. 记录次数
     */
    public Integer getCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_mp_scene_record.id</code>.
     */
    public void setId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_mp_scene_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(9);
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
    public Row10<Integer, String, String, Short, String, String, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Short, String, String, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MpSceneRecord.MP_SCENE_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpSceneRecord.MP_SCENE_RECORD.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MpSceneRecord.MP_SCENE_RECORD.PATH_QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return MpSceneRecord.MP_SCENE_RECORD.SCENE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MpSceneRecord.MP_SCENE_RECORD.SHARE_TICKET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MpSceneRecord.MP_SCENE_RECORD.REFERRER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MpSceneRecord.MP_SCENE_RECORD.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MpSceneRecord.MP_SCENE_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return MpSceneRecord.MP_SCENE_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return MpSceneRecord.MP_SCENE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPathQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getShareTicket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getReferrerInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPathQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShareTicket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReferrerInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value2(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value3(String value) {
        setPathQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value4(Short value) {
        setScene(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value5(String value) {
        setShareTicket(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value6(String value) {
        setReferrerInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value7(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord value10(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSceneRecordRecord values(Integer value1, String value2, String value3, Short value4, String value5, String value6, Integer value7, Timestamp value8, Timestamp value9, Integer value10) {
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
     * Create a detached MpSceneRecordRecord
     */
    public MpSceneRecordRecord() {
        super(MpSceneRecord.MP_SCENE_RECORD);
    }

    /**
     * Create a detached, initialised MpSceneRecordRecord
     */
    public MpSceneRecordRecord(Integer userId, String path, String pathQuery, Short scene, String shareTicket, String referrerInfo, Integer count, Timestamp createTime, Timestamp updateTime, Integer id) {
        super(MpSceneRecord.MP_SCENE_RECORD);

        set(0, userId);
        set(1, path);
        set(2, pathQuery);
        set(3, scene);
        set(4, shareTicket);
        set(5, referrerInfo);
        set(6, count);
        set(7, createTime);
        set(8, updateTime);
        set(9, id);
    }
}
