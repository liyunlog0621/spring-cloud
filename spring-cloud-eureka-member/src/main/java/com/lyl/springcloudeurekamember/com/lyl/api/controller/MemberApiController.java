package com.lyl.springcloudeurekamember.com.lyl.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApiController {
    @GetMapping
    public String getMember(){
        return "这是一个会员服务";
    }
}
