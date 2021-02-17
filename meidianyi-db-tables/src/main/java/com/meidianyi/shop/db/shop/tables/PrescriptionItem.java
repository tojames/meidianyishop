/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.PrescriptionItemRecord;

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
 * 处方项目明细表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrescriptionItem extends TableImpl<PrescriptionItemRecord> {

    private static final long serialVersionUID = -59146519;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_prescription_item</code>
     */
    public static final PrescriptionItem PRESCRIPTION_ITEM = new PrescriptionItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrescriptionItemRecord> getRecordType() {
        return PrescriptionItemRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.id</code>.
     */
    public final TableField<PrescriptionItemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.pos_code</code>. 确定一个医嘱的编号
     */
    public final TableField<PrescriptionItemRecord, String> POS_CODE = createField("pos_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "确定一个医嘱的编号");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.pos_detail_code</code>. 医嘱明细单号
     */
    public final TableField<PrescriptionItemRecord, String> POS_DETAIL_CODE = createField("pos_detail_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医嘱明细单号");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.prescription_code</code>. 处方号外键
     */
    public final TableField<PrescriptionItemRecord, String> PRESCRIPTION_CODE = createField("prescription_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "处方号外键");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.prescription_detail_code</code>. 处方项目明细号码（可根据此字段反查批次号）
     */
    public final TableField<PrescriptionItemRecord, String> PRESCRIPTION_DETAIL_CODE = createField("prescription_detail_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "处方项目明细号码（可根据此字段反查批次号）");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_id</code>. 商品id
     */
    public final TableField<PrescriptionItemRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_common_name</code>. 通用名
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_COMMON_NAME = createField("goods_common_name", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通用名");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_img</code>.
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_IMG = createField("goods_img", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("商品图片", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_quality_ratio</code>. 规格系数，通用名和规格系数确定一个药品
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_QUALITY_RATIO = createField("goods_quality_ratio", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "规格系数，通用名和规格系数确定一个药品");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.prd_id</code>. 产品id
     */
    public final TableField<PrescriptionItemRecord, Integer> PRD_ID = createField("prd_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "产品id");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.use_method</code>. 用法
     */
    public final TableField<PrescriptionItemRecord, String> USE_METHOD = createField("use_method", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用法");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.per_time_num</code>. 单次数量
     */
    public final TableField<PrescriptionItemRecord, Double> PER_TIME_NUM = createField("per_time_num", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "单次数量");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.per_time_unit</code>. 数量单位
     */
    public final TableField<PrescriptionItemRecord, String> PER_TIME_UNIT = createField("per_time_unit", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "数量单位");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.per_time_dosage</code>. 单次剂量
     */
    public final TableField<PrescriptionItemRecord, Double> PER_TIME_DOSAGE = createField("per_time_dosage", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "单次剂量");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.per_time_dosage_unit</code>. 剂量单位
     */
    public final TableField<PrescriptionItemRecord, String> PER_TIME_DOSAGE_UNIT = createField("per_time_dosage_unit", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "剂量单位");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.frequency</code>. 频次
     */
    public final TableField<PrescriptionItemRecord, Double> FREQUENCY = createField("frequency", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "频次");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.drag_sum_num</code>. 总取药数量
     */
    public final TableField<PrescriptionItemRecord, Double> DRAG_SUM_NUM = createField("drag_sum_num", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "总取药数量");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.drag_sum_unit</code>. 总取药的单位
     */
    public final TableField<PrescriptionItemRecord, String> DRAG_SUM_UNIT = createField("drag_sum_unit", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "总取药的单位");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_use_memo</code>. 药品使用方式说明
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_USE_MEMO = createField("goods_use_memo", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "药品使用方式说明");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_production_enterprise</code>. 生产企业
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_PRODUCTION_ENTERPRISE = createField("goods_production_enterprise", org.jooq.impl.SQLDataType.VARCHAR(512), this, "生产企业");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.medicine_price</code>. 药品总价
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> MEDICINE_PRICE = createField("medicine_price", org.jooq.impl.SQLDataType.DECIMAL(18, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "药品总价");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.can_calculate_money</code>. 可计算返利金额
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> CAN_CALCULATE_MONEY = createField("can_calculate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "可计算返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_sharing_proportion</code>. 商品分成比例
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> GOODS_SHARING_PROPORTION = createField("goods_sharing_proportion", org.jooq.impl.SQLDataType.DECIMAL(10, 4).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品分成比例");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.rebate_proportion</code>. 返利比例
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> REBATE_PROPORTION = createField("rebate_proportion", org.jooq.impl.SQLDataType.DECIMAL(6, 4).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "返利比例");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.total_rebate_money</code>. 返利金额
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> TOTAL_REBATE_MONEY = createField("total_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.real_rebate_money</code>. 实际返利金额
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> REAL_REBATE_MONEY = createField("real_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "实际返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.platform_rebate_proportion</code>. 平台返利比例
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> PLATFORM_REBATE_PROPORTION = createField("platform_rebate_proportion", org.jooq.impl.SQLDataType.DECIMAL(6, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台返利比例");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.platform_rebate_money</code>. 平台返利金额
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> PLATFORM_REBATE_MONEY = createField("platform_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.platform_real_rebate_money</code>. 平台实际返利金额
     */
    public final TableField<PrescriptionItemRecord, BigDecimal> PLATFORM_REAL_REBATE_MONEY = createField("platform_real_rebate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台实际返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.is_delete</code>.
     */
    public final TableField<PrescriptionItemRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.create_time</code>.
     */
    public final TableField<PrescriptionItemRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.update_time</code>. 最后修改时间
     */
    public final TableField<PrescriptionItemRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem() {
        this(DSL.name("b2c_prescription_item"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem(String alias) {
        this(DSL.name(alias), PRESCRIPTION_ITEM);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem(Name alias) {
        this(alias, PRESCRIPTION_ITEM);
    }

    private PrescriptionItem(Name alias, Table<PrescriptionItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private PrescriptionItem(Name alias, Table<PrescriptionItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("处方项目明细表"));
    }

    public <O extends Record> PrescriptionItem(Table<O> child, ForeignKey<O, PrescriptionItemRecord> key) {
        super(child, key, PRESCRIPTION_ITEM);
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
        return Arrays.<Index>asList(Indexes.PRESCRIPTION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PrescriptionItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRESCRIPTION_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PrescriptionItemRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PRESCRIPTION_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PrescriptionItemRecord>> getKeys() {
        return Arrays.<UniqueKey<PrescriptionItemRecord>>asList(Keys.KEY_B2C_PRESCRIPTION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionItem as(String alias) {
        return new PrescriptionItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionItem as(Name alias) {
        return new PrescriptionItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PrescriptionItem rename(String name) {
        return new PrescriptionItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PrescriptionItem rename(Name name) {
        return new PrescriptionItem(name, null);
    }
}