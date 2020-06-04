package com.example.entity.vo;

import lombok.Data;

import java.util.List;

@Data
public class MenuVo {
    private Integer id;

    private Integer parentId;

    private String name;

    private List<MenuVo> childrens;
}
