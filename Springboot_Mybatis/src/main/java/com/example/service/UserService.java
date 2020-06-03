package com.example.service;

import com.example.entity.Tree;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    /**
     * 查询
     */
    public List<User> select(){
       return userMapper.selectUser();
    }

    /**
     * 查询 树结构
     */
    public List<Tree> selectTree(){

        List<Tree> trees = userMapper.selectTree();
        List<Tree> list = new ArrayList<>();
        trees.forEach(tree -> {
            if(tree.getpId()==0){
                tree(trees,tree,tree.getId());
                list.add(tree);
            }
        });
        return list;
    }

    /**
     * 递归 排序下边n个树节点
     * @param trees
     * @param tree
     * @param id
     */
    private void tree( List<Tree> trees,Tree tree,int id) {
        List<Tree> list = new ArrayList<>();
        trees.forEach(tree1 -> {
            if (tree1.getpId() == id) {
                tree(trees, tree1, tree1.getId());
                list.add(tree1);
            }
        });
        tree.setList(list);
    }
}
