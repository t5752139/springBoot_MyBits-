package com.example.mapper;


import com.example.entity.MenuFunction;
import com.example.examle.MenuFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuFunctionMapper {
    int countByExample(MenuFunctionExample example);

    int deleteByExample(MenuFunctionExample example);

    int insert(MenuFunction record);

    int insertSelective(MenuFunction record);

    List<MenuFunction> selectByExample(MenuFunctionExample example);

    int updateByExampleSelective(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);

    int updateByExample(@Param("record") MenuFunction record, @Param("example") MenuFunctionExample example);
}