package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商户用户表
 *
 * @TableName cf_mm_merchant_user
 */
@TableName(value = "cf_mm_merchant_user")
@Data
public class CfMmMerchantUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "merchant_user_id")
    private Long merchantUserId;

    /**
     * 账号
     */
    @TableField(value = "account_number")
    private String accountNumber;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 是否顶级用户
     */
    @TableField(value = "is_master")
    private String isMaster;

    /**
     * 用户状态0、启用 1、禁用
     */
    @TableField(value = "user_status")
    private String userStatus;

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