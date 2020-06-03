package com.ky.jyg.userCenter.authIdentity.pojo;

import java.util.Date;

public class AuthMateria {
    /**
     * 主键
     */
    private Long id;

    /**
     * 认证模板id
     */
    private Long authMateriaTemplateId;

    /**
     * 职业人角色id
     */
    private Long professionalRoleId;

    /**
     * 企业id
     */
    private Long companyId;

    /**
     * 对象类型             company: 企业 professional: 职业人
     */
    private String authType;

    /**
     * 认证类型编码
     */
    private String authTypeCode;

    /**
     * 认证对象             valuer: 估价师 agent: 经纪人 banker: 银行人 assessment: 评估机构 finance: 金融机构 intermediary: 中介机构
     */
    private String authObj;

    /**
     * 认证对象编码
     */
    private String authObjCode;

    /**
     * 材料名称
     */
    private String materialName;

    /**
     * 材料名称_编码
     */
    private String materialNameCode;

    /**
     * 附件关联键
     */
    private String materialAppendixId;

    /**
     * 是否必填
     */
    private String isMust;

    /**
     * 是否生效
     */
    private String isEffective;

    /**
     * 排序号
     */
    private Byte sortingNo;

    /**
     * 数据类型编码
     */
    private String dataTypeCode;

    /**
     * JS校验方法
     */
    private String jsCheckMethod;

    /**
     * 是否审核通过
     */
    private String isExaminePass;

    /**
     * 审核错误描述
     */
    private String examineErrorMsg;

    /**
     * 值
     */
    private String value;

    /**
     * 审核人
     */
    private Long examineId;

    /**
     * 审核时间
     */
    private Date examineTime;

    /**
     * 是否流程中
     */
    private String isWorkflowing;

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

    public Long getAuthMateriaTemplateId() {
        return authMateriaTemplateId;
    }

    public void setAuthMateriaTemplateId(Long authMateriaTemplateId) {
        this.authMateriaTemplateId = authMateriaTemplateId;
    }

    public Long getProfessionalRoleId() {
        return professionalRoleId;
    }

    public void setProfessionalRoleId(Long professionalRoleId) {
        this.professionalRoleId = professionalRoleId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getAuthTypeCode() {
        return authTypeCode;
    }

    public void setAuthTypeCode(String authTypeCode) {
        this.authTypeCode = authTypeCode == null ? null : authTypeCode.trim();
    }

    public String getAuthObj() {
        return authObj;
    }

    public void setAuthObj(String authObj) {
        this.authObj = authObj == null ? null : authObj.trim();
    }

    public String getAuthObjCode() {
        return authObjCode;
    }

    public void setAuthObjCode(String authObjCode) {
        this.authObjCode = authObjCode == null ? null : authObjCode.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialNameCode() {
        return materialNameCode;
    }

    public void setMaterialNameCode(String materialNameCode) {
        this.materialNameCode = materialNameCode == null ? null : materialNameCode.trim();
    }

    public String getMaterialAppendixId() {
        return materialAppendixId;
    }

    public void setMaterialAppendixId(String materialAppendixId) {
        this.materialAppendixId = materialAppendixId == null ? null : materialAppendixId.trim();
    }

    public String getIsMust() {
        return isMust;
    }

    public void setIsMust(String isMust) {
        this.isMust = isMust == null ? null : isMust.trim();
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public Byte getSortingNo() {
        return sortingNo;
    }

    public void setSortingNo(Byte sortingNo) {
        this.sortingNo = sortingNo;
    }

    public String getDataTypeCode() {
        return dataTypeCode;
    }

    public void setDataTypeCode(String dataTypeCode) {
        this.dataTypeCode = dataTypeCode == null ? null : dataTypeCode.trim();
    }

    public String getJsCheckMethod() {
        return jsCheckMethod;
    }

    public void setJsCheckMethod(String jsCheckMethod) {
        this.jsCheckMethod = jsCheckMethod == null ? null : jsCheckMethod.trim();
    }

    public String getIsExaminePass() {
        return isExaminePass;
    }

    public void setIsExaminePass(String isExaminePass) {
        this.isExaminePass = isExaminePass == null ? null : isExaminePass.trim();
    }

    public String getExamineErrorMsg() {
        return examineErrorMsg;
    }

    public void setExamineErrorMsg(String examineErrorMsg) {
        this.examineErrorMsg = examineErrorMsg == null ? null : examineErrorMsg.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Long getExamineId() {
        return examineId;
    }

    public void setExamineId(Long examineId) {
        this.examineId = examineId;
    }

    public Date getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(Date examineTime) {
        this.examineTime = examineTime;
    }

    public String getIsWorkflowing() {
        return isWorkflowing;
    }

    public void setIsWorkflowing(String isWorkflowing) {
        this.isWorkflowing = isWorkflowing == null ? null : isWorkflowing.trim();
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