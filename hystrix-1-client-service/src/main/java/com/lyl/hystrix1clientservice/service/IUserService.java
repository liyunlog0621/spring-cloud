package com.lyl.hystrix1clientservice.service;

import com.lyl.hystrix1clientservice.service.impl.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * InterfaceName IUserService
 * Author liyunlong
 * Data 下午 2:58
 * Version 1.0
 **/
@FeignClient(name = "provider-service", fallback = UserService.class)
public interface IUserService {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    String getUser(@RequestParam("username") String username);
}
