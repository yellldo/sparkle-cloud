package com.sparkle.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 直接融资产品表
 * @TableName direct_finance
 */
@TableName(value = "direct_finance")
@Data
public class DirectFinance implements Serializable {
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 产品名称
     */
    @TableField(value = "df_name")
    private String dfName;

    /**
     * 机构id
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 类型 0、股权融资 1、股权挂牌 2、可转换债券
     */
    @TableField(value = "df_type")
    private String dfType;

    /**
     * 行业范围
     */
    @TableField(value = "df_range")
    private String dfRange;

    /**
     * 概要
     */
    @TableField(value = "df_summary")
    private String dfSummary;

    /**
     * 产品介绍
     */
    @TableField(value = "df_introduce")
    private String dfIntroduce;

    /**
     * 审核状态 0、 待审核 1、审核通过 2、审核驳回 3、编辑
     */
    @TableField(value = "df_audit_status")
    private String dfAuditStatus;

    /**
     * 上线状态 0、未发布 1、已上线 2、已下线
     */
    @TableField(value = "df_pub_status")
    private String dfPubStatus;

    /**
     * 上线时间
     */
    @TableField(value = "df_pub_time")
    private Date dfPubTime;

    /**
     * 审核备注
     */
    @TableField(value = "df_audit_remark")
    private String dfAuditRemark;

    /**
     * 删除状态 0、未删除 1、已删除
     */
    @TableField(value = "del_status")
    private String delStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 图片地址
     */
    @TableField(value = "image_url")
    private String imageUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}