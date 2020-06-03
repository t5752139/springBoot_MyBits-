package com.ky.jyg.userCenter.authIdentity.mapper;

import com.ky.jyg.userCenter.authIdentity.pojo.AuthMateriaTemplate;
import com.ky.jyg.userCenter.authIdentity.pojo.AuthMateriaTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthMateriaTemplateMapper {
    int countByExample(AuthMateriaTemplateExample example);

    int deleteByExample(AuthMateriaTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthMateriaTemplate record);

    int insertSelective(AuthMateriaTemplate record);

    List<AuthMateriaTemplate> selectByExample(AuthMateriaTemplateExample example);

    AuthMateriaTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthMateriaTemplate record, @Param("example") AuthMateriaTemplateExample example);

    int updateByExample(@Param("record") AuthMateriaTemplate record, @Param("example") AuthMateriaTemplateExample example);

    int updateByPrimaryKeySelective(AuthMateriaTemplate record);

    int updateByPrimaryKey(AuthMateriaTemplate record);
}