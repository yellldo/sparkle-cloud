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
 * @TableName apply_dtl
 */
@TableName(value = "apply_dtl")
@Data
public class ApplyDtl implements Serializable {
    /**
     * ID
     */
    @TableId(value = "dtl_id")
    private Long dtlId;

    /**
     * 融资申请ID
     */
    @TableField(value = "apply_id")
    private Long applyId;

    /**
     * 银行代码
     */
    @TableField(value = "bank_code")
    private Integer bankCode;

    /**
     * 银行名称
     */
    @TableField(value = "bank_name")
    private String bankName;

    /**
     * 机构CODE
     */
    @TableField(value = "org_id")
    private Long orgId;

    /**
     * 申请时间
     */
    @TableField(value = "apply_time")
    private Date applyTime;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 审批说明
     */
    @TableField(value = "audit_detail")
    private String auditDetail;

    /**
     * 审批时间
     */
    @TableField(value = "audit_time")
    private Date auditTime;

    /**
     * 审批人
     */
    @TableField(value = "audit_user")
    private String auditUser;

    /**
     * 审批人姓名
     */
    @TableField(value = "audit_user_name")
    private String auditUserName;

    /**
     * 放款时间
     */
    @TableField(value = "credit_time")
    private Date creditTime;

    /**
     * 放款额度
     */
    @TableField(value = "credit_amt")
    private BigDecimal creditAmt;

    /**
     * 放款利率
     */
    @TableField(value = "credit_rate")
    private BigDecimal creditRate;

    /**
     * 放款周期单位
     */
    @TableField(value = "credit_peri_unit")
    private Integer creditPeriUnit;

    /**
     * 放款周期
     */
    @TableField(value = "credit_peri")
    private Integer creditPeri;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}