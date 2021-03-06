/*
 * This file is generated by jOOQ.
 */
package com.meidianyi.shop.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 患者信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Data
public class PatientDo implements Serializable {

    private static final long serialVersionUID = -1245292818;

    private Integer   id;
    private String    name;
    private String    mobile;
    private String    patientCode;
    private String    identityCode;
    private Byte      identityType;
    private String    treatmentCode;
    private String    insuranceCardCode;
    private Byte      sex;
    private Date      birthday;
    private String    diseaseHistory;
    private String    allergyHistory;
    private String    familyDiseaseHistory;
    private Byte      gestationType;
    private Byte      kidneyFunctionOk;
    private Byte      liverFunctionOk;
    private Byte      isFetch;
    private String    remarks;
    private Byte      isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

}
