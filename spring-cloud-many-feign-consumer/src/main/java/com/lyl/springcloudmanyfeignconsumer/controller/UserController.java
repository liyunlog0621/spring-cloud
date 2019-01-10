package com.lyl.springcloudmanyfeignconsumer.controller;

import com.lyl.springcloudmanyfeignconsumer.model.User;
import com.lyl.springcloudmanyfeignconsumer.service.UserFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName UserController
 * Author liyunlong
 * Data 上午 9:44
 * Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    /**
     * 用于演示Feign的Get请求多参数传递
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        return userFeignService.addUser(user);
    }

    /**
     * 用于演示Feign的Post请求多参数传递
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        return userFeignService.updateUser(user);
    }


}
