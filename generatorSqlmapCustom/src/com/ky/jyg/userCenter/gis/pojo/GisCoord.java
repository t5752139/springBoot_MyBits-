package com.ky.jyg.userCenter.gis.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GisCoord {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务表主键
     */
    private Long bussId;

    /**
     * 业务类型
     */
    private String bussKey;

    /**
     * 业务类型_编码
     */
    private String bussKeyCode;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
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

    /**
     * 坐标
     */
    private byte[] coord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBussId() {
        return bussId;
    }

    public void setBussId(Long bussId) {
        this.bussId = bussId;
    }

    public String getBussKey() {
        return bussKey;
    }

    public void setBussKey(String bussKey) {
        this.bussKey = bussKey == null ? null : bussKey.trim();
    }

    public String getBussKeyCode() {
        return bussKeyCode;
    }

    public void setBussKeyCode(String bussKeyCode) {
        this.bussKeyCode = bussKeyCode == null ? null : bussKeyCode.trim();
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

    public byte[] getCoord() {
        return coord;
    }

    public void setCoord(byte[] coord) {
        this.coord = coord;
    }
}