package com.sparkle.merchant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商家评论表
 *
 * @TableName cf_bm_merchant_evaluate
 */
@TableName(value = "cf_bm_merchant_evaluate")
@Data
public class CfBmMerchantEvaluate implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "evaluate_id")
    private Long evaluateId;

    /**
     * 根id
     */
    @TableField(value = "root")
    private Long root;

    /**
     * 父级id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 回复的用户id
     */
    @TableField(value = "reply_user_id")
    private Long replyUserId;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 评价
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 商家id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 是否主评论 0、是 1、否
     */
    @TableField(value = "is_master")
    private String isMaster;

    /**
     * 删除标志位0、未删除 1、已删除
     */
    @TableField(value = "id_delete")
    private String idDelete;

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