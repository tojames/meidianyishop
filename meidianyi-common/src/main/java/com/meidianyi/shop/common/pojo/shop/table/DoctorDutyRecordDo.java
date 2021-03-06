package com.meidianyi.shop.common.pojo.shop.table;

/**
 * @author chenjie
 * @date 2020年08月12日
 */

import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 医师上下班记录表
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
public class DoctorDutyRecordDo implements Serializable {
    private static final long serialVersionUID = -1384343343;

    private Integer   id;
    private Integer   doctorId;
    private Byte      dutyStatus;
    private Byte      type;
    private Timestamp createTime;
    private Timestamp updateTime;
}
