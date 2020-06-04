package com.example.service.impl;

import com.example.entity.Menu;
import com.example.examle.MenuExample;
import com.example.mapper.MenuMapper;
import com.example.model.ReturnValue;
import com.example.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

        @Autowired
    private MenuMapper menuMapper;


     public ReturnValue find(){
         MenuExample menuExample =new MenuExample();
         List<Menu> menus = menuMapper.selectByExample(menuExample);
         ReturnValue<List<Menu>> success = ReturnValue.success(menus);

         return success;


     }


}
