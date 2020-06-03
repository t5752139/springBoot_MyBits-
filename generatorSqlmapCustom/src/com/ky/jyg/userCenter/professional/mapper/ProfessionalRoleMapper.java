package com.ky.jyg.userCenter.professional.mapper;

import com.ky.jyg.userCenter.professional.pojo.ProfessionalRole;
import com.ky.jyg.userCenter.professional.pojo.ProfessionalRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalRoleMapper {
    int countByExample(ProfessionalRoleExample example);

    int deleteByExample(ProfessionalRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProfessionalRole record);

    int insertSelective(ProfessionalRole record);

    List<ProfessionalRole> selectByExample(ProfessionalRoleExample example);

    ProfessionalRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProfessionalRole record, @Param("example") ProfessionalRoleExample example);

    int updateByExample(@Param("record") ProfessionalRole record, @Param("example") ProfessionalRoleExample example);

    int updateByPrimaryKeySelective(ProfessionalRole record);

    int updateByPrimaryKey(ProfessionalRole record);
}