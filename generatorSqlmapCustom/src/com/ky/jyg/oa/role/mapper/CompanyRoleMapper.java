package com.ky.jyg.oa.role.mapper;

import com.ky.jyg.oa.role.pojo.CompanyRole;
import com.ky.jyg.oa.role.pojo.CompanyRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyRoleMapper {
    int countByExample(CompanyRoleExample example);

    int deleteByExample(CompanyRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyRole record);

    int insertSelective(CompanyRole record);

    List<CompanyRole> selectByExample(CompanyRoleExample example);

    CompanyRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyRole record, @Param("example") CompanyRoleExample example);

    int updateByExample(@Param("record") CompanyRole record, @Param("example") CompanyRoleExample example);

    int updateByPrimaryKeySelective(CompanyRole record);

    int updateByPrimaryKey(CompanyRole record);
}