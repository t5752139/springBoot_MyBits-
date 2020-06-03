package com.ky.jyg.assess.entrust.mapper;

import com.ky.jyg.assess.entrust.pojo.Entrust;
import com.ky.jyg.assess.entrust.pojo.EntrustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrustMapper {
    int countByExample(EntrustExample example);

    int deleteByExample(EntrustExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Entrust record);

    int insertSelective(Entrust record);

    List<Entrust> selectByExample(EntrustExample example);

    Entrust selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Entrust record, @Param("example") EntrustExample example);

    int updateByExample(@Param("record") Entrust record, @Param("example") EntrustExample example);

    int updateByPrimaryKeySelective(Entrust record);

    int updateByPrimaryKey(Entrust record);
}