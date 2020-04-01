package com.blank.practice.service;

import com.blank.practice.entity.People;

import java.util.List;

/**
 * @author 秦菊
 * @date 2020/1/13 15:15
 */

public interface PeopleService {
    List<People> selectAll();

    Boolean addPeople(People people);
}
