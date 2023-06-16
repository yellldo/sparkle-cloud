package com.sparkle.merchant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商户轮播图
 *
 * @TableName cf_mm_merchant_pic
 */
@TableName(value = "cf_mm_merchant_pic")
@Data
public class CfMmMerchantPic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "pic_id")
    private Long picId;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 图片路径
     */
    @TableField(value = "pic_url")
    private String picUrl;

    /**
     * 图片名称
     */
    @TableField(value = "pic_name")
    private String picName;

    /**
     * 状态 0、启用 1、禁用
     */
    @TableField(value = "status")
    private String status;

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
     * 删除标志位0、未删除 1、已删除
     */
    @TableField(value = "is_delete")
    private String isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}