package com.lyl.hystrix1clientservice.service.impl;

import com.lyl.hystrix1clientservice.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * ClassName UserService
 * Author liyunlong
 * Data 下午 2:58
 * Version 1.0
 **/
@Component
public class UserService implements IUserService {

    @Override
    public String getUser(String username) {
        return "/provider-service/getUser 错误,降级处理到了UserService";
    }
}
