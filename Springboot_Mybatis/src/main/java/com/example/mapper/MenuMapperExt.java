package com.example.mapper;

import com.example.entity.Menu;
import com.example.entity.MenuRole;
import com.example.entity.vo.MenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapperExt {


    void insertAll(List<MenuRole> list);


    List<MenuVo> datagrid(@Param("uid") Integer uid);
}
