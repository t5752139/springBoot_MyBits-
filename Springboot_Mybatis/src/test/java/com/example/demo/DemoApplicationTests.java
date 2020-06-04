package com.example.demo;

import com.example.DemoApplication;
import com.example.entity.Menu;
import com.example.model.ReturnValue;
import com.example.service.MenuService;
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
    private MenuService menuService;

    @Test
    public void tets1(){
        ReturnValue returnValue = menuService.find();
        List<Menu> data = (List<Menu>) returnValue.getData();

        System.out.println(data);
    }

}
