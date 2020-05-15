package com.example.mapper;

import com.example.entity.Tree;
import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {



    List<User> selectUser();

    List<Tree> selectTree();
}
