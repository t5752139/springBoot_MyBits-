package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssessHouse {
    /**
     * 主键
     */
    private Long id;

    /**
     * 房屋查勘id
     */
    private Long surveyHouseId;

    /**
     * 房产评估方法
     */
    private String houseAssessMethod;

    /**
     * 实勘时间起
     */
    private Date trueSurveyDateStart;

    /**
     * 实勘时间止
     */
    private Date trueSurveyDateEnd;

    /**
     * 价值时点
     */
    private Date valuePointDate;

    /**
     * 估价作业起
     */
    private Date dateStart;

    /**
     * 估价作业止
     */
    private Date dateEnd;

    /**
     * 比较法单价
     */
    private BigDecimal compareUnitPrice;

    /**
     * 比较法单价
     */
    private BigDecimal compareTotalPrice;

    /**
     * 比较法权
     */
    private BigDecimal compareWeight;

    /**
     * 估价师认定价值
     */
    private BigDecimal appraiserTotalPrice;

    /**
     * 收益法单价
     */
    private BigDecimal incomeUnitPrice;

    /**
     * 收益法总价
     */
    private BigDecimal incomeTotalPrice;

    /**
     * 收益法权重
     */
    private BigDecimal incomeWeight;

    /**
     * 估价房产单价
     */
    private BigDecimal unitPrice;

    /**
     * 估价房产总价
     */
    private BigDecimal totalPrice;

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

    public String getHouseAssessMethod() {
        return houseAssessMethod;
    }

    public void setHouseAssessMethod(String houseAssessMethod) {
        this.houseAssessMethod = houseAssessMethod == null ? null : houseAssessMethod.trim();
    }

    public Date getTrueSurveyDateStart() {
        return trueSurveyDateStart;
    }

    public void setTrueSurveyDateStart(Date trueSurveyDateStart) {
        this.trueSurveyDateStart = trueSurveyDateStart;
    }

    public Date getTrueSurveyDateEnd() {
        return trueSurveyDateEnd;
    }

    public void setTrueSurveyDateEnd(Date trueSurveyDateEnd) {
        this.trueSurveyDateEnd = trueSurveyDateEnd;
    }

    public Date getValuePointDate() {
        return valuePointDate;
    }

    public void setValuePointDate(Date valuePointDate) {
        this.valuePointDate = valuePointDate;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public BigDecimal getCompareUnitPrice() {
        return compareUnitPrice;
    }

    public void setCompareUnitPrice(BigDecimal compareUnitPrice) {
        this.compareUnitPrice = compareUnitPrice;
    }

    public BigDecimal getCompareTotalPrice() {
        return compareTotalPrice;
    }

    public void setCompareTotalPrice(BigDecimal compareTotalPrice) {
        this.compareTotalPrice = compareTotalPrice;
    }

    public BigDecimal getCompareWeight() {
        return compareWeight;
    }

    public void setCompareWeight(BigDecimal compareWeight) {
        this.compareWeight = compareWeight;
    }

    public BigDecimal getAppraiserTotalPrice() {
        return appraiserTotalPrice;
    }

    public void setAppraiserTotalPrice(BigDecimal appraiserTotalPrice) {
        this.appraiserTotalPrice = appraiserTotalPrice;
    }

    public BigDecimal getIncomeUnitPrice() {
        return incomeUnitPrice;
    }

    public void setIncomeUnitPrice(BigDecimal incomeUnitPrice) {
        this.incomeUnitPrice = incomeUnitPrice;
    }

    public BigDecimal getIncomeTotalPrice() {
        return incomeTotalPrice;
    }

    public void setIncomeTotalPrice(BigDecimal incomeTotalPrice) {
        this.incomeTotalPrice = incomeTotalPrice;
    }

    public BigDecimal getIncomeWeight() {
        return incomeWeight;
    }

    public void setIncomeWeight(BigDecimal incomeWeight) {
        this.incomeWeight = incomeWeight;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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