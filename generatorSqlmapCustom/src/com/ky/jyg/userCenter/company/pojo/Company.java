package com.ky.jyg.userCenter.company.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Company {
    /**
     * 主键
     */
    private Long id;

    /**
     * 机构类型
     */
    private String organType;

    /**
     * 
     */
    private String organTypeCode;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 父企业id
     */
    private Long parentId;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 类型
     */
    private String type;

    /**
     * 法定代表人
     */
    private String legalPerson;

    /**
     * 注册资本(万元)
     */
    private BigDecimal registerCapital;

    /**
     * 成立日期
     */
    private Date establishDate;

    /**
     * 营业期限自
     */
    private Date businessStart;

    /**
     * 营业期限至
     */
    private Date businessOver;

    /**
     * 登记机关
     */
    private String registerAuthority;

    /**
     * 核准日期
     */
    private Date conformDate;

    /**
     * 登记状态
     */
    private String registerStatus;

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
     * 坐标x
     */
    private Double x;

    /**
     * 坐标y
     */
    private Double y;

    /**
     * 住所
     */
    private String address;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 是否有效
     */
    private String isEffective;

    /**
     * 是否冻结
     */
    private String isFreeze;

    /**
     * 注册人
     */
    private Long registerBy;

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
    private String isDelete;

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

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType == null ? null : organType.trim();
    }

    public String getOrganTypeCode() {
        return organTypeCode;
    }

    public void setOrganTypeCode(String organTypeCode) {
        this.organTypeCode = organTypeCode == null ? null : organTypeCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public BigDecimal getRegisterCapital() {
        return registerCapital;
    }

    public void setRegisterCapital(BigDecimal registerCapital) {
        this.registerCapital = registerCapital;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Date getBusinessStart() {
        return businessStart;
    }

    public void setBusinessStart(Date businessStart) {
        this.businessStart = businessStart;
    }

    public Date getBusinessOver() {
        return businessOver;
    }

    public void setBusinessOver(Date businessOver) {
        this.businessOver = businessOver;
    }

    public String getRegisterAuthority() {
        return registerAuthority;
    }

    public void setRegisterAuthority(String registerAuthority) {
        this.registerAuthority = registerAuthority == null ? null : registerAuthority.trim();
    }

    public Date getConformDate() {
        return conformDate;
    }

    public void setConformDate(Date conformDate) {
        this.conformDate = conformDate;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus == null ? null : registerStatus.trim();
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

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public String getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(String isFreeze) {
        this.isFreeze = isFreeze == null ? null : isFreeze.trim();
    }

    public Long getRegisterBy() {
        return registerBy;
    }

    public void setRegisterBy(Long registerBy) {
        this.registerBy = registerBy;
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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
}