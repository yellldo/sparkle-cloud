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
 * 担保需求变更记录表
 *
 * @TableName guarantee_demand_change_record
 */
@TableName(value = "guarantee_demand_change_record")
@Data
public class GuaranteeDemandChangeRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 担保需求ID
     */
    @TableField(value = "guarantee_demand_id")
    private Long guaranteeDemandId;

    /**
     * 担保机构ID
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 需求受理状态（字段表）
     */
    @TableField(value = "demand_status")
    private String demandStatus;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 操作人ID
     */
    @TableField(value = "operator_id")
    private Long operatorId;

    /**
     * 操作人姓名
     */
    @TableField(value = "operator_name")
    private String operatorName;

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
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 审批时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}