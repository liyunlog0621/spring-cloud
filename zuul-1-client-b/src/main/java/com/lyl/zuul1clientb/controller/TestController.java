package com.lyl.zuul1clientb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName TestController
 * Author liyunlong
 * Data 上午 10:47
 * Version 1.0
 **/
@RestController
public class TestController {

    @GetMapping("/update")
    public String add() {
        return "client-b-> 返回的数据库:200";
    }
}
