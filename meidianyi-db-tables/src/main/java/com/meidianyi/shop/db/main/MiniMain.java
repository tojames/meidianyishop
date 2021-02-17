/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.db.main;


import com.meidianyi.shop.db.main.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class MiniMain extends SchemaImpl {

    private static final long serialVersionUID = -415813261;

    /**
     * The reference instance of <code>mini_main</code>
     */
    public static final MiniMain MINI_MAIN = new MiniMain();

    /**
     * 退回订单表
     */
    public final ReturnOrderBak RETURN_ORDER_BAK = com.meidianyi.shop.db.main.tables.ReturnOrderBak.RETURN_ORDER_BAK;

    /**
     * 退货商品表
     */
    public final ReturnOrderGoodsBak RETURN_ORDER_GOODS_BAK = com.meidianyi.shop.db.main.tables.ReturnOrderGoodsBak.RETURN_ORDER_GOODS_BAK;

    /**
     * 订单商品表  b2c_order_goods
     */
    public final OrderGoodsBak ORDER_GOODS_BAK = com.meidianyi.shop.db.main.tables.OrderGoodsBak.ORDER_GOODS_BAK;

    /**
     * 订单
     */
    public final OrderInfoBak ORDER_INFO_BAK = com.meidianyi.shop.db.main.tables.OrderInfoBak.ORDER_INFO_BAK;


    /**
     * 定时任务定义表
     */
    public final CronDefine CRON_DEFINE = com.meidianyi.shop.db.main.tables.CronDefine.CRON_DEFINE;

    /**
     * 定时任务执行结果记录表
     */
    public final CronRecord CRON_RECORD = com.meidianyi.shop.db.main.tables.CronRecord.CRON_RECORD;

    /**
     * The table <code>mini_main.b2c_activity_statistics</code>.
     */
    public final ActivityStatistics ACTIVITY_STATISTICS = com.meidianyi.shop.db.main.tables.ActivityStatistics.ACTIVITY_STATISTICS;

    /**
     * The table <code>mini_main.b2c_ali_mini_agent</code>.
     */
    public final AliMiniAgent ALI_MINI_AGENT = com.meidianyi.shop.db.main.tables.AliMiniAgent.ALI_MINI_AGENT;

    /**
     * The table <code>mini_main.b2c_ali_mini_app_version</code>.
     */
    public final AliMiniAppVersion ALI_MINI_APP_VERSION = com.meidianyi.shop.db.main.tables.AliMiniAppVersion.ALI_MINI_APP_VERSION;

    /**
     * The table <code>mini_main.b2c_ali_mini_auth_shop</code>.
     */
    public final AliMiniAuthShop ALI_MINI_AUTH_SHOP = com.meidianyi.shop.db.main.tables.AliMiniAuthShop.ALI_MINI_AUTH_SHOP;

    /**
     * The table <code>mini_main.b2c_ali_my_order</code>.
     */
    public final AliMyOrder ALI_MY_ORDER = com.meidianyi.shop.db.main.tables.AliMyOrder.ALI_MY_ORDER;

    /**
     * The table <code>mini_main.b2c_ali_user_token</code>.
     */
    public final AliUserToken ALI_USER_TOKEN = com.meidianyi.shop.db.main.tables.AliUserToken.ALI_USER_TOKEN;

    /**
     * The table <code>mini_main.b2c_app</code>.
     */
    public final App APP = com.meidianyi.shop.db.main.tables.App.APP;

    /**
     * The table <code>mini_main.b2c_app_auth</code>.
     */
    public final AppAuth APP_AUTH = com.meidianyi.shop.db.main.tables.AppAuth.APP_AUTH;

    /**
     * The table <code>mini_main.b2c_article</code>.
     */
    public final Article ARTICLE = com.meidianyi.shop.db.main.tables.Article.ARTICLE;

    /**
     * The table <code>mini_main.b2c_article_category</code>.
     */
    public final ArticleCategory ARTICLE_CATEGORY = com.meidianyi.shop.db.main.tables.ArticleCategory.ARTICLE_CATEGORY;

    /**
     * The table <code>mini_main.b2c_article_record</code>.
     */
    public final ArticleRecord ARTICLE_RECORD = com.meidianyi.shop.db.main.tables.ArticleRecord.ARTICLE_RECORD;

    /**
     * The table <code>mini_main.b2c_back_process</code>.
     */
    public final BackProcess BACK_PROCESS = com.meidianyi.shop.db.main.tables.BackProcess.BACK_PROCESS;

    /**
     * The table <code>mini_main.b2c_cache</code>.
     */
    public final Cache CACHE = com.meidianyi.shop.db.main.tables.Cache.CACHE;

    /**
     * The table <code>mini_main.b2c_category</code>.
     */
    public final Category CATEGORY = com.meidianyi.shop.db.main.tables.Category.CATEGORY;

    /**
     * The table <code>mini_main.b2c_charge_renew</code>.
     */
    public final ChargeRenew CHARGE_RENEW = com.meidianyi.shop.db.main.tables.ChargeRenew.CHARGE_RENEW;

    /**
     * The table <code>mini_main.b2c_db_option_record</code>.
     */
    public final DbOptionRecord DB_OPTION_RECORD = com.meidianyi.shop.db.main.tables.DbOptionRecord.DB_OPTION_RECORD;

    /**
     * The table <code>mini_main.b2c_decoration_template</code>.
     */
    public final DecorationTemplate DECORATION_TEMPLATE = com.meidianyi.shop.db.main.tables.DecorationTemplate.DECORATION_TEMPLATE;

    /**
     * The table <code>mini_main.b2c_dict_city</code>.
     */
    public final DictCity DICT_CITY = com.meidianyi.shop.db.main.tables.DictCity.DICT_CITY;

    /**
     * The table <code>mini_main.b2c_dict_country</code>.
     */
    public final DictCountry DICT_COUNTRY = com.meidianyi.shop.db.main.tables.DictCountry.DICT_COUNTRY;

    /**
     * The table <code>mini_main.b2c_dict_district</code>.
     */
    public final DictDistrict DICT_DISTRICT = com.meidianyi.shop.db.main.tables.DictDistrict.DICT_DISTRICT;

    /**
     * 省份字典
     */
    public final DictProvince DICT_PROVINCE = com.meidianyi.shop.db.main.tables.DictProvince.DICT_PROVINCE;

    /**
     * The table <code>mini_main.b2c_failed_jobs</code>.
     */
    public final FailedJobs FAILED_JOBS = com.meidianyi.shop.db.main.tables.FailedJobs.FAILED_JOBS;

    /**
     * The table <code>mini_main.b2c_goods</code>.
     */
    public final Goods GOODS = com.meidianyi.shop.db.main.tables.Goods.GOODS;

    /**
     * The table <code>mini_main.b2c_goods_brand</code>.
     */
    public final GoodsBrand GOODS_BRAND = com.meidianyi.shop.db.main.tables.GoodsBrand.GOODS_BRAND;

    /**
     * The table <code>mini_main.b2c_goods_img</code>.
     */
    public final GoodsImg GOODS_IMG = com.meidianyi.shop.db.main.tables.GoodsImg.GOODS_IMG;

    /**
     * The table <code>mini_main.b2c_goods_spec_product</code>.
     */
    public final GoodsSpecProduct GOODS_SPEC_PRODUCT = com.meidianyi.shop.db.main.tables.GoodsSpecProduct.GOODS_SPEC_PRODUCT;

    /**
     * The table <code>mini_main.b2c_grasp_goods</code>.
     */
    public final GraspGoods GRASP_GOODS = com.meidianyi.shop.db.main.tables.GraspGoods.GRASP_GOODS;

    /**
     * The table <code>mini_main.b2c_jobs</code>.
     */
    public final Jobs JOBS = com.meidianyi.shop.db.main.tables.Jobs.JOBS;

    /**
     * The table <code>mini_main.b2c_log_manage</code>.
     */
    public final LogManage LOG_MANAGE = com.meidianyi.shop.db.main.tables.LogManage.LOG_MANAGE;

    /**
     * The table <code>mini_main.b2c_mp_auth_shop</code>.
     */
    public final MpAuthShop MP_AUTH_SHOP = com.meidianyi.shop.db.main.tables.MpAuthShop.MP_AUTH_SHOP;

    /**
     * The table <code>mini_main.b2c_mp_daily_retain</code>.
     */
    public final MpDailyRetain MP_DAILY_RETAIN = com.meidianyi.shop.db.main.tables.MpDailyRetain.MP_DAILY_RETAIN;

    /**
     * The table <code>mini_main.b2c_mp_daily_visit</code>.
     */
    public final MpDailyVisit MP_DAILY_VISIT = com.meidianyi.shop.db.main.tables.MpDailyVisit.MP_DAILY_VISIT;

    /**
     * The table <code>mini_main.b2c_mp_deploy_history</code>.
     */
    public final MpDeployHistory MP_DEPLOY_HISTORY = com.meidianyi.shop.db.main.tables.MpDeployHistory.MP_DEPLOY_HISTORY;

    /**
     * The table <code>mini_main.b2c_mp_distribution_visit</code>.
     */
    public final MpDistributionVisit MP_DISTRIBUTION_VISIT = com.meidianyi.shop.db.main.tables.MpDistributionVisit.MP_DISTRIBUTION_VISIT;

    /**
     * The table <code>mini_main.b2c_mp_jump_version</code>.
     */
    public final MpJumpVersion MP_JUMP_VERSION = com.meidianyi.shop.db.main.tables.MpJumpVersion.MP_JUMP_VERSION;

    /**
     * The table <code>mini_main.b2c_mp_monthly_retain</code>.
     */
    public final MpMonthlyRetain MP_MONTHLY_RETAIN = com.meidianyi.shop.db.main.tables.MpMonthlyRetain.MP_MONTHLY_RETAIN;

    /**
     * The table <code>mini_main.b2c_mp_monthly_visit</code>.
     */
    public final MpMonthlyVisit MP_MONTHLY_VISIT = com.meidianyi.shop.db.main.tables.MpMonthlyVisit.MP_MONTHLY_VISIT;

    /**
     * The table <code>mini_main.b2c_mp_official_account</code>.
     */
    public final MpOfficialAccount MP_OFFICIAL_ACCOUNT = com.meidianyi.shop.db.main.tables.MpOfficialAccount.MP_OFFICIAL_ACCOUNT;

    /**
     * The table <code>mini_main.b2c_mp_official_account_user</code>.
     */
    public final MpOfficialAccountUser MP_OFFICIAL_ACCOUNT_USER = com.meidianyi.shop.db.main.tables.MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER;

    /**
     * The table <code>mini_main.b2c_mp_operate_log</code>.
     */
    public final MpOperateLog MP_OPERATE_LOG = com.meidianyi.shop.db.main.tables.MpOperateLog.MP_OPERATE_LOG;

    /**
     * The table <code>mini_main.b2c_mp_summary_trend</code>.
     */
    public final MpSummaryTrend MP_SUMMARY_TREND = com.meidianyi.shop.db.main.tables.MpSummaryTrend.MP_SUMMARY_TREND;

    /**
     * The table <code>mini_main.b2c_mp_summary_trend_shop</code>.
     */
    public final MpSummaryTrendShop MP_SUMMARY_TREND_SHOP = com.meidianyi.shop.db.main.tables.MpSummaryTrendShop.MP_SUMMARY_TREND_SHOP;

    /**
     * The table <code>mini_main.b2c_mp_user_portrait</code>.
     */
    public final MpUserPortrait MP_USER_PORTRAIT = com.meidianyi.shop.db.main.tables.MpUserPortrait.MP_USER_PORTRAIT;

    /**
     * The table <code>mini_main.b2c_mp_version</code>.
     */
    public final MpVersion MP_VERSION = com.meidianyi.shop.db.main.tables.MpVersion.MP_VERSION;

    /**
     * The table <code>mini_main.b2c_mp_visit_page</code>.
     */
    public final MpVisitPage MP_VISIT_PAGE = com.meidianyi.shop.db.main.tables.MpVisitPage.MP_VISIT_PAGE;

    /**
     * The table <code>mini_main.b2c_mp_weekly_retain</code>.
     */
    public final MpWeeklyRetain MP_WEEKLY_RETAIN = com.meidianyi.shop.db.main.tables.MpWeeklyRetain.MP_WEEKLY_RETAIN;

    /**
     * The table <code>mini_main.b2c_mp_weekly_visit</code>.
     */
    public final MpWeeklyVisit MP_WEEKLY_VISIT = com.meidianyi.shop.db.main.tables.MpWeeklyVisit.MP_WEEKLY_VISIT;


    /**
     * The table <code>mini_main.b2c_qf_img</code>.
     */
    public final QfImg QF_IMG = com.meidianyi.shop.db.main.tables.QfImg.QF_IMG;

    /**
     * The table <code>mini_main.b2c_shop</code>.
     */
    public final Shop SHOP = com.meidianyi.shop.db.main.tables.Shop.SHOP;

    /**
     * The table <code>mini_main.b2c_shop_account</code>.
     */
    public final ShopAccount SHOP_ACCOUNT = com.meidianyi.shop.db.main.tables.ShopAccount.SHOP_ACCOUNT;

    /**
     * The table <code>mini_main.b2c_shop_activity</code>.
     */
    public final ShopActivity SHOP_ACTIVITY = com.meidianyi.shop.db.main.tables.ShopActivity.SHOP_ACTIVITY;

    /**
     * The table <code>mini_main.b2c_shop_child_account</code>.
     */
    public final ShopChildAccount SHOP_CHILD_ACCOUNT = com.meidianyi.shop.db.main.tables.ShopChildAccount.SHOP_CHILD_ACCOUNT;

    /**
     * The table <code>mini_main.b2c_shop_child_role</code>.
     */
    public final ShopChildRole SHOP_CHILD_ROLE = com.meidianyi.shop.db.main.tables.ShopChildRole.SHOP_CHILD_ROLE;

    /**
     * The table <code>mini_main.b2c_shop_free_experience</code>.
     */
    public final ShopFreeExperience SHOP_FREE_EXPERIENCE = com.meidianyi.shop.db.main.tables.ShopFreeExperience.SHOP_FREE_EXPERIENCE;

    /**
     * The table <code>mini_main.b2c_shop_grade</code>.
     */
    public final ShopGrade SHOP_GRADE = com.meidianyi.shop.db.main.tables.ShopGrade.SHOP_GRADE;

    /**
     * The table <code>mini_main.b2c_shop_grade_log</code>.
     */
    public final ShopGradeLog SHOP_GRADE_LOG = com.meidianyi.shop.db.main.tables.ShopGradeLog.SHOP_GRADE_LOG;

    /**
     * The table <code>mini_main.b2c_shop_operation</code>.
     */
    public final ShopOperation SHOP_OPERATION = com.meidianyi.shop.db.main.tables.ShopOperation.SHOP_OPERATION;

    /**
     * The table <code>mini_main.b2c_shop_question_feedback</code>.
     */
    public final ShopQuestionFeedback SHOP_QUESTION_FEEDBACK = com.meidianyi.shop.db.main.tables.ShopQuestionFeedback.SHOP_QUESTION_FEEDBACK;

    /**
     * The table <code>mini_main.b2c_shop_renew</code>.
     */
    public final ShopRenew SHOP_RENEW = com.meidianyi.shop.db.main.tables.ShopRenew.SHOP_RENEW;

    /**
     * The table <code>mini_main.b2c_shop_role</code>.
     */
    public final ShopRole SHOP_ROLE = com.meidianyi.shop.db.main.tables.ShopRole.SHOP_ROLE;

    /**
     * The table <code>mini_main.b2c_shop_uploaded_image</code>.
     */
    public final ShopUploadedImage SHOP_UPLOADED_IMAGE = com.meidianyi.shop.db.main.tables.ShopUploadedImage.SHOP_UPLOADED_IMAGE;

    /**
     * The table <code>mini_main.b2c_shop_uploaded_image_category</code>.
     */
    public final ShopUploadedImageCategory SHOP_UPLOADED_IMAGE_CATEGORY = com.meidianyi.shop.db.main.tables.ShopUploadedImageCategory.SHOP_UPLOADED_IMAGE_CATEGORY;

    /**
     * The table <code>mini_main.b2c_shop_version</code>.
     */
    public final ShopVersion SHOP_VERSION = com.meidianyi.shop.db.main.tables.ShopVersion.SHOP_VERSION;

    /**
     * The table <code>mini_main.b2c_sms</code>.
     */
    public final Sms SMS = com.meidianyi.shop.db.main.tables.Sms.SMS;

    /**
     * The table <code>mini_main.b2c_sort</code>.
     */
    public final Sort SORT = com.meidianyi.shop.db.main.tables.Sort.SORT;

    /**
     * The table <code>mini_main.b2c_spec</code>.
     */
    public final Spec SPEC = com.meidianyi.shop.db.main.tables.Spec.SPEC;

    /**
     * The table <code>mini_main.b2c_spec_vals</code>.
     */
    public final SpecVals SPEC_VALS = com.meidianyi.shop.db.main.tables.SpecVals.SPEC_VALS;

    /**
     * The table <code>mini_main.b2c_statistics_shop</code>.
     */
    public final StatisticsShop STATISTICS_SHOP = com.meidianyi.shop.db.main.tables.StatisticsShop.STATISTICS_SHOP;

    /**
     * The table <code>mini_main.b2c_system_cfg</code>.
     */
    public final SystemCfg SYSTEM_CFG = com.meidianyi.shop.db.main.tables.SystemCfg.SYSTEM_CFG;

    /**
     * The table <code>mini_main.b2c_system_child_account</code>.
     */
    public final SystemChildAccount SYSTEM_CHILD_ACCOUNT = com.meidianyi.shop.db.main.tables.SystemChildAccount.SYSTEM_CHILD_ACCOUNT;

    /**
     * The table <code>mini_main.b2c_system_role</code>.
     */
    public final SystemRole SYSTEM_ROLE = com.meidianyi.shop.db.main.tables.SystemRole.SYSTEM_ROLE;

    /**
     * The table <code>mini_main.b2c_system_user</code>.
     */
    public final SystemUser SYSTEM_USER = com.meidianyi.shop.db.main.tables.SystemUser.SYSTEM_USER;

    /**
     * The table <code>mini_main.b2c_third_party_services</code>.
     */
    public final ThirdPartyServices THIRD_PARTY_SERVICES = com.meidianyi.shop.db.main.tables.ThirdPartyServices.THIRD_PARTY_SERVICES;

    /**
     * The table <code>mini_main.b2c_uploaded_image</code>.
     */
    public final UploadedImage UPLOADED_IMAGE = com.meidianyi.shop.db.main.tables.UploadedImage.UPLOADED_IMAGE;

    /**
     * The table <code>mini_main.b2c_uploaded_image_category</code>.
     */
    public final UploadedImageCategory UPLOADED_IMAGE_CATEGORY = com.meidianyi.shop.db.main.tables.UploadedImageCategory.UPLOADED_IMAGE_CATEGORY;

    /**
     * The table <code>mini_main.b2c_upload_uyun_record</code>.
     */
    public final UploadUyunRecord UPLOAD_UYUN_RECORD = com.meidianyi.shop.db.main.tables.UploadUyunRecord.UPLOAD_UYUN_RECORD;

    /**
     * The table <code>mini_main.b2c_user</code>.
     */
    public final User USER = com.meidianyi.shop.db.main.tables.User.USER;

    /**
     * The table <code>mini_main.b2c_user_detail</code>.
     */
    public final UserDetail USER_DETAIL = com.meidianyi.shop.db.main.tables.UserDetail.USER_DETAIL;

    /**
     * The table <code>mini_main.b2c_user_login_record</code>.
     */
    public final UserLoginRecord USER_LOGIN_RECORD = com.meidianyi.shop.db.main.tables.UserLoginRecord.USER_LOGIN_RECORD;

    /**
     * The table <code>mini_main.b2c_user_summary_trend</code>.
     */
    public final UserSummaryTrend USER_SUMMARY_TREND = com.meidianyi.shop.db.main.tables.UserSummaryTrend.USER_SUMMARY_TREND;

    public final TaskJobMain TASK_JOB_MAIN = com.meidianyi.shop.db.main.tables.TaskJobMain.TASK_JOB_MAIN;
    public final TaskJobContent TASK_JOB_CONTENT = com.meidianyi.shop.db.main.tables.TaskJobContent.TASK_JOB_CONTENT;
    /**
     * 店铺短信配置表
     */
    public final ShopSmsConfig SHOP_SMS_CONFIG = com.meidianyi.shop.db.main.tables.ShopSmsConfig.SHOP_SMS_CONFIG;
    /**
     * The table <code>mini_main.b2c_store_account</code>.
     */
    public final StoreAccount STORE_ACCOUNT = com.meidianyi.shop.db.main.tables.StoreAccount.STORE_ACCOUNT;
    /**
     * 店铺物流信息表
     */
    public final ShopLogistics SHOP_LOGISTICS = com.meidianyi.shop.db.main.tables.ShopLogistics.SHOP_LOGISTICS;
    /**
     * No further instances allowed
     */
    private MiniMain() {
        super("mini_main", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ActivityStatistics.ACTIVITY_STATISTICS,
            AliMiniAgent.ALI_MINI_AGENT,
            AliMiniAppVersion.ALI_MINI_APP_VERSION,
            AliMiniAuthShop.ALI_MINI_AUTH_SHOP,
            AliMyOrder.ALI_MY_ORDER,
            AliUserToken.ALI_USER_TOKEN,
            App.APP,
            AppAuth.APP_AUTH,
            Article.ARTICLE,
            ArticleCategory.ARTICLE_CATEGORY,
            ArticleRecord.ARTICLE_RECORD,
            BackProcess.BACK_PROCESS,
            Cache.CACHE,
            Category.CATEGORY,
            ChargeRenew.CHARGE_RENEW,
            DbOptionRecord.DB_OPTION_RECORD,
            DecorationTemplate.DECORATION_TEMPLATE,
            DictCity.DICT_CITY,
            DictCountry.DICT_COUNTRY,
            DictDistrict.DICT_DISTRICT,
            DictProvince.DICT_PROVINCE,
            FailedJobs.FAILED_JOBS,
            Goods.GOODS,
            GoodsBrand.GOODS_BRAND,
            GoodsImg.GOODS_IMG,
            GoodsSpecProduct.GOODS_SPEC_PRODUCT,
            GraspGoods.GRASP_GOODS,
            Jobs.JOBS,
            LogManage.LOG_MANAGE,
            MpAuthShop.MP_AUTH_SHOP,
            MpDailyRetain.MP_DAILY_RETAIN,
            MpDailyVisit.MP_DAILY_VISIT,
            MpDeployHistory.MP_DEPLOY_HISTORY,
            MpDistributionVisit.MP_DISTRIBUTION_VISIT,
            MpJumpVersion.MP_JUMP_VERSION,
            MpMonthlyRetain.MP_MONTHLY_RETAIN,
            MpMonthlyVisit.MP_MONTHLY_VISIT,
            MpOfficialAccount.MP_OFFICIAL_ACCOUNT,
            MpOfficialAccountUser.MP_OFFICIAL_ACCOUNT_USER,
            MpOperateLog.MP_OPERATE_LOG,
            MpSummaryTrend.MP_SUMMARY_TREND,
            MpSummaryTrendShop.MP_SUMMARY_TREND_SHOP,
            MpUserPortrait.MP_USER_PORTRAIT,
            MpVersion.MP_VERSION,
            MpVisitPage.MP_VISIT_PAGE,
            MpWeeklyRetain.MP_WEEKLY_RETAIN,
            MpWeeklyVisit.MP_WEEKLY_VISIT,
            QfImg.QF_IMG,
            Shop.SHOP,
            ShopAccount.SHOP_ACCOUNT,
            ShopActivity.SHOP_ACTIVITY,
            ShopChildAccount.SHOP_CHILD_ACCOUNT,
            ShopChildRole.SHOP_CHILD_ROLE,
            ShopFreeExperience.SHOP_FREE_EXPERIENCE,
            ShopGrade.SHOP_GRADE,
            ShopGradeLog.SHOP_GRADE_LOG,
            ShopOperation.SHOP_OPERATION,
            ShopQuestionFeedback.SHOP_QUESTION_FEEDBACK,
            ShopRenew.SHOP_RENEW,
            ShopRole.SHOP_ROLE,
            ShopUploadedImage.SHOP_UPLOADED_IMAGE,
            ShopUploadedImageCategory.SHOP_UPLOADED_IMAGE_CATEGORY,
            ShopVersion.SHOP_VERSION,
            Sms.SMS,
            Sort.SORT,
            Spec.SPEC,
            SpecVals.SPEC_VALS,
            StatisticsShop.STATISTICS_SHOP,
            SystemCfg.SYSTEM_CFG,
            SystemChildAccount.SYSTEM_CHILD_ACCOUNT,
            SystemRole.SYSTEM_ROLE,
            SystemUser.SYSTEM_USER,
            ThirdPartyServices.THIRD_PARTY_SERVICES,
            UploadedImage.UPLOADED_IMAGE,
            UploadedImageCategory.UPLOADED_IMAGE_CATEGORY,
            UploadUyunRecord.UPLOAD_UYUN_RECORD,
            User.USER,
            UserDetail.USER_DETAIL,
            UserLoginRecord.USER_LOGIN_RECORD,
            UserSummaryTrend.USER_SUMMARY_TREND,
            TaskJobContent.TASK_JOB_CONTENT,
            TaskJobMain.TASK_JOB_MAIN,
            CronDefine.CRON_DEFINE,
            CronRecord.CRON_RECORD,
            ReturnOrderBak.RETURN_ORDER_BAK,
            ReturnOrderGoodsBak.RETURN_ORDER_GOODS_BAK,
            InquiryOrder.INQUIRY_ORDER,
            ShopSmsConfig.SHOP_SMS_CONFIG,
            StoreAccount.STORE_ACCOUNT,
            ShopLogistics.SHOP_LOGISTICS);
    }
}
