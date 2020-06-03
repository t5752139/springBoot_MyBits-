package com.ky.jyg.userCenter.console.mapper;

import com.ky.jyg.userCenter.console.pojo.RealnnameAuthentication;
import com.ky.jyg.userCenter.console.pojo.RealnnameAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealnnameAuthenticationMapper {
    int countByExample(RealnnameAuthenticationExample example);

    int deleteByExample(RealnnameAuthenticationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RealnnameAuthentication record);

    int insertSelective(RealnnameAuthentication record);

    List<RealnnameAuthentication> selectByExample(RealnnameAuthenticationExample example);

    RealnnameAuthentication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RealnnameAuthentication record, @Param("example") RealnnameAuthenticationExample example);

    int updateByExample(@Param("record") RealnnameAuthentication record, @Param("example") RealnnameAuthenticationExample example);

    int updateByPrimaryKeySelective(RealnnameAuthentication record);

    int updateByPrimaryKey(RealnnameAuthentication record);
}