package com.sparkle.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 卖出信息表
 *
 * @TableName trade_sell_info
 */
@TableName(value = "trade_sell_info")
@Data
public class TradeSellInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 订单编号
     */
    @TableField(value = "trade_id")
    private Long tradeId;

    /**
     * 卖出比例
     */
    @TableField(value = "sell_ratio")
    private String sellRatio;

    /**
     * 主动止盈涨幅
     */
    @TableField(value = "check_surplus_gains")
    private String checkSurplusGains;

    /**
     * 主动止损跌幅
     */
    @TableField(value = "stop_losses")
    private String stopLosses;

    /**
     * 跟随卖出 0、否 1、是
     */
    @TableField(value = "follow_cell")
    private String followCell;

    /**
     * 折价上限
     */
    @TableField(value = "budget_limit")
    private String budgetLimit;

    /**
     * 下单模式 0、默认模式 1、以最高溢价直接下限价单 2、以市价单直接下单
     */
    @TableField(value = "order_model")
    private String orderModel;

    /**
     * 删除标识 0、未删除 1、已删除
     */
    @TableField(value = "del_flag")
    private String delFlag;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 删除时间
     */
    @TableField(value = "del_time")
    private Date delTime;

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
        TradeSellInfo other = (TradeSellInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
                && (this.getSellRatio() == null ? other.getSellRatio() == null : this.getSellRatio().equals(other.getSellRatio()))
                && (this.getCheckSurplusGains() == null ? other.getCheckSurplusGains() == null : this.getCheckSurplusGains().equals(other.getCheckSurplusGains()))
                && (this.getStopLosses() == null ? other.getStopLosses() == null : this.getStopLosses().equals(other.getStopLosses()))
                && (this.getFollowCell() == null ? other.getFollowCell() == null : this.getFollowCell().equals(other.getFollowCell()))
                && (this.getBudgetLimit() == null ? other.getBudgetLimit() == null : this.getBudgetLimit().equals(other.getBudgetLimit()))
                && (this.getOrderModel() == null ? other.getOrderModel() == null : this.getOrderModel().equals(other.getOrderModel()))
                && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getDelTime() == null ? other.getDelTime() == null : this.getDelTime().equals(other.getDelTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getSellRatio() == null) ? 0 : getSellRatio().hashCode());
        result = prime * result + ((getCheckSurplusGains() == null) ? 0 : getCheckSurplusGains().hashCode());
        result = prime * result + ((getStopLosses() == null) ? 0 : getStopLosses().hashCode());
        result = prime * result + ((getFollowCell() == null) ? 0 : getFollowCell().hashCode());
        result = prime * result + ((getBudgetLimit() == null) ? 0 : getBudgetLimit().hashCode());
        result = prime * result + ((getOrderModel() == null) ? 0 : getOrderModel().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDelTime() == null) ? 0 : getDelTime().hashCode());
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
        sb.append(", sellRatio=").append(sellRatio);
        sb.append(", checkSurplusGains=").append(checkSurplusGains);
        sb.append(", stopLosses=").append(stopLosses);
        sb.append(", followCell=").append(followCell);
        sb.append(", budgetLimit=").append(budgetLimit);
        sb.append(", orderModel=").append(orderModel);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", delTime=").append(delTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}