/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UserAnnouncement;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户公告关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserAnnouncementRecord extends UpdatableRecordImpl<UserAnnouncementRecord> implements Record7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1269853497;

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.announcement_id</code>.
     */
    public void setAnnouncementId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.announcement_id</code>.
     */
    public Integer getAnnouncementId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.message_id</code>. 公告id
     */
    public void setMessageId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.message_id</code>. 公告id
     */
    public Integer getMessageId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.message_status</code>. 消息状态 0：未读、1：已读、3：置顶消息 默认0
     */
    public void setMessageStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.message_status</code>. 消息状态 0：未读、1：已读、3：置顶消息 默认0
     */
    public Byte getMessageStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.is_delete</code>. 删除
     */
    public void setIsDelete(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.is_delete</code>. 删除
     */
    public Byte getIsDelete() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_announcement.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_announcement.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserAnnouncement.USER_ANNOUNCEMENT.ANNOUNCEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserAnnouncement.USER_ANNOUNCEMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserAnnouncement.USER_ANNOUNCEMENT.MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UserAnnouncement.USER_ANNOUNCEMENT.MESSAGE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return UserAnnouncement.USER_ANNOUNCEMENT.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UserAnnouncement.USER_ANNOUNCEMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserAnnouncement.USER_ANNOUNCEMENT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAnnouncementId();
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
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getMessageStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAnnouncementId();
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
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getMessageStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value1(Integer value) {
        setAnnouncementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value3(Integer value) {
        setMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value4(Byte value) {
        setMessageStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value5(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAnnouncementRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Byte value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserAnnouncementRecord
     */
    public UserAnnouncementRecord() {
        super(UserAnnouncement.USER_ANNOUNCEMENT);
    }

    /**
     * Create a detached, initialised UserAnnouncementRecord
     */
    public UserAnnouncementRecord(Integer announcementId, Integer userId, Integer messageId, Byte messageStatus, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(UserAnnouncement.USER_ANNOUNCEMENT);

        set(0, announcementId);
        set(1, userId);
        set(2, messageId);
        set(3, messageStatus);
        set(4, isDelete);
        set(5, createTime);
        set(6, updateTime);
    }
}
