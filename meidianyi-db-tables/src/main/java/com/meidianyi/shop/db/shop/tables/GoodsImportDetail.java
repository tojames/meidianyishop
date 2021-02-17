/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.GoodsImportDetailRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class GoodsImportDetail extends TableImpl<GoodsImportDetailRecord> {

    private static final long serialVersionUID = -869436908;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_goods_import_detail</code>
     */
    public static final GoodsImportDetail GOODS_IMPORT_DETAIL = new GoodsImportDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsImportDetailRecord> getRecordType() {
        return GoodsImportDetailRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.id</code>.
     */
    public final TableField<GoodsImportDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.batch_id</code>. 主表id
     */
    public final TableField<GoodsImportDetailRecord, Integer> BATCH_ID = createField("batch_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主表id");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.goods_sn</code>. 商品sn
     */
    public final TableField<GoodsImportDetailRecord, String> GOODS_SN = createField("goods_sn", org.jooq.impl.SQLDataType.VARCHAR(32), this, "商品sn");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.prd_sn</code>. 规格sn
     */
    public final TableField<GoodsImportDetailRecord, String> PRD_SN = createField("prd_sn", org.jooq.impl.SQLDataType.VARCHAR(32), this, "规格sn");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.goods_name</code>. 商品名称
     */
    public final TableField<GoodsImportDetailRecord, String> GOODS_NAME = createField("goods_name", org.jooq.impl.SQLDataType.VARCHAR(120), this, "商品名称");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.prd_desc</code>. 规格描述
     */
    public final TableField<GoodsImportDetailRecord, String> PRD_DESC = createField("prd_desc", org.jooq.impl.SQLDataType.VARCHAR(120), this, "规格描述");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.error_code</code>. 导入数据错误码，0表示正确 非0对应错误码
     */
    public final TableField<GoodsImportDetailRecord, Byte> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "导入数据错误码，0表示正确 非0对应错误码");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.is_success</code>. 导入成功标识：0不成功，1成功
     */
    public final TableField<GoodsImportDetailRecord, Byte> IS_SUCCESS = createField("is_success", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "导入成功标识：0不成功，1成功");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.create_time</code>.
     */
    public final TableField<GoodsImportDetailRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_goods_import_detail.update_time</code>. 最后修改时间
     */
    public final TableField<GoodsImportDetailRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_goods_import_detail</code> table reference
     */
    public GoodsImportDetail() {
        this(DSL.name("b2c_goods_import_detail"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_import_detail</code> table reference
     */
    public GoodsImportDetail(String alias) {
        this(DSL.name(alias), GOODS_IMPORT_DETAIL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_goods_import_detail</code> table reference
     */
    public GoodsImportDetail(Name alias) {
        this(alias, GOODS_IMPORT_DETAIL);
    }

    private GoodsImportDetail(Name alias, Table<GoodsImportDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsImportDetail(Name alias, Table<GoodsImportDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsImportDetail(Table<O> child, ForeignKey<O, GoodsImportDetailRecord> key) {
        super(child, key, GOODS_IMPORT_DETAIL);
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
        return Arrays.<Index>asList(Indexes.GOODS_IMPORT_DETAIL_GOODS_SN, Indexes.GOODS_IMPORT_DETAIL_PRD_SN, Indexes.GOODS_IMPORT_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsImportDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GOODS_IMPORT_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsImportDetailRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_IMPORT_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsImportDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsImportDetailRecord>>asList(Keys.KEY_B2C_GOODS_IMPORT_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImportDetail as(String alias) {
        return new GoodsImportDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImportDetail as(Name alias) {
        return new GoodsImportDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsImportDetail rename(String name) {
        return new GoodsImportDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsImportDetail rename(Name name) {
        return new GoodsImportDetail(name, null);
    }
}