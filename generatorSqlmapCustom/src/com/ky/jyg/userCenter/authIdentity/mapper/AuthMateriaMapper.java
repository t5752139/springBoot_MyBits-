package com.ky.jyg.userCenter.authIdentity.mapper;

import com.ky.jyg.userCenter.authIdentity.pojo.AuthMateria;
import com.ky.jyg.userCenter.authIdentity.pojo.AuthMateriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthMateriaMapper {
    int countByExample(AuthMateriaExample example);

    int deleteByExample(AuthMateriaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthMateria record);

    int insertSelective(AuthMateria record);

    List<AuthMateria> selectByExample(AuthMateriaExample example);

    AuthMateria selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthMateria record, @Param("example") AuthMateriaExample example);

    int updateByExample(@Param("record") AuthMateria record, @Param("example") AuthMateriaExample example);

    int updateByPrimaryKeySelective(AuthMateria record);

    int updateByPrimaryKey(AuthMateria record);
}