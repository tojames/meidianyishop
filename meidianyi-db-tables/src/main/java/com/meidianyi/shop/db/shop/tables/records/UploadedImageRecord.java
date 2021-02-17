/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.UploadedImage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class UploadedImageRecord extends UpdatableRecordImpl<UploadedImageRecord> implements Record16<Integer, String, Integer, String, String, String, String, Integer, Integer, Integer, Byte, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -422414220;

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_id</code>.
     */
    public void setImgId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_id</code>.
     */
    public Integer getImgId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_type</code>.
     */
    public void setImgType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_type</code>.
     */
    public String getImgType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_size</code>.
     */
    public void setImgSize(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_size</code>.
     */
    public Integer getImgSize() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_name</code>. 图片名称，用于前端显示
     */
    public void setImgName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_name</code>. 图片名称，用于前端显示
     */
    public String getImgName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_orig_fname</code>.
     */
    public void setImgOrigFname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_orig_fname</code>.
     */
    public String getImgOrigFname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_path</code>.
     */
    public void setImgPath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_path</code>.
     */
    public String getImgPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_url</code>.
     */
    public void setImgUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_url</code>.
     */
    public String getImgUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_cat_id</code>. 图片分类 默认0 用户上传为-1
     */
    public void setImgCatId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_cat_id</code>. 图片分类 默认0 用户上传为-1
     */
    public Integer getImgCatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_width</code>.
     */
    public void setImgWidth(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_width</code>.
     */
    public Integer getImgWidth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.img_height</code>.
     */
    public void setImgHeight(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.img_height</code>.
     */
    public Integer getImgHeight() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.is_refer</code>. 是否引用
     */
    public void setIsRefer(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.is_refer</code>. 是否引用
     */
    public Byte getIsRefer() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_image.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_image.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, Integer, String, String, String, String, Integer, Integer, Integer, Byte, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, Integer, String, String, String, String, Integer, Integer, Integer, Byte, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UploadedImage.UPLOADED_IMAGE.IMG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UploadedImage.UPLOADED_IMAGE.IMG_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UploadedImage.UPLOADED_IMAGE.IMG_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UploadedImage.UPLOADED_IMAGE.IMG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UploadedImage.UPLOADED_IMAGE.IMG_ORIG_FNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UploadedImage.UPLOADED_IMAGE.IMG_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UploadedImage.UPLOADED_IMAGE.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UploadedImage.UPLOADED_IMAGE.IMG_CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return UploadedImage.UPLOADED_IMAGE.IMG_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UploadedImage.UPLOADED_IMAGE.IMG_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return UploadedImage.UPLOADED_IMAGE.IS_REFER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return UploadedImage.UPLOADED_IMAGE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return UploadedImage.UPLOADED_IMAGE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return UploadedImage.UPLOADED_IMAGE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return UploadedImage.UPLOADED_IMAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return UploadedImage.UPLOADED_IMAGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getImgType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getImgSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getImgOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getImgCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getImgWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getImgHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getImgType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getImgSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getImgOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getImgCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getImgWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getImgHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value1(Integer value) {
        setImgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value2(String value) {
        setImgType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value3(Integer value) {
        setImgSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value4(String value) {
        setImgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value5(String value) {
        setImgOrigFname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value6(String value) {
        setImgPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value7(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value8(Integer value) {
        setImgCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value9(Integer value) {
        setImgWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value10(Integer value) {
        setImgHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value11(Byte value) {
        setIsRefer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value12(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value13(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value14(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value15(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord value16(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedImageRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9, Integer value10, Byte value11, Integer value12, Integer value13, Byte value14, Timestamp value15, Timestamp value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UploadedImageRecord
     */
    public UploadedImageRecord() {
        super(UploadedImage.UPLOADED_IMAGE);
    }

    /**
     * Create a detached, initialised UploadedImageRecord
     */
    public UploadedImageRecord(Integer imgId, String imgType, Integer imgSize, String imgName, String imgOrigFname, String imgPath, String imgUrl, Integer imgCatId, Integer imgWidth, Integer imgHeight, Byte isRefer, Integer shopId, Integer userId, Byte delFlag, Timestamp createTime, Timestamp updateTime) {
        super(UploadedImage.UPLOADED_IMAGE);

        set(0, imgId);
        set(1, imgType);
        set(2, imgSize);
        set(3, imgName);
        set(4, imgOrigFname);
        set(5, imgPath);
        set(6, imgUrl);
        set(7, imgCatId);
        set(8, imgWidth);
        set(9, imgHeight);
        set(10, isRefer);
        set(11, shopId);
        set(12, userId);
        set(13, delFlag);
        set(14, createTime);
        set(15, updateTime);
    }
}