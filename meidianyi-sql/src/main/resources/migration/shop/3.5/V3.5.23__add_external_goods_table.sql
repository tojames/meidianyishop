CREATE TABLE `b2c_goods_from_his` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品额外信息id',
    `goods_price` decimal(10,2) DEFAULT NULL,
    `goods_number` int(11) DEFAULT NULL,
    `goods_code` varchar(64)  NOT NULL DEFAULT '' COMMENT '药品唯一编码',
    `goods_common_name` varchar(512)     NOT NULL DEFAULT '' COMMENT '通用名',
    `is_medical` tinyint(1) DEFAULT '1',
    `goods_alias_name` varchar(512)     NOT NULL DEFAULT '' COMMENT '别名',
    `goods_quality_ratio` varchar(512)     NOT NULL DEFAULT '' COMMENT '规格系数，通用名和规格系数确定一个药品',
    `is_rx` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否处方药 0否 1是 默认0',
    `medical_type` tinyint(1) DEFAULT NULL COMMENT 'null 未知  1西药 2中成药 3中草药',
    `insurance_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '医保类型 1:甲 2:乙 3:丙 4:科研',
    `insurance_code` varchar(64)     NOT NULL DEFAULT '' COMMENT '医保编码',
    `insurance_database_name` varchar(128)     NOT NULL DEFAULT '' COMMENT '医保库内名称',
    `goods_basic_unit` varchar(32)     DEFAULT '' COMMENT '商品基本单位',
    `goods_package_unit` varchar(32)     DEFAULT '' COMMENT '商品包装单位',
    `goods_unit_convert_factor` double DEFAULT '0' COMMENT '整包转换系数',
    `goods_equivalent_quantity` double DEFAULT '0' COMMENT '等效量',
    `goods_equivalent_unit` varchar(32)     DEFAULT '' COMMENT '等效单位',
    `goods_approval_number` varchar(128)     DEFAULT '' COMMENT '批准文号',
    `goods_production_enterprise` varchar(512)     DEFAULT '' COMMENT '生产企业',
    `is_delete` tinyint(1) NOT NULL DEFAULT '0',
    `state` int(11) DEFAULT NULL,
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`id`)
) COMMENT='his商品-药品信息表';

CREATE TABLE `b2c_goods_from_store` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品额外信息id',
    `goods_price` decimal(10,2) DEFAULT NULL,
    `goods_number` int(11) DEFAULT NULL,
    `goods_code` varchar(64)     NOT NULL DEFAULT '' COMMENT '药品唯一编码',
    `goods_bar_code` varchar(128)     DEFAULT NULL,
    `is_medical` tinyint(1) DEFAULT '1',
    `goods_common_name` varchar(512)     NOT NULL DEFAULT '' COMMENT '通用名',
    `goods_alias_name` varchar(512)     NOT NULL DEFAULT '' COMMENT '别名',
    `goods_quality_ratio` varchar(512)     NOT NULL DEFAULT '' COMMENT '规格系数，通用名和规格系数确定一个药品',
    `is_rx` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否处方药 0否 1是 默认0',
    `medical_type` tinyint(1) DEFAULT NULL COMMENT 'null 未知  1西药 2中成药 3中草药',
    `insurance_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '医保类型 1:甲 2:乙 3:丙 4:科研',
    `insurance_code` varchar(64)     NOT NULL DEFAULT '' COMMENT '医保编码',
    `insurance_database_name` varchar(128)     NOT NULL DEFAULT '' COMMENT '医保库内名称',
    `goods_basic_unit` varchar(32)     DEFAULT '' COMMENT '商品基本单位',
    `goods_package_unit` varchar(32)     DEFAULT '' COMMENT '商品包装单位',
    `goods_unit_convert_factor` double DEFAULT '0' COMMENT '整包转换系数',
    `goods_equivalent_quantity` double DEFAULT '0' COMMENT '等效量',
    `goods_equivalent_unit` varchar(32)     DEFAULT '' COMMENT '等效单位',
    `goods_approval_number` varchar(128)     DEFAULT '' COMMENT '批准文号',
    `goods_production_enterprise` varchar(512)     DEFAULT '' COMMENT '生产企业',
    `is_delete` tinyint(1) NOT NULL DEFAULT '0',
    `state` int(11) DEFAULT NULL,
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`id`)
) COMMENT='药店商品-药品信息表';