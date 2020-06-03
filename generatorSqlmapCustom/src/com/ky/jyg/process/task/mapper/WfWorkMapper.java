package com.ky.jyg.process.task.mapper;

import com.ky.jyg.process.task.pojo.WfWork;
import com.ky.jyg.process.task.pojo.WfWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfWorkMapper {
    int countByExample(WfWorkExample example);

    int deleteByExample(WfWorkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WfWork record);

    int insertSelective(WfWork record);

    List<WfWork> selectByExample(WfWorkExample example);

    WfWork selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WfWork record, @Param("example") WfWorkExample example);

    int updateByExample(@Param("record") WfWork record, @Param("example") WfWorkExample example);

    int updateByPrimaryKeySelective(WfWork record);

    int updateByPrimaryKey(WfWork record);
}