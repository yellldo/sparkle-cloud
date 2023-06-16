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
 * 后台用户账户交易流水表
 *
 * @TableName cf_wp_user_account_bill
 */
@TableName(value = "cf_wp_user_account_bill")
@Data
public class CfWpUserAccountBill implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "bill_id")
    private Long billId;

    /**
     * 用户名
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 变动类型(0消费 1充值 2提现 3分红 4返现)
     */
    @TableField(value = "change_type")
    private String changeType;

    /**
     * 变动方式(0微信 1支付宝 2银联 3银行卡 4钱包通用余额 5钱包定向余额)
     */
    @TableField(value = "change_way")
    private String changeWay;

    /**
     * 订单流水号
     */
    @TableField(value = "order_no")
    private Long orderNo;

    /**
     * 消费商家
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 消费流水号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 交易状态0、初始 1、交易中、2、成功 3、失败
     */
    @TableField(value = "trans_status")
    private String transStatus;

    /**
     * 交易成功时间
     */
    @TableField(value = "trans_success_time")
    private Date transSuccessTime;

    /**
     * 是否退款 0否 1是
     */
    @TableField(value = "refund_flag")
    private String refundFlag;

    /**
     * 支出类型
     */
    @TableField(value = "expend_type")
    private String expendType;

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