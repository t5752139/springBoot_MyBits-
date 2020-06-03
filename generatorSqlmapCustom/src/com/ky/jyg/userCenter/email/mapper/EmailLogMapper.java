package com.ky.jyg.userCenter.email.mapper;

import com.ky.jyg.userCenter.email.pojo.EmailLog;
import com.ky.jyg.userCenter.email.pojo.EmailLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailLogMapper {
    int countByExample(EmailLogExample example);

    int deleteByExample(EmailLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EmailLog record);

    int insertSelective(EmailLog record);

    List<EmailLog> selectByExample(EmailLogExample example);

    EmailLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EmailLog record, @Param("example") EmailLogExample example);

    int updateByExample(@Param("record") EmailLog record, @Param("example") EmailLogExample example);

    int updateByPrimaryKeySelective(EmailLog record);

    int updateByPrimaryKey(EmailLog record);
}