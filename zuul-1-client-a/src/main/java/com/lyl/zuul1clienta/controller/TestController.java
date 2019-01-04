package com.lyl.zuul1clienta.controller;

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

    @GetMapping("/add")
    public String add() {
        return "com.lyl.zuul1clienta.controller.TestController-> 返回的数据库:200";
    }
    @GetMapping("/update")
    public String udpdate() {
        return "client-a -> 返回的数据库:200";
    }
}
