package com.example.service.impl;

import com.example.entity.*;
import com.example.entity.vo.MenuVo;
import com.example.examle.*;
import com.example.mapper.*;
import com.example.model.ReturnValue;
import com.example.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapperExt menuMapperExt;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private MenuRoleMapper menuRoleMapper;

    public ReturnValue find() {
        MenuExample menuExample = new MenuExample();
        // menuExample.createCriteria().andIdEqualTo(1);
        List<MenuVo> menuVos = new ArrayList<>();
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        menus.forEach(menu -> {
            if (menu.getParentId() == 0) {
                MenuVo vo = new MenuVo();
                BeanUtils.copyProperties(menu, vo);
                getChildrenMenu(menus, vo, menu.getId());
                menuVos.add(vo);
            }

        });
        ReturnValue<List<MenuVo>> success = ReturnValue.success(menuVos);

        return success;

    }

    private void getChildrenMenu(List<Menu> menus, MenuVo vo, Integer id) {
        List<MenuVo> menuVos = new ArrayList<>();
        menus.forEach(menu -> {
            if (menu.getParentId() == id) {
                MenuVo menuVo = new MenuVo();
                BeanUtils.copyProperties(menu, menuVo);
                getChildrenMenu(menus, menuVo, menu.getId());
                menuVos.add(menuVo);
            }
        });

        vo.setChildrens(menuVos);
    }


    @Override
    public ReturnValue datagridMenu(Integer uid, Integer cid, Integer id) {

          User user =menuMapperExt.fandById(id);
          if(user == null ){
              return ReturnValue.failMessage("没有该用户");
          }else if (!"admin".equals(user.getName())){
              return ReturnValue.failMessage("不是admin用户");
          }
        UserRoleExample ex = new UserRoleExample();
        ex.createCriteria().andUserIdEqualTo(uid);
        List<UserRole> userRoles = userRoleMapper.selectByExample(ex);
        if (!(userRoles.isEmpty())) {
            List<Integer> collect = userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList());
            RoleExample roleExample = new RoleExample();
            roleExample.createCriteria().andIdIn(collect);
            boolean sys = roleMapper.selectByExample(roleExample).stream().map(Role::getRoleCode).anyMatch(n -> n.equals("sys"));
            if (sys)
                return ReturnValue.failMessage("已经是最高 权限人");
        }
        Role role = new Role();
        role.setName("最高权限人");
        role.setRoleCode("sys");
        role.setSystemName("最高权限人");
        role.setCompanyId(cid);
        roleMapper.insertSelective(role);
        List<Menu> list = new ArrayList<>();
        MenuExample example = new MenuExample();
        example.createCriteria().andCompanyIdEqualTo(cid);
        List<Menu> menus = menuMapper.selectByExample(example);
        for (Menu menu : menus) {
            if (menu.getParentId() == 0) {
                getMenus(menus, list, menu.getId(), false);
                list.add(menu);
            }
        }
        List<MenuRole> collect = list.stream()
                .map(n -> {
                    MenuRole menuRole = new MenuRole();
                    menuRole.setMenuId(n.getId());
                    menuRole.setRoleId(role.getId());
                    return menuRole;
                })
                .collect(Collectors.toList());
        menuMapperExt.insertAll(collect);
        UserRole userRole = new UserRole();
        userRole.setRoleId(role.getId());
        userRole.setUserId(uid);
        userRoleMapper.insertSelective(userRole);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue datagrid(Integer uid) {
        List<MenuVo> menuVos = new ArrayList<>();
        List<MenuVo> list = menuMapperExt.datagrid(uid);
        for (MenuVo menuVo : list) {
            if (menuVo.getParentId() == 0) {
                getMenuVos(list, menuVo, menuVo.getId());
                menuVos.add(menuVo);
            }
        }
        return ReturnValue.success(menuVos);
    }

    @Override
    public ReturnValue permissions(Integer id,Integer roleId, Integer uid, Integer mid) {
        Menu menu = menuMapperExt.permissions(id, uid, mid);
        if (menu == null)
            return ReturnValue.failMessage("指定人没有权限");
            RoleExample roleExample = new RoleExample();
           roleExample.createCriteria().andIdEqualTo(roleId);
        boolean flag = roleMapper.selectByExample(roleExample).stream().map(Role::getRoleCode).anyMatch(s -> "ass".equals(s) );
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andCompanyIdEqualTo(menu.getCompanyId());
        List<Menu> list = menuMapper.selectByExample(menuExample);
        List<Menu> ody = list.stream().filter(n -> "ody".equals(n.getTyperCode())).collect(Collectors.toList());
        List <Menu> ass= null;
        if(flag)
         ass = list.stream().filter(n -> "ass".equals(n.getTyperCode())).collect(Collectors.toList());
        List<Menu> menus = new ArrayList<>();
        menus.add(menu);
        //取下面节点
            for (Menu n : list) {
                //向下去
                if (n.getParentId() == mid) {
                    menus.add(n);
                    getMenus(list, menus, n.getId(), flag);
                }
                //向上去
                if (n.getId() == menu.getParentId()
                        && ("ass".equals(n.getTyperCode())
                        || "sys".equals(n.getTyperCode()))) {
                    menus.add(n);
                    getChildren(list, menus, n.getParentId());
                }
            }
        menus.addAll(ody);
        menus.addAll(ass);
        List<Integer> uids = menus.stream().map(Menu::getId).collect(Collectors.toList());
       List<Integer> ids = menuMapperExt.getRoleIds(id);
       uids.retainAll(ids);
        List<MenuRole> collect = uids.stream().map(n -> {
            MenuRole menuRole = new MenuRole();
            menuRole.setMenuId(n);
            menuRole.setRoleId(roleId);
            return menuRole;
        }).collect(Collectors.toList());
        MenuRoleExample menuRoleExample = new MenuRoleExample();
        menuRoleExample.createCriteria().andRoleIdEqualTo(roleId);
        menuRoleMapper.deleteByExample(menuRoleExample);
        menuMapperExt.addRoleMenus(collect);
        List<UserRole> userRoles = menuMapperExt.fandUserRole(uid,roleId);
        if(userRoles.isEmpty()){
            UserRole userRole = new UserRole();
            userRole.setUserId(uid);
            userRole.setRoleId(roleId);
            userRoleMapper.insertSelective(userRole);
        }
        return ReturnValue.success();
    }

    @Override
    public ReturnValue deleteMenuRole(Integer uid, Integer cid, Integer id) {
        User user =menuMapperExt.fandById(id);
        if(user == null ){
            return ReturnValue.failMessage("没有该用户");
        }else if (!"admin".equals(user.getName())){
            return ReturnValue.failMessage("不是admin用户");
        }
       List<Role> roles = menuMapperExt.selectRole(uid);

       List<Role> collect=null;
        if(roles.isEmpty()){
            return ReturnValue.fail();
        }else {
             collect = roles.stream().filter(n -> "sys".equals(n.getRoleCode())).collect(Collectors.toList());
            if (collect.isEmpty())
                return ReturnValue.fail();
        }
        menuMapperExt.delectUserRole(uid,collect.get(0).getId());
        menuMapperExt.deleteRole(collect.get(0).getId());
        menuMapperExt.deleleteMenuRole(collect.get(0).getId());
        return ReturnValue.success();
    }

    @Override
    public ReturnValue deleteMenu(Integer uid, Integer mid) {
        //判断是否是admin用户 或是 最高权限人
        User user = menuMapperExt.fandById(uid);
        List<Role> roles = menuMapperExt.selectRole(uid);
        boolean b = roles.stream().map(Role::getRoleCode).anyMatch(s -> "sys".equals(s));
        if("admin".equals(user.getRealname()) || b){
            MenuExample example = new MenuExample();
            example.createCriteria().andIdEqualTo(mid);
            menuMapper.deleteByExample(example);
            return ReturnValue.success();
        }
        roles.forEach(n -> {
            MenuRoleExample menuRoleExample =  new MenuRoleExample();
            menuRoleExample.createCriteria().andRoleIdEqualTo(n.getId()).andMenuIdEqualTo(mid);
            menuRoleMapper.deleteByExample(menuRoleExample);
        });
        return ReturnValue.success();
    }

    @Override
    public ReturnValue updataMenu(Integer uid, Menu menu) {
        //查询用户是否又该用的权限
        List<Integer> roleIds = menuMapperExt.getRoleIds(uid);
        boolean b = roleIds.stream().anyMatch(s -> menu.getId() == s);
       /* User user = menuMapperExt.fandById(uid);
        if("admin".equals(user.getRealname()))
            b=true;*/
        if(b){
           Menu bean= menuMapperExt.fundByMenuId(menu.getId());
           BeanUtils.copyProperties(menu,bean);
            System.out.println(bean);
           menuMapperExt.updataMenu(bean);
           return ReturnValue.success();
        }
        return ReturnValue.failMessage("没有修改这个页面的权限");
    }

    @Override
    public ReturnValue addMenu(Integer uid, Menu menu) {
        //查询用户是否又该用的权限
        List<Integer> roleIds = menuMapperExt.getRoleIds(uid);
        boolean b = roleIds.stream().anyMatch(s -> menu.getParentId() == s);
       /* User user = menuMapperExt.fandById(uid);
        if("admin".equals(user.getRealname()))
            b=true;*/
        if(b){
            menuMapper.insertSelective(menu);
            List<MenuRole> collect = menuMapperExt.selectRole(uid).stream().map(n -> {
                MenuRole menuRole = new MenuRole();
                menuRole.setRoleId(n.getId());
                menuRole.setMenuId(menu.getId());
                return menuRole;
            }).collect(Collectors.toList());
            menuMapperExt.addRoleMenus(collect);
            return ReturnValue.success();
        }
        return ReturnValue.failMessage("没有添加这个页面的权限");

    }

    private void getChildren(List<Menu> list, List<Menu> menus, Integer parentId) {
        for (Menu menu1 : list) {
            if (menu1.getId() == parentId
                    && ("ass".equals(menu1.getTyperCode())
                    || "sys".equals(menu1.getTyperCode()))) {
//                if("pet".equals(menu1.getTyperCode()))
//                    continue;
                menus.add(menu1);
                getChildren(list, menus, menu1.getParentId());
            }
        }
    }

    private void getMenuVos(List<MenuVo> list, MenuVo menuVo, Integer parentId) {
        List<MenuVo> menuVos = new ArrayList<>();

        for (MenuVo vo : list) {
            if (vo.getParentId() == parentId) {
                getMenuVos(list, vo, vo.getId());
                menuVos.add(vo);
            }
        }
        menuVo.setChildrens(menuVos);
    }
    private void getMenus(List<Menu> menus, List<Menu> list, Integer parentId, boolean falg) {
        for (Menu menu : menus) {
            if (menu.getParentId() == parentId) {
                if("pet".equals(menu.getTyperCode()))
                    continue;
                list.add(menu);
                getMenus(menus, list, menu.getId(), falg);
            }
        }
    }
}
