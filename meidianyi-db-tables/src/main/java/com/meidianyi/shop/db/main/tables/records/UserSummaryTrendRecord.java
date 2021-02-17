/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables.records;


import com.meidianyi.shop.db.main.tables.UserSummaryTrend;

import java.math.BigDecimal;
import java.sql.Date;
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
public class UserSummaryTrendRecord extends UpdatableRecordImpl<UserSummaryTrendRecord> {

    private static final long serialVersionUID = 1503344058;

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.ref_date</code>. 2018-09-04
     */
    public void setRefDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.ref_date</code>. 2018-09-04
     */
    public Date getRefDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.type</code>. 1，7，30
     */
    public void setType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.type</code>. 1，7，30
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.login_data</code>. 访问会员数据
     */
    public void setLoginData(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.login_data</code>. 访问会员数据
     */
    public Integer getLoginData() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.user_data</code>. 累积会员数
     */
    public void setUserData(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.user_data</code>. 累积会员数
     */
    public Integer getUserData() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.coupon_data</code>. 领券会员数
     */
    public void setCouponData(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.coupon_data</code>. 领券会员数
     */
    public Integer getCouponData() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.cart_data</code>. 加购会员数
     */
    public void setCartData(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.cart_data</code>. 加购会员数
     */
    public Integer getCartData() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.reg_user_data</code>. 注册数
     */
    public void setRegUserData(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.reg_user_data</code>. 注册数
     */
    public Integer getRegUserData() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.upgrade_user_data</code>. 升级会员数
     */
    public void setUpgradeUserData(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.upgrade_user_data</code>. 升级会员数
     */
    public Integer getUpgradeUserData() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.charge_user_data</code>. 储值会员数
     */
    public void setChargeUserData(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.charge_user_data</code>. 储值会员数
     */
    public Integer getChargeUserData() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.order_user_data</code>. 成交客户数
     */
    public void setOrderUserData(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.order_user_data</code>. 成交客户数
     */
    public Integer getOrderUserData() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.new_order_user_data</code>. 成交新客户数
     */
    public void setNewOrderUserData(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.new_order_user_data</code>. 成交新客户数
     */
    public Integer getNewOrderUserData() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.old_order_user_data</code>. 成交老客户数
     */
    public void setOldOrderUserData(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.old_order_user_data</code>. 成交老客户数
     */
    public Integer getOldOrderUserData() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.total_paid_money</code>. 总成交金额
     */
    public void setTotalPaidMoney(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.total_paid_money</code>. 总成交金额
     */
    public Integer getTotalPaidMoney() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.new_paid_money</code>. 成交新客户支付金额
     */
    public void setNewPaidMoney(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.new_paid_money</code>. 成交新客户支付金额
     */
    public BigDecimal getNewPaidMoney() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.old_paid_money</code>. 成交老客户支付金额
     */
    public void setOldPaidMoney(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.old_paid_money</code>. 成交老客户支付金额
     */
    public Long getOldPaidMoney() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.pay_goods_number</code>. 付款件数
     */
    public void setPayGoodsNumber(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.pay_goods_number</code>. 付款件数
     */
    public Integer getPayGoodsNumber() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.new_pay_goods_number</code>. 付款件数
     */
    public void setNewPayGoodsNumber(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.new_pay_goods_number</code>. 付款件数
     */
    public Integer getNewPayGoodsNumber() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.old_pay_goods_number</code>. 付款件数
     */
    public void setOldPayGoodsNumber(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.old_pay_goods_number</code>. 付款件数
     */
    public Integer getOldPayGoodsNumber() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.pay_order_num</code>. 成交订单数
     */
    public void setPayOrderNum(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.pay_order_num</code>. 成交订单数
     */
    public Integer getPayOrderNum() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.login_pv</code>. 登录pv
     */
    public void setLoginPv(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.login_pv</code>. 登录pv
     */
    public Integer getLoginPv() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.order_num</code>. 下单笔数
     */
    public void setOrderNum(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.order_num</code>. 下单笔数
     */
    public Integer getOrderNum() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.order_user_num</code>. 下单人数(生成订单就算)
     */
    public void setOrderUserNum(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.order_user_num</code>. 下单人数(生成订单就算)
     */
    public Integer getOrderUserNum() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>mini_main.b2c_user_summary_trend.add_time</code>. 统计时间
     */
    public void setAddTime(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_main.b2c_user_summary_trend.add_time</code>. 统计时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(24);
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
     * Create a detached UserSummaryTrendRecord
     */
    public UserSummaryTrendRecord() {
        super(UserSummaryTrend.USER_SUMMARY_TREND);
    }

    /**
     * Create a detached, initialised UserSummaryTrendRecord
     */
    public UserSummaryTrendRecord(Integer id, Integer shopId, Date refDate, Byte type, Integer loginData, Integer userData, Integer couponData, Integer cartData, Integer regUserData, Integer upgradeUserData, Integer chargeUserData, Integer orderUserData, Integer newOrderUserData, Integer oldOrderUserData, Integer totalPaidMoney, BigDecimal newPaidMoney, Long oldPaidMoney, Integer payGoodsNumber, Integer newPayGoodsNumber, Integer oldPayGoodsNumber, Integer payOrderNum, Integer loginPv, Integer orderNum, Integer orderUserNum, Timestamp addTime) {
        super(UserSummaryTrend.USER_SUMMARY_TREND);

        set(0, id);
        set(1, shopId);
        set(2, refDate);
        set(3, type);
        set(4, loginData);
        set(5, userData);
        set(6, couponData);
        set(7, cartData);
        set(8, regUserData);
        set(9, upgradeUserData);
        set(10, chargeUserData);
        set(11, orderUserData);
        set(12, newOrderUserData);
        set(13, oldOrderUserData);
        set(14, totalPaidMoney);
        set(15, newPaidMoney);
        set(16, oldPaidMoney);
        set(17, payGoodsNumber);
        set(18, newPayGoodsNumber);
        set(19, oldPayGoodsNumber);
        set(20, payOrderNum);
        set(21, loginPv);
        set(22, orderNum);
        set(23, orderUserNum);
        set(24, addTime);
    }
}
