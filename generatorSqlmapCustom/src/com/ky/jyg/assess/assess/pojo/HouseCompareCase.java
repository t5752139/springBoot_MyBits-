package com.ky.jyg.assess.assess.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class HouseCompareCase {
    /**
     * 主键
     */
    private Long id;

    /**
     * 房产估价id
     */
    private Long surveyHouseId;

    /**
     * 采样id
     */
    private Long caseId;

    /**
     * 小区名
     */
    private String gardenName;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 用途_编码
     */
    private String purposeCode;

    /**
     * 朝向
     */
    private String faceto;

    /**
     * 朝向_编码
     */
    private String facetoCode;

    /**
     * 所在层
     */
    private String location;

    /**
     * 所在层_编码
     */
    private String locationCode;

    /**
     * 总层
     */
    private Byte levelTotal;

    /**
     * 面积
     */
    private BigDecimal area;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 采样日期
     */
    private Date samplingDate;

    /**
     * 成交单价
     */
    private BigDecimal transactionPrice;

    /**
     * 交易情况
     */
    private Byte transactionState;

    /**
     * 市场状况
     */
    private Byte marketState;

    /**
     * 位置状况
     */
    private Byte locationState;

    /**
     * 周围环境和景观
     */
    private Byte environmentState;

    /**
     * 交通条件
     */
    private Byte trafficState;

    /**
     * 教育配套设施
     */
    private Byte educationState;

    /**
     * 医疗配套设施
     */
    private Byte hospitalState;

    /**
     * 其他生活配套
     */
    private Byte otherState;

    /**
     * 基础设施完备度
     */
    private Byte basicState;

    /**
     * 所在层/总层
     */
    private Byte levelState;

    /**
     * 朝向情况
     */
    private Byte facetoState;

    /**
     * 临街
     */
    private Byte faceStreetState;

    /**
     * 小计(区位状况)
     */
    private BigDecimal siteSubtotal;

    /**
     * 新旧程度
     */
    private Byte oldNewState;

    /**
     * 设施与设备
     */
    private Byte facilitiesState;

    /**
     * 工程质量
     */
    private Byte engineeringState;

    /**
     * 物业管理、规模
     */
    private Byte propertyState;

    /**
     * 平面布置
     */
    private Byte layoutState;

    /**
     * 建筑面积
     */
    private Byte buildAreaState;

    /**
     * 建筑结构
     */
    private Byte buildStructureState;

    /**
     * 装饰装修
     */
    private Byte renovationState;

    /**
     * 土地使用年限
     */
    private Byte uselimitState;

    /**
     * 小计(实物状况)
     */
    private BigDecimal matterSubtotal;

    /**
     * 土地用途及性质
     */
    private Byte landPurposeState;

    /**
     * 出租情况
     */
    private Byte rentState;

    /**
     * 权利性质
     */
    private Byte natureRightState;

    /**
     * 地役权设立及相邻关系
     */
    private Byte easementRelationState;

    /**
     * 小计(权益状况)
     */
    private BigDecimal equitySubtotal;

    /**
     * 房地产状况调整系数
     */
    private BigDecimal houseCoefficient;

    /**
     * 总调整系数
     */
    private BigDecimal coefficientTotal;

    /**
     * 比准价格
     */
    private BigDecimal quasiPrice;

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

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getGardenName() {
        return gardenName;
    }

    public void setGardenName(String gardenName) {
        this.gardenName = gardenName == null ? null : gardenName.trim();
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

    public String getFaceto() {
        return faceto;
    }

    public void setFaceto(String faceto) {
        this.faceto = faceto == null ? null : faceto.trim();
    }

    public String getFacetoCode() {
        return facetoCode;
    }

    public void setFacetoCode(String facetoCode) {
        this.facetoCode = facetoCode == null ? null : facetoCode.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public Byte getLevelTotal() {
        return levelTotal;
    }

    public void setLevelTotal(Byte levelTotal) {
        this.levelTotal = levelTotal;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
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

    public Date getSamplingDate() {
        return samplingDate;
    }

    public void setSamplingDate(Date samplingDate) {
        this.samplingDate = samplingDate;
    }

    public BigDecimal getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(BigDecimal transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public Byte getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(Byte transactionState) {
        this.transactionState = transactionState;
    }

    public Byte getMarketState() {
        return marketState;
    }

    public void setMarketState(Byte marketState) {
        this.marketState = marketState;
    }

    public Byte getLocationState() {
        return locationState;
    }

    public void setLocationState(Byte locationState) {
        this.locationState = locationState;
    }

    public Byte getEnvironmentState() {
        return environmentState;
    }

    public void setEnvironmentState(Byte environmentState) {
        this.environmentState = environmentState;
    }

    public Byte getTrafficState() {
        return trafficState;
    }

    public void setTrafficState(Byte trafficState) {
        this.trafficState = trafficState;
    }

    public Byte getEducationState() {
        return educationState;
    }

    public void setEducationState(Byte educationState) {
        this.educationState = educationState;
    }

    public Byte getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(Byte hospitalState) {
        this.hospitalState = hospitalState;
    }

    public Byte getOtherState() {
        return otherState;
    }

    public void setOtherState(Byte otherState) {
        this.otherState = otherState;
    }

    public Byte getBasicState() {
        return basicState;
    }

    public void setBasicState(Byte basicState) {
        this.basicState = basicState;
    }

    public Byte getLevelState() {
        return levelState;
    }

    public void setLevelState(Byte levelState) {
        this.levelState = levelState;
    }

    public Byte getFacetoState() {
        return facetoState;
    }

    public void setFacetoState(Byte facetoState) {
        this.facetoState = facetoState;
    }

    public Byte getFaceStreetState() {
        return faceStreetState;
    }

    public void setFaceStreetState(Byte faceStreetState) {
        this.faceStreetState = faceStreetState;
    }

    public BigDecimal getSiteSubtotal() {
        return siteSubtotal;
    }

    public void setSiteSubtotal(BigDecimal siteSubtotal) {
        this.siteSubtotal = siteSubtotal;
    }

    public Byte getOldNewState() {
        return oldNewState;
    }

    public void setOldNewState(Byte oldNewState) {
        this.oldNewState = oldNewState;
    }

    public Byte getFacilitiesState() {
        return facilitiesState;
    }

    public void setFacilitiesState(Byte facilitiesState) {
        this.facilitiesState = facilitiesState;
    }

    public Byte getEngineeringState() {
        return engineeringState;
    }

    public void setEngineeringState(Byte engineeringState) {
        this.engineeringState = engineeringState;
    }

    public Byte getPropertyState() {
        return propertyState;
    }

    public void setPropertyState(Byte propertyState) {
        this.propertyState = propertyState;
    }

    public Byte getLayoutState() {
        return layoutState;
    }

    public void setLayoutState(Byte layoutState) {
        this.layoutState = layoutState;
    }

    public Byte getBuildAreaState() {
        return buildAreaState;
    }

    public void setBuildAreaState(Byte buildAreaState) {
        this.buildAreaState = buildAreaState;
    }

    public Byte getBuildStructureState() {
        return buildStructureState;
    }

    public void setBuildStructureState(Byte buildStructureState) {
        this.buildStructureState = buildStructureState;
    }

    public Byte getRenovationState() {
        return renovationState;
    }

    public void setRenovationState(Byte renovationState) {
        this.renovationState = renovationState;
    }

    public Byte getUselimitState() {
        return uselimitState;
    }

    public void setUselimitState(Byte uselimitState) {
        this.uselimitState = uselimitState;
    }

    public BigDecimal getMatterSubtotal() {
        return matterSubtotal;
    }

    public void setMatterSubtotal(BigDecimal matterSubtotal) {
        this.matterSubtotal = matterSubtotal;
    }

    public Byte getLandPurposeState() {
        return landPurposeState;
    }

    public void setLandPurposeState(Byte landPurposeState) {
        this.landPurposeState = landPurposeState;
    }

    public Byte getRentState() {
        return rentState;
    }

    public void setRentState(Byte rentState) {
        this.rentState = rentState;
    }

    public Byte getNatureRightState() {
        return natureRightState;
    }

    public void setNatureRightState(Byte natureRightState) {
        this.natureRightState = natureRightState;
    }

    public Byte getEasementRelationState() {
        return easementRelationState;
    }

    public void setEasementRelationState(Byte easementRelationState) {
        this.easementRelationState = easementRelationState;
    }

    public BigDecimal getEquitySubtotal() {
        return equitySubtotal;
    }

    public void setEquitySubtotal(BigDecimal equitySubtotal) {
        this.equitySubtotal = equitySubtotal;
    }

    public BigDecimal getHouseCoefficient() {
        return houseCoefficient;
    }

    public void setHouseCoefficient(BigDecimal houseCoefficient) {
        this.houseCoefficient = houseCoefficient;
    }

    public BigDecimal getCoefficientTotal() {
        return coefficientTotal;
    }

    public void setCoefficientTotal(BigDecimal coefficientTotal) {
        this.coefficientTotal = coefficientTotal;
    }

    public BigDecimal getQuasiPrice() {
        return quasiPrice;
    }

    public void setQuasiPrice(BigDecimal quasiPrice) {
        this.quasiPrice = quasiPrice;
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