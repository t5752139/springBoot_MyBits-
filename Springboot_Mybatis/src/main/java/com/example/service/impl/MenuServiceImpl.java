package com.example.service.impl;

import com.example.entity.*;
import com.example.entity.vo.MenuVo;
import com.example.examle.MenuExample;
import com.example.examle.RoleExample;
import com.example.examle.UserRoleExample;
import com.example.mapper.MenuMapper;
import com.example.mapper.MenuMapperExt;
import com.example.mapper.RoleMapper;
import com.example.mapper.UserRoleMapper;
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
    public ReturnValue datagridMenu(Integer uid, Integer cid) {
        UserRoleExample ex =new UserRoleExample();
        ex.createCriteria().andUserIdEqualTo(uid);
        List<UserRole> userRoles = userRoleMapper.selectByExample(ex);
        if(!(userRoles.isEmpty())){
            List<Integer> collect = userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList());
            RoleExample roleExample = new RoleExample();
            roleExample.createCriteria().andIdIn(collect);
            boolean sys = roleMapper.selectByExample(roleExample).stream().map(Role::getRoleCode).anyMatch(n -> n.equals("sys"));
            if(sys)
               return ReturnValue.failMessage("已经是最高 权限人");
        }
        Role role = new Role();
        role.setName("最高权限人");
        role.setRoleCode("sys");
        role.setSystemName("最高权限人");
        roleMapper.insertSelective(role);
        List<Menu> list = new ArrayList<>();
        MenuExample example = new MenuExample();
        example.createCriteria().andCompanyIdEqualTo(cid);
        List<Menu> menus = menuMapper.selectByExample(example);
        for (Menu menu : menus) {
            if (menu.getParentId() == 0) {
                getMenus(menus, list, menu.getId());
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
        UserRole userRole =new UserRole();
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
            if(menuVo.getParentId() == 0){
                getMenuVos(list,menuVo,menuVo.getId());
                menuVos.add(menuVo);
            }

        }
      return  ReturnValue.success(menuVos);
    }

    private void getMenuVos(List<MenuVo> list, MenuVo menuVo, Integer parentId) {
        List<MenuVo> menuVos = new ArrayList<>();

        for (MenuVo vo : list) {
            if (vo.getParentId() == parentId){
                getMenuVos(list,vo,vo.getId());
                menuVos.add(vo);
            }
        }
        menuVo.setChildrens(menuVos);
    }


    private void getMenus(List<Menu> menus, List<Menu> list, Integer parentId) {
        for (Menu menu : menus) {
            if (menu.getParentId() == parentId) {
                getMenus(menus, list, menu.getId());
                list.add(menu);
            }
        }
    }
}
