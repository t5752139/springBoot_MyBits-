package com.ky.jyg.assess.survey.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SurveyHouse {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务受理id
     */
    private Long acceptId;

    /**
     * 小区名称
     */
    private String housingEstateName;

    /**
     * 坐落
     */
    private String location;

    /**
     * 开发商
     */
    private String developerName;

    /**
     * 开发商类型
     */
    private String developerType;

    /**
     * 开发商类型_编码
     */
    private String developerTypeCode;

    /**
     * 物业等级
     */
    private String refpropertyLevel;

    /**
     * 物业等级_编码
     */
    private String refpropertyLevelCode;

    /**
     * 总幢数
     */
    private Byte buildingsTotal;

    /**
     * 治安状况
     */
    private String securityState;

    /**
     * 治安状况_编码
     */
    private String securityStateCode;

    /**
     * 人文环境
     */
    private String culturalEnvironment;

    /**
     * 人文环境_编码
     */
    private String culturalEnvironmentCode;

    /**
     * 公交线路数量
     */
    private Byte busLineTotal;

    /**
     * 公交线路明细
     */
    private String busLineDetailed;

    /**
     * 地铁线路数量
     */
    private Byte metroLineTotal;

    /**
     * 地铁线路明细
     */
    private String metroLineDetail;

    /**
     * 东临
     */
    private String eastTo;

    /**
     * 南临
     */
    private String southTo;

    /**
     * 西临
     */
    private String westTo;

    /**
     * 北临
     */
    private String northTo;

    /**
     * 公共服务设施
     */
    private String publicService;

    /**
     * 污染状况
     */
    private String polluteState;

    /**
     * 幢号
     */
    private Byte houseBuildingNo;

    /**
     * 单元总数
     */
    private Byte unitTotal;

    /**
     * 幢使用性质
     */
    private String buildingUsage;

    /**
     * 幢使用性质_编码
     */
    private String buildingUsageCode;

    /**
     * 建筑类型
     */
    private String buildingType;

    /**
     * 建筑类型_编码
     */
    private String buildingTypeCode;

    /**
     * 房屋朝向
     */
    private String direction;

    /**
     * 房屋朝向_编码
     */
    private String directionType;

    /**
     * 临街状况
     */
    private String faceStreetState;

    /**
     * 临街状况_编码
     */
    private String faceStreetStateCode;

    /**
     * 建筑结构
     */
    private String buildingStructure;

    /**
     * 建筑结构_编码
     */
    private String buildingStructureCode;

    /**
     * 建成年份
     */
    private Short builtYear;

    /**
     * 景观等级
     */
    private String landscapeGrade;

    /**
     * 景观等级_编码
     */
    private String landscapeGradeCode;

    /**
     * 卫生状况
     */
    private String healthState;

    /**
     * 卫生状况_编码
     */
    private String healthStateCode;

    /**
     * 外墙面
     */
    private String outWall;

    /**
     * 外墙面_编码
     */
    private String outWallCode;

    /**
     * 停车位
     */
    private String parkingSpace;

    /**
     * 停车位数量(概述)
     */
    private String parkingSpaceTotal;

    /**
     * 停车位数量(概述)_编码
     */
    private String parkingSpaceTotalCode;

    /**
     * 基础设施
     */
    private String infrastructure;

    /**
     * 单元号
     */
    private Byte unitNumber;

    /**
     * 总楼层
     */
    private Byte floorTotal;

    /**
     * 每层套数
     */
    private Byte floorCyclesTotal;

    /**
     * 单元使用性质
     */
    private String unitUsage;

    /**
     * 单元使用性质_编码
     */
    private String unitUsageCode;

    /**
     * 电梯数
     */
    private Byte elevatorTotal;

    /**
     * 步梯数
     */
    private Byte ladderTotal;

    /**
     * 房号
     */
    private Integer roomNumber;

    /**
     * 证书类型
     */
    private String certificateType;

    /**
     * 证书类型_编码
     */
    private String certificateTypeCode;

    /**
     * 房屋使用性质
     */
    private String nature;

    /**
     * 房屋使用性质_编码
     */
    private String natureCode;

    /**
     * 所有权人
     */
    private String owner;

    /**
     * 房产证号
     */
    private String certificateNo;

    /**
     * 规划用途
     */
    private String purposePlan;

    /**
     * 共有权证
     */
    private String commonWarrants;

    /**
     * 共有权人
     */
    private String coOwner;

    /**
     * 房屋产别
     */
    private String housingProduction;

    /**
     * 户型
     */
    private String apartment;

    /**
     * 户型_编码
     */
    private String apartmentCode;

    /**
     * 利用现状
     */
    private String useState;

    /**
     * 利用现状_编码
     */
    private String useStateCode;

    /**
     * 装修状况
     */
    private String renovationState;

    /**
     * 装修状况_编码
     */
    private String renovationStateCode;

    /**
     * 成新率
     */
    private BigDecimal houseNewRate;

    /**
     * 室数量
     */
    private Byte roomCount;

    /**
     * 厅数量
     */
    private Byte parlourCount;

    /**
     * 阳台数量
     */
    private Byte balconyCount;

    /**
     * 卫生间数量
     */
    private Byte bathroomCount;

    /**
     * 厨房数量
     */
    private Byte kitchenCount;

    /**
     * 所在层
     */
    private Byte floor;

    /**
     * 变现能力
     */
    private String cashAbility;

    /**
     * 变现能力_编码
     */
    private String cashAbilityCode;

    /**
     * 建筑面积
     */
    private BigDecimal area;

    /**
     * 参考房价
     */
    private BigDecimal referencePrice;

    /**
     * 参考房租
     */
    private BigDecimal referenceRent;

    /**
     * 物业费
     */
    private BigDecimal refpropertyFee;

    /**
     * 窗
     */
    private String tWindow;

    /**
     * 窗_编码
     */
    private String tWindowCode;

    /**
     * 卫生间门
     */
    private String bathroomDoor;

    /**
     * 卫生间门_编码
     */
    private String bathroomDoorCode;

    /**
     * 内门
     */
    private String insideDoor;

    /**
     * 内门_编码
     */
    private String insideDoorCode;

    /**
     * 入户门
     */
    private String inroomDoor;

    /**
     * 入户门_编码
     */
    private String inroomDoorCode;

    /**
     * 卧室门
     */
    private String bedroomDoor;

    /**
     * 卧室门_编码
     */
    private String bedroomDoorCode;

    /**
     * 厨房门
     */
    private String kitchenDoor;

    /**
     * 厨房门_编码
     */
    private String kitchenDoorCode;

    /**
     * 墙面
     */
    private String wall;

    /**
     * 顶棚
     */
    private String platfond;

    /**
     * 地面
     */
    private String ground;

    /**
     * 坐标纬度
     */
    private BigDecimal latitude;

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

    public Long getAcceptId() {
        return acceptId;
    }

    public void setAcceptId(Long acceptId) {
        this.acceptId = acceptId;
    }

    public String getHousingEstateName() {
        return housingEstateName;
    }

    public void setHousingEstateName(String housingEstateName) {
        this.housingEstateName = housingEstateName == null ? null : housingEstateName.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName == null ? null : developerName.trim();
    }

    public String getDeveloperType() {
        return developerType;
    }

    public void setDeveloperType(String developerType) {
        this.developerType = developerType == null ? null : developerType.trim();
    }

    public String getDeveloperTypeCode() {
        return developerTypeCode;
    }

    public void setDeveloperTypeCode(String developerTypeCode) {
        this.developerTypeCode = developerTypeCode == null ? null : developerTypeCode.trim();
    }

    public String getRefpropertyLevel() {
        return refpropertyLevel;
    }

    public void setRefpropertyLevel(String refpropertyLevel) {
        this.refpropertyLevel = refpropertyLevel == null ? null : refpropertyLevel.trim();
    }

    public String getRefpropertyLevelCode() {
        return refpropertyLevelCode;
    }

    public void setRefpropertyLevelCode(String refpropertyLevelCode) {
        this.refpropertyLevelCode = refpropertyLevelCode == null ? null : refpropertyLevelCode.trim();
    }

    public Byte getBuildingsTotal() {
        return buildingsTotal;
    }

    public void setBuildingsTotal(Byte buildingsTotal) {
        this.buildingsTotal = buildingsTotal;
    }

    public String getSecurityState() {
        return securityState;
    }

    public void setSecurityState(String securityState) {
        this.securityState = securityState == null ? null : securityState.trim();
    }

    public String getSecurityStateCode() {
        return securityStateCode;
    }

    public void setSecurityStateCode(String securityStateCode) {
        this.securityStateCode = securityStateCode == null ? null : securityStateCode.trim();
    }

    public String getCulturalEnvironment() {
        return culturalEnvironment;
    }

    public void setCulturalEnvironment(String culturalEnvironment) {
        this.culturalEnvironment = culturalEnvironment == null ? null : culturalEnvironment.trim();
    }

    public String getCulturalEnvironmentCode() {
        return culturalEnvironmentCode;
    }

    public void setCulturalEnvironmentCode(String culturalEnvironmentCode) {
        this.culturalEnvironmentCode = culturalEnvironmentCode == null ? null : culturalEnvironmentCode.trim();
    }

    public Byte getBusLineTotal() {
        return busLineTotal;
    }

    public void setBusLineTotal(Byte busLineTotal) {
        this.busLineTotal = busLineTotal;
    }

    public String getBusLineDetailed() {
        return busLineDetailed;
    }

    public void setBusLineDetailed(String busLineDetailed) {
        this.busLineDetailed = busLineDetailed == null ? null : busLineDetailed.trim();
    }

    public Byte getMetroLineTotal() {
        return metroLineTotal;
    }

    public void setMetroLineTotal(Byte metroLineTotal) {
        this.metroLineTotal = metroLineTotal;
    }

    public String getMetroLineDetail() {
        return metroLineDetail;
    }

    public void setMetroLineDetail(String metroLineDetail) {
        this.metroLineDetail = metroLineDetail == null ? null : metroLineDetail.trim();
    }

    public String getEastTo() {
        return eastTo;
    }

    public void setEastTo(String eastTo) {
        this.eastTo = eastTo == null ? null : eastTo.trim();
    }

    public String getSouthTo() {
        return southTo;
    }

    public void setSouthTo(String southTo) {
        this.southTo = southTo == null ? null : southTo.trim();
    }

    public String getWestTo() {
        return westTo;
    }

    public void setWestTo(String westTo) {
        this.westTo = westTo == null ? null : westTo.trim();
    }

    public String getNorthTo() {
        return northTo;
    }

    public void setNorthTo(String northTo) {
        this.northTo = northTo == null ? null : northTo.trim();
    }

    public String getPublicService() {
        return publicService;
    }

    public void setPublicService(String publicService) {
        this.publicService = publicService == null ? null : publicService.trim();
    }

    public String getPolluteState() {
        return polluteState;
    }

    public void setPolluteState(String polluteState) {
        this.polluteState = polluteState == null ? null : polluteState.trim();
    }

    public Byte getHouseBuildingNo() {
        return houseBuildingNo;
    }

    public void setHouseBuildingNo(Byte houseBuildingNo) {
        this.houseBuildingNo = houseBuildingNo;
    }

    public Byte getUnitTotal() {
        return unitTotal;
    }

    public void setUnitTotal(Byte unitTotal) {
        this.unitTotal = unitTotal;
    }

    public String getBuildingUsage() {
        return buildingUsage;
    }

    public void setBuildingUsage(String buildingUsage) {
        this.buildingUsage = buildingUsage == null ? null : buildingUsage.trim();
    }

    public String getBuildingUsageCode() {
        return buildingUsageCode;
    }

    public void setBuildingUsageCode(String buildingUsageCode) {
        this.buildingUsageCode = buildingUsageCode == null ? null : buildingUsageCode.trim();
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public String getBuildingTypeCode() {
        return buildingTypeCode;
    }

    public void setBuildingTypeCode(String buildingTypeCode) {
        this.buildingTypeCode = buildingTypeCode == null ? null : buildingTypeCode.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getDirectionType() {
        return directionType;
    }

    public void setDirectionType(String directionType) {
        this.directionType = directionType == null ? null : directionType.trim();
    }

    public String getFaceStreetState() {
        return faceStreetState;
    }

    public void setFaceStreetState(String faceStreetState) {
        this.faceStreetState = faceStreetState == null ? null : faceStreetState.trim();
    }

    public String getFaceStreetStateCode() {
        return faceStreetStateCode;
    }

    public void setFaceStreetStateCode(String faceStreetStateCode) {
        this.faceStreetStateCode = faceStreetStateCode == null ? null : faceStreetStateCode.trim();
    }

    public String getBuildingStructure() {
        return buildingStructure;
    }

    public void setBuildingStructure(String buildingStructure) {
        this.buildingStructure = buildingStructure == null ? null : buildingStructure.trim();
    }

    public String getBuildingStructureCode() {
        return buildingStructureCode;
    }

    public void setBuildingStructureCode(String buildingStructureCode) {
        this.buildingStructureCode = buildingStructureCode == null ? null : buildingStructureCode.trim();
    }

    public Short getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(Short builtYear) {
        this.builtYear = builtYear;
    }

    public String getLandscapeGrade() {
        return landscapeGrade;
    }

    public void setLandscapeGrade(String landscapeGrade) {
        this.landscapeGrade = landscapeGrade == null ? null : landscapeGrade.trim();
    }

    public String getLandscapeGradeCode() {
        return landscapeGradeCode;
    }

    public void setLandscapeGradeCode(String landscapeGradeCode) {
        this.landscapeGradeCode = landscapeGradeCode == null ? null : landscapeGradeCode.trim();
    }

    public String getHealthState() {
        return healthState;
    }

    public void setHealthState(String healthState) {
        this.healthState = healthState == null ? null : healthState.trim();
    }

    public String getHealthStateCode() {
        return healthStateCode;
    }

    public void setHealthStateCode(String healthStateCode) {
        this.healthStateCode = healthStateCode == null ? null : healthStateCode.trim();
    }

    public String getOutWall() {
        return outWall;
    }

    public void setOutWall(String outWall) {
        this.outWall = outWall == null ? null : outWall.trim();
    }

    public String getOutWallCode() {
        return outWallCode;
    }

    public void setOutWallCode(String outWallCode) {
        this.outWallCode = outWallCode == null ? null : outWallCode.trim();
    }

    public String getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace == null ? null : parkingSpace.trim();
    }

    public String getParkingSpaceTotal() {
        return parkingSpaceTotal;
    }

    public void setParkingSpaceTotal(String parkingSpaceTotal) {
        this.parkingSpaceTotal = parkingSpaceTotal == null ? null : parkingSpaceTotal.trim();
    }

    public String getParkingSpaceTotalCode() {
        return parkingSpaceTotalCode;
    }

    public void setParkingSpaceTotalCode(String parkingSpaceTotalCode) {
        this.parkingSpaceTotalCode = parkingSpaceTotalCode == null ? null : parkingSpaceTotalCode.trim();
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure == null ? null : infrastructure.trim();
    }

    public Byte getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Byte unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Byte getFloorTotal() {
        return floorTotal;
    }

    public void setFloorTotal(Byte floorTotal) {
        this.floorTotal = floorTotal;
    }

    public Byte getFloorCyclesTotal() {
        return floorCyclesTotal;
    }

    public void setFloorCyclesTotal(Byte floorCyclesTotal) {
        this.floorCyclesTotal = floorCyclesTotal;
    }

    public String getUnitUsage() {
        return unitUsage;
    }

    public void setUnitUsage(String unitUsage) {
        this.unitUsage = unitUsage == null ? null : unitUsage.trim();
    }

    public String getUnitUsageCode() {
        return unitUsageCode;
    }

    public void setUnitUsageCode(String unitUsageCode) {
        this.unitUsageCode = unitUsageCode == null ? null : unitUsageCode.trim();
    }

    public Byte getElevatorTotal() {
        return elevatorTotal;
    }

    public void setElevatorTotal(Byte elevatorTotal) {
        this.elevatorTotal = elevatorTotal;
    }

    public Byte getLadderTotal() {
        return ladderTotal;
    }

    public void setLadderTotal(Byte ladderTotal) {
        this.ladderTotal = ladderTotal;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateTypeCode() {
        return certificateTypeCode;
    }

    public void setCertificateTypeCode(String certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode == null ? null : certificateTypeCode.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode == null ? null : natureCode.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public String getPurposePlan() {
        return purposePlan;
    }

    public void setPurposePlan(String purposePlan) {
        this.purposePlan = purposePlan == null ? null : purposePlan.trim();
    }

    public String getCommonWarrants() {
        return commonWarrants;
    }

    public void setCommonWarrants(String commonWarrants) {
        this.commonWarrants = commonWarrants == null ? null : commonWarrants.trim();
    }

    public String getCoOwner() {
        return coOwner;
    }

    public void setCoOwner(String coOwner) {
        this.coOwner = coOwner == null ? null : coOwner.trim();
    }

    public String getHousingProduction() {
        return housingProduction;
    }

    public void setHousingProduction(String housingProduction) {
        this.housingProduction = housingProduction == null ? null : housingProduction.trim();
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment == null ? null : apartment.trim();
    }

    public String getApartmentCode() {
        return apartmentCode;
    }

    public void setApartmentCode(String apartmentCode) {
        this.apartmentCode = apartmentCode == null ? null : apartmentCode.trim();
    }

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }

    public String getUseStateCode() {
        return useStateCode;
    }

    public void setUseStateCode(String useStateCode) {
        this.useStateCode = useStateCode == null ? null : useStateCode.trim();
    }

    public String getRenovationState() {
        return renovationState;
    }

    public void setRenovationState(String renovationState) {
        this.renovationState = renovationState == null ? null : renovationState.trim();
    }

    public String getRenovationStateCode() {
        return renovationStateCode;
    }

    public void setRenovationStateCode(String renovationStateCode) {
        this.renovationStateCode = renovationStateCode == null ? null : renovationStateCode.trim();
    }

    public BigDecimal getHouseNewRate() {
        return houseNewRate;
    }

    public void setHouseNewRate(BigDecimal houseNewRate) {
        this.houseNewRate = houseNewRate;
    }

    public Byte getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Byte roomCount) {
        this.roomCount = roomCount;
    }

    public Byte getParlourCount() {
        return parlourCount;
    }

    public void setParlourCount(Byte parlourCount) {
        this.parlourCount = parlourCount;
    }

    public Byte getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(Byte balconyCount) {
        this.balconyCount = balconyCount;
    }

    public Byte getBathroomCount() {
        return bathroomCount;
    }

    public void setBathroomCount(Byte bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public Byte getKitchenCount() {
        return kitchenCount;
    }

    public void setKitchenCount(Byte kitchenCount) {
        this.kitchenCount = kitchenCount;
    }

    public Byte getFloor() {
        return floor;
    }

    public void setFloor(Byte floor) {
        this.floor = floor;
    }

    public String getCashAbility() {
        return cashAbility;
    }

    public void setCashAbility(String cashAbility) {
        this.cashAbility = cashAbility == null ? null : cashAbility.trim();
    }

    public String getCashAbilityCode() {
        return cashAbilityCode;
    }

    public void setCashAbilityCode(String cashAbilityCode) {
        this.cashAbilityCode = cashAbilityCode == null ? null : cashAbilityCode.trim();
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public BigDecimal getReferenceRent() {
        return referenceRent;
    }

    public void setReferenceRent(BigDecimal referenceRent) {
        this.referenceRent = referenceRent;
    }

    public BigDecimal getRefpropertyFee() {
        return refpropertyFee;
    }

    public void setRefpropertyFee(BigDecimal refpropertyFee) {
        this.refpropertyFee = refpropertyFee;
    }

    public String gettWindow() {
        return tWindow;
    }

    public void settWindow(String tWindow) {
        this.tWindow = tWindow == null ? null : tWindow.trim();
    }

    public String gettWindowCode() {
        return tWindowCode;
    }

    public void settWindowCode(String tWindowCode) {
        this.tWindowCode = tWindowCode == null ? null : tWindowCode.trim();
    }

    public String getBathroomDoor() {
        return bathroomDoor;
    }

    public void setBathroomDoor(String bathroomDoor) {
        this.bathroomDoor = bathroomDoor == null ? null : bathroomDoor.trim();
    }

    public String getBathroomDoorCode() {
        return bathroomDoorCode;
    }

    public void setBathroomDoorCode(String bathroomDoorCode) {
        this.bathroomDoorCode = bathroomDoorCode == null ? null : bathroomDoorCode.trim();
    }

    public String getInsideDoor() {
        return insideDoor;
    }

    public void setInsideDoor(String insideDoor) {
        this.insideDoor = insideDoor == null ? null : insideDoor.trim();
    }

    public String getInsideDoorCode() {
        return insideDoorCode;
    }

    public void setInsideDoorCode(String insideDoorCode) {
        this.insideDoorCode = insideDoorCode == null ? null : insideDoorCode.trim();
    }

    public String getInroomDoor() {
        return inroomDoor;
    }

    public void setInroomDoor(String inroomDoor) {
        this.inroomDoor = inroomDoor == null ? null : inroomDoor.trim();
    }

    public String getInroomDoorCode() {
        return inroomDoorCode;
    }

    public void setInroomDoorCode(String inroomDoorCode) {
        this.inroomDoorCode = inroomDoorCode == null ? null : inroomDoorCode.trim();
    }

    public String getBedroomDoor() {
        return bedroomDoor;
    }

    public void setBedroomDoor(String bedroomDoor) {
        this.bedroomDoor = bedroomDoor == null ? null : bedroomDoor.trim();
    }

    public String getBedroomDoorCode() {
        return bedroomDoorCode;
    }

    public void setBedroomDoorCode(String bedroomDoorCode) {
        this.bedroomDoorCode = bedroomDoorCode == null ? null : bedroomDoorCode.trim();
    }

    public String getKitchenDoor() {
        return kitchenDoor;
    }

    public void setKitchenDoor(String kitchenDoor) {
        this.kitchenDoor = kitchenDoor == null ? null : kitchenDoor.trim();
    }

    public String getKitchenDoorCode() {
        return kitchenDoorCode;
    }

    public void setKitchenDoorCode(String kitchenDoorCode) {
        this.kitchenDoorCode = kitchenDoorCode == null ? null : kitchenDoorCode.trim();
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall == null ? null : wall.trim();
    }

    public String getPlatfond() {
        return platfond;
    }

    public void setPlatfond(String platfond) {
        this.platfond = platfond == null ? null : platfond.trim();
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground == null ? null : ground.trim();
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
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