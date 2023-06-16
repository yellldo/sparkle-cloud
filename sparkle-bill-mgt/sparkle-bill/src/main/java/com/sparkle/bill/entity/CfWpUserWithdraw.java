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
 * 后台用户账户提现流水表
 *
 * @TableName cf_wp_user_withdraw
 */
@TableName(value = "cf_wp_user_withdraw")
@Data
public class CfWpUserWithdraw implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "withdraw_id")
    private Long withdrawId;

    /**
     * 用户名
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 提现金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 提现方式(0微信 1支付宝 2银联 3银行卡)
     */
    @TableField(value = "withdraw_way")
    private String withdrawWay;

    /**
     * 提现账户
     */
    @TableField(value = "withdraw_account")
    private String withdrawAccount;

    /**
     * 消费流水号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 交易状态 0、初始 1、成功 2、失败
     */
    @TableField(value = "withdraw_status")
    private String withdrawStatus;

    /**
     * 交易成功时间
     */
    @TableField(value = "trans_success_time")
    private Date transSuccessTime;

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
     * 逻辑删除标识 0有效 1无效
     */
    @TableField(value = "is_delete")
    private String isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}