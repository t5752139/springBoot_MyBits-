package com.mall.mapper;

import com.mall.pojo.UsBlacklist;
import com.mall.pojo.UsBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsBlacklistMapper {
    int countByExample(UsBlacklistExample example);

    int deleteByExample(UsBlacklistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsBlacklist record);

    int insertSelective(UsBlacklist record);

    List<UsBlacklist> selectByExample(UsBlacklistExample example);

    UsBlacklist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UsBlacklist record, @Param("example") UsBlacklistExample example);

    int updateByExample(@Param("record") UsBlacklist record, @Param("example") UsBlacklistExample example);

    int updateByPrimaryKeySelective(UsBlacklist record);

    int updateByPrimaryKey(UsBlacklist record);
}