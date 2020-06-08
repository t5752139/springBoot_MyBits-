package com.example.entity;

import lombok.Data;

@Data
public class Role {
    /**
     * 
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 平台名称
     */
    private String systemName;
    /**
     * 公司id
     */
   private Integer companyId;
}