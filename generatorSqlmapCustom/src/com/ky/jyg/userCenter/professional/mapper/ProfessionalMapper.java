package com.ky.jyg.userCenter.professional.mapper;

import com.ky.jyg.userCenter.professional.pojo.Professional;
import com.ky.jyg.userCenter.professional.pojo.ProfessionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalMapper {
    int countByExample(ProfessionalExample example);

    int deleteByExample(ProfessionalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Professional record);

    int insertSelective(Professional record);

    List<Professional> selectByExample(ProfessionalExample example);

    Professional selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByExample(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByPrimaryKeySelective(Professional record);

    int updateByPrimaryKey(Professional record);
}