package com.ky.jyg.assess.survey.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SurveyLand {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务受理id
     */
    private Long acceptId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 查勘时间
     */
    private Date surveyTime;

    /**
     * 现使用情况
     */
    private String useState;

    /**
     * 现使用情况_编码
     */
    private String useStateCode;

    /**
     * 宗地位置
     */
    private String location;

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
     * 用途
     */
    private String purpose;

    /**
     * 开发商
     */
    private String redlineOutside;

    /**
     * 红线外
     */
    private String redlineInside;

    /**
     * 宗地形状
     */
    private String parcelShape;

    /**
     * 宗地形状_编码
     */
    private String parcelShapeCode;

    /**
     * 宗地位于
     */
    private String parcelLocation;

    /**
     * 宗地位于_编码
     */
    private String parcelLocationCode;

    /**
     * 耕地类型
     */
    private String farmlandType;

    /**
     * 周围企业
     */
    private String aroundEnterprise;

    /**
     * 路网道路名称1
     */
    private String roadName1;

    /**
     * 属1
     */
    private String roadType1;

    /**
     * 属1_编码
     */
    private String roadType1Code;

    /**
     * 路面宽1
     */
    private BigDecimal roadWidth1;

    /**
     * 路面材料1
     */
    private String roadMaterial1;

    /**
     * 路网道路名称2
     */
    private String roadName2;

    /**
     * 属2
     */
    private String roadType2;

    /**
     * 属1_编码
     */
    private String roadType2Code;

    /**
     * 路面宽2
     */
    private BigDecimal roadWidth2;

    /**
     * 路面材料2
     */
    private String roadMaterial2;

    /**
     * 路网道路名称3
     */
    private String roadName3;

    /**
     * 属3
     */
    private String roadType3;

    /**
     * 属3_编码
     */
    private String roadType3Code;

    /**
     * 路面宽3
     */
    private BigDecimal roadWidth3;

    /**
     * 路面材料3
     */
    private String roadMaterial3;

    /**
     * 路网道路名称4
     */
    private String roadName4;

    /**
     * 属4
     */
    private String roadType4;

    /**
     * 属4_编码
     */
    private String roadType4Code;

    /**
     * 路面宽4
     */
    private BigDecimal roadWidth4;

    /**
     * 路面材料4
     */
    private String roadMaterial4;

    /**
     * 距离市级商服中心
     */
    private BigDecimal distanceCityCenter;

    /**
     * 距离区级商服中心
     */
    private BigDecimal distanceCountyCenter;

    /**
     * 距离小区级商服中心
     */
    private BigDecimal distanceGardenCenter;

    /**
     * 东临(路)
     */
    private String eastRoad;

    /**
     * 属(东)
     */
    private String belongEast;

    /**
     * 属(东)_编码
     */
    private String belongEastCode;

    /**
     * 路面宽(东)
     */
    private BigDecimal roadWidthEast;

    /**
     * 路面材料(东)
     */
    private String roadMaterialEast;

    /**
     * 南临(路)
     */
    private String southRoad;

    /**
     * 属(南)
     */
    private String belongSouth;

    /**
     * 属(南)_编码
     */
    private String belongSouthCode;

    /**
     * 路面宽(南)
     */
    private BigDecimal roadWidthSouth;

    /**
     * 路面材料(南)
     */
    private String roadMaterialSouth;

    /**
     * 西临(路)
     */
    private String westRoad;

    /**
     * 属(西)
     */
    private String belongWest;

    /**
     * 属(西)_编码
     */
    private String belongWestCode;

    /**
     * 路面宽(西)
     */
    private BigDecimal roadWidthWest;

    /**
     * 路面材料(西)
     */
    private String roadMaterialWest;

    /**
     * 北临(路)
     */
    private String northRoad;

    /**
     * 属(北)
     */
    private String belongNorth;

    /**
     * 属(北)_编码
     */
    private String belongNorthCode;

    /**
     * 路面宽(北)
     */
    private BigDecimal roadWidthNorth;

    /**
     * 路面材料(北)
     */
    private String roadMaterialNorth;

    /**
     * 公交线路
     */
    private String busLines;

    /**
     * 距离最近站点
     */
    private BigDecimal distanceBusStation;

    /**
     * 汽车站
     */
    private String carStation;

    /**
     * 距离汽车站
     */
    private BigDecimal distanceCarStation;

    /**
     * 火车站
     */
    private String trainStation;

    /**
     * 距离火车站
     */
    private BigDecimal distanceTrainStation;

    /**
     * 机场
     */
    private String airport;

    /**
     * 距离机场
     */
    private BigDecimal distanceAirport;

    /**
     * 附近设施
     */
    private String nearbyFacilities;

    /**
     * 污染企业
     */
    private String pollutingEnterprises;

    /**
     * 污染企业_编码
     */
    private String pollutingEnterprisesCode;

    /**
     * 主污染源
     */
    private String polluteSource;

    /**
     * 主污染源(其他)
     */
    private String polluteSourceOther;

    /**
     * 土质结构
     */
    private String soilTexture;

    /**
     * 土质结构_编码
     */
    private String soilTextureCode;

    /**
     * 地基承载力
     */
    private BigDecimal kpa;

    /**
     * 灾害情况
     */
    private String damageStatution;

    /**
     * 灾害情况(其他)
     */
    private String damageStatutionOther;

    /**
     * 规划限制
     */
    private String planLimit;

    /**
     * 规划限制_编码
     */
    private String planLimitCode;

    /**
     * 规划容积率
     */
    private BigDecimal plotRatio;

    /**
     * 通路状况
     */
    private String accessState;

    /**
     * 通路状况_编码
     */
    private String accessStateCode;

    /**
     * 主要道路路名1
     */
    private String mainRoadName1;

    /**
     * 道路类型与等级1
     */
    private String mainRoadLevel1;

    /**
     * 主要道路路名2
     */
    private String mainRoadName2;

    /**
     * 道路类型与等级2
     */
    private String mainRoadLevel2;

    /**
     * 主要道路路名3
     */
    private String mainRoadName3;

    /**
     * 道路类型与等级3
     */
    private String mainRoadLevel3;

    /**
     * 主要道路路名4
     */
    private String mainRoadName4;

    /**
     * 道路类型与等级4
     */
    private String mainRoadLevel4;

    /**
     * 供电来源
     */
    private String powerSupplySource;

    /**
     * 所用电网名称
     */
    private String powerGridName;

    /**
     * 供电保证率
     */
    private BigDecimal powerSupplyRate;

    /**
     * 用户自备发电设备总功率
     */
    private BigDecimal electricEquPowerSelf;

    /**
     * 城市自来水供水保证率
     */
    private BigDecimal cityWaterSupply;

    /**
     * 自备深水井取水指标
     */
    private BigDecimal wellSelfUse;

    /**
     * 占企业用水量
     */
    private BigDecimal useWater;

    /**
     * 排污水
     */
    private BigDecimal sewageDischarge;

    /**
     * 排雨水
     */
    private BigDecimal rainwaterDischarge;

    /**
     * 排水管道
     */
    private String drainageDuct;

    /**
     * 排水管道_编码
     */
    private String drainageDuctCode;

    /**
     * 规格(H)
     */
    private BigDecimal specsH;

    /**
     * 规格(W)
     */
    private BigDecimal specsW;

    /**
     * 供暖
     */
    private String heating;

    /**
     * 供暖_编码
     */
    private String heatingCode;

    /**
     * 供气
     */
    private String supplyGas;

    /**
     * 供气_编码
     */
    private String supplyGasCode;

    /**
     * 总通讯能力
     */
    private String communications;

    /**
     * 交换机型号
     */
    private String switchModel;

    /**
     * 实装电话分机门数
     */
    private Byte eTelNum;

    /**
     * 实装电话直拨门数
     */
    private Byte lTelNum;

    /**
     * 平整状况
     */
    private String smoothness;

    /**
     * 平整状况_编码
     */
    private String smoothnessCode;

    /**
     * 坡度
     */
    private BigDecimal slope;

    /**
     * 附件
     */
    private String attachment;

    /**
     * 坐标经度
     */
    private BigDecimal longitude;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Date getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(Date surveyTime) {
        this.surveyTime = surveyTime;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getRedlineOutside() {
        return redlineOutside;
    }

    public void setRedlineOutside(String redlineOutside) {
        this.redlineOutside = redlineOutside == null ? null : redlineOutside.trim();
    }

    public String getRedlineInside() {
        return redlineInside;
    }

    public void setRedlineInside(String redlineInside) {
        this.redlineInside = redlineInside == null ? null : redlineInside.trim();
    }

    public String getParcelShape() {
        return parcelShape;
    }

    public void setParcelShape(String parcelShape) {
        this.parcelShape = parcelShape == null ? null : parcelShape.trim();
    }

    public String getParcelShapeCode() {
        return parcelShapeCode;
    }

    public void setParcelShapeCode(String parcelShapeCode) {
        this.parcelShapeCode = parcelShapeCode == null ? null : parcelShapeCode.trim();
    }

    public String getParcelLocation() {
        return parcelLocation;
    }

    public void setParcelLocation(String parcelLocation) {
        this.parcelLocation = parcelLocation == null ? null : parcelLocation.trim();
    }

    public String getParcelLocationCode() {
        return parcelLocationCode;
    }

    public void setParcelLocationCode(String parcelLocationCode) {
        this.parcelLocationCode = parcelLocationCode == null ? null : parcelLocationCode.trim();
    }

    public String getFarmlandType() {
        return farmlandType;
    }

    public void setFarmlandType(String farmlandType) {
        this.farmlandType = farmlandType == null ? null : farmlandType.trim();
    }

    public String getAroundEnterprise() {
        return aroundEnterprise;
    }

    public void setAroundEnterprise(String aroundEnterprise) {
        this.aroundEnterprise = aroundEnterprise == null ? null : aroundEnterprise.trim();
    }

    public String getRoadName1() {
        return roadName1;
    }

    public void setRoadName1(String roadName1) {
        this.roadName1 = roadName1 == null ? null : roadName1.trim();
    }

    public String getRoadType1() {
        return roadType1;
    }

    public void setRoadType1(String roadType1) {
        this.roadType1 = roadType1 == null ? null : roadType1.trim();
    }

    public String getRoadType1Code() {
        return roadType1Code;
    }

    public void setRoadType1Code(String roadType1Code) {
        this.roadType1Code = roadType1Code == null ? null : roadType1Code.trim();
    }

    public BigDecimal getRoadWidth1() {
        return roadWidth1;
    }

    public void setRoadWidth1(BigDecimal roadWidth1) {
        this.roadWidth1 = roadWidth1;
    }

    public String getRoadMaterial1() {
        return roadMaterial1;
    }

    public void setRoadMaterial1(String roadMaterial1) {
        this.roadMaterial1 = roadMaterial1 == null ? null : roadMaterial1.trim();
    }

    public String getRoadName2() {
        return roadName2;
    }

    public void setRoadName2(String roadName2) {
        this.roadName2 = roadName2 == null ? null : roadName2.trim();
    }

    public String getRoadType2() {
        return roadType2;
    }

    public void setRoadType2(String roadType2) {
        this.roadType2 = roadType2 == null ? null : roadType2.trim();
    }

    public String getRoadType2Code() {
        return roadType2Code;
    }

    public void setRoadType2Code(String roadType2Code) {
        this.roadType2Code = roadType2Code == null ? null : roadType2Code.trim();
    }

    public BigDecimal getRoadWidth2() {
        return roadWidth2;
    }

    public void setRoadWidth2(BigDecimal roadWidth2) {
        this.roadWidth2 = roadWidth2;
    }

    public String getRoadMaterial2() {
        return roadMaterial2;
    }

    public void setRoadMaterial2(String roadMaterial2) {
        this.roadMaterial2 = roadMaterial2 == null ? null : roadMaterial2.trim();
    }

    public String getRoadName3() {
        return roadName3;
    }

    public void setRoadName3(String roadName3) {
        this.roadName3 = roadName3 == null ? null : roadName3.trim();
    }

    public String getRoadType3() {
        return roadType3;
    }

    public void setRoadType3(String roadType3) {
        this.roadType3 = roadType3 == null ? null : roadType3.trim();
    }

    public String getRoadType3Code() {
        return roadType3Code;
    }

    public void setRoadType3Code(String roadType3Code) {
        this.roadType3Code = roadType3Code == null ? null : roadType3Code.trim();
    }

    public BigDecimal getRoadWidth3() {
        return roadWidth3;
    }

    public void setRoadWidth3(BigDecimal roadWidth3) {
        this.roadWidth3 = roadWidth3;
    }

    public String getRoadMaterial3() {
        return roadMaterial3;
    }

    public void setRoadMaterial3(String roadMaterial3) {
        this.roadMaterial3 = roadMaterial3 == null ? null : roadMaterial3.trim();
    }

    public String getRoadName4() {
        return roadName4;
    }

    public void setRoadName4(String roadName4) {
        this.roadName4 = roadName4 == null ? null : roadName4.trim();
    }

    public String getRoadType4() {
        return roadType4;
    }

    public void setRoadType4(String roadType4) {
        this.roadType4 = roadType4 == null ? null : roadType4.trim();
    }

    public String getRoadType4Code() {
        return roadType4Code;
    }

    public void setRoadType4Code(String roadType4Code) {
        this.roadType4Code = roadType4Code == null ? null : roadType4Code.trim();
    }

    public BigDecimal getRoadWidth4() {
        return roadWidth4;
    }

    public void setRoadWidth4(BigDecimal roadWidth4) {
        this.roadWidth4 = roadWidth4;
    }

    public String getRoadMaterial4() {
        return roadMaterial4;
    }

    public void setRoadMaterial4(String roadMaterial4) {
        this.roadMaterial4 = roadMaterial4 == null ? null : roadMaterial4.trim();
    }

    public BigDecimal getDistanceCityCenter() {
        return distanceCityCenter;
    }

    public void setDistanceCityCenter(BigDecimal distanceCityCenter) {
        this.distanceCityCenter = distanceCityCenter;
    }

    public BigDecimal getDistanceCountyCenter() {
        return distanceCountyCenter;
    }

    public void setDistanceCountyCenter(BigDecimal distanceCountyCenter) {
        this.distanceCountyCenter = distanceCountyCenter;
    }

    public BigDecimal getDistanceGardenCenter() {
        return distanceGardenCenter;
    }

    public void setDistanceGardenCenter(BigDecimal distanceGardenCenter) {
        this.distanceGardenCenter = distanceGardenCenter;
    }

    public String getEastRoad() {
        return eastRoad;
    }

    public void setEastRoad(String eastRoad) {
        this.eastRoad = eastRoad == null ? null : eastRoad.trim();
    }

    public String getBelongEast() {
        return belongEast;
    }

    public void setBelongEast(String belongEast) {
        this.belongEast = belongEast == null ? null : belongEast.trim();
    }

    public String getBelongEastCode() {
        return belongEastCode;
    }

    public void setBelongEastCode(String belongEastCode) {
        this.belongEastCode = belongEastCode == null ? null : belongEastCode.trim();
    }

    public BigDecimal getRoadWidthEast() {
        return roadWidthEast;
    }

    public void setRoadWidthEast(BigDecimal roadWidthEast) {
        this.roadWidthEast = roadWidthEast;
    }

    public String getRoadMaterialEast() {
        return roadMaterialEast;
    }

    public void setRoadMaterialEast(String roadMaterialEast) {
        this.roadMaterialEast = roadMaterialEast == null ? null : roadMaterialEast.trim();
    }

    public String getSouthRoad() {
        return southRoad;
    }

    public void setSouthRoad(String southRoad) {
        this.southRoad = southRoad == null ? null : southRoad.trim();
    }

    public String getBelongSouth() {
        return belongSouth;
    }

    public void setBelongSouth(String belongSouth) {
        this.belongSouth = belongSouth == null ? null : belongSouth.trim();
    }

    public String getBelongSouthCode() {
        return belongSouthCode;
    }

    public void setBelongSouthCode(String belongSouthCode) {
        this.belongSouthCode = belongSouthCode == null ? null : belongSouthCode.trim();
    }

    public BigDecimal getRoadWidthSouth() {
        return roadWidthSouth;
    }

    public void setRoadWidthSouth(BigDecimal roadWidthSouth) {
        this.roadWidthSouth = roadWidthSouth;
    }

    public String getRoadMaterialSouth() {
        return roadMaterialSouth;
    }

    public void setRoadMaterialSouth(String roadMaterialSouth) {
        this.roadMaterialSouth = roadMaterialSouth == null ? null : roadMaterialSouth.trim();
    }

    public String getWestRoad() {
        return westRoad;
    }

    public void setWestRoad(String westRoad) {
        this.westRoad = westRoad == null ? null : westRoad.trim();
    }

    public String getBelongWest() {
        return belongWest;
    }

    public void setBelongWest(String belongWest) {
        this.belongWest = belongWest == null ? null : belongWest.trim();
    }

    public String getBelongWestCode() {
        return belongWestCode;
    }

    public void setBelongWestCode(String belongWestCode) {
        this.belongWestCode = belongWestCode == null ? null : belongWestCode.trim();
    }

    public BigDecimal getRoadWidthWest() {
        return roadWidthWest;
    }

    public void setRoadWidthWest(BigDecimal roadWidthWest) {
        this.roadWidthWest = roadWidthWest;
    }

    public String getRoadMaterialWest() {
        return roadMaterialWest;
    }

    public void setRoadMaterialWest(String roadMaterialWest) {
        this.roadMaterialWest = roadMaterialWest == null ? null : roadMaterialWest.trim();
    }

    public String getNorthRoad() {
        return northRoad;
    }

    public void setNorthRoad(String northRoad) {
        this.northRoad = northRoad == null ? null : northRoad.trim();
    }

    public String getBelongNorth() {
        return belongNorth;
    }

    public void setBelongNorth(String belongNorth) {
        this.belongNorth = belongNorth == null ? null : belongNorth.trim();
    }

    public String getBelongNorthCode() {
        return belongNorthCode;
    }

    public void setBelongNorthCode(String belongNorthCode) {
        this.belongNorthCode = belongNorthCode == null ? null : belongNorthCode.trim();
    }

    public BigDecimal getRoadWidthNorth() {
        return roadWidthNorth;
    }

    public void setRoadWidthNorth(BigDecimal roadWidthNorth) {
        this.roadWidthNorth = roadWidthNorth;
    }

    public String getRoadMaterialNorth() {
        return roadMaterialNorth;
    }

    public void setRoadMaterialNorth(String roadMaterialNorth) {
        this.roadMaterialNorth = roadMaterialNorth == null ? null : roadMaterialNorth.trim();
    }

    public String getBusLines() {
        return busLines;
    }

    public void setBusLines(String busLines) {
        this.busLines = busLines == null ? null : busLines.trim();
    }

    public BigDecimal getDistanceBusStation() {
        return distanceBusStation;
    }

    public void setDistanceBusStation(BigDecimal distanceBusStation) {
        this.distanceBusStation = distanceBusStation;
    }

    public String getCarStation() {
        return carStation;
    }

    public void setCarStation(String carStation) {
        this.carStation = carStation == null ? null : carStation.trim();
    }

    public BigDecimal getDistanceCarStation() {
        return distanceCarStation;
    }

    public void setDistanceCarStation(BigDecimal distanceCarStation) {
        this.distanceCarStation = distanceCarStation;
    }

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation == null ? null : trainStation.trim();
    }

    public BigDecimal getDistanceTrainStation() {
        return distanceTrainStation;
    }

    public void setDistanceTrainStation(BigDecimal distanceTrainStation) {
        this.distanceTrainStation = distanceTrainStation;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport == null ? null : airport.trim();
    }

    public BigDecimal getDistanceAirport() {
        return distanceAirport;
    }

    public void setDistanceAirport(BigDecimal distanceAirport) {
        this.distanceAirport = distanceAirport;
    }

    public String getNearbyFacilities() {
        return nearbyFacilities;
    }

    public void setNearbyFacilities(String nearbyFacilities) {
        this.nearbyFacilities = nearbyFacilities == null ? null : nearbyFacilities.trim();
    }

    public String getPollutingEnterprises() {
        return pollutingEnterprises;
    }

    public void setPollutingEnterprises(String pollutingEnterprises) {
        this.pollutingEnterprises = pollutingEnterprises == null ? null : pollutingEnterprises.trim();
    }

    public String getPollutingEnterprisesCode() {
        return pollutingEnterprisesCode;
    }

    public void setPollutingEnterprisesCode(String pollutingEnterprisesCode) {
        this.pollutingEnterprisesCode = pollutingEnterprisesCode == null ? null : pollutingEnterprisesCode.trim();
    }

    public String getPolluteSource() {
        return polluteSource;
    }

    public void setPolluteSource(String polluteSource) {
        this.polluteSource = polluteSource == null ? null : polluteSource.trim();
    }

    public String getPolluteSourceOther() {
        return polluteSourceOther;
    }

    public void setPolluteSourceOther(String polluteSourceOther) {
        this.polluteSourceOther = polluteSourceOther == null ? null : polluteSourceOther.trim();
    }

    public String getSoilTexture() {
        return soilTexture;
    }

    public void setSoilTexture(String soilTexture) {
        this.soilTexture = soilTexture == null ? null : soilTexture.trim();
    }

    public String getSoilTextureCode() {
        return soilTextureCode;
    }

    public void setSoilTextureCode(String soilTextureCode) {
        this.soilTextureCode = soilTextureCode == null ? null : soilTextureCode.trim();
    }

    public BigDecimal getKpa() {
        return kpa;
    }

    public void setKpa(BigDecimal kpa) {
        this.kpa = kpa;
    }

    public String getDamageStatution() {
        return damageStatution;
    }

    public void setDamageStatution(String damageStatution) {
        this.damageStatution = damageStatution == null ? null : damageStatution.trim();
    }

    public String getDamageStatutionOther() {
        return damageStatutionOther;
    }

    public void setDamageStatutionOther(String damageStatutionOther) {
        this.damageStatutionOther = damageStatutionOther == null ? null : damageStatutionOther.trim();
    }

    public String getPlanLimit() {
        return planLimit;
    }

    public void setPlanLimit(String planLimit) {
        this.planLimit = planLimit == null ? null : planLimit.trim();
    }

    public String getPlanLimitCode() {
        return planLimitCode;
    }

    public void setPlanLimitCode(String planLimitCode) {
        this.planLimitCode = planLimitCode == null ? null : planLimitCode.trim();
    }

    public BigDecimal getPlotRatio() {
        return plotRatio;
    }

    public void setPlotRatio(BigDecimal plotRatio) {
        this.plotRatio = plotRatio;
    }

    public String getAccessState() {
        return accessState;
    }

    public void setAccessState(String accessState) {
        this.accessState = accessState == null ? null : accessState.trim();
    }

    public String getAccessStateCode() {
        return accessStateCode;
    }

    public void setAccessStateCode(String accessStateCode) {
        this.accessStateCode = accessStateCode == null ? null : accessStateCode.trim();
    }

    public String getMainRoadName1() {
        return mainRoadName1;
    }

    public void setMainRoadName1(String mainRoadName1) {
        this.mainRoadName1 = mainRoadName1 == null ? null : mainRoadName1.trim();
    }

    public String getMainRoadLevel1() {
        return mainRoadLevel1;
    }

    public void setMainRoadLevel1(String mainRoadLevel1) {
        this.mainRoadLevel1 = mainRoadLevel1 == null ? null : mainRoadLevel1.trim();
    }

    public String getMainRoadName2() {
        return mainRoadName2;
    }

    public void setMainRoadName2(String mainRoadName2) {
        this.mainRoadName2 = mainRoadName2 == null ? null : mainRoadName2.trim();
    }

    public String getMainRoadLevel2() {
        return mainRoadLevel2;
    }

    public void setMainRoadLevel2(String mainRoadLevel2) {
        this.mainRoadLevel2 = mainRoadLevel2 == null ? null : mainRoadLevel2.trim();
    }

    public String getMainRoadName3() {
        return mainRoadName3;
    }

    public void setMainRoadName3(String mainRoadName3) {
        this.mainRoadName3 = mainRoadName3 == null ? null : mainRoadName3.trim();
    }

    public String getMainRoadLevel3() {
        return mainRoadLevel3;
    }

    public void setMainRoadLevel3(String mainRoadLevel3) {
        this.mainRoadLevel3 = mainRoadLevel3 == null ? null : mainRoadLevel3.trim();
    }

    public String getMainRoadName4() {
        return mainRoadName4;
    }

    public void setMainRoadName4(String mainRoadName4) {
        this.mainRoadName4 = mainRoadName4 == null ? null : mainRoadName4.trim();
    }

    public String getMainRoadLevel4() {
        return mainRoadLevel4;
    }

    public void setMainRoadLevel4(String mainRoadLevel4) {
        this.mainRoadLevel4 = mainRoadLevel4 == null ? null : mainRoadLevel4.trim();
    }

    public String getPowerSupplySource() {
        return powerSupplySource;
    }

    public void setPowerSupplySource(String powerSupplySource) {
        this.powerSupplySource = powerSupplySource == null ? null : powerSupplySource.trim();
    }

    public String getPowerGridName() {
        return powerGridName;
    }

    public void setPowerGridName(String powerGridName) {
        this.powerGridName = powerGridName == null ? null : powerGridName.trim();
    }

    public BigDecimal getPowerSupplyRate() {
        return powerSupplyRate;
    }

    public void setPowerSupplyRate(BigDecimal powerSupplyRate) {
        this.powerSupplyRate = powerSupplyRate;
    }

    public BigDecimal getElectricEquPowerSelf() {
        return electricEquPowerSelf;
    }

    public void setElectricEquPowerSelf(BigDecimal electricEquPowerSelf) {
        this.electricEquPowerSelf = electricEquPowerSelf;
    }

    public BigDecimal getCityWaterSupply() {
        return cityWaterSupply;
    }

    public void setCityWaterSupply(BigDecimal cityWaterSupply) {
        this.cityWaterSupply = cityWaterSupply;
    }

    public BigDecimal getWellSelfUse() {
        return wellSelfUse;
    }

    public void setWellSelfUse(BigDecimal wellSelfUse) {
        this.wellSelfUse = wellSelfUse;
    }

    public BigDecimal getUseWater() {
        return useWater;
    }

    public void setUseWater(BigDecimal useWater) {
        this.useWater = useWater;
    }

    public BigDecimal getSewageDischarge() {
        return sewageDischarge;
    }

    public void setSewageDischarge(BigDecimal sewageDischarge) {
        this.sewageDischarge = sewageDischarge;
    }

    public BigDecimal getRainwaterDischarge() {
        return rainwaterDischarge;
    }

    public void setRainwaterDischarge(BigDecimal rainwaterDischarge) {
        this.rainwaterDischarge = rainwaterDischarge;
    }

    public String getDrainageDuct() {
        return drainageDuct;
    }

    public void setDrainageDuct(String drainageDuct) {
        this.drainageDuct = drainageDuct == null ? null : drainageDuct.trim();
    }

    public String getDrainageDuctCode() {
        return drainageDuctCode;
    }

    public void setDrainageDuctCode(String drainageDuctCode) {
        this.drainageDuctCode = drainageDuctCode == null ? null : drainageDuctCode.trim();
    }

    public BigDecimal getSpecsH() {
        return specsH;
    }

    public void setSpecsH(BigDecimal specsH) {
        this.specsH = specsH;
    }

    public BigDecimal getSpecsW() {
        return specsW;
    }

    public void setSpecsW(BigDecimal specsW) {
        this.specsW = specsW;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating == null ? null : heating.trim();
    }

    public String getHeatingCode() {
        return heatingCode;
    }

    public void setHeatingCode(String heatingCode) {
        this.heatingCode = heatingCode == null ? null : heatingCode.trim();
    }

    public String getSupplyGas() {
        return supplyGas;
    }

    public void setSupplyGas(String supplyGas) {
        this.supplyGas = supplyGas == null ? null : supplyGas.trim();
    }

    public String getSupplyGasCode() {
        return supplyGasCode;
    }

    public void setSupplyGasCode(String supplyGasCode) {
        this.supplyGasCode = supplyGasCode == null ? null : supplyGasCode.trim();
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications == null ? null : communications.trim();
    }

    public String getSwitchModel() {
        return switchModel;
    }

    public void setSwitchModel(String switchModel) {
        this.switchModel = switchModel == null ? null : switchModel.trim();
    }

    public Byte geteTelNum() {
        return eTelNum;
    }

    public void seteTelNum(Byte eTelNum) {
        this.eTelNum = eTelNum;
    }

    public Byte getlTelNum() {
        return lTelNum;
    }

    public void setlTelNum(Byte lTelNum) {
        this.lTelNum = lTelNum;
    }

    public String getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(String smoothness) {
        this.smoothness = smoothness == null ? null : smoothness.trim();
    }

    public String getSmoothnessCode() {
        return smoothnessCode;
    }

    public void setSmoothnessCode(String smoothnessCode) {
        this.smoothnessCode = smoothnessCode == null ? null : smoothnessCode.trim();
    }

    public BigDecimal getSlope() {
        return slope;
    }

    public void setSlope(BigDecimal slope) {
        this.slope = slope;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
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