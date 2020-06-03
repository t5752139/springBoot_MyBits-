package com.ky.jyg.sys.dictionary.mapper;

import com.ky.jyg.sys.dictionary.pojo.DictItem;
import com.ky.jyg.sys.dictionary.pojo.DictItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictItemMapper {
    int countByExample(DictItemExample example);

    int deleteByExample(DictItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DictItem record);

    int insertSelective(DictItem record);

    List<DictItem> selectByExample(DictItemExample example);

    DictItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DictItem record, @Param("example") DictItemExample example);

    int updateByExample(@Param("record") DictItem record, @Param("example") DictItemExample example);

    int updateByPrimaryKeySelective(DictItem record);

    int updateByPrimaryKey(DictItem record);
}