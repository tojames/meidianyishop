/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main.tables;


import com.meidianyi.shop.db.main.Indexes;
import com.meidianyi.shop.db.main.Keys;
import com.meidianyi.shop.db.main.MiniMain;
import com.meidianyi.shop.db.main.tables.records.ShopUploadedImageRecord;

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
public class ShopUploadedImage extends TableImpl<ShopUploadedImageRecord> {

    private static final long serialVersionUID = 1964415731;

    /**
     * The reference instance of <code>mini_main.b2c_shop_uploaded_image</code>
     */
    public static final ShopUploadedImage SHOP_UPLOADED_IMAGE = new ShopUploadedImage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopUploadedImageRecord> getRecordType() {
        return ShopUploadedImageRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_id</code>.
     */
    public final TableField<ShopUploadedImageRecord, Integer> IMG_ID = createField("img_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_type</code>.
     */
    public final TableField<ShopUploadedImageRecord, String> IMG_TYPE = createField("img_type", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_size</code>.
     */
    public final TableField<ShopUploadedImageRecord, Integer> IMG_SIZE = createField("img_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_name</code>. 图片名称，用于前端显示
     */
    public final TableField<ShopUploadedImageRecord, String> IMG_NAME = createField("img_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "图片名称，用于前端显示");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_orig_fname</code>.
     */
    public final TableField<ShopUploadedImageRecord, String> IMG_ORIG_FNAME = createField("img_orig_fname", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_path</code>.
     */
    public final TableField<ShopUploadedImageRecord, String> IMG_PATH = createField("img_path", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_url</code>.
     */
    public final TableField<ShopUploadedImageRecord, String> IMG_URL = createField("img_url", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_cat_id</code>. 图片分类
     */
    public final TableField<ShopUploadedImageRecord, Integer> IMG_CAT_ID = createField("img_cat_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "图片分类");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_width</code>.
     */
    public final TableField<ShopUploadedImageRecord, Integer> IMG_WIDTH = createField("img_width", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.img_height</code>.
     */
    public final TableField<ShopUploadedImageRecord, Integer> IMG_HEIGHT = createField("img_height", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.is_refer</code>. 是否引用
     */
    public final TableField<ShopUploadedImageRecord, Byte> IS_REFER = createField("is_refer", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否引用");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.upload_time</code>.
     */
    public final TableField<ShopUploadedImageRecord, Timestamp> UPLOAD_TIME = createField("upload_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.sys_id</code>. 账户ID
     */
    public final TableField<ShopUploadedImageRecord, Integer> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "账户ID");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.shop_id</code>. 店铺ID
     */
    public final TableField<ShopUploadedImageRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.del_flag</code>.
     */
    public final TableField<ShopUploadedImageRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_main.b2c_shop_uploaded_image.create_time</code>. 创建时间
     */
    public final TableField<ShopUploadedImageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * Create a <code>mini_main.b2c_shop_uploaded_image</code> table reference
     */
    public ShopUploadedImage() {
        this(DSL.name("b2c_shop_uploaded_image"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_uploaded_image</code> table reference
     */
    public ShopUploadedImage(String alias) {
        this(DSL.name(alias), SHOP_UPLOADED_IMAGE);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_uploaded_image</code> table reference
     */
    public ShopUploadedImage(Name alias) {
        this(alias, SHOP_UPLOADED_IMAGE);
    }

    private ShopUploadedImage(Name alias, Table<ShopUploadedImageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShopUploadedImage(Name alias, Table<ShopUploadedImageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShopUploadedImage(Table<O> child, ForeignKey<O, ShopUploadedImageRecord> key) {
        super(child, key, SHOP_UPLOADED_IMAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SHOP_UPLOADED_IMAGE_IMG_ORIG_FNAME, Indexes.SHOP_UPLOADED_IMAGE_PRIMARY, Indexes.SHOP_UPLOADED_IMAGE_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopUploadedImageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOP_UPLOADED_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopUploadedImageRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_UPLOADED_IMAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopUploadedImageRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopUploadedImageRecord>>asList(Keys.KEY_B2C_SHOP_UPLOADED_IMAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImage as(String alias) {
        return new ShopUploadedImage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImage as(Name alias) {
        return new ShopUploadedImage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopUploadedImage rename(String name) {
        return new ShopUploadedImage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopUploadedImage rename(Name name) {
        return new ShopUploadedImage(name, null);
    }
}
