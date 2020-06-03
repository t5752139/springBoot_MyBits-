package com.ky.jyg.assess.assess.mapper;

import com.ky.jyg.assess.assess.pojo.AssessHouse;
import com.ky.jyg.assess.assess.pojo.AssessHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessHouseMapper {
    int countByExample(AssessHouseExample example);

    int deleteByExample(AssessHouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessHouse record);

    int insertSelective(AssessHouse record);

    List<AssessHouse> selectByExample(AssessHouseExample example);

    AssessHouse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessHouse record, @Param("example") AssessHouseExample example);

    int updateByExample(@Param("record") AssessHouse record, @Param("example") AssessHouseExample example);

    int updateByPrimaryKeySelective(AssessHouse record);

    int updateByPrimaryKey(AssessHouse record);
}