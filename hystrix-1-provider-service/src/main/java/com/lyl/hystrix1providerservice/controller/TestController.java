package com.lyl.hystrix1providerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName TestController
 * Author liyunlong
 * Data 下午 3:39
 * Version 1.0
 **/
@RestController
public class TestController {
    @GetMapping("/getUser")
    public String getUser(@RequestParam("username") String username) {
        return "你查的是个锤子哟" + username;
    }
}
