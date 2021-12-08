package com.sparkle.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 担保日志表
 *
 * @TableName guarantee_demand_log
 */
@TableName(value = "guarantee_demand_log")
@Data
public class GuaranteeDemandLog implements Serializable {
    /**
     * 主键ID
     */
    @TableField(value = "seq_id")
    private Long seqId;

    /**
     * 申请ID
     */
    @TableField(value = "apply_id")
    private Long applyId;

    /**
     * 操作明细表ID
     */
    @TableField(value = "dtl_id")
    private Long dtlId;

    /**
     * 机构号
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    private Integer auditStatus;

    /**
     * 审批说明
     */
    @TableField(value = "audit_detail")
    private String auditDetail;

    /**
     * 审批时间
     */
    @TableField(value = "audit_time")
    private Long auditTime;

    /**
     * 审批人
     */
    @TableField(value = "audit_user")
    private String auditUser;

    /**
     * 审批人姓名
     */
    @TableField(value = "audit_user_name")
    private String auditUserName;

    /**
     * 合同签订时间
     */
    @TableField(value = "guarantee_time")
    private Date guaranteeTime;

    /**
     * 担保金额
     */
    @TableField(value = "guarantee_amt")
    private BigDecimal guaranteeAmt;

    /**
     * 担保周期单位
     */
    @TableField(value = "guarantee_peri_unit")
    private Integer guaranteePeriUnit;

    /**
     * 担保周期
     */
    @TableField(value = "guarantee_peri")
    private Integer guaranteePeri;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}