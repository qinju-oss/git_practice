package com.blank.practice.controller;

import com.alibaba.fastjson.JSON;
import com.blank.practice.entity.People;
import com.blank.practice.service.PeopleService;
import io.swagger.annotations.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XXX
 * @version 1.0
 * @date 2020/1/10 15:13
 */
@RestController
@Slf4j
@RequestMapping("test")
@CrossOrigin(origins = "*")
public class TestController {
    @Autowired
    private PeopleService peopleService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @CrossOrigin(origins = "*")
    @GetMapping("/get_people")
    public List<People> selectPeopleInfo() {
        return peopleService.selectAll();
    }

    @PostMapping("/add_people")
    public String addPeopleInfo(@RequestParam String code,@RequestParam String name) {
        String info=code+name;
        log.info(info);
        return info;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/select_people")
    public List<People> selectPeopleByCondition(@RequestParam String input) {
        return peopleService.selectAll();
    }


    @PostMapping("/people")
    public Object addUser(@RequestBody People people) {
        stringRedisTemplate.opsForValue().set("people", JSON.toJSONString(people));
        return "success";
    }
}
