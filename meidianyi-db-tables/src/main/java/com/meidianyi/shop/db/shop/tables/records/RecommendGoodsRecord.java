/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;

import com.meidianyi.shop.db.shop.tables.RecommendGoods;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;

/** This class is generated by jOOQ. */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.11.9"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RecommendGoodsRecord extends UpdatableRecordImpl<RecommendGoodsRecord>
    implements Record14<
        Integer,
        String,
        Byte,
        String,
        String,
        String,
        Byte,
        Byte,
        Timestamp,
        String,
        Timestamp,
        Timestamp,
        Byte,
        Integer> {

  private static final long serialVersionUID = 296637648;

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.id</code>. 编号 */
  public void setId(Integer value) {
    set(0, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.id</code>. 编号 */
  public Integer getId() {
    return (Integer) get(0);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_name</code>. 推荐名称 */
  public void setRecommendName(String value) {
    set(1, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_name</code>. 推荐名称 */
  public String getRecommendName() {
    return (String) get(1);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_type</code>. 0.全部商品1.部分商品 */
  public void setRecommendType(Byte value) {
    set(2, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_type</code>. 0.全部商品1.部分商品 */
  public Byte getRecommendType() {
    return (Byte) get(2);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_goods_id</code>. 推荐商品id */
  public void setRecommendGoodsId(String value) {
    set(3, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_goods_id</code>. 推荐商品id */
  public String getRecommendGoodsId() {
    return (String) get(3);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_cat_id</code>. 推荐分类id */
  public void setRecommendCatId(String value) {
    set(4, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_cat_id</code>. 推荐分类id */
  public String getRecommendCatId() {
    return (String) get(4);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_use_page</code>. 推荐使用页面 */
  public void setRecommendUsePage(String value) {
    set(5, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_use_page</code>. 推荐使用页面 */
  public String getRecommendUsePage() {
    return (String) get(5);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.status</code>. 状态1停用 */
  public void setStatus(Byte value) {
    set(6, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.status</code>. 状态1停用 */
  public Byte getStatus() {
    return (Byte) get(6);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.del_flag</code>. 1删除 */
  public void setDelFlag(Byte value) {
    set(7, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.del_flag</code>. 1删除 */
  public Byte getDelFlag() {
    return (Byte) get(7);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.del_time</code>. 删除时间 */
  public void setDelTime(Timestamp value) {
    set(8, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.del_time</code>. 删除时间 */
  public Timestamp getDelTime() {
    return (Timestamp) get(8);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_sort_id</code>. 推荐商家分类id */
  public void setRecommendSortId(String value) {
    set(9, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_sort_id</code>. 推荐商家分类id */
  public String getRecommendSortId() {
    return (String) get(9);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.create_time</code>. */
  public void setCreateTime(Timestamp value) {
    set(10, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.create_time</code>. */
  public Timestamp getCreateTime() {
    return (Timestamp) get(10);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.update_time</code>. 最后修改时间 */
  public void setUpdateTime(Timestamp value) {
    set(11, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.update_time</code>. 最后修改时间 */
  public Timestamp getUpdateTime() {
    return (Timestamp) get(11);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.choose_type</code>. 0普通推荐1智能推荐 */
  public void setChooseType(Byte value) {
    set(12, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.choose_type</code>. 0普通推荐1智能推荐 */
  public Byte getChooseType() {
    return (Byte) get(12);
  }

  /** Setter for <code>mini_shop_471752.b2c_recommend_goods.recommend_number</code>. 智能推荐商品数 */
  public void setRecommendNumber(Integer value) {
    set(13, value);
  }

  /** Getter for <code>mini_shop_471752.b2c_recommend_goods.recommend_number</code>. 智能推荐商品数 */
  public Integer getRecommendNumber() {
    return (Integer) get(13);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /** {@inheritDoc} */
  @Override
  public Record1<Integer> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record14 type implementation
  // -------------------------------------------------------------------------

  /** {@inheritDoc} */
  @Override
  public Row14<
          Integer,
          String,
          Byte,
          String,
          String,
          String,
          Byte,
          Byte,
          Timestamp,
          String,
          Timestamp,
          Timestamp,
          Byte,
          Integer>
      fieldsRow() {
    return (Row14) super.fieldsRow();
  }

  /** {@inheritDoc} */
  @Override
  public Row14<
          Integer,
          String,
          Byte,
          String,
          String,
          String,
          Byte,
          Byte,
          Timestamp,
          String,
          Timestamp,
          Timestamp,
          Byte,
          Integer>
      valuesRow() {
    return (Row14) super.valuesRow();
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field1() {
    return RecommendGoods.RECOMMEND_GOODS.ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field2() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_NAME;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Byte> field3() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_TYPE;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field4() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_GOODS_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field5() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_CAT_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field6() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_USE_PAGE;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Byte> field7() {
    return RecommendGoods.RECOMMEND_GOODS.STATUS;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Byte> field8() {
    return RecommendGoods.RECOMMEND_GOODS.DEL_FLAG;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field9() {
    return RecommendGoods.RECOMMEND_GOODS.DEL_TIME;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field10() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_SORT_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field11() {
    return RecommendGoods.RECOMMEND_GOODS.CREATE_TIME;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field12() {
    return RecommendGoods.RECOMMEND_GOODS.UPDATE_TIME;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Byte> field13() {
    return RecommendGoods.RECOMMEND_GOODS.CHOOSE_TYPE;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field14() {
    return RecommendGoods.RECOMMEND_GOODS.RECOMMEND_NUMBER;
  }

  /** {@inheritDoc} */
  @Override
  public Integer component1() {
    return getId();
  }

  /** {@inheritDoc} */
  @Override
  public String component2() {
    return getRecommendName();
  }

  /** {@inheritDoc} */
  @Override
  public Byte component3() {
    return getRecommendType();
  }

  /** {@inheritDoc} */
  @Override
  public String component4() {
    return getRecommendGoodsId();
  }

  /** {@inheritDoc} */
  @Override
  public String component5() {
    return getRecommendCatId();
  }

  /** {@inheritDoc} */
  @Override
  public String component6() {
    return getRecommendUsePage();
  }

  /** {@inheritDoc} */
  @Override
  public Byte component7() {
    return getStatus();
  }

  /** {@inheritDoc} */
  @Override
  public Byte component8() {
    return getDelFlag();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp component9() {
    return getDelTime();
  }

  /** {@inheritDoc} */
  @Override
  public String component10() {
    return getRecommendSortId();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp component11() {
    return getCreateTime();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp component12() {
    return getUpdateTime();
  }

  /** {@inheritDoc} */
  @Override
  public Byte component13() {
    return getChooseType();
  }

  /** {@inheritDoc} */
  @Override
  public Integer component14() {
    return getRecommendNumber();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value1() {
    return getId();
  }

  /** {@inheritDoc} */
  @Override
  public String value2() {
    return getRecommendName();
  }

  /** {@inheritDoc} */
  @Override
  public Byte value3() {
    return getRecommendType();
  }

  /** {@inheritDoc} */
  @Override
  public String value4() {
    return getRecommendGoodsId();
  }

  /** {@inheritDoc} */
  @Override
  public String value5() {
    return getRecommendCatId();
  }

  /** {@inheritDoc} */
  @Override
  public String value6() {
    return getRecommendUsePage();
  }

  /** {@inheritDoc} */
  @Override
  public Byte value7() {
    return getStatus();
  }

  /** {@inheritDoc} */
  @Override
  public Byte value8() {
    return getDelFlag();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp value9() {
    return getDelTime();
  }

  /** {@inheritDoc} */
  @Override
  public String value10() {
    return getRecommendSortId();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp value11() {
    return getCreateTime();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp value12() {
    return getUpdateTime();
  }

  /** {@inheritDoc} */
  @Override
  public Byte value13() {
    return getChooseType();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value14() {
    return getRecommendNumber();
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value1(Integer value) {
    setId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value2(String value) {
    setRecommendName(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value3(Byte value) {
    setRecommendType(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value4(String value) {
    setRecommendGoodsId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value5(String value) {
    setRecommendCatId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value6(String value) {
    setRecommendUsePage(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value7(Byte value) {
    setStatus(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value8(Byte value) {
    setDelFlag(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value9(Timestamp value) {
    setDelTime(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value10(String value) {
    setRecommendSortId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value11(Timestamp value) {
    setCreateTime(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value12(Timestamp value) {
    setUpdateTime(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value13(Byte value) {
    setChooseType(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord value14(Integer value) {
    setRecommendNumber(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoodsRecord values(
      Integer value1,
      String value2,
      Byte value3,
      String value4,
      String value5,
      String value6,
      Byte value7,
      Byte value8,
      Timestamp value9,
      String value10,
      Timestamp value11,
      Timestamp value12,
      Byte value13,
      Integer value14) {
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
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /** Create a detached RecommendGoodsRecord */
  public RecommendGoodsRecord() {
    super(RecommendGoods.RECOMMEND_GOODS);
  }

  /** Create a detached, initialised RecommendGoodsRecord */
  public RecommendGoodsRecord(
      Integer id,
      String recommendName,
      Byte recommendType,
      String recommendGoodsId,
      String recommendCatId,
      String recommendUsePage,
      Byte status,
      Byte delFlag,
      Timestamp delTime,
      String recommendSortId,
      Timestamp createTime,
      Timestamp updateTime,
      Byte chooseType,
      Integer recommendNumber) {
    super(RecommendGoods.RECOMMEND_GOODS);

    set(0, id);
    set(1, recommendName);
    set(2, recommendType);
    set(3, recommendGoodsId);
    set(4, recommendCatId);
    set(5, recommendUsePage);
    set(6, status);
    set(7, delFlag);
    set(8, delTime);
    set(9, recommendSortId);
    set(10, createTime);
    set(11, updateTime);
    set(12, chooseType);
    set(13, recommendNumber);
  }
}
