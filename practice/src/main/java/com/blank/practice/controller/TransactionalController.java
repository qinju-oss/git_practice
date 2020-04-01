package com.blank.practice.controller;

import com.blank.practice.entity.People;
import com.blank.practice.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/3/19 9:21
 */
@RestController
@Slf4j
@RequestMapping("transaction")
@Api(tags = "事务管理")
public class TransactionalController {
    @Autowired
    private PeopleService peopleService;

    @PostMapping("/add-people")
    @ApiOperation("添加用户")
    public Boolean addPeople(@RequestBody People people) {
        return peopleService.addPeople(people);
    }
}
