package com.example.controller;

import com.example.entity.Menu;
import com.example.model.ReturnValue;
import com.example.service.MenuService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 添加menu
     */
    @PostMapping("/addMenu/{uid:\\d+}")
    @ApiOperation(value = "添加菜单",httpMethod = "POST")
    @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true)
    public ReturnValue addMenu(@PathVariable Integer uid,@Valid @RequestBody Menu menu){
        ReturnValue rv=null;
        try {
            rv =  menuService.addMenu(uid, menu);
        } catch (Exception e) {
            e.printStackTrace();
            rv= ReturnValue.fail();
        }
        return  rv;
    }

    /**
     * 根据用户权限修改菜单 信息
     * @param uid
     * @return
     */
    @PutMapping("/updata/{uid:\\d+}")
    @ApiOperation(value = "根据用户权限,修改某个菜单的页面",httpMethod = "PUT")
    @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true)
    public ReturnValue updataMenu(@PathVariable Integer uid,@Valid @RequestBody Menu menu){
        ReturnValue rv=null;
        try {
            rv =  menuService.updataMenu(uid, menu);
        } catch (Exception e) {
            e.printStackTrace();
            rv= ReturnValue.fail();
        }
        return  rv;
    }



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
    @GetMapping("permissions/{id:\\d+}/{uid:\\d+}/{mid:\\d+}/{roleId:\\d+}")
     @ApiOperation(value = "分配权限")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "指定人id", paramType = "path", required = true),
            @ApiImplicitParam(name = "uid", value = "被指定人id", paramType = "path", required = true),
            @ApiImplicitParam(name = "mid", value = "权限id", paramType = "path", required = true),
            @ApiImplicitParam(name = "roleId", value = "角色id", paramType = "path", required = true)})
     public ReturnValue permissions(@PathVariable Integer id,
                                    @PathVariable Integer uid,
                                    @PathVariable Integer mid ,
                                    @PathVariable Integer roleId){
            ReturnValue rv = null;
        try {
           rv = menuService.permissions(id,roleId,uid,mid);

        } catch (Exception e) {
            e.printStackTrace();
            rv = ReturnValue.fail();
        }
        return rv;
    }


    @GetMapping("menu/{uid:\\d+}/{cid:\\d+}/{id:\\d+}")
    @ApiOperation(value = "指定最高权限人", httpMethod = "GET")
    @ApiImplicitParams({@ApiImplicitParam(name = "cid", value = "企业id", paramType = "path", required = true),
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true),
            @ApiImplicitParam(name = "id", value = "admin用户", paramType = "path", required = true)})
    public ReturnValue datagridMenu(@PathVariable Integer uid, @PathVariable Integer cid,@PathVariable Integer id){
        ReturnValue rv = null;
        try {
            rv = menuService.datagridMenu(uid, cid,id);
        }catch (Exception e){
            e.printStackTrace();
            rv=ReturnValue.fail();
        }
        return rv;
    }
    @DeleteMapping(value = "deleteHighest/{uid:\\d+}/{cid:\\d+}/{id:\\d+}")
    @ApiOperation(value = "删除最高权限人", httpMethod = "DELETE")
    @ApiImplicitParams({@ApiImplicitParam(name = "cid", value = "企业id", paramType = "path", required = true),
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "path", required = true),
            @ApiImplicitParam(name = "id", value = "admin用户", paramType = "path", required = true)})
    public ReturnValue deleteMenuRole(@PathVariable Integer uid, @PathVariable Integer cid,@PathVariable Integer id){
        ReturnValue rv = null;
        try {
            rv = menuService.deleteMenuRole(uid, cid,id);
        }catch (Exception e){
            e.printStackTrace();
            rv=ReturnValue.fail();
        }
        return rv;
    }


    /**
     * 删除页面  最高权限人是直接删
     * @param uid 用户ID
     * @param mid 菜单ID
     * @return
     */
    @DeleteMapping(value = "deleteJurisdiction/{uid:\\d+}/{mid:\\d+}")
    @ApiOperation(value  = "删除页面",httpMethod = "DELETE")
    @ApiImplicitParams({@ApiImplicitParam(name = "uid", value = "登录id", paramType = "path", required = true),
            @ApiImplicitParam(name = "mid", value = "菜单id", paramType = "path", required = true)})
    public ReturnValue deleteJurisdiction (@PathVariable Integer uid,@PathVariable Integer mid){
        ReturnValue rv = null;
        try {
            rv = menuService.deleteMenu(uid, mid);
        }catch (Exception e){
            e.printStackTrace();
            rv=ReturnValue.fail();
        }
        return rv;
    }




}
