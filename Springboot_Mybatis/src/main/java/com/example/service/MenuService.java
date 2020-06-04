package com.example.service;

import com.example.model.ReturnValue;

public interface MenuService {

    ReturnValue find();

    ReturnValue datagridMenu(Integer uid, Integer cid);

    ReturnValue datagrid(Integer uid);
}
