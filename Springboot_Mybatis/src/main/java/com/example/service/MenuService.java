package com.example.service;

import com.example.entity.Menu;
import com.example.model.ReturnValue;

public interface MenuService {

    ReturnValue find();

    ReturnValue datagridMenu(Integer uid, Integer cid,Integer id);

    ReturnValue datagrid(Integer uid);

    ReturnValue permissions(Integer id, Integer roleId,Integer uid, Integer mid);

    ReturnValue deleteMenuRole(Integer uid, Integer cid, Integer id);

    ReturnValue deleteMenu(Integer uid, Integer mid);

    ReturnValue updataMenu(Integer uid, Menu menu);

    ReturnValue addMenu(Integer uid, Menu menu);
}
