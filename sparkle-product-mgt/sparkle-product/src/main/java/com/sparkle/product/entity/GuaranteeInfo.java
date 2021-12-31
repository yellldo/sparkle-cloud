package com.sparkle.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 担保产品表
 *
 * @TableName guarantee_info
 */
@TableName(value = "guarantee_info")
@Data
public class GuaranteeInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 担保产品名称
     */
    @TableField(value = "guarantee_name")
    private String guaranteeName;

    /**
     * 担保产品图片地址
     */
    @TableField(value = "guarantee_pic_url")
    private String guaranteePicUrl;

    /**
     * 担保类型
     */
    @TableField(value = "guarantee_type")
    private String guaranteeType;

    /**
     * 担保金额
     */
    @TableField(value = "guarantee_amount")
    private BigDecimal guaranteeAmount;

    /**
     * 担保金额单位
     */
    @TableField(value = "amount_unit")
    private String amountUnit;

    /**
     * 担保期限月数
     */
    @TableField(value = "guarantee_term_mounth")
    private Integer guaranteeTermMounth;

    /**
     * 担保期限
     */
    @TableField(value = "guarantee_term")
    private Integer guaranteeTerm;

    /**
     * 担保期限单位
     */
    @TableField(value = "term_unit")
    private String termUnit;

    /**
     * 担保公司id
     */
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 担保产品描述
     */
    @TableField(value = "guarantee_remark")
    private String guaranteeRemark;

    /**
     * 数据状态，0已删除，1正常
     */
    @TableField(value = "cur_status")
    private String curStatus;

    /**
     * 发布状态
     */
    @TableField(value = "post_status")
    private String postStatus;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 排序
     */
    @TableField(value = "view_order")
    private Integer viewOrder;

    /**
     * 发布时间
     */
    @TableField(value = "publish_time")
    private Date publishTime;

    /**
     * 审核时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

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
     * 所属机构id
     */
    @TableField(value = "oper_org_id")
    private Long operOrgId;

    /**
     * 机构id
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 角色id
     */
    @TableField(value = "oper_role_id")
    private Long operRoleId;

    /**
     * 审核描述
     */
    @TableField(value = "audit_remark")
    private String auditRemark;

    /**
     * 审批人
     */
    @TableField(value = "audit_by")
    private String auditBy;

    /**
     * 服务范围
     */
    @TableField(value = "server_addr")
    private String serverAddr;

    /**
     * 服务范围地区码
     */
    @TableField(value = "own_area")
    private String ownArea;

    /**
     * 权重
     */
    @TableField(value = "weight")
    private Integer weight;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}