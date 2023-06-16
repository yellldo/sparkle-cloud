package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户收藏表
 *
 * @TableName cf_wp_user_collect
 */
@TableName(value = "cf_wp_user_collect")
@Data
public class CfWpUserCollect implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "collect_id")
    private Long collectId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 类型
     */
    @TableField(value = "collect_type")
    private String collectType;

    /**
     * 收藏的信息id
     */
    @TableField(value = "target_id")
    private Long targetId;

    /**
     * 删除标志位 0、未删除 1、已删除
     */
    @TableField(value = "is_delete")
    private String isDelete;

    /**
     *
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