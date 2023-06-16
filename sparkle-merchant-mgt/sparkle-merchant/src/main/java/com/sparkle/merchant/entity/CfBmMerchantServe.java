package com.sparkle.merchant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 商家服务
 *
 * @TableName cf_bm_merchant_serve
 */
@TableName(value = "cf_bm_merchant_serve")
@Data
public class CfBmMerchantServe implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "service_id")
    private Long serviceId;

    /**
     * 商家id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 服务名称
     */
    @TableField(value = "service_name")
    private String serviceName;

    /**
     * 服务描述
     */
    @TableField(value = "service_desc")
    private String serviceDesc;

    /**
     * 服务价格
     */
    @TableField(value = "service_amount")
    private BigDecimal serviceAmount;

    /**
     * 服务状态 0、待审核 1、审核通过 2、审核拒绝
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 审核备注
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    /**
     * 上架状态0、否1、是
     */
    @TableField(value = "rack_status")
    private String rackStatus;

    /**
     * 上架时间
     */
    @TableField(value = "rack_time")
    private Date rackTime;

    /**
     * 删除标志位0、否1、是
     */
    @TableField(value = "is_delete")
    private String isDelete;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}