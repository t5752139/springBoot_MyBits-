package com.ky.jyg.assess.accept.mapper;

import com.ky.jyg.assess.accept.pojo.Accept;
import com.ky.jyg.assess.accept.pojo.AcceptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceptMapper {
    int countByExample(AcceptExample example);

    int deleteByExample(AcceptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Accept record);

    int insertSelective(Accept record);

    List<Accept> selectByExample(AcceptExample example);

    Accept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Accept record, @Param("example") AcceptExample example);

    int updateByExample(@Param("record") Accept record, @Param("example") AcceptExample example);

    int updateByPrimaryKeySelective(Accept record);

    int updateByPrimaryKey(Accept record);
}