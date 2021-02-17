/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables;


import com.meidianyi.shop.db.shop.Indexes;
import com.meidianyi.shop.db.shop.Keys;
import com.meidianyi.shop.db.shop.MiniShop_471752;
import com.meidianyi.shop.db.shop.tables.records.DistributorCollectionRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 分销员推广中心收藏商品表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributorCollection extends TableImpl<DistributorCollectionRecord> {

    private static final long serialVersionUID = -1909769717;

    /**
     * The reference instance of <code>mini_shop_245547.b2c_distributor_collection</code>
     */
    public static final DistributorCollection DISTRIBUTOR_COLLECTION = new DistributorCollection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistributorCollectionRecord> getRecordType() {
        return DistributorCollectionRecord.class;
    }

    /**
     * The column <code>mini_shop_245547.b2c_distributor_collection.id</code>.
     */
    public final TableField<DistributorCollectionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_245547.b2c_distributor_collection.distributor_id</code>. 分销员id
     */
    public final TableField<DistributorCollectionRecord, Integer> DISTRIBUTOR_ID = createField("distributor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "分销员id");

    /**
     * The column <code>mini_shop_245547.b2c_distributor_collection.collection_goods_id</code>. 分销员收藏的商品id集合
     */
    public final TableField<DistributorCollectionRecord, String> COLLECTION_GOODS_ID = createField("collection_goods_id", org.jooq.impl.SQLDataType.CLOB, this, "分销员收藏的商品id集合");

    /**
     * The column <code>mini_shop_245547.b2c_distributor_collection.create_time</code>. 添加时间
     */
    public final TableField<DistributorCollectionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * The column <code>mini_shop_245547.b2c_distributor_collection.update_time</code>. 更新时间
     */
    public final TableField<DistributorCollectionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>mini_shop_245547.b2c_distributor_collection</code> table reference
     */
    public DistributorCollection() {
        this(DSL.name("b2c_distributor_collection"), null);
    }

    /**
     * Create an aliased <code>mini_shop_245547.b2c_distributor_collection</code> table reference
     */
    public DistributorCollection(String alias) {
        this(DSL.name(alias), DISTRIBUTOR_COLLECTION);
    }

    /**
     * Create an aliased <code>mini_shop_245547.b2c_distributor_collection</code> table reference
     */
    public DistributorCollection(Name alias) {
        this(alias, DISTRIBUTOR_COLLECTION);
    }

    private DistributorCollection(Name alias, Table<DistributorCollectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistributorCollection(Name alias, Table<DistributorCollectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("分销员推广中心收藏商品表"));
    }

    public <O extends Record> DistributorCollection(Table<O> child, ForeignKey<O, DistributorCollectionRecord> key) {
        super(child, key, DISTRIBUTOR_COLLECTION);
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
        return Arrays.<Index>asList(Indexes.DISTRIBUTOR_COLLECTION_DISTRIBUTOR_ID, Indexes.DISTRIBUTOR_COLLECTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DistributorCollectionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRIBUTOR_COLLECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistributorCollectionRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DISTRIBUTOR_COLLECTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistributorCollectionRecord>> getKeys() {
        return Arrays.<UniqueKey<DistributorCollectionRecord>>asList(Keys.KEY_B2C_DISTRIBUTOR_COLLECTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorCollection as(String alias) {
        return new DistributorCollection(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributorCollection as(Name alias) {
        return new DistributorCollection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorCollection rename(String name) {
        return new DistributorCollection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributorCollection rename(Name name) {
        return new DistributorCollection(name, null);
    }
}