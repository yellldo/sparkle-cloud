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
 * 直接融资申请表
 *
 * @TableName direct_finance_apply
 */
@TableName(value = "direct_finance_apply")
@Data
public class DirectFinanceApply implements Serializable {
    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 直接融资产品id
     */
    @TableField(value = "finance_id")
    private Long financeId;

    /**
     * 产品名称
     */
    @TableField(value = "finance_name")
    private String financeName;

    /**
     * 申请人手机号
     */
    @TableField(value = "apply_phone")
    private String applyPhone;

    /**
     * 企业id
     */
    @TableField(value = "ent_id")
    private Long entId;

    /**
     * 机构id
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 融资金额
     */
    @TableField(value = "finance_amount")
    private BigDecimal financeAmount;

    /**
     * 放款金额
     */
    @TableField(value = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 办理时间
     */
    @TableField(value = "loan_time")
    private Date loanTime;

    /**
     * 商业计划书 存id
     */
    @TableField(value = "business_files")
    private String businessFiles;

    /**
     * 需求描述
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 受理状态 0、未处理 1、已查看 2、审查中 3、已驳回  4、已受理
     */
    @TableField(value = "finance_status")
    private String financeStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 审核备注
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}