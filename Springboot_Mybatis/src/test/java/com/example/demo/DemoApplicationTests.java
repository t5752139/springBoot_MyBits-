package com.example.demo;

import com.example.DemoApplication;
import com.example.entity.Menu;
import com.example.entity.MenuFunction;
import com.example.examle.MenuExample;
import com.example.mapper.MenuFunctionMapper;
import com.example.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {


    @Autowired
   private MenuMapper menuMapper;
    @Autowired
    private MenuFunctionMapper menuFunctionMapper;

    @Test
    public void tets1(){
        MenuExample example = new MenuExample();
        List<Menu> list = menuMapper.selectByExample(example);
        for (Menu menu : list) {
            MenuFunction function = new MenuFunction();
            function.setMenuId(menu.getId());
            function.setName("edit");
            MenuFunction function1 = new MenuFunction();
            function1.setMenuId(menu.getId());
            function1.setName("list");
            MenuFunction function2 = new MenuFunction();
            function2.setMenuId(menu.getId());
            function2.setName("delete");
            MenuFunction function3 = new MenuFunction();
            function3.setMenuId(menu.getId());
            function3.setName("updata");

            menuFunctionMapper.insertSelective(function);
            menuFunctionMapper.insertSelective(function1);
            menuFunctionMapper.insertSelective(function2);
            menuFunctionMapper.insertSelective(function3);



        }



    }

}
