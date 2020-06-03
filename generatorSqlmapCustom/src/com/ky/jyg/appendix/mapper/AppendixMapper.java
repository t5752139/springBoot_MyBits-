package com.ky.jyg.appendix.mapper;

import com.ky.jyg.appendix.pojo.Appendix;
import com.ky.jyg.appendix.pojo.AppendixExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppendixMapper {
    int countByExample(AppendixExample example);

    int deleteByExample(AppendixExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Appendix record);

    int insertSelective(Appendix record);

    List<Appendix> selectByExample(AppendixExample example);

    Appendix selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Appendix record, @Param("example") AppendixExample example);

    int updateByExample(@Param("record") Appendix record, @Param("example") AppendixExample example);

    int updateByPrimaryKeySelective(Appendix record);

    int updateByPrimaryKey(Appendix record);
}