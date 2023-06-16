package com.sparkle.bill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 银行卡信息
 *
 * @TableName cf_wp_user_bank
 */
@TableName(value = "cf_wp_user_bank")
@Data
public class CfWpUserBank implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "bank_id")
    private Long bankId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 卡号
     */
    @TableField(value = "bank_acc_no")
    private String bankAccNo;

    /**
     * 账户名称
     */
    @TableField(value = "bank_acc_name")
    private String bankAccName;

    /**
     * 银行分行名称
     */
    @TableField(value = "bank_branch_name")
    private String bankBranchName;

    /**
     * 银行开户行名称
     */
    @TableField(value = "bank_name")
    private String bankName;

    /**
     * 银行联行号
     */
    @TableField(value = "bank_branch_id")
    private String bankBranchId;

    /**
     * 银行卡状态 0、正常 1、冻结 2、解绑
     */
    @TableField(value = "bank_status")
    private String bankStatus;

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