package com.ky.jyg.assess.survey.mapper;

import com.ky.jyg.assess.survey.pojo.SurveyLand;
import com.ky.jyg.assess.survey.pojo.SurveyLandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyLandMapper {
    int countByExample(SurveyLandExample example);

    int deleteByExample(SurveyLandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SurveyLand record);

    int insertSelective(SurveyLand record);

    List<SurveyLand> selectByExample(SurveyLandExample example);

    SurveyLand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SurveyLand record, @Param("example") SurveyLandExample example);

    int updateByExample(@Param("record") SurveyLand record, @Param("example") SurveyLandExample example);

    int updateByPrimaryKeySelective(SurveyLand record);

    int updateByPrimaryKey(SurveyLand record);
}