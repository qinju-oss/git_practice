package com.blank.practice.controller;

import com.blank.practice.entity.People;
import com.blank.practice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/1/10 15:13
 */
@RestController
public class TestController {
    @Autowired
    private PeopleService peopleService;
    @GetMapping("/")
    public List<People> selectPeopleInfo(){
        return peopleService.selectAll();
    }


}
