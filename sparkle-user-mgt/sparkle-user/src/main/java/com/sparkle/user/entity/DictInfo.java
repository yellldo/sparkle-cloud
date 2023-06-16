package com.sparkle.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 字典表
 *
 * @TableName dict_info
 */
@TableName(value = "dict_info")
@Data
public class DictInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "dict_id")
    private Long dictId;

    /**
     * 父级id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 类型
     */
    @TableField(value = "dict_type")
    private String dictType;

    /**
     * 字典key
     */
    @TableField(value = "dict_key")
    private String dictKey;

    /**
     * 字典值
     */
    @TableField(value = "dict_value")
    private String dictValue;

    /**
     * 状态 0、正常 1、禁用
     */
    @TableField(value = "dict_status")
    private String dictStatus;

    /**
     * 备注
     */
    @TableField(value = "dict_remark")
    private String dictRemark;

    /**
     * 删除标志位0、未删除1、已删除
     */
    @TableField(value = "is_delete")
    private String isDelete;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}