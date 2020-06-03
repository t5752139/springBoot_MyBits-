package com.ky.jyg.userCenter.register.pojo;

import java.util.Date;

public class BaseUser {
    /**
     * 主键
     */
    private Long id;

    /**
     * 账号
     */
    private String name;

    /**
     * 移动电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 微信号
     */
    private String weixinOpenid;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 是否冻结
     */
    private String isFreeze;

    /**
     * 是否黑名单
     */
    private String isBlacklist;

    /**
     * 是否职业人
     */
    private String isProfessional;

    /**
     * 是否企业管理员
     */
    private String isCompanyAdmin;

    /**
     * 是否企业雇员
     */
    private String isEmployee;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid == null ? null : weixinOpenid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(String isFreeze) {
        this.isFreeze = isFreeze == null ? null : isFreeze.trim();
    }

    public String getIsBlacklist() {
        return isBlacklist;
    }

    public void setIsBlacklist(String isBlacklist) {
        this.isBlacklist = isBlacklist == null ? null : isBlacklist.trim();
    }

    public String getIsProfessional() {
        return isProfessional;
    }

    public void setIsProfessional(String isProfessional) {
        this.isProfessional = isProfessional == null ? null : isProfessional.trim();
    }

    public String getIsCompanyAdmin() {
        return isCompanyAdmin;
    }

    public void setIsCompanyAdmin(String isCompanyAdmin) {
        this.isCompanyAdmin = isCompanyAdmin == null ? null : isCompanyAdmin.trim();
    }

    public String getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(String isEmployee) {
        this.isEmployee = isEmployee == null ? null : isEmployee.trim();
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