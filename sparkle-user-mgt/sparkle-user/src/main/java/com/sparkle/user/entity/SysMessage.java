package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 消息表
 *
 * @TableName sys_message
 */
@TableName(value = "sys_message")
@Data
public class SysMessage implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "message_id")
    private Long messageId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 标题
     */
    @TableField(value = "message_title")
    private String messageTitle;

    /**
     * 内容
     */
    @TableField(value = "message_content")
    private String messageContent;

    /**
     * 消息类型
     */
    @TableField(value = "message_type")
    private String messageType;

    /**
     * 状态 0、未读 1、已读
     */
    @TableField(value = "message_status")
    private String messageStatus;

    /**
     * 回复人id
     */
    @TableField(value = "reply_user_id")
    private Long replyUserId;

    /**
     * 目标id
     */
    @TableField(value = "target_id")
    private Long targetId;

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