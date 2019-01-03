package com.lyl.hystrix1helloservice.controller;

import com.lyl.hystrix1helloservice.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController
{
    @Autowired
    private IHelloService userService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData(){
        return userService.getProviderData();
    }



    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData() {
        return "hello Service";
    }
}
