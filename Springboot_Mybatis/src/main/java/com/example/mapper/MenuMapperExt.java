package com.example.mapper;

import com.example.entity.*;
import com.example.entity.vo.MenuVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MenuMapperExt {


    void insertAll(List<MenuRole> list);


    List<MenuVo> datagrid(@Param("uid") Integer uid);

    Menu permissions(@Param("id") Integer id, @Param("uid") Integer uid,@Param("mid") Integer mid);

    List<Role> getRoles(@Param("uid") Integer uid,@Param("companyId") Integer companyId);

    List<Integer> getRoleIds(@Param("id") Integer id);

    void addRoleMenus( List<MenuRole> list);

    List<UserRole> fandUserRole(@Param("uid") Integer uid,@Param("roleId") Integer roleId);

    User fandById(@Param("id") Integer id);

    List<Role> selectRole(@Param("uid") Integer uid);

    void delectUserRole(@Param("uid") Integer uid, @Param("id") Integer id);

    void deleteRole(@Param("id") Integer id);

    void deleleteMenuRole(@Param("id") Integer id);

    Menu fundByMenuId(@Param("id") Integer id);

    void updataMenu(Menu bean);
}
