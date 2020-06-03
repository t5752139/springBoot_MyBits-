package com.ky.jyg.process.task.mapper;

import com.ky.jyg.process.task.pojo.WfTask;
import com.ky.jyg.process.task.pojo.WfTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfTaskMapper {
    int countByExample(WfTaskExample example);

    int deleteByExample(WfTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WfTask record);

    int insertSelective(WfTask record);

    List<WfTask> selectByExample(WfTaskExample example);

    WfTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WfTask record, @Param("example") WfTaskExample example);

    int updateByExample(@Param("record") WfTask record, @Param("example") WfTaskExample example);

    int updateByPrimaryKeySelective(WfTask record);

    int updateByPrimaryKey(WfTask record);
}