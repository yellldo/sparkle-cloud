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
 * 商家商品表
 *
 * @TableName cf_mm_merchant_product
 */
@TableName(value = "cf_mm_merchant_product")
@Data
public class CfMmMerchantProduct implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "product_id")
    private Long productId;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 商品图片
     */
    @TableField(value = "product_img")
    private String productImg;

    /**
     * 商品类型
     */
    @TableField(value = "product_type")
    private String productType;

    /**
     * 商品库存
     */
    @TableField(value = "product_stock")
    private Integer productStock;

    /**
     * 商品描述
     */
    @TableField(value = "product_desc")
    private String productDesc;

    /**
     * 商品状态0、启用 1、禁用
     */
    @TableField(value = "product_status")
    private String productStatus;

    /**
     * 商品价格
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 折扣
     */
    @TableField(value = "discount")
    private String discount;

    /**
     * 商品品牌
     */
    @TableField(value = "product_brand")
    private String productBrand;

    /**
     * 售出数量
     */
    @TableField(value = "sale_count")
    private Integer saleCount;

    /**
     * 商品型号
     */
    @TableField(value = "product_model")
    private String productModel;

    /**
     * 是否爆款商品 0、否 1、是
     */
    @TableField(value = "is_hot")
    private String isHot;

    /**
     * 上架时间
     */
    @TableField(value = "rack_time")
    private Date rackTime;

    /**
     * 上架状态 0、下架 1、上架
     */
    @TableField(value = "rack_status")
    private String rackStatus;

    /**
     * 配送方式
     */
    @TableField(value = "send_type")
    private String sendType;

    /**
     * 审核状态 0、未审核 1、审核通过 2、审核拒绝
     */
    @TableField(value = "audit_status")
    private String auditStatus;

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
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 删除标志位 0、未删除 1、已删除
     */
    @TableField(value = "is_delete")
    private String isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}