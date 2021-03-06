/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.shop.tables.records;


import com.meidianyi.shop.db.shop.tables.StoreService;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class StoreServiceRecord extends UpdatableRecordImpl<StoreServiceRecord> {

    private static final long serialVersionUID = -1974717407;

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.store_id</code>. 门店id
     */
    public void setStoreId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.store_id</code>. 门店id
     */
    public Integer getStoreId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_name</code>. 服务名称
     */
    public void setServiceName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_name</code>. 服务名称
     */
    public String getServiceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_sn</code>. 服务编码
     */
    public void setServiceSn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_sn</code>. 服务编码
     */
    public String getServiceSn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.sale_num</code>. 销量
     */
    public void setSaleNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.sale_num</code>. 销量
     */
    public Integer getSaleNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_price</code>. 服务价格
     */
    public void setServicePrice(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_price</code>. 服务价格
     */
    public BigDecimal getServicePrice() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_subsist</code>. 预约订金
     */
    public void setServiceSubsist(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_subsist</code>. 预约订金
     */
    public BigDecimal getServiceSubsist() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.cat_id</code>. 服务分类
     */
    public void setCatId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.cat_id</code>. 服务分类
     */
    public Integer getCatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_shelf</code>. 上下架 1:上架，0:下架
     */
    public void setServiceShelf(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_shelf</code>. 上下架 1:上架，0:下架
     */
    public Byte getServiceShelf() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_img</code>. 分类主图
     */
    public void setServiceImg(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_img</code>. 分类主图
     */
    public String getServiceImg() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.start_date</code>. 可服务日期开始时间
     */
    public void setStartDate(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.start_date</code>. 可服务日期开始时间
     */
    public Date getStartDate() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.end_date</code>. 可服务日期结束时间
     */
    public void setEndDate(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.end_date</code>. 可服务日期结束时间
     */
    public Date getEndDate() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.start_period</code>. 开始服务时段
     */
    public void setStartPeriod(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.start_period</code>. 开始服务时段
     */
    public String getStartPeriod() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.end_period</code>. 结束服务时段
     */
    public void setEndPeriod(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.end_period</code>. 结束服务时段
     */
    public String getEndPeriod() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_duration</code>. 服务时长
     */
    public void setServiceDuration(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_duration</code>. 服务时长
     */
    public Integer getServiceDuration() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.service_type</code>. 服务类型:0无技师1有技师
     */
    public void setServiceType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.service_type</code>. 服务类型:0无技师1有技师
     */
    public Byte getServiceType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.services_number</code>. 服务数量
     */
    public void setServicesNumber(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.services_number</code>. 服务数量
     */
    public Integer getServicesNumber() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.tech_services_number</code>. 技师单时段服务数量
     */
    public void setTechServicesNumber(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.tech_services_number</code>. 技师单时段服务数量
     */
    public Integer getTechServicesNumber() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.content</code>. 服务描述
     */
    public void setContent(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.content</code>. 服务描述
     */
    public String getContent() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.charge_resolve</code>. 收费说明
     */
    public void setChargeResolve(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.charge_resolve</code>. 收费说明
     */
    public String getChargeResolve() {
        return (String) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_service.del_flag</code>. 1为删除状态
     */
    public void setDelFlag(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_service.del_flag</code>. 1为删除状态
     */
    public Byte getDelFlag() {
        return (Byte) get(22);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreServiceRecord
     */
    public StoreServiceRecord() {
        super(StoreService.STORE_SERVICE);
    }

    /**
     * Create a detached, initialised StoreServiceRecord
     */
    public StoreServiceRecord(Integer id, Integer storeId, String serviceName, String serviceSn, Integer saleNum, BigDecimal servicePrice, BigDecimal serviceSubsist, Integer catId, Byte serviceShelf, String serviceImg, Date startDate, Date endDate, String startPeriod, String endPeriod, Integer serviceDuration, Byte serviceType, Integer servicesNumber, Integer techServicesNumber, String content, Timestamp createTime, Timestamp updateTime, String chargeResolve, Byte delFlag) {
        super(StoreService.STORE_SERVICE);

        set(0, id);
        set(1, storeId);
        set(2, serviceName);
        set(3, serviceSn);
        set(4, saleNum);
        set(5, servicePrice);
        set(6, serviceSubsist);
        set(7, catId);
        set(8, serviceShelf);
        set(9, serviceImg);
        set(10, startDate);
        set(11, endDate);
        set(12, startPeriod);
        set(13, endPeriod);
        set(14, serviceDuration);
        set(15, serviceType);
        set(16, servicesNumber);
        set(17, techServicesNumber);
        set(18, content);
        set(19, createTime);
        set(20, updateTime);
        set(21, chargeResolve);
        set(22, delFlag);
    }
}
