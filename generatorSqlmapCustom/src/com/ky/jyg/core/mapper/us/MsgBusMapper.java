package com.ky.jyg.core.mapper.us;

import com.ky.jyg.core.pojo.us.MsgBus;
import com.ky.jyg.core.pojo.us.MsgBusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgBusMapper {
    int countByExample(MsgBusExample example);

    int deleteByExample(MsgBusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MsgBus record);

    int insertSelective(MsgBus record);

    List<MsgBus> selectByExample(MsgBusExample example);

    MsgBus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MsgBus record, @Param("example") MsgBusExample example);

    int updateByExample(@Param("record") MsgBus record, @Param("example") MsgBusExample example);

    int updateByPrimaryKeySelective(MsgBus record);

    int updateByPrimaryKey(MsgBus record);
}