/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.InquiryOrderRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 问诊订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InquiryOrder extends TableImpl<InquiryOrderRecord> {

    private static final long serialVersionUID = -1096039334;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_inquiry_order</code>
     */
    public static final InquiryOrder INQUIRY_ORDER = new InquiryOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InquiryOrderRecord> getRecordType() {
        return InquiryOrderRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.order_id</code>. 订单id
     */
    public final TableField<InquiryOrderRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "订单id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.shop_id</code>. 店铺id
     */
    public final TableField<InquiryOrderRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.order_sn</code>. 订单编号
     */
    public final TableField<InquiryOrderRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.user_id</code>. 用户id
     */
    public final TableField<InquiryOrderRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.order_status</code>. 订单状态0待付款 1待接诊 2接诊中 3已完成 4已退款 5已取消 6待退款 7部分退款
     */
    public final TableField<InquiryOrderRecord, Byte> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "订单状态0待付款 1待接诊 2接诊中 3已完成 4已退款 5已取消 6待退款 7部分退款");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.doctor_id</code>. 医师id
     */
    public final TableField<InquiryOrderRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "医师id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.doctor_name</code>. 医师名称
     */
    public final TableField<InquiryOrderRecord, String> DOCTOR_NAME = createField("doctor_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师名称");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.department_id</code>. 科室id
     */
    public final TableField<InquiryOrderRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "科室id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.department_name</code>. 医师科室
     */
    public final TableField<InquiryOrderRecord, String> DEPARTMENT_NAME = createField("department_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医师科室");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_id</code>. 患者id
     */
    public final TableField<InquiryOrderRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "患者id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_mobile</code>. 患者手机号码
     */
    public final TableField<InquiryOrderRecord, String> PATIENT_MOBILE = createField("patient_mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "患者手机号码");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_name</code>. 患者名称
     */
    public final TableField<InquiryOrderRecord, String> PATIENT_NAME = createField("patient_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "患者名称");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_sex</code>. 性别 0：未知 1：男 2：女
     */
    public final TableField<InquiryOrderRecord, Byte> PATIENT_SEX = createField("patient_sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "性别 0：未知 1：男 2：女");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_birthday</code>. 出生年月
     */
    public final TableField<InquiryOrderRecord, Date> PATIENT_BIRTHDAY = createField("patient_birthday", org.jooq.impl.SQLDataType.DATE, this, "出生年月");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_identity_code</code>. 证件号码
     */
    public final TableField<InquiryOrderRecord, String> PATIENT_IDENTITY_CODE = createField("patient_identity_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "证件号码");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.patient_identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public final TableField<InquiryOrderRecord, Byte> PATIENT_IDENTITY_TYPE = createField("patient_identity_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "证件类型: 1：身份证 2：军人证 3：护照 4：社保卡");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.pay_code</code>. 支付代号
     */
    public final TableField<InquiryOrderRecord, String> PAY_CODE = createField("pay_code", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付代号");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.pay_name</code>. 支付名称
     */
    public final TableField<InquiryOrderRecord, String> PAY_NAME = createField("pay_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付名称");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.pay_sn</code>. 支付流水号
     */
    public final TableField<InquiryOrderRecord, String> PAY_SN = createField("pay_sn", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "支付流水号");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.prepay_id</code>. 微信支付id，用于发送模板消息
     */
    public final TableField<InquiryOrderRecord, String> PREPAY_ID = createField("prepay_id", org.jooq.impl.SQLDataType.VARCHAR(128), this, "微信支付id，用于发送模板消息");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.order_amount</code>. 订单总金额
     */
    public final TableField<InquiryOrderRecord, BigDecimal> ORDER_AMOUNT = createField("order_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单总金额");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.pay_time</code>. 支付时间
     */
    public final TableField<InquiryOrderRecord, Timestamp> PAY_TIME = createField("pay_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "支付时间");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.refund_money</code>. 已退款金额
     */
    public final TableField<InquiryOrderRecord, BigDecimal> REFUND_MONEY = createField("refund_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "已退款金额");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.limit_time</code>. 医生接诊后会话截止时间点
     */
    public final TableField<InquiryOrderRecord, Timestamp> LIMIT_TIME = createField("limit_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "医生接诊后会话截止时间点");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.cancelled_time</code>. 取消时间
     */
    public final TableField<InquiryOrderRecord, Timestamp> CANCELLED_TIME = createField("cancelled_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "取消时间");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.finished_time</code>. 订单完成时间
     */
    public final TableField<InquiryOrderRecord, Timestamp> FINISHED_TIME = createField("finished_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "订单完成时间");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.description_disease</code>. 病情描述
     */
    public final TableField<InquiryOrderRecord, String> DESCRIPTION_DISEASE = createField("description_disease", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "病情描述");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.image_url</code>. 病情描述image
     */
    public final TableField<InquiryOrderRecord, String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.CLOB, this, "病情描述image");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.rebate_proportion</code>. 返利比例
     */
    public final TableField<InquiryOrderRecord, BigDecimal> REBATE_PROPORTION = createField("rebate_proportion", org.jooq.impl.SQLDataType.DECIMAL(6, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "返利比例");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.total_rebate_money</code>. 返利金额
     */
    public final TableField<InquiryOrderRecord, BigDecimal> TOTAL_REBATE_MONEY = createField("total_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_proportion</code>. 平台返利比例
     */
    public final TableField<InquiryOrderRecord, BigDecimal> PLATFORM_REBATE_PROPORTION = createField("platform_rebate_proportion", org.jooq.impl.SQLDataType.DECIMAL(6, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台返利比例");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.platform_rebate_money</code>. 平台返利比例
     */
    public final TableField<InquiryOrderRecord, BigDecimal> PLATFORM_REBATE_MONEY = createField("platform_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台返利比例");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.is_delete</code>. 删除
     */
    public final TableField<InquiryOrderRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.settlement_flag</code>. 结算标志：0：未结算，1：已结算
     */
    public final TableField<InquiryOrderRecord, Byte> SETTLEMENT_FLAG = createField("settlement_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "结算标志：0：未结算，1：已结算");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.create_time</code>.
     */
    public final TableField<InquiryOrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order.update_time</code>. 最后修改时间
     */
    public final TableField<InquiryOrderRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_inquiry_order</code> table reference
     */
    public InquiryOrder() {
        this(DSL.name("b2c_inquiry_order"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_inquiry_order</code> table reference
     */
    public InquiryOrder(String alias) {
        this(DSL.name(alias), INQUIRY_ORDER);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_inquiry_order</code> table reference
     */
    public InquiryOrder(Name alias) {
        this(alias, INQUIRY_ORDER);
    }

    private InquiryOrder(Name alias, Table<InquiryOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private InquiryOrder(Name alias, Table<InquiryOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("问诊订单表"));
    }

    public <O extends Record> InquiryOrder(Table<O> child, ForeignKey<O, InquiryOrderRecord> key) {
        super(child, key, INQUIRY_ORDER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INQUIRY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InquiryOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INQUIRY_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InquiryOrderRecord> getPrimaryKey() {
        return Keys.KEY_B2C_INQUIRY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InquiryOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<InquiryOrderRecord>>asList(Keys.KEY_B2C_INQUIRY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryOrder as(String alias) {
        return new InquiryOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryOrder as(Name alias) {
        return new InquiryOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InquiryOrder rename(String name) {
        return new InquiryOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InquiryOrder rename(Name name) {
        return new InquiryOrder(name, null);
    }
}
