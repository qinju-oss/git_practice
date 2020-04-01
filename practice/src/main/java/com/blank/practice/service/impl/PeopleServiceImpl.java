package com.blank.practice.service.impl;

import com.blank.practice.dao.PeopleMapper;
import com.blank.practice.entity.People;
import com.blank.practice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/1/13 15:15
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<People> selectAll() {

        return peopleMapper.selectAll();

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addPeople(People people) {
        int flag = peopleMapper.insert(people);
        if ("秦菊".equals(people.getName())) {
            throw new RuntimeException("不能添加此用户");
        }
        return flag>0;
    }
}
