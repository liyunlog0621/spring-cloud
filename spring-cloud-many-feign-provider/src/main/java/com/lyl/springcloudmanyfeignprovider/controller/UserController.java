package com.lyl.springcloudmanyfeignprovider.controller;

import com.lyl.springcloudmanyfeignprovider.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName UserController
 * Author liyunlong
 * Data 上午 9:54
 * Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    private final String TOKEN = "oauthtoken";

    @GetMapping(value = "/add")
    public String addUser(User user, HttpServletRequest request) {
        String token = request.getHeader(TOKEN);
        return "token:" + token + "添加的用户名称：" + user.getName();
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@RequestBody User user, HttpServletRequest request) {
        String token = request.getHeader("oauthToken");
        return "token:" + token + "修改的用户名称：" + user.getName();
    }
}
