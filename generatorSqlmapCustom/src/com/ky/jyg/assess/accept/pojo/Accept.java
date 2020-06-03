package com.ky.jyg.assess.accept.pojo;

import java.util.Date;

public class Accept {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报告编号
     */
    private String reportNo;

    /**
     * 业务委托id
     */
    private Long entrustId;

    /**
     * 受理企业id
     */
    private Long acceptCompanyId;

    /**
     * 受理人id
     */
    private Long acceptUidId;

    /**
     * 受理时间
     */
    private Date acceptTime;

    /**
     * 收费标准id
     */
    private Long chargingStandardId;

    /**
     * 业务来源城市
     */
    private String bussSourceCity;

    /**
     * 业务来源城市_编码
     */
    private String bussSourceCityCode;

    /**
     * 业务来源机构
     */
    private String bussSourceOrgan;

    /**
     * 业务来源机构_编码
     */
    private String bussSourceOrganCode;

    /**
     * 业务归属
     */
    private String bussVest;

    /**
     * 业务归属_编码
     */
    private String bussVestCode;

    /**
     * 受理状态
     */
    private String acceptState;

    /**
     * 受理状态_编码
     */
    private String acceptStateCode;

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

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public Long getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Long entrustId) {
        this.entrustId = entrustId;
    }

    public Long getAcceptCompanyId() {
        return acceptCompanyId;
    }

    public void setAcceptCompanyId(Long acceptCompanyId) {
        this.acceptCompanyId = acceptCompanyId;
    }

    public Long getAcceptUidId() {
        return acceptUidId;
    }

    public void setAcceptUidId(Long acceptUidId) {
        this.acceptUidId = acceptUidId;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Long getChargingStandardId() {
        return chargingStandardId;
    }

    public void setChargingStandardId(Long chargingStandardId) {
        this.chargingStandardId = chargingStandardId;
    }

    public String getBussSourceCity() {
        return bussSourceCity;
    }

    public void setBussSourceCity(String bussSourceCity) {
        this.bussSourceCity = bussSourceCity == null ? null : bussSourceCity.trim();
    }

    public String getBussSourceCityCode() {
        return bussSourceCityCode;
    }

    public void setBussSourceCityCode(String bussSourceCityCode) {
        this.bussSourceCityCode = bussSourceCityCode == null ? null : bussSourceCityCode.trim();
    }

    public String getBussSourceOrgan() {
        return bussSourceOrgan;
    }

    public void setBussSourceOrgan(String bussSourceOrgan) {
        this.bussSourceOrgan = bussSourceOrgan == null ? null : bussSourceOrgan.trim();
    }

    public String getBussSourceOrganCode() {
        return bussSourceOrganCode;
    }

    public void setBussSourceOrganCode(String bussSourceOrganCode) {
        this.bussSourceOrganCode = bussSourceOrganCode == null ? null : bussSourceOrganCode.trim();
    }

    public String getBussVest() {
        return bussVest;
    }

    public void setBussVest(String bussVest) {
        this.bussVest = bussVest == null ? null : bussVest.trim();
    }

    public String getBussVestCode() {
        return bussVestCode;
    }

    public void setBussVestCode(String bussVestCode) {
        this.bussVestCode = bussVestCode == null ? null : bussVestCode.trim();
    }

    public String getAcceptState() {
        return acceptState;
    }

    public void setAcceptState(String acceptState) {
        this.acceptState = acceptState == null ? null : acceptState.trim();
    }

    public String getAcceptStateCode() {
        return acceptStateCode;
    }

    public void setAcceptStateCode(String acceptStateCode) {
        this.acceptStateCode = acceptStateCode == null ? null : acceptStateCode.trim();
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