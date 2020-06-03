package com.ky.jyg.assess.assess.mapper;

import com.ky.jyg.assess.assess.pojo.HouseCompareCase;
import com.ky.jyg.assess.assess.pojo.HouseCompareCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseCompareCaseMapper {
    int countByExample(HouseCompareCaseExample example);

    int deleteByExample(HouseCompareCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseCompareCase record);

    int insertSelective(HouseCompareCase record);

    List<HouseCompareCase> selectByExample(HouseCompareCaseExample example);

    HouseCompareCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HouseCompareCase record, @Param("example") HouseCompareCaseExample example);

    int updateByExample(@Param("record") HouseCompareCase record, @Param("example") HouseCompareCaseExample example);

    int updateByPrimaryKeySelective(HouseCompareCase record);

    int updateByPrimaryKey(HouseCompareCase record);
}