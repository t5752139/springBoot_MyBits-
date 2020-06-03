package com.ky.jyg.file.appendix.pojo;

import java.util.Date;

public class Attachment {
    /**
     * 主键
     */
    private Long id;

    /**
     * 业务id
     */
    private Long taskId;

    /**
     * 业务结点
     */
    private String taskName;

    /**
     * 业务结点_编码
     */
    private String taskNameCode;

    /**
     * 附件类型
     */
    private String fileType;

    /**
     * 附件类型_编码
     */
    private String fileTypeCode;

    /**
     * 版本
     */
    private Byte verNo;

    /**
     * 流程实例id
     */
    private String workFlowId;

    /**
     * 流程引擎
     */
    private String workFlowEngine;

    /**
     * 流程引擎编码
     */
    private String workFlowEngineCode;

    /**
     * 是否有效
     */
    private Byte isEffective;

    /**
     * 排序号
     */
    private Byte sortNo;

    /**
     * 附件id
     */
    private String appendixId;

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

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskNameCode() {
        return taskNameCode;
    }

    public void setTaskNameCode(String taskNameCode) {
        this.taskNameCode = taskNameCode == null ? null : taskNameCode.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode == null ? null : fileTypeCode.trim();
    }

    public Byte getVerNo() {
        return verNo;
    }

    public void setVerNo(Byte verNo) {
        this.verNo = verNo;
    }

    public String getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId == null ? null : workFlowId.trim();
    }

    public String getWorkFlowEngine() {
        return workFlowEngine;
    }

    public void setWorkFlowEngine(String workFlowEngine) {
        this.workFlowEngine = workFlowEngine == null ? null : workFlowEngine.trim();
    }

    public String getWorkFlowEngineCode() {
        return workFlowEngineCode;
    }

    public void setWorkFlowEngineCode(String workFlowEngineCode) {
        this.workFlowEngineCode = workFlowEngineCode == null ? null : workFlowEngineCode.trim();
    }

    public Byte getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Byte isEffective) {
        this.isEffective = isEffective;
    }

    public Byte getSortNo() {
        return sortNo;
    }

    public void setSortNo(Byte sortNo) {
        this.sortNo = sortNo;
    }

    public String getAppendixId() {
        return appendixId;
    }

    public void setAppendixId(String appendixId) {
        this.appendixId = appendixId == null ? null : appendixId.trim();
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