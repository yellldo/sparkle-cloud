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
 * 后台用户账户付款消费流水表
 *
 * @TableName cf_wp_user_payment_consume
 */
@TableName(value = "cf_wp_user_payment_consume")
@Data
public class CfWpUserPaymentConsume implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "payment_id")
    private Long paymentId;

    /**
     * 用户名
     */
    @TableField(value = "user_id")
    private Long userId;

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
     * 消费方式(0微信 1支付宝 2银联 3银行卡)
     */
    @TableField(value = "consume_way")
    private String consumeWay;

    /**
     * 消费流水号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 消费商家
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 是否退款 0否 1是
     */
    @TableField(value = "refund_flag")
    private String refundFlag;

    /**
     * 支出类型 线下消费、美食
     */
    @TableField(value = "expend_type")
    private String expendType;

    /**
     * 交易状态0、待支付 1、交易中 2、成功 3、交易关闭
     */
    @TableField(value = "payment_status")
    private String paymentStatus;

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