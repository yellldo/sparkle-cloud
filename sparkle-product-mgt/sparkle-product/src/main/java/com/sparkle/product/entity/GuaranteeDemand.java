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
 * 担保需求表
 *
 * @TableName guarantee_demand
 */
@TableName(value = "guarantee_demand")
@Data
public class GuaranteeDemand implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 申请人手机号
     */
    @TableField(value = "apply_phone")
    private String applyPhone;

    /**
     * 担保产品Id
     */
    @TableField(value = "guarantee_id")
    private Long guaranteeId;

    /**
     * 担保产品名称
     */
    @TableField(value = "guarantee_name")
    private String guaranteeName;

    /**
     * 企业ID
     */
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 担保机构ID
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 需求受理状态（最新）0、未处理 1、已查看 2、审查中 3、已受理 4、已驳回
     */
    @TableField(value = "demand_status")
    private String demandStatus;

    /**
     * 期望担保金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 期望担保金额单位
     */
    @TableField(value = "amount_unit")
    private String amountUnit;

    /**
     * 期望担保期限
     */
    @TableField(value = "term")
    private String term;

    /**
     * 期望担保期限单位 0、月 1、年
     */
    @TableField(value = "term_unit")
    private String termUnit;

    /**
     * 需求描述
     */
    @TableField(value = "demand_desc")
    private String demandDesc;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private Date updateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}