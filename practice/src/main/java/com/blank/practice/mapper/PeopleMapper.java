package com.blank.practice.mapper;

import com.blank.practice.entity.People;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author 秦菊
 * @date 2020/1/13 15:14
 */
@Repository
public interface PeopleMapper {
    List<People> selectAll();
}
