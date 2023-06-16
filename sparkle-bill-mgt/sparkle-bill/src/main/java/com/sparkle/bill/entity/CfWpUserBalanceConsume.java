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
 * 后台用户账户余额消费流水表
 *
 * @TableName cf_wp_user_balance_consume
 */
@TableName(value = "cf_wp_user_balance_consume")
@Data
public class CfWpUserBalanceConsume implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "consumer_id")
    private Long consumerId;

    /**
     * 用户名
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 消费商家
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 消费金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 退款金额
     */
    @TableField(value = "refund_amount")
    private BigDecimal refundAmount;

    /**
     * 账户剩余金额
     */
    @TableField(value = "user_balance")
    private String userBalance;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 消费流水号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 是否退款 0否 1是
     */
    @TableField(value = "refund_flag")
    private String refundFlag;

    /**
     * 支出类型 线下消费、美食等
     */
    @TableField(value = "expend_type")
    private String expendType;

    /**
     * 消费类型0、通用余额1、定向余额
     */
    @TableField(value = "consumer_type")
    private String consumerType;

    /**
     * 消费状态 0、待支付 1、交易中 2、成功 3、交易关闭
     */
    @TableField(value = "consumer_status")
    private String consumerStatus;

    /**
     * 交易成功时间
     */
    @TableField(value = "trans_success_time")
    private Date transSuccessTime;

    /**
     * 交易关闭时间
     */
    @TableField(value = "trans_close_time")
    private Date transCloseTime;

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