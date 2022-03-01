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
 * @TableName apply_info
 */
@TableName(value = "apply_info")
@Data
public class ApplyInfo implements Serializable {
    /**
     * 申请ID
     */
    @TableId(value = "apply_id")
    private Long applyId;

    /**
     * 登录手机号
     */
    @TableField(value = "apply_phone")
    private String applyPhone;

    /**
     * 企业ID
     */
    @TableField(value = "ent_id")
    private Long entId;

    /**
     * 统一社会信用代码
     */
    @TableField(value = "credit_code")
    private String creditCode;

    /**
     * 法定代表人
     */
    @TableField(value = "legal_repre")
    private String legalRepre;

    /**
     * 注册成本
     */
    @TableField(value = "regist_cost")
    private BigDecimal registCost;

    /**
     * 省id
     */
    @TableField(value = "pro_id")
    private Long proId;

    /**
     * 市id
     */
    @TableField(value = "city_id")
    private Long cityId;

    /**
     * 县id
     */
    @TableField(value = "county_id")
    private Long countyId;

    /**
     * 邮政编码
     */
    @TableField(value = "post_code")
    private String postCode;

    /**
     * 融资额度
     */
    @TableField(value = "finan_limit")
    private BigDecimal finanLimit;

    /**
     * 企业联系人
     */
    @TableField(value = "ent_link_user")
    private String entLinkUser;

    /**
     * 企业联系人电话
     */
    @TableField(value = "ent_link_phone")
    private String entLinkPhone;

    /**
     * 联系人性别
     */
    @TableField(value = "link_user_sex")
    private String linkUserSex;

    /**
     * 需求类型
     */
    @TableField(value = "demand_type")
    private String demandType;

    /**
     * 产品ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 产品所属机构
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 贷款金额
     */
    @TableField(value = "loan_amount")
    private BigDecimal loanAmount;

    /**
     * 保障金额下限
     */
    @TableField(value = "safe_amount_down")
    private BigDecimal safeAmountDown;

    /**
     * 保障上限
     */
    @TableField(value = "safe_amount_up")
    private BigDecimal safeAmountUp;

    /**
     * 贷款期限
     */
    @TableField(value = "loan_period")
    private Integer loanPeriod;

    /**
     * 贷款期限单位
     */
    @TableField(value = "period_unit")
    private Integer periodUnit;

    /**
     * 抵押方式
     */
    @TableField(value = "mortgage_pattern")
    private String mortgagePattern;

    /**
     * 申请主题
     */
    @TableField(value = "apply_theme")
    private String applyTheme;

    /**
     * 申请说明
     */
    @TableField(value = "apply_detail")
    private String applyDetail;

    /**
     * 申请时间
     */
    @TableField(value = "apply_time")
    private Date applyTime;

    /**
     * 投保对象
     */
    @TableField(value = "insured_object")
    private String insuredObject;

    /**
     * 当前操作机构
     */
    @TableField(value = "oper_orgid")
    private Long operOrgid;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 审批说明
     */
    @TableField(value = "audit_detail")
    private String auditDetail;

    /**
     * 审批时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

    /**
     * 审批人
     */
    @TableField(value = "audit_user")
    private String auditUser;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}