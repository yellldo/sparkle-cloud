package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户表
 *
 * @TableName cf_wp_user
 */
@TableName(value = "cf_wp_user")
@Data
public class CfWpUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "user_id")
    private Long userId;

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
     * 性别 0、男 1、女
     */
    @TableField(value = "user_gender")
    private String userGender;

    /**
     * 个性签名
     */
    @TableField(value = "user_signature")
    private String userSignature;

    /**
     * 车队编号
     */
    @TableField(value = "cade_id")
    private Long cadeId;

    /**
     * 来源
     */
    @TableField(value = "source_code")
    private String sourceCode;

    /**
     * 邀请码
     */
    @TableField(value = "invite_code")
    private String inviteCode;

    /**
     * 邀请码
     */
    @TableField(value = "invited_code")
    private String invitedCode;

    /**
     * 角色
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 注册渠道
     */
    @TableField(value = "register_channel")
    private String registerChannel;

    /**
     * 状态 0、正常 1、禁用
     */
    @TableField(value = "user_status")
    private String userStatus;

    /**
     * 是否付费会员
     */
    @TableField(value = "is_vip")
    private String isVip;

    /**
     * 邀请人数
     */
    @TableField(value = "invite_count")
    private Integer inviteCount;

    /**
     * 钱包id
     */
    @TableField(value = "wallet_id")
    private Long walletId;

    /**
     * 用户头像
     */
    @TableField(value = "user_icon")
    private String userIcon;

    /**
     * 常用设备
     */
    @TableField(value = "common_equipment")
    private String commonEquipment;

    /**
     * 交易密码
     */
    @TableField(value = "payment_password")
    private String paymentPassword;

    /**
     * 用户类型 0、web用户 1、商户
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 删除标志位 0、未删除 1、已删除
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