package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 百业联盟管理用户
 *
 * @TableName cf_bm_alliance_user
 */
@TableName(value = "cf_bm_alliance_user")
@Data
public class CfBmAllianceUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "user_id")
    private Long userId;

    /**
     * 登录账号
     */
    @TableField(value = "login_name")
    private String loginName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 角色
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 删除标志位 0、否 1、是
     */
    @TableField(value = "is_delete")
    private String isDelete;

    /**
     * 用户状态 0、正常 1、禁用
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}