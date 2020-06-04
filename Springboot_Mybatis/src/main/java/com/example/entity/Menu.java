package com.example.entity;

public class Menu {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * lujing
     */
    private String url;

    /**
     * 菜单m,按钮b
     */
    private String typerCode;

    /**
     * 类型,部门dept,菜单menu
     */
    private String menuCode;

    /**
     * 
     */
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}