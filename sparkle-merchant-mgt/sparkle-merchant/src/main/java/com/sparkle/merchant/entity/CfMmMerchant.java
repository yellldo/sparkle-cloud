package com.sparkle.merchant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 百业联盟商户
 *
 * @TableName cf_mm_merchant
 */
@TableName(value = "cf_mm_merchant")
@Data
public class CfMmMerchant implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "merchant_id")
    private Long merchantId;

    /**
     * 商户名称
     */
    @TableField(value = "merchant_name")
    private String merchantName;

    /**
     * 商户手机号 作为登录账号
     */
    @TableField(value = "merchant_phone")
    private String merchantPhone;

    /**
     * 社会统一信用代码
     */
    @TableField(value = "credit_code")
    private String creditCode;

    /**
     * 公司地址
     */
    @TableField(value = "merchant_address")
    private String merchantAddress;

    /**
     * 商户状态0、待审核、1、审核通过
     */
    @TableField(value = "merchant_status")
    private String merchantStatus;

    /**
     * 营业执照地址
     */
    @TableField(value = "license_address")
    private String licenseAddress;

    /**
     * 商户类型
     */
    @TableField(value = "merchant_type")
    private String merchantType;

    /**
     * 营业执照期限
     */
    @TableField(value = "license_start")
    private Date licenseStart;

    /**
     * 营业执照期限
     */
    @TableField(value = "license_deadline_type")
    private String licenseDeadlineType;

    /**
     * 营业执照url
     */
    @TableField(value = "license_url")
    private String licenseUrl;

    /**
     * 审核备注
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}