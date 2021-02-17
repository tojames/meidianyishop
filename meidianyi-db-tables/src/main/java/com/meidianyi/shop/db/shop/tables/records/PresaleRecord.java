/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.Presale;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class PresaleRecord extends UpdatableRecordImpl<PresaleRecord> {

    private static final long serialVersionUID = -1946407487;

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.id</code>. 活动id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.id</code>. 活动id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.presale_type</code>. 预售类型1：全款
     */
    public void setPresaleType(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.presale_type</code>. 预售类型1：全款
     */
    public Byte getPresaleType() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.presale_name</code>. 预售活动名称
     */
    public void setPresaleName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.presale_name</code>. 预售活动名称
     */
    public String getPresaleName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_pay_step</code>. 定金期数1|2
     */
    public void setPrePayStep(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_pay_step</code>. 定金期数1|2
     */
    public Byte getPrePayStep() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_start_time</code>. 定金一期支付开始时间
     */
    public void setPreStartTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_start_time</code>. 定金一期支付开始时间
     */
    public Timestamp getPreStartTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_end_time</code>. 定金一期支付结束时间
     */
    public void setPreEndTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_end_time</code>. 定金一期支付结束时间
     */
    public Timestamp getPreEndTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_start_time_2</code>. 定金二期支付开始时间
     */
    public void setPreStartTime_2(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_start_time_2</code>. 定金二期支付开始时间
     */
    public Timestamp getPreStartTime_2() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_end_time_2</code>. 定金二期支付结束时间
     */
    public void setPreEndTime_2(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_end_time_2</code>. 定金二期支付结束时间
     */
    public Timestamp getPreEndTime_2() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.start_time</code>. 尾款支付开始时间
     */
    public void setStartTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.start_time</code>. 尾款支付开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.end_time</code>. 尾款支付结束时间
     */
    public void setEndTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.end_time</code>. 尾款支付结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.goods_id</code>. 商品id 1,2,4
     */
    public void setGoodsId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.goods_id</code>. 商品id 1,2,4
     */
    public String getGoodsId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.deliver_type</code>. 发货时间模式1:deliver_time;2:deliver_days
     */
    public void setDeliverType(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.deliver_type</code>. 发货时间模式1:deliver_time;2:deliver_days
     */
    public Byte getDeliverType() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.deliver_time</code>. 发货日期
     */
    public void setDeliverTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.deliver_time</code>. 发货日期
     */
    public Timestamp getDeliverTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.deliver_days</code>. 下单后几日发货
     */
    public void setDeliverDays(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.deliver_days</code>. 下单后几日发货
     */
    public Integer getDeliverDays() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.discount_type</code>. 优惠策略1:可叠加0:不可叠加
     */
    public void setDiscountType(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.discount_type</code>. 优惠策略1:可叠加0:不可叠加
     */
    public Byte getDiscountType() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.return_type</code>. 退定金模式1:自动退定金0:不退定金
     */
    public void setReturnType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.return_type</code>. 退定金模式1:自动退定金0:不退定金
     */
    public Byte getReturnType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.show_sale_number</code>. 是否显示销量1:显示
     */
    public void setShowSaleNumber(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.show_sale_number</code>. 是否显示销量1:显示
     */
    public Integer getShowSaleNumber() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.buy_type</code>. 是否支持原价1:支持
     */
    public void setBuyType(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.buy_type</code>. 是否支持原价1:支持
     */
    public Byte getBuyType() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.buy_number</code>. 单用户最多可购买数量
     */
    public void setBuyNumber(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.buy_number</code>. 单用户最多可购买数量
     */
    public Integer getBuyNumber() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.status</code>. 状态1:启用0:停用
     */
    public void setStatus(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.status</code>. 状态1:启用0:停用
     */
    public Byte getStatus() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.del_flag</code>. 删除状态1:删除
     */
    public void setDelFlag(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.del_flag</code>. 删除状态1:删除
     */
    public Byte getDelFlag() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.share_config</code>. 分享设置
     */
    public void setShareConfig(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.share_config</code>. 分享设置
     */
    public String getShareConfig() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.pre_time</code>. 预告时间：-1：立刻预告；0：不预告；大于0：开始前预告小时数
     */
    public void setPreTime(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.pre_time</code>. 预告时间：-1：立刻预告；0：不预告；大于0：开始前预告小时数
     */
    public Integer getPreTime() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_presale.first</code>. 优先级
     */
    public void setFirst(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_presale.first</code>. 优先级
     */
    public Integer getFirst() {
        return (Integer) get(25);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PresaleRecord
     */
    public PresaleRecord() {
        super(Presale.PRESALE);
    }

    /**
     * Create a detached, initialised PresaleRecord
     */
    public PresaleRecord(Integer id, Byte presaleType, String presaleName, Byte prePayStep, Timestamp preStartTime, Timestamp preEndTime, Timestamp preStartTime_2, Timestamp preEndTime_2, Timestamp startTime, Timestamp endTime, String goodsId, Byte deliverType, Timestamp deliverTime, Integer deliverDays, Byte discountType, Byte returnType, Integer showSaleNumber, Byte buyType, Integer buyNumber, Byte status, Byte delFlag, Timestamp createTime, Timestamp updateTime, String shareConfig, Integer preTime, Integer first) {
        super(Presale.PRESALE);

        set(0, id);
        set(1, presaleType);
        set(2, presaleName);
        set(3, prePayStep);
        set(4, preStartTime);
        set(5, preEndTime);
        set(6, preStartTime_2);
        set(7, preEndTime_2);
        set(8, startTime);
        set(9, endTime);
        set(10, goodsId);
        set(11, deliverType);
        set(12, deliverTime);
        set(13, deliverDays);
        set(14, discountType);
        set(15, returnType);
        set(16, showSaleNumber);
        set(17, buyType);
        set(18, buyNumber);
        set(19, status);
        set(20, delFlag);
        set(21, createTime);
        set(22, updateTime);
        set(23, shareConfig);
        set(24, preTime);
        set(25, first);
    }
}
