package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台静态资源表
 *
 * @TableName plat_static_res
 */
@TableName(value = "plat_static_res")
@Data
public class PlatStaticRes implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 类型
     */
    @TableField(value = "res_type")
    private String resType;

    /**
     * 详情
     */
    @TableField(value = "detail")
    private String detail;

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

    /**
     * 所属省码
     */
    @TableField(value = "pro_id")
    private Long proId;

    /**
     * 所属市码
     */
    @TableField(value = "city_id")
    private Long cityId;

    /**
     * 所属县码
     */
    @TableField(value = "county_id")
    private Long countyId;

    /**
     * 等级
     */
    @TableField(value = "plat_level")
    private Integer platLevel;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}