package com.sparkle.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 担保产品附表
 *
 * @TableName guarantee_area
 */
@TableName(value = "guarantee_area")
@Data
public class GuaranteeArea implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 产品ID
     */
    @TableField(value = "guarantee_id")
    private Long guaranteeId;

    /**
     * 所属地区码
     */
    @TableField(value = "own_area_code")
    private Integer ownAreaCode;

    /**
     * 精选标识
     */
    @TableField(value = "choi_flag")
    private String choiFlag;

    /**
     * 热门标识
     */
    @TableField(value = "favo_flag")
    private String favoFlag;

    /**
     * 精选排序
     */
    @TableField(value = "choi_order")
    private Integer choiOrder;

    /**
     * 热门排序
     */
    @TableField(value = "favo_order")
    private Integer favoOrder;

    /**
     * 发布状态
     */
    @TableField(value = "post_status")
    private String postStatus;

    /**
     * 层级
     */
    @TableField(value = "area_level")
    private Integer areaLevel;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private String updateUser;

    /**
     * 操作人ID
     */
    @TableField(value = "oper_user_id")
    private Long operUserId;

    /**
     * 所属机构ID
     */
    @TableField(value = "oper_org_id")
    private Long operOrgId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}