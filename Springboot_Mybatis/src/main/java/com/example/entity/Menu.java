package com.example.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class Menu {
    /**
     * 主键
     */
    @NotNull
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;

    /**
     * 父id
     */
    @ApiModelProperty(value = "父id", required = true)
    private Integer parentId;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    /**
     * lujing
     */
    @ApiModelProperty(value = "url", required = true)
    private String url;

    /**
     * 菜单m,按钮b
     */
    @ApiModelProperty(value = "菜单m,按钮b", required = true)
    private String typerCode;

    /**
     * 类型,部门dept,菜单menu
     */
    @ApiModelProperty(value = "类型,部门ass,pet,sys", required = true)
    private String menuCode;

    /**
     * 
     */
    @ApiModelProperty(value = "公司id", required = true)
    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTyperCode() {
        return typerCode;
    }

    public void setTyperCode(String typerCode) {
        this.typerCode = typerCode == null ? null : typerCode.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}