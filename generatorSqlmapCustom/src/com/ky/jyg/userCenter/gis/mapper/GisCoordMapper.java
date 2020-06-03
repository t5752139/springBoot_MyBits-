package com.ky.jyg.userCenter.gis.mapper;

import com.ky.jyg.userCenter.gis.pojo.GisCoord;
import com.ky.jyg.userCenter.gis.pojo.GisCoordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GisCoordMapper {

    int deleteByExample(GisCoordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GisCoord record);

    int insertSelective(GisCoord record);

    int updateByPrimaryKeySelective(GisCoord record);

    int updateByPrimaryKeyWithBLOBs(GisCoord record);
}