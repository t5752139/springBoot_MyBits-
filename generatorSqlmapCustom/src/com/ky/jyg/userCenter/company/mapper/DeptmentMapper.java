package com.ky.jyg.userCenter.company.mapper;

import com.ky.jyg.userCenter.company.pojo.Deptment;
import com.ky.jyg.userCenter.company.pojo.DeptmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptmentMapper {
    int countByExample(DeptmentExample example);

    int deleteByExample(DeptmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Deptment record);

    int insertSelective(Deptment record);

    List<Deptment> selectByExample(DeptmentExample example);

    Deptment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Deptment record, @Param("example") DeptmentExample example);

    int updateByExample(@Param("record") Deptment record, @Param("example") DeptmentExample example);

    int updateByPrimaryKeySelective(Deptment record);

    int updateByPrimaryKey(Deptment record);
}