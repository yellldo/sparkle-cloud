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
 * 百业联盟商户
 *
 * @TableName cf_bm_merchant
 */
@TableName(value = "cf_bm_merchant")
@Data
public class CfBmMerchant implements Serializable {
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
     * 商户标签
     */
    @TableField(value = "merchant_tag")
    private String merchantTag;

    /**
     * 商户图片
     */
    @TableField(value = "merchant_icon")
    private String merchantIcon;

    /**
     * 收藏数量
     */
    @TableField(value = "collect_count")
    private Integer collectCount;

    /**
     * 评论数量
     */
    @TableField(value = "evaluate_count")
    private Integer evaluateCount;

    /**
     * 星级
     */
    @TableField(value = "score")
    private String score;

    /**
     * 商户地址
     */
    @TableField(value = "merchant_address")
    private String merchantAddress;

    /**
     * 商家联系电话
     */
    @TableField(value = "merchant_phone")
    private String merchantPhone;

    /**
     * 精度
     */
    @TableField(value = "lng")
    private Double lng;

    /**
     * 纬度
     */
    @TableField(value = "lat")
    private Double lat;

    /**
     * 商户描述
     */
    @TableField(value = "merchant_desc")
    private String merchantDesc;

    /**
     * 折扣
     */
    @TableField(value = "merchant_discount")
    private BigDecimal merchantDiscount;

    /**
     * 状态0、启用 1、冻结
     */
    @TableField(value = "merchant_status")
    private String merchantStatus;

    /**
     * 审核原因
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    /**
     * 排序
     */
    @TableField(value = "sorting")
    private Integer sorting;

    /**
     * 删除标志位0、未删除 1、已删除
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