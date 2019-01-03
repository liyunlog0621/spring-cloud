package com.lyl.hystrix1clientservice.controller;

import com.lyl.hystrix1clientservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName TestController
 * Author liyunlong
 * Data 下午 2:57
 * Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String username) {
        return iUserService.getUser(username);
    }

}
