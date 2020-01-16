package com.blank.practice.controller;

import com.alibaba.fastjson.JSON;
import com.blank.practice.entity.People;
import com.blank.practice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XXX
 * @version 1.0
 * @date 2020/1/10 15:13
 */
@RestController
public class TestController {
    @Autowired
    private PeopleService peopleService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/")
    public List<People> selectPeopleInfo() {
        return peopleService.selectAll();
    }

    @PostMapping("/people")
    public Object addUser(@RequestBody People people){
        stringRedisTemplate.opsForValue().set("people", JSON.toJSONString(people));
        return "success";
    }
}
