package com.blank.practice.service.impl;

import com.blank.practice.entity.People;
import com.blank.practice.mapper.PeopleMapper;
import com.blank.practice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
