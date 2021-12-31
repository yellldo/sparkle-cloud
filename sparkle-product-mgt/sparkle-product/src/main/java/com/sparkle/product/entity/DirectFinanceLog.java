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
 * 直接融资操作日志表
 *
 * @TableName direct_finance_log
 */
@TableName(value = "direct_finance_log")
@Data
public class DirectFinanceLog implements Serializable {
    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 申请id
     */
    @TableField(value = "apply_id")
    private Long applyId;

    /**
     * 机构编号
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 放款金额
     */
    @TableField(value = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 办理日期
     */
    @TableField(value = "loan_time")
    private Date loanTime;

    /**
     * 状态
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 审批时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

    /**
     * 备注
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    /**
     * 审批人
     */
    @TableField(value = "oper_name")
    private String operName;

    /**
     * 操作时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}