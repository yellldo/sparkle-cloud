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
 * 商家费率
 *
 * @TableName cf_bm_merchant_fee
 */
@TableName(value = "cf_bm_merchant_fee")
@Data
public class CfBmMerchantFee implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "fee_id")
    private Long feeId;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 费率类型 0、梯度 1、定额
     */
    @TableField(value = "fee_type")
    private String feeType;

    /**
     * 最小值
     */
    @TableField(value = "min_value")
    private BigDecimal minValue;

    /**
     * 最大值
     */
    @TableField(value = "max_value")
    private BigDecimal maxValue;

    /**
     * 优惠值
     */
    @TableField(value = "discount_value")
    private String discountValue;

    /**
     * 单位 0、元 1、百分比
     */
    @TableField(value = "discount_unit")
    private String discountUnit;

    /**
     * 删除标志位 0、否1、是
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