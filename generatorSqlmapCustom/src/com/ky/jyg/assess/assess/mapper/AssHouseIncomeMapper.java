package com.ky.jyg.assess.assess.mapper;

import com.ky.jyg.assess.assess.pojo.AssHouseIncome;
import com.ky.jyg.assess.assess.pojo.AssHouseIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssHouseIncomeMapper {
    int countByExample(AssHouseIncomeExample example);

    int deleteByExample(AssHouseIncomeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssHouseIncome record);

    int insertSelective(AssHouseIncome record);

    List<AssHouseIncome> selectByExample(AssHouseIncomeExample example);

    AssHouseIncome selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssHouseIncome record, @Param("example") AssHouseIncomeExample example);

    int updateByExample(@Param("record") AssHouseIncome record, @Param("example") AssHouseIncomeExample example);

    int updateByPrimaryKeySelective(AssHouseIncome record);

    int updateByPrimaryKey(AssHouseIncome record);
}