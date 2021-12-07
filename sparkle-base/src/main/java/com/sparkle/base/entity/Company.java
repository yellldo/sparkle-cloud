package com.sparkle.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 公司-公司背景-基本信息
 *
 * @TableName company
 */
@TableName(value = "company")
@Data
public class Company implements Serializable {
    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 公司标识
     */
    @TableField(value = "cid")
    private Long cid;

    /**
     * 归属省份的首字母小写
     */
    @TableField(value = "base")
    private String base;

    /**
     * 公司名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 英文名
     */
    @TableField(value = "name_en")
    private String nameEn;

    /**
     * 公司别名
     */
    @TableField(value = "name_alias")
    private String nameAlias;

    /**
     * 公司历史名称
     */
    @TableField(value = "history_names")
    private String historyNames;

    /**
     * 法人ID：人标识或公司标识
     */
    @TableField(value = "legal_entity_id")
    private Long legalEntityId;

    /**
     * 法人类型，1 人 2 公司
     */
    @TableField(value = "legal_entity_type")
    private Integer legalEntityType;

    /**
     * 注册号
     */
    @TableField(value = "reg_number")
    private String regNumber;

    /**
     * 公司类型
     */
    @TableField(value = "company_org_type")
    private String companyOrgType;

    /**
     * 注册地址
     */
    @TableField(value = "reg_location")
    private String regLocation;

    /**
     * 成立日期
     */
    @TableField(value = "estiblish_time")
    private Date estiblishTime;

    /**
     * 营业期限开始日期
     */
    @TableField(value = "from_time")
    private Date fromTime;

    /**
     * 营业期限终止日期
     */
    @TableField(value = "to_time")
    private Date toTime;

    /**
     * 经营范围
     */
    @TableField(value = "business_scope")
    private String businessScope;

    /**
     * 登记机关
     */
    @TableField(value = "reg_institute")
    private String regInstitute;

    /**
     * 核准日期
     */
    @TableField(value = "approved_time")
    private Date approvedTime;

    /**
     * 企业状态
     */
    @TableField(value = "reg_status")
    private String regStatus;

    /**
     * 注册资本
     */
    @TableField(value = "reg_capital")
    private String regCapital;

    /**
     * 组织机构代码
     */
    @TableField(value = "org_number")
    private String orgNumber;

    /**
     * 组织机构批准单位
     */
    @TableField(value = "org_approved_institute")
    private String orgApprovedInstitute;

    /**
     * 如果该条记录为历史名称，则该字段值对应最新名称那条记录的id
     */
    @TableField(value = "current_cid")
    private Long currentCid;

    /**
     * 上级机构ID
     */
    @TableField(value = "parent_cid")
    private Long parentCid;

    /**
     * 机构类型-1:公司,2:香港企业,3:社会组织,4:律所,5:事业单位,6:基金会,8:台湾企业
     */
    @TableField(value = "company_type")
    private Integer companyType;

    /**
     * 统一社会信用代码
     */
    @TableField(value = "credit_code")
    private String creditCode;

    /**
     * 公司评分
     */
    @TableField(value = "score")
    private String score;

    /**
     * 行业分类
     */
    @TableField(value = "category_code")
    private String categoryCode;

    /**
     * 公司纬度
     */
    @TableField(value = "lat")
    private BigDecimal lat;

    /**
     * 公司经度
     */
    @TableField(value = "lng")
    private BigDecimal lng;

    /**
     * 行政区划码
     */
    @TableField(value = "area_code")
    private Integer areaCode;

    /**
     * 注册资本金额，数值类型
     */
    @TableField(value = "reg_capital_amount")
    private Long regCapitalAmount;

    /**
     * 注册资本币种  人民币 美元 欧元 等
     */
    @TableField(value = "reg_capital_currency")
    private String regCapitalCurrency;

    /**
     * 实收资本金额（单位：分）
     */
    @TableField(value = "actual_capital_amount")
    private Long actualCapitalAmount;

    /**
     * 实收资本币种 人民币 美元 欧元等
     */
    @TableField(value = "actual_capital_currency")
    private String actualCapitalCurrency;

    /**
     * 公司注册状态标准化
     */
    @TableField(value = "reg_status_std")
    private String regStatusStd;

    /**
     * 职工参保人数
     */
    @TableField(value = "social_security_staff_num")
    private Integer socialSecurityStaffNum;

    /**
     * 注销日期
     */
    @TableField(value = "cancel_date")
    private Date cancelDate;

    /**
     * 注销原因
     */
    @TableField(value = "cancel_reason")
    private String cancelReason;

    /**
     * 吊销日期
     */
    @TableField(value = "revoke_date")
    private Date revokeDate;

    /**
     * 吊销原因/吊销凭证
     */
    @TableField(value = "revoke_reason")
    private String revokeReason;

    /**
     * 邮箱列表
     */
    @TableField(value = "emails")
    private String emails;

    /**
     * 电话
     */
    @TableField(value = "phones")
    private String phones;

    /**
     * 微信公众号
     */
    @TableField(value = "wechat_public_num")
    private String wechatPublicNum;

    /**
     * 公司logo
     */
    @TableField(value = "logo")
    private String logo;

    /**
     * 解析完成时间
     */
    @TableField(value = "crawled_time")
    private Date crawledTime;

    /**
     *
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     *
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     *
     */
    @TableField(value = "deleted")
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}