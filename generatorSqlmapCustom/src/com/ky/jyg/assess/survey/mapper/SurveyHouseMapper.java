package com.ky.jyg.assess.survey.mapper;

import com.ky.jyg.assess.survey.pojo.SurveyHouse;
import com.ky.jyg.assess.survey.pojo.SurveyHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyHouseMapper {
    int countByExample(SurveyHouseExample example);

    int deleteByExample(SurveyHouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SurveyHouse record);

    int insertSelective(SurveyHouse record);

    List<SurveyHouse> selectByExample(SurveyHouseExample example);

    SurveyHouse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SurveyHouse record, @Param("example") SurveyHouseExample example);

    int updateByExample(@Param("record") SurveyHouse record, @Param("example") SurveyHouseExample example);

    int updateByPrimaryKeySelective(SurveyHouse record);

    int updateByPrimaryKey(SurveyHouse record);
}