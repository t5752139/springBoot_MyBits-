package com.ky.jyg.assess.assess.mapper;

import com.ky.jyg.assess.assess.pojo.AssessLand;
import com.ky.jyg.assess.assess.pojo.AssessLandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessLandMapper {
    int countByExample(AssessLandExample example);

    int deleteByExample(AssessLandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessLand record);

    int insertSelective(AssessLand record);

    List<AssessLand> selectByExample(AssessLandExample example);

    AssessLand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessLand record, @Param("example") AssessLandExample example);

    int updateByExample(@Param("record") AssessLand record, @Param("example") AssessLandExample example);

    int updateByPrimaryKeySelective(AssessLand record);

    int updateByPrimaryKey(AssessLand record);
}