package com.lyl.hystrix1providerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName TestController
 * Author liyunlong
 * Data 下午 3:39
 * Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/hello")
    public String getHelloService() {
        return consumerService.getHelloServiceData();
    }


    @GetMapping("/getUser")
    public String getUser(@RequestParam("username") String username) {
        return "你查的是个锤子哟" + username;
    }

    @GetMapping("/getUserById")
    public String getUserById(@RequestParam("id") int id) {
        if (id == 1) {
            return "张三";
        } else {
            return "李四";
        }

    }

    @GetMapping("/getDashboard")
    public List<String> getProviderData() {
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }

}
