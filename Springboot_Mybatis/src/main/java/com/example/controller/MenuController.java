package com.example.controller;

import com.example.model.ReturnValue;
import com.example.service.MenuService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;




    @GetMapping("/datagrid/{uid:\\d+}")
    @ApiOperation(value = "根据用户id查看菜单结构", httpMethod = "GET")
    public ReturnValue datagrid(@PathVariable Integer uid){
        ReturnValue rv =null;
        try {
            rv =  menuService.datagrid(uid);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ReturnValue.fail();
        }
        return rv;
    }


    @GetMapping("/find")
    @ApiOperation(value = "查询菜单全部", httpMethod = "GET")
    public ReturnValue find(){
        ReturnValue returnValue = menuService.find();
        return returnValue;
    }

    @GetMapping("menu/{uid:\\d+}/{cid:\\d+}")
    @ApiOperation(value = "指定最高权限人", httpMethod = "GET")
    @ApiImplicitParams({@ApiImplicitParam(name = "cid", value = "企业id", paramType = "path", required = true),
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true)})
    public ReturnValue datagridMenu(@PathVariable Integer uid, @PathVariable Integer cid){
        ReturnValue rv = null;
        try {
            rv = menuService.datagridMenu(uid, cid);
        }catch (Exception e){
            e.printStackTrace();
            rv=ReturnValue.fail();
        }
        return rv;
    }




}
