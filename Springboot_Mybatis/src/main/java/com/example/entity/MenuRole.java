package com.example.entity;

import lombok.Data;

@Data
public class MenuRole {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer menuId;

    /**
     * 
     */
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}