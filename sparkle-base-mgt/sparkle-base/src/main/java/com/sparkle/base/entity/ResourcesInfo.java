package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 资源表
 *
 * @TableName resources_info
 */
@TableName(value = "resources_info")
@Data
public class ResourcesInfo implements Serializable {
    /**
     * 资源ID
     */
    @TableId(value = "res_id")
    private Long resId;

    /**
     * icon
     */
    @TableField(value = "res_icon")
    private String resIcon;

    /**
     * 路径
     */
    @TableField(value = "res_url")
    private String resUrl;

    /**
     * 资源名称
     */
    @TableField(value = "res_title")
    private String resTitle;

    /**
     * 名称
     */
    @TableField(value = "res_name")
    private String resName;

    /**
     * 组件
     */
    @TableField(value = "res_component")
    private String resComponent;

    /**
     * 是否隐藏
     */
    @TableField(value = "res_hidden")
    private Integer resHidden;

    /**
     * 菜单级别
     */
    @TableField(value = "res_level")
    private Integer resLevel;

    /**
     * 是否展示父级
     */
    @TableField(value = "res_show")
    private Integer resShow;

    /**
     * 默认路由选中
     */
    @TableField(value = "res_active")
    private String resActive;

    /**
     * 父资源ID
     */
    @TableField(value = "parent_id")
    private Long parentId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}