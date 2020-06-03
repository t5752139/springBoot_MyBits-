package com.ky.jyg.sys.user.mapper;

import com.ky.jyg.sys.user.pojo.UserSystem;
import com.ky.jyg.sys.user.pojo.UserSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSystemMapper {
    int countByExample(UserSystemExample example);

    int deleteByExample(UserSystemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSystem record);

    int insertSelective(UserSystem record);

    List<UserSystem> selectByExample(UserSystemExample example);

    UserSystem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSystem record, @Param("example") UserSystemExample example);

    int updateByExample(@Param("record") UserSystem record, @Param("example") UserSystemExample example);

    int updateByPrimaryKeySelective(UserSystem record);

    int updateByPrimaryKey(UserSystem record);
}