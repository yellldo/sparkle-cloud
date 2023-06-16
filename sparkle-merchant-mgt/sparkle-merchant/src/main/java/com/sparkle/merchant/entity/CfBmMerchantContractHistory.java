package com.sparkle.merchant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商家合同记录
 *
 * @TableName cf_bm_merchant_contract_history
 */
@TableName(value = "cf_bm_merchant_contract_history")
@Data
public class CfBmMerchantContractHistory implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "history_id")
    private Long historyId;

    /**
     * 商家id
     */
    @TableField(value = "merchant_id")
    private Long merchantId;

    /**
     * 文件路径
     */
    @TableField(value = "file_url")
    private String fileUrl;

    /**
     * 状态 0、正常 1、过期
     */
    @TableField(value = "history_status")
    private String historyStatus;

    /**
     * 删除标志位 0、否1、是
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