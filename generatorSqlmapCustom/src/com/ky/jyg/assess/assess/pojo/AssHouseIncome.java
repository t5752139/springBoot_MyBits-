package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssHouseIncome {
    /**
     * 主键
     */
    private Long id;

    /**
     * 房屋估价表id
     */
    private Long surveyHouseId;

    /**
     * 潜在毛租金
     */
    private BigDecimal grossRent;

    /**
     * 每年以12月计
     */
    private Byte monthCount;

    /**
     * 出租率
     */
    private BigDecimal rentaRate;

    /**
     * 建筑面积
     */
    private BigDecimal bulidArea;

    /**
     * 管理费用
     */
    private BigDecimal manageCost;

    /**
     * 年有效毛收入
     */
    private BigDecimal validIncome;

    /**
     * 建筑物重置成本
     */
    private Integer bulidingResetCost;

    /**
     * 年维修费用
     */
    private BigDecimal repairCost;

    /**
     * 年保险费
     */
    private BigDecimal safeCost;

    /**
     * 年税金
     */
    private BigDecimal taxes;

    /**
     * 年运营费用
     */
    private BigDecimal operateCost;

    /**
     * 年净收益
     */
    private BigDecimal netProfit;

    /**
     * 报酬率
     */
    private BigDecimal rewardRate;

    /**
     * 年租金增长率
     */
    private BigDecimal rentRiseRate;

    /**
     * 收益年限
     */
    private Byte incomeYear;

    /**
     * 新建人
     */
    private Long createBy;

    /**
     * 新建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 是否删除
     */
    private Byte isDelete;

    /**
     * 删除时间
     */
    private Date deleteDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSurveyHouseId() {
        return surveyHouseId;
    }

    public void setSurveyHouseId(Long surveyHouseId) {
        this.surveyHouseId = surveyHouseId;
    }

    public BigDecimal getGrossRent() {
        return grossRent;
    }

    public void setGrossRent(BigDecimal grossRent) {
        this.grossRent = grossRent;
    }

    public Byte getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Byte monthCount) {
        this.monthCount = monthCount;
    }

    public BigDecimal getRentaRate() {
        return rentaRate;
    }

    public void setRentaRate(BigDecimal rentaRate) {
        this.rentaRate = rentaRate;
    }

    public BigDecimal getBulidArea() {
        return bulidArea;
    }

    public void setBulidArea(BigDecimal bulidArea) {
        this.bulidArea = bulidArea;
    }

    public BigDecimal getManageCost() {
        return manageCost;
    }

    public void setManageCost(BigDecimal manageCost) {
        this.manageCost = manageCost;
    }

    public BigDecimal getValidIncome() {
        return validIncome;
    }

    public void setValidIncome(BigDecimal validIncome) {
        this.validIncome = validIncome;
    }

    public Integer getBulidingResetCost() {
        return bulidingResetCost;
    }

    public void setBulidingResetCost(Integer bulidingResetCost) {
        this.bulidingResetCost = bulidingResetCost;
    }

    public BigDecimal getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    public BigDecimal getSafeCost() {
        return safeCost;
    }

    public void setSafeCost(BigDecimal safeCost) {
        this.safeCost = safeCost;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getOperateCost() {
        return operateCost;
    }

    public void setOperateCost(BigDecimal operateCost) {
        this.operateCost = operateCost;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }

    public BigDecimal getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(BigDecimal rewardRate) {
        this.rewardRate = rewardRate;
    }

    public BigDecimal getRentRiseRate() {
        return rentRiseRate;
    }

    public void setRentRiseRate(BigDecimal rentRiseRate) {
        this.rentRiseRate = rentRiseRate;
    }

    public Byte getIncomeYear() {
        return incomeYear;
    }

    public void setIncomeYear(Byte incomeYear) {
        this.incomeYear = incomeYear;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
}