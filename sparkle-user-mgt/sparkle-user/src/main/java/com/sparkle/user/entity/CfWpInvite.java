package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 邀请表
 *
 * @TableName cf_wp_invite
 */
@TableName(value = "cf_wp_invite")
@Data
public class CfWpInvite implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "invite_id")
    private Long inviteId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 邀请人手机号
     */
    @TableField(value = "account_number")
    private String accountNumber;

    /**
     * 人员身份 0、普通会员 1、合作商铺
     */
    @TableField(value = "flag")
    private String flag;

    /**
     * 删除标志位0、未删除 1、未删除
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