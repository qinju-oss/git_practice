package com.blank.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/1/10 15:13
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
