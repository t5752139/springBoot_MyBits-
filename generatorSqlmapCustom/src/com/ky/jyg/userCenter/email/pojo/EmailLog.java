package com.ky.jyg.userCenter.email.pojo;

import java.util.Date;

public class EmailLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 普通用户id
     */
    private Long baseUserId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 验证码
     */
    private Integer verifyNo;

    /**
     * 操作类型             register: 注册 retrieve:密码找回
     */
    private String operation;

    /**
     * 操作类型_编码
     */
    private String operationCode;

    /**
     * 验证时间
     */
    private Date verifyTime;

    /**
     * 是否验证成功
     */
    private String isSuccessed;

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

    public Long getBaseUserId() {
        return baseUserId;
    }

    public void setBaseUserId(Long baseUserId) {
        this.baseUserId = baseUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getVerifyNo() {
        return verifyNo;
    }

    public void setVerifyNo(Integer verifyNo) {
        this.verifyNo = verifyNo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getIsSuccessed() {
        return isSuccessed;
    }

    public void setIsSuccessed(String isSuccessed) {
        this.isSuccessed = isSuccessed == null ? null : isSuccessed.trim();
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