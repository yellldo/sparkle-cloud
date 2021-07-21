package com.sparkle.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName user_info
 */
@TableName(value = "user_info")
@Data
public class UserInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 等级从0开始递增V0
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 到期日期
     */
    @TableField(value = "expiry_time")
    private Date expiryTime;

    /**
     * 佣金类型
     */
    @TableField(value = "commission_type")
    private String commissionType;

    /**
     * 状态 0、待审核 1、审核通过 2、审核驳回
     */
    @TableField(value = "user_status")
    private String userStatus;

    /**
     * 最大资金
     */
    @TableField(value = "biggest_funds")
    private String biggestFunds;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
                && (this.getExpiryTime() == null ? other.getExpiryTime() == null : this.getExpiryTime().equals(other.getExpiryTime()))
                && (this.getCommissionType() == null ? other.getCommissionType() == null : this.getCommissionType().equals(other.getCommissionType()))
                && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
                && (this.getBiggestFunds() == null ? other.getBiggestFunds() == null : this.getBiggestFunds().equals(other.getBiggestFunds()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        result = prime * result + ((getCommissionType() == null) ? 0 : getCommissionType().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getBiggestFunds() == null) ? 0 : getBiggestFunds().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nickName=").append(nickName);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", level=").append(level);
        sb.append(", expiryTime=").append(expiryTime);
        sb.append(", commissionType=").append(commissionType);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", biggestFunds=").append(biggestFunds);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}