package com.ky.jyg.assess.entrust.pojo;

import java.util.Date;

public class Entrust {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务编号
     */
    private String bussSerial;

    /**
     * 业务类型表单id
     */
    private Long bussFormId;

    /**
     * 业务类型表单
     */
    private String bussForm;

    /**
     * 业务类型表单_编码
     */
    private String bussFormCode;

    /**
     * 估价目的
     */
    private String assPurpose;

    /**
     * 估价目的_编码
     */
    private String assPurposeCode;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 用途_编码
     */
    private String purposeCode;

    /**
     * 省
     */
    private String province;

    /**
     * 省_编码
     */
    private String provinceCode;

    /**
     * 市
     */
    private String city;

    /**
     * 市_编码
     */
    private String cityCode;

    /**
     * 区/县
     */
    private String county;

    /**
     * 区/县_编码
     */
    private String countyCode;

    /**
     * 估价基准日
     */
    private Date baseDate;

    /**
     * 委托机构id
     */
    private Long entrustCompanyId;

    /**
     * 委托机构名称
     */
    private String entrustCompanyName;

    /**
     * 委托人id
     */
    private Long consignorUid;

    /**
     * 委托人姓名
     */
    private String consignorUname;

    /**
     * 委托人电话
     */
    private String consignorPhone;

    /**
     * 联系人姓名
     */
    private String connectUname;

    /**
     * 联系人电话
     */
    private String connectPhone;

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

    public String getBussSerial() {
        return bussSerial;
    }

    public void setBussSerial(String bussSerial) {
        this.bussSerial = bussSerial == null ? null : bussSerial.trim();
    }

    public Long getBussFormId() {
        return bussFormId;
    }

    public void setBussFormId(Long bussFormId) {
        this.bussFormId = bussFormId;
    }

    public String getBussForm() {
        return bussForm;
    }

    public void setBussForm(String bussForm) {
        this.bussForm = bussForm == null ? null : bussForm.trim();
    }

    public String getBussFormCode() {
        return bussFormCode;
    }

    public void setBussFormCode(String bussFormCode) {
        this.bussFormCode = bussFormCode == null ? null : bussFormCode.trim();
    }

    public String getAssPurpose() {
        return assPurpose;
    }

    public void setAssPurpose(String assPurpose) {
        this.assPurpose = assPurpose == null ? null : assPurpose.trim();
    }

    public String getAssPurposeCode() {
        return assPurposeCode;
    }

    public void setAssPurposeCode(String assPurposeCode) {
        this.assPurposeCode = assPurposeCode == null ? null : assPurposeCode.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode == null ? null : purposeCode.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public Date getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(Date baseDate) {
        this.baseDate = baseDate;
    }

    public Long getEntrustCompanyId() {
        return entrustCompanyId;
    }

    public void setEntrustCompanyId(Long entrustCompanyId) {
        this.entrustCompanyId = entrustCompanyId;
    }

    public String getEntrustCompanyName() {
        return entrustCompanyName;
    }

    public void setEntrustCompanyName(String entrustCompanyName) {
        this.entrustCompanyName = entrustCompanyName == null ? null : entrustCompanyName.trim();
    }

    public Long getConsignorUid() {
        return consignorUid;
    }

    public void setConsignorUid(Long consignorUid) {
        this.consignorUid = consignorUid;
    }

    public String getConsignorUname() {
        return consignorUname;
    }

    public void setConsignorUname(String consignorUname) {
        this.consignorUname = consignorUname == null ? null : consignorUname.trim();
    }

    public String getConsignorPhone() {
        return consignorPhone;
    }

    public void setConsignorPhone(String consignorPhone) {
        this.consignorPhone = consignorPhone == null ? null : consignorPhone.trim();
    }

    public String getConnectUname() {
        return connectUname;
    }

    public void setConnectUname(String connectUname) {
        this.connectUname = connectUname == null ? null : connectUname.trim();
    }

    public String getConnectPhone() {
        return connectPhone;
    }

    public void setConnectPhone(String connectPhone) {
        this.connectPhone = connectPhone == null ? null : connectPhone.trim();
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