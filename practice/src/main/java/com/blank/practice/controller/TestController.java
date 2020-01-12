package com.blank.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/1/10 15:13
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/test")
    public String getWords(){
        return "文档测试";
    }


}
