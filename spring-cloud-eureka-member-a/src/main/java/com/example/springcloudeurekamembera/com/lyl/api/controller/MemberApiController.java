package com.example.springcloudeurekamembera.com.lyl.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName MemberApiController
 *
 * @Author liyunlong
 * Data 下午 2:11
 * Version 1.0
 **/
@RestController
public class MemberApiController {
    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/getMember")
    public String geMember() {
        return "this is member 我是会员服务！！！"+serverPort;
    }
}
