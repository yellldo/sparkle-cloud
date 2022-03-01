package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 数据字典表
 *
 * @TableName sys_dict_info
 */
@TableName(value = "sys_dict_info")
@Data
public class SysDictInfo implements Serializable {
    /**
     * 类型KEY
     */
    @TableField(value = "type_key")
    private String typeKey;

    /**
     * 关键字KEY
     */
    @TableField(value = "kw_key")
    private String kwKey;

    /**
     * 类型名称
     */
    @TableField(value = "type_name")
    private String typeName;

    /**
     * 关键字VALUE
     */
    @TableField(value = "kw_value")
    private String kwValue;

    /**
     * 状态
     */
    @TableField(value = "cur_status")
    private String curStatus;

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