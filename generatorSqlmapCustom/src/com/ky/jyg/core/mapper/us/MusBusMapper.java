package com.ky.jyg.core.mapper.us;

import com.ky.jyg.core.pojo.us.MusBus;
import com.ky.jyg.core.pojo.us.MusBusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusBusMapper {
    int countByExample(MusBusExample example);

    int deleteByExample(MusBusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MusBus record);

    int insertSelective(MusBus record);

    List<MusBus> selectByExample(MusBusExample example);

    MusBus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MusBus record, @Param("example") MusBusExample example);

    int updateByExample(@Param("record") MusBus record, @Param("example") MusBusExample example);

    int updateByPrimaryKeySelective(MusBus record);

    int updateByPrimaryKey(MusBus record);
}