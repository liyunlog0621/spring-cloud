package com.lyl.springcloudfeignuploadconsumer.controller;

import com.lyl.springcloudfeignuploadconsumer.service.UserFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName ConsumerController
 * Author liyunlong
 * Data 上午 11:07
 * Version 1.0
 **/
@RestController
@Api(value = "consumer")
public class ConsumerController {

    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/consumer/feign")
    @ApiOperation(value = "文件上传", notes = "请选择文件上传")
    public String findByIdBYEurekaServer() {
        return userFeignService.helloFeign();
    }
}
