package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 字典表-行政区划码
 * @TableName area_code
 */
@TableName(value = "area_code")
@Data
public class AreaCode implements Serializable {
    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 省份简称
     */
    @TableField(value = "base")
    private String base;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区县
     */
    @TableField(value = "district")
    private String district;

    /**
     * 行政区划代码
     */
    @TableField(value = "area_code")
    private String areaCode;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 是否删除，1:删除，0:未删除
     */
    @TableField(value = "deleted")
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}