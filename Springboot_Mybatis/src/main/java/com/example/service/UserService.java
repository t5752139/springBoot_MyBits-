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
        for (Tree tree : trees) {
            //一级节点
            if(tree.getpId()==0){
                Tree t=new Tree();
                t.setId(tree.getId());
                t.setName(tree.getName());
                t.setpId(tree.getpId());
                tree(trees,t,tree.getId());
                list.add(t);
            }
        }
        return list;
    }
    private void tree( List<Tree> trees,Tree tree,int id){
        List<Tree> list =new ArrayList<>();
        for (Tree tree1 : trees) {
            if(tree1.getpId()==id){
                Tree t=new Tree();
                t.setId(tree1.getId());
                t.setName(tree1.getName());
                t.setpId(tree1.getpId());
                tree(trees,t,tree1.getId());
                list.add(t);
            }
        }
        tree.setList(list);


    }

}
