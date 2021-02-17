/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;

import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.RecommendGoodsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/** This class is generated by jOOQ. */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.11.9"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RecommendGoods extends TableImpl<RecommendGoodsRecord> {

  private static final long serialVersionUID = 1500529310;

  /** The reference instance of <code>mini_shop_471752.b2c_recommend_goods</code> */
  public static final RecommendGoods RECOMMEND_GOODS = new RecommendGoods();

  /** The class holding records for this type */
  @Override
  public Class<RecommendGoodsRecord> getRecordType() {
    return RecommendGoodsRecord.class;
  }

  /** The column <code>mini_shop_471752.b2c_recommend_goods.id</code>. 编号 */
  public final TableField<RecommendGoodsRecord, Integer> ID =
      createField(
          "id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "编号");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_name</code>. 推荐名称 */
  public final TableField<RecommendGoodsRecord, String> RECOMMEND_NAME =
      createField(
          "recommend_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "推荐名称");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_type</code>. 0.全部商品1.部分商品 */
  public final TableField<RecommendGoodsRecord, Byte> RECOMMEND_TYPE =
      createField(
          "recommend_type",
          org.jooq.impl.SQLDataType.TINYINT
              .nullable(false)
              .defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)),
          this,
          "0.全部商品1.部分商品");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_goods_id</code>. 推荐商品id */
  public final TableField<RecommendGoodsRecord, String> RECOMMEND_GOODS_ID =
      createField("recommend_goods_id", org.jooq.impl.SQLDataType.VARCHAR(299), this, "推荐商品id");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_cat_id</code>. 推荐分类id */
  public final TableField<RecommendGoodsRecord, String> RECOMMEND_CAT_ID =
      createField("recommend_cat_id", org.jooq.impl.SQLDataType.VARCHAR(299), this, "推荐分类id");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_use_page</code>. 推荐使用页面 */
  public final TableField<RecommendGoodsRecord, String> RECOMMEND_USE_PAGE =
      createField(
          "recommend_use_page",
          org.jooq.impl.SQLDataType.VARCHAR(299)
              .nullable(false)
              .defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)),
          this,
          "推荐使用页面");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.status</code>. 状态1停用 */
  public final TableField<RecommendGoodsRecord, Byte> STATUS =
      createField(
          "status",
          org.jooq.impl.SQLDataType.TINYINT.defaultValue(
              DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)),
          this,
          "状态1停用");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.del_flag</code>. 1删除 */
  public final TableField<RecommendGoodsRecord, Byte> DEL_FLAG =
      createField(
          "del_flag",
          org.jooq.impl.SQLDataType.TINYINT.defaultValue(
              DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)),
          this,
          "1删除");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.del_time</code>. 删除时间 */
  public final TableField<RecommendGoodsRecord, Timestamp> DEL_TIME =
      createField(
          "del_time",
          org.jooq.impl.SQLDataType.TIMESTAMP
              .nullable(false)
              .defaultValue(DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)),
          this,
          "删除时间");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_sort_id</code>. 推荐商家分类id */
  public final TableField<RecommendGoodsRecord, String> RECOMMEND_SORT_ID =
      createField("recommend_sort_id", org.jooq.impl.SQLDataType.VARCHAR(299), this, "推荐商家分类id");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.create_time</code>. */
  public final TableField<RecommendGoodsRecord, Timestamp> CREATE_TIME =
      createField(
          "create_time",
          org.jooq.impl.SQLDataType.TIMESTAMP
              .nullable(false)
              .defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)),
          this,
          "");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.update_time</code>. 最后修改时间 */
  public final TableField<RecommendGoodsRecord, Timestamp> UPDATE_TIME =
      createField(
          "update_time",
          org.jooq.impl.SQLDataType.TIMESTAMP
              .nullable(false)
              .defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)),
          this,
          "最后修改时间");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.choose_type</code>. 0普通推荐1智能推荐 */
  public final TableField<RecommendGoodsRecord, Byte> CHOOSE_TYPE =
      createField(
          "choose_type",
          org.jooq.impl.SQLDataType.TINYINT.defaultValue(
              DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)),
          this,
          "0普通推荐1智能推荐");

  /** The column <code>mini_shop_471752.b2c_recommend_goods.recommend_number</code>. 智能推荐商品数 */
  public final TableField<RecommendGoodsRecord, Integer> RECOMMEND_NUMBER =
      createField(
          "recommend_number",
          org.jooq.impl.SQLDataType.INTEGER.defaultValue(
              DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)),
          this,
          "智能推荐商品数");

  /** Create a <code>mini_shop_471752.b2c_recommend_goods</code> table reference */
  public RecommendGoods() {
    this(DSL.name("b2c_recommend_goods"), null);
  }

  /** Create an aliased <code>mini_shop_471752.b2c_recommend_goods</code> table reference */
  public RecommendGoods(String alias) {
    this(DSL.name(alias), RECOMMEND_GOODS);
  }

  /** Create an aliased <code>mini_shop_471752.b2c_recommend_goods</code> table reference */
  public RecommendGoods(Name alias) {
    this(alias, RECOMMEND_GOODS);
  }

  private RecommendGoods(Name alias, Table<RecommendGoodsRecord> aliased) {
    this(alias, aliased, null);
  }

  private RecommendGoods(Name alias, Table<RecommendGoodsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> RecommendGoods(
      Table<O> child, ForeignKey<O, RecommendGoodsRecord> key) {
    super(child, key, RECOMMEND_GOODS);
  }

  /** {@inheritDoc} */
  @Override
  public Schema getSchema() {
    return MiniShop_471752.MINI_SHOP_471752;
  }

  /** {@inheritDoc} */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.RECOMMEND_GOODS_PRIMARY);
  }

  /** {@inheritDoc} */
  @Override
  public Identity<RecommendGoodsRecord, Integer> getIdentity() {
    return Keys.IDENTITY_RECOMMEND_GOODS;
  }

  /** {@inheritDoc} */
  @Override
  public UniqueKey<RecommendGoodsRecord> getPrimaryKey() {
    return Keys.KEY_B2C_RECOMMEND_GOODS_PRIMARY;
  }

  /** {@inheritDoc} */
  @Override
  public List<UniqueKey<RecommendGoodsRecord>> getKeys() {
    return Arrays.<UniqueKey<RecommendGoodsRecord>>asList(Keys.KEY_B2C_RECOMMEND_GOODS_PRIMARY);
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoods as(String alias) {
    return new RecommendGoods(DSL.name(alias), this);
  }

  /** {@inheritDoc} */
  @Override
  public RecommendGoods as(Name alias) {
    return new RecommendGoods(alias, this);
  }

  /** Rename this table */
  @Override
  public RecommendGoods rename(String name) {
    return new RecommendGoods(DSL.name(name), null);
  }

  /** Rename this table */
  @Override
  public RecommendGoods rename(Name name) {
    return new RecommendGoods(name, null);
  }
}
