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
 * 后台用户账户充值流水表
 *
 * @TableName cf_wp_user_recharge
 */
@TableName(value = "cf_wp_user_recharge")
@Data
public class CfWpUserRecharge implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "recharge_id")
    private Long rechargeId;

    /**
     * 用户名
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 充值金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 充值方式(0微信 1支付宝 2银联 3银行卡)
     */
    @TableField(value = "recharge_way")
    private String rechargeWay;

    /**
     * 订单流水号
     */
    @TableField(value = "order_no")
    private String orderNo;

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
     * 交易状态0、待支付 1、支付中2、成功 3、交易关闭
     */
    @TableField(value = "recharge_status")
    private String rechargeStatus;

    /**
     * 付款渠道编号
     */
    @TableField(value = "channel_code")
    private String channelCode;

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