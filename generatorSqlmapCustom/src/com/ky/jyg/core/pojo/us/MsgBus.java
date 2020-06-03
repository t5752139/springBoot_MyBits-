package com.ky.jyg.core.pojo.us;

import java.util.Date;

public class MsgBus {
    /**
     * 主键
     */
    private Long id;

    /**
     * 父通知消息id
     */
    private Long parentId;

    /**
     * 消息类型: 企业合作,邀请员工入职
     */
    private String type;

    /**
     * 消息类型_编码
     */
    private String typeCode;

    /**
     * 生产者企业id
     */
    private Long producerCid;

    /**
     * 生产者id
     */
    private Long producerId;

    /**
     * 生产时间
     */
    private Date produceTime;

    /**
     * 请求消息
     */
    private String requestMsg;

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public Long getProducerCid() {
        return producerCid;
    }

    public void setProducerCid(Long producerCid) {
        this.producerCid = producerCid;
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public Date getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Date produceTime) {
        this.produceTime = produceTime;
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg == null ? null : requestMsg.trim();
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