package com.sparkle.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 买入信息
 *
 * @TableName trade_buy_info
 */
@TableName(value = "trade_buy_info")
@Data
public class TradeBuyInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 交易id
     */
    @TableField(value = "trade_id")
    private Long tradeId;

    /**
     * 交易类型 0、ALL 1、CALL 2、PUT
     */
    @TableField(value = "buy_type")
    private String buyType;

    /**
     * 消息类别 0、All 1、Normal 2、Lotto 3、Rollup
     */
    @TableField(value = "message_type")
    private String messageType;

    /**
     * 价格下限
     */
    @TableField(value = "perice_floor")
    private BigDecimal periceFloor;

    /**
     * 价格上限
     */
    @TableField(value = "price_ceiling")
    private BigDecimal priceCeiling;

    /**
     * 最大购买金额
     */
    @TableField(value = "maximum_amount")
    private BigDecimal maximumAmount;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     *
     */
    @TableField(value = "del_time")
    private Date delTime;

    /**
     * 删除标识 0、未删除 1、已删除
     */
    @TableField(value = "del_flag")
    private String delFlag;

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
        TradeBuyInfo other = (TradeBuyInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
                && (this.getBuyType() == null ? other.getBuyType() == null : this.getBuyType().equals(other.getBuyType()))
                && (this.getMessageType() == null ? other.getMessageType() == null : this.getMessageType().equals(other.getMessageType()))
                && (this.getPericeFloor() == null ? other.getPericeFloor() == null : this.getPericeFloor().equals(other.getPericeFloor()))
                && (this.getPriceCeiling() == null ? other.getPriceCeiling() == null : this.getPriceCeiling().equals(other.getPriceCeiling()))
                && (this.getMaximumAmount() == null ? other.getMaximumAmount() == null : this.getMaximumAmount().equals(other.getMaximumAmount()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getDelTime() == null ? other.getDelTime() == null : this.getDelTime().equals(other.getDelTime()))
                && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getBuyType() == null) ? 0 : getBuyType().hashCode());
        result = prime * result + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        result = prime * result + ((getPericeFloor() == null) ? 0 : getPericeFloor().hashCode());
        result = prime * result + ((getPriceCeiling() == null) ? 0 : getPriceCeiling().hashCode());
        result = prime * result + ((getMaximumAmount() == null) ? 0 : getMaximumAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDelTime() == null) ? 0 : getDelTime().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", buyType=").append(buyType);
        sb.append(", messageType=").append(messageType);
        sb.append(", periceFloor=").append(periceFloor);
        sb.append(", priceCeiling=").append(priceCeiling);
        sb.append(", maximumAmount=").append(maximumAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", delTime=").append(delTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}