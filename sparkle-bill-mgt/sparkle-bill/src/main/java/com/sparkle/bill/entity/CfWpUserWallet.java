package com.sparkle.bill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 钱包表
 *
 * @TableName cf_wp_user_wallet
 */
@TableName(value = "cf_wp_user_wallet")
@Data
public class CfWpUserWallet implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "wallet_id")
    private Long walletId;

    /**
     * 定向金额 来源于[商城门票保险]等返现
     */
    @TableField(value = "direction_amount")
    private BigDecimal directionAmount;

    /**
     * userid
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 通用金额 来源于[微信支付宝银行卡]充值
     */
    @TableField(value = "common_amount")
    private BigDecimal commonAmount;

    /**
     * 定向可用金额
     */
    @TableField(value = "direction_available_amount")
    private BigDecimal directionAvailableAmount;

    /**
     * 通用可用金额
     */
    @TableField(value = "common_available_amount")
    private BigDecimal commonAvailableAmount;

    /**
     * 累计省钱
     */
    @TableField(value = "total_save_amount")
    private BigDecimal totalSaveAmount;

    /**
     * 冻结金额
     */
    @TableField(value = "freeze_amount")
    private BigDecimal freezeAmount;

    /**
     * 创建人
     */
    @TableField(value = "created_user")
    private String createdUser;

    /**
     * 逻辑删除标识 0有效 1无效
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