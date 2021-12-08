package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 地区表
 * @TableName area_info
 */
@TableName(value = "area_info")
@Data
public class AreaInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 地区码
     */
    @TableField(value = "area_code")
    private Integer areaCode;

    /**
     * 地区名称
     */
    @TableField(value = "area_name")
    private String areaName;

    /**
     * 级别
     */
    @TableField(value = "area_level")
    private String areaLevel;

    /**
     * 上级id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 状态
     */
    @TableField(value = "cur_status")
    private String curStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}