/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.ChargeMoney;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ChargeMoneyRecord extends UpdatableRecordImpl<ChargeMoneyRecord> {

    private static final long serialVersionUID = -418910761;

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.card_id</code>. 会员卡id
     */
    public void setCardId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.card_id</code>. 会员卡id
     */
    public Integer getCardId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.charge</code>. 充值的钱
     */
    public void setCharge(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.charge</code>. 充值的钱
     */
    public BigDecimal getCharge() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.count</code>. 充值次数
     */
    public void setCount(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.count</code>. 充值次数
     */
    public Short getCount() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.payment</code>. 支付方式
     */
    public void setPayment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.payment</code>. 支付方式
     */
    public String getPayment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.type</code>. 消费类型 0是普通卡 1限次卡
     */
    public void setType(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.type</code>. 消费类型 0是普通卡 1限次卡
     */
    public Byte getType() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.reason_id</code>. 充值原因模板id
     */
    public void setReasonId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.reason_id</code>. 充值原因模板id
     */
    public String getReasonId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.reason</code>. 充值原因
     */
    public void setReason(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.reason</code>. 充值原因
     */
    public String getReason() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.message</code>. 备注
     */
    public void setMessage(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.message</code>. 备注
     */
    public String getMessage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.order_sn</code>.
     */
    public void setOrderSn(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.order_sn</code>.
     */
    public String getOrderSn() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.order_status</code>. 订单状态 0：待支付，1：已取消，2：已完成
     */
    public void setOrderStatus(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.order_status</code>. 订单状态 0：待支付，1：已取消，2：已完成
     */
    public Byte getOrderStatus() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.money_paid</code>. 订单应付金额
     */
    public void setMoneyPaid(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.money_paid</code>. 订单应付金额
     */
    public BigDecimal getMoneyPaid() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.charge_type</code>. 0按规则 1自定义
     */
    public void setChargeType(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.charge_type</code>. 0按规则 1自定义
     */
    public Byte getChargeType() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.card_no</code>. 会员卡号
     */
    public void setCardNo(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.card_no</code>. 会员卡号
     */
    public String getCardNo() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.ali_trade_no</code>. 支付宝交易单号
     */
    public void setAliTradeNo(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.ali_trade_no</code>. 支付宝交易单号
     */
    public String getAliTradeNo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.exchang_count</code>. 兑换充值次数
     */
    public void setExchangCount(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.exchang_count</code>. 兑换充值次数
     */
    public Short getExchangCount() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.return_money</code>. 已退金额
     */
    public void setReturnMoney(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.return_money</code>. 已退金额
     */
    public BigDecimal getReturnMoney() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.after_charge_money</code>. 充值后卡余额
     */
    public void setAfterChargeMoney(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.after_charge_money</code>. 充值后卡余额
     */
    public BigDecimal getAfterChargeMoney() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_charge_money.change_type</code>. 充值类型 1发卡 2用户充值 3 管理员操作
     */
    public void setChangeType(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_charge_money.change_type</code>. 充值类型 1发卡 2用户充值 3 管理员操作
     */
    public Byte getChangeType() {
        return (Byte) get(22);
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
     * Create a detached ChargeMoneyRecord
     */
    public ChargeMoneyRecord() {
        super(ChargeMoney.CHARGE_MONEY);
    }

    /**
     * Create a detached, initialised ChargeMoneyRecord
     */
    public ChargeMoneyRecord(Integer id, Integer userId, Integer cardId, BigDecimal charge, Short count, String payment, Byte type, String reasonId, String reason, String prepayId, String message, String orderSn, Byte orderStatus, BigDecimal moneyPaid, Byte chargeType, String cardNo, String aliTradeNo, Short exchangCount, Timestamp createTime, Timestamp updateTime, BigDecimal returnMoney, BigDecimal afterChargeMoney, Byte changeType) {
        super(ChargeMoney.CHARGE_MONEY);

        set(0, id);
        set(1, userId);
        set(2, cardId);
        set(3, charge);
        set(4, count);
        set(5, payment);
        set(6, type);
        set(7, reasonId);
        set(8, reason);
        set(9, prepayId);
        set(10, message);
        set(11, orderSn);
        set(12, orderStatus);
        set(13, moneyPaid);
        set(14, chargeType);
        set(15, cardNo);
        set(16, aliTradeNo);
        set(17, exchangCount);
        set(18, createTime);
        set(19, updateTime);
        set(20, returnMoney);
        set(21, afterChargeMoney);
        set(22, changeType);
    }
}
