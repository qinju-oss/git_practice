package com.blank.practice.dao;

import com.blank.practice.entity.People;
import com.blank.practice.entity.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {
    int countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);

    List<People> selectAll();
}
