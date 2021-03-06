/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.UploadedVideoCategoryRecord;

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
public class UploadedVideoCategory extends TableImpl<UploadedVideoCategoryRecord> {

    private static final long serialVersionUID = -1376884018;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_uploaded_video_category</code>
     */
    public static final UploadedVideoCategory UPLOADED_VIDEO_CATEGORY = new UploadedVideoCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UploadedVideoCategoryRecord> getRecordType() {
        return UploadedVideoCategoryRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_id</code>.
     */
    public final TableField<UploadedVideoCategoryRecord, Integer> VIDEO_CAT_ID = createField("video_cat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.shop_id</code>. 店铺ID
     */
    public final TableField<UploadedVideoCategoryRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_name</code>.
     */
    public final TableField<UploadedVideoCategoryRecord, String> VIDEO_CAT_NAME = createField("video_cat_name", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_parent_id</code>.
     */
    public final TableField<UploadedVideoCategoryRecord, Integer> VIDEO_CAT_PARENT_ID = createField("video_cat_parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.cat_ids</code>. 层级ID串,逗号分隔
     */
    public final TableField<UploadedVideoCategoryRecord, String> CAT_IDS = createField("cat_ids", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("'0'", org.jooq.impl.SQLDataType.VARCHAR)), this, "层级ID串,逗号分隔");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.level</code>. 层级，0开始
     */
    public final TableField<UploadedVideoCategoryRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "层级，0开始");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.sort</code>. 排序优先级
     */
    public final TableField<UploadedVideoCategoryRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "排序优先级");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.create_time</code>.
     */
    public final TableField<UploadedVideoCategoryRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video_category.update_time</code>. 最后修改时间
     */
    public final TableField<UploadedVideoCategoryRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_uploaded_video_category</code> table reference
     */
    public UploadedVideoCategory() {
        this(DSL.name("b2c_uploaded_video_category"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_video_category</code> table reference
     */
    public UploadedVideoCategory(String alias) {
        this(DSL.name(alias), UPLOADED_VIDEO_CATEGORY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_video_category</code> table reference
     */
    public UploadedVideoCategory(Name alias) {
        this(alias, UPLOADED_VIDEO_CATEGORY);
    }

    private UploadedVideoCategory(Name alias, Table<UploadedVideoCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private UploadedVideoCategory(Name alias, Table<UploadedVideoCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UploadedVideoCategory(Table<O> child, ForeignKey<O, UploadedVideoCategoryRecord> key) {
        super(child, key, UPLOADED_VIDEO_CATEGORY);
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
        return Arrays.<Index>asList(Indexes.UPLOADED_VIDEO_CATEGORY_PRIMARY, Indexes.UPLOADED_VIDEO_CATEGORY_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UploadedVideoCategoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UPLOADED_VIDEO_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UploadedVideoCategoryRecord> getPrimaryKey() {
        return Keys.KEY_B2C_UPLOADED_VIDEO_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UploadedVideoCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<UploadedVideoCategoryRecord>>asList(Keys.KEY_B2C_UPLOADED_VIDEO_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategory as(String alias) {
        return new UploadedVideoCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategory as(Name alias) {
        return new UploadedVideoCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedVideoCategory rename(String name) {
        return new UploadedVideoCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedVideoCategory rename(Name name) {
        return new UploadedVideoCategory(name, null);
    }
}
