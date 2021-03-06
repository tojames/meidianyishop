/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.GroupDrawRecord;

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
 * 拼团抽奖配置页
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupDraw extends TableImpl<GroupDrawRecord> {

    private static final long serialVersionUID = 2112351072;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_group_draw</code>
     */
    public static final GroupDraw GROUP_DRAW = new GroupDraw();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupDrawRecord> getRecordType() {
        return GroupDrawRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.id</code>.
     */
    public final TableField<GroupDrawRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.name</code>. 活动名称
     */
    public final TableField<GroupDrawRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.start_time</code>. 开始时间
     */
    public final TableField<GroupDrawRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.end_time</code>. 结束时间
     */
    public final TableField<GroupDrawRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.goods_id</code>. 参与抽奖的商品id
     */
    public final TableField<GroupDrawRecord, String> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.CLOB, this, "参与抽奖的商品id");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.min_join_num</code>. 开奖最小参与人数
     */
    public final TableField<GroupDrawRecord, Short> MIN_JOIN_NUM = createField("min_join_num", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "开奖最小参与人数");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.pay_money</code>. 下单支付金额
     */
    public final TableField<GroupDrawRecord, BigDecimal> PAY_MONEY = createField("pay_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "下单支付金额");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.join_limit</code>. 参团限制
     */
    public final TableField<GroupDrawRecord, Short> JOIN_LIMIT = createField("join_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "参团限制");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.open_limit</code>. 开团限制
     */
    public final TableField<GroupDrawRecord, Short> OPEN_LIMIT = createField("open_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "开团限制");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.limit_amount</code>. 最小成团人数
     */
    public final TableField<GroupDrawRecord, Short> LIMIT_AMOUNT = createField("limit_amount", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "最小成团人数");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.to_num_show</code>. 参与用户达到多少前端展示
     */
    public final TableField<GroupDrawRecord, Short> TO_NUM_SHOW = createField("to_num_show", org.jooq.impl.SQLDataType.SMALLINT, this, "参与用户达到多少前端展示");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.status</code>. 1：启用 0：禁用
     */
    public final TableField<GroupDrawRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1：启用 0：禁用");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.is_draw</code>. 是否已开奖
     */
    public final TableField<GroupDrawRecord, Byte> IS_DRAW = createField("is_draw", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否已开奖");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.create_time</code>.
     */
    public final TableField<GroupDrawRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.update_time</code>. 最后修改时间
     */
    public final TableField<GroupDrawRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.del_flag</code>.
     */
    public final TableField<GroupDrawRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.del_time</code>. 删除时间
     */
    public final TableField<GroupDrawRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "删除时间");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.reward_coupon_id</code>. 拼团失败发放优惠券
     */
    public final TableField<GroupDrawRecord, String> REWARD_COUPON_ID = createField("reward_coupon_id", org.jooq.impl.SQLDataType.VARCHAR(200), this, "拼团失败发放优惠券");

    /**
     * The column <code>mini_shop_471752.b2c_group_draw.activity_copywriting</code>. 活动说明
     */
    public final TableField<GroupDrawRecord, String> ACTIVITY_COPYWRITING = createField("activity_copywriting", org.jooq.impl.SQLDataType.CLOB, this, "活动说明");

    /**
     * Create a <code>mini_shop_471752.b2c_group_draw</code> table reference
     */
    public GroupDraw() {
        this(DSL.name("b2c_group_draw"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_group_draw</code> table reference
     */
    public GroupDraw(String alias) {
        this(DSL.name(alias), GROUP_DRAW);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_group_draw</code> table reference
     */
    public GroupDraw(Name alias) {
        this(alias, GROUP_DRAW);
    }

    private GroupDraw(Name alias, Table<GroupDrawRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupDraw(Name alias, Table<GroupDrawRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("拼团抽奖配置页"));
    }

    public <O extends Record> GroupDraw(Table<O> child, ForeignKey<O, GroupDrawRecord> key) {
        super(child, key, GROUP_DRAW);
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
        return Arrays.<Index>asList(Indexes.GROUP_DRAW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GroupDrawRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GROUP_DRAW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupDrawRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GROUP_DRAW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupDrawRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupDrawRecord>>asList(Keys.KEY_B2C_GROUP_DRAW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupDraw as(String alias) {
        return new GroupDraw(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupDraw as(Name alias) {
        return new GroupDraw(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupDraw rename(String name) {
        return new GroupDraw(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupDraw rename(Name name) {
        return new GroupDraw(name, null);
    }
}
