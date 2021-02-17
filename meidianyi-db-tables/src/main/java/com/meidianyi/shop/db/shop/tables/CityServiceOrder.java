/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.CityServiceOrderRecord;

import java.math.BigDecimal;
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
 * 同城配送订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityServiceOrder extends TableImpl<CityServiceOrderRecord> {

    private static final long serialVersionUID = 979142460;

    /**
     * The reference instance of <code>jmini_shop_224462.b2c_city_service_order</code>
     */
    public static final CityServiceOrder CITY_SERVICE_ORDER = new CityServiceOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityServiceOrderRecord> getRecordType() {
        return CityServiceOrderRecord.class;
    }

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.id</code>.
     */
    public final TableField<CityServiceOrderRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.batch_no</code>. 发货批次号
     */
    public final TableField<CityServiceOrderRecord, String> BATCH_NO = createField("batch_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "发货批次号");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.order_sn</code>. 订单号
     */
    public final TableField<CityServiceOrderRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(50), this, "订单号");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.service_account_id</code>. 签约账号关联ID
     */
    public final TableField<CityServiceOrderRecord, Integer> SERVICE_ACCOUNT_ID = createField("service_account_id", org.jooq.impl.SQLDataType.INTEGER, this, "签约账号关联ID");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.fee</code>. 实际运费(单位：元)，运费减去优惠券费用
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> FEE = createField("fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "实际运费(单位：元)，运费减去优惠券费用");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.deliverfee</code>. 运费
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> DELIVERFEE = createField("deliverfee", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "运费");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.couponfee</code>. 优惠券费用
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> COUPONFEE = createField("couponfee", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "优惠券费用");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.tips</code>. 小费
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> TIPS = createField("tips", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "小费");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.insurancefee</code>. 保价费
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> INSURANCEFEE = createField("insurancefee", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "保价费");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.distance</code>. 配送距离
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> DISTANCE = createField("distance", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "配送距离");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.waybill_id</code>. 配送单号
     */
    public final TableField<CityServiceOrderRecord, String> WAYBILL_ID = createField("waybill_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "配送单号");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.order_status</code>. 配送状态
     */
    public final TableField<CityServiceOrderRecord, String> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.VARCHAR(20), this, "配送状态");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.finish_code</code>. 收货码
     */
    public final TableField<CityServiceOrderRecord, String> FINISH_CODE = createField("finish_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "收货码");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.pickup_code</code>. 取货码
     */
    public final TableField<CityServiceOrderRecord, String> PICKUP_CODE = createField("pickup_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "取货码");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.dispatch_duration</code>. 骑手接单时间(单位s)
     */
    public final TableField<CityServiceOrderRecord, Integer> DISPATCH_DURATION = createField("dispatch_duration", org.jooq.impl.SQLDataType.INTEGER, this, "骑手接单时间(单位s)");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.agent_name</code>. 骑手姓名
     */
    public final TableField<CityServiceOrderRecord, String> AGENT_NAME = createField("agent_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "骑手姓名");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.agent_phone</code>. 骑手电话
     */
    public final TableField<CityServiceOrderRecord, String> AGENT_PHONE = createField("agent_phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "骑手电话");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.action_time</code>. 状态变更时间
     */
    public final TableField<CityServiceOrderRecord, Timestamp> ACTION_TIME = createField("action_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "状态变更时间");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.action_msg</code>. 附加信息
     */
    public final TableField<CityServiceOrderRecord, String> ACTION_MSG = createField("action_msg", org.jooq.impl.SQLDataType.VARCHAR(500), this, "附加信息");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.create_time</code>.
     */
    public final TableField<CityServiceOrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.update_time</code>.
     */
    public final TableField<CityServiceOrderRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_224462.b2c_city_service_order.deduct_fee</code>. 扣除的违约金
     */
    public final TableField<CityServiceOrderRecord, BigDecimal> DEDUCT_FEE = createField("deduct_fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "扣除的违约金");

    /**
     * Create a <code>jmini_shop_224462.b2c_city_service_order</code> table reference
     */
    public CityServiceOrder() {
        this(DSL.name("b2c_city_service_order"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_224462.b2c_city_service_order</code> table reference
     */
    public CityServiceOrder(String alias) {
        this(DSL.name(alias), CITY_SERVICE_ORDER);
    }

    /**
     * Create an aliased <code>jmini_shop_224462.b2c_city_service_order</code> table reference
     */
    public CityServiceOrder(Name alias) {
        this(alias, CITY_SERVICE_ORDER);
    }

    private CityServiceOrder(Name alias, Table<CityServiceOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private CityServiceOrder(Name alias, Table<CityServiceOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("同城配送订单表"));
    }

    public <O extends Record> CityServiceOrder(Table<O> child, ForeignKey<O, CityServiceOrderRecord> key) {
        super(child, key, CITY_SERVICE_ORDER);
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
        return Arrays.<Index>asList(Indexes.CITY_SERVICE_ORDER_BATCH_NO, Indexes.CITY_SERVICE_ORDER_ORDER_SN, Indexes.CITY_SERVICE_ORDER_ORDER_STATUS, Indexes.CITY_SERVICE_ORDER_PRIMARY, Indexes.CITY_SERVICE_ORDER_WAYBILL_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CityServiceOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CITY_SERVICE_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CityServiceOrderRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CITY_SERVICE_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CityServiceOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<CityServiceOrderRecord>>asList(Keys.KEY_B2C_CITY_SERVICE_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityServiceOrder as(String alias) {
        return new CityServiceOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityServiceOrder as(Name alias) {
        return new CityServiceOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CityServiceOrder rename(String name) {
        return new CityServiceOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CityServiceOrder rename(Name name) {
        return new CityServiceOrder(name, null);
    }
}
