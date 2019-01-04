package com.lyl.hystrix1helloservice.service.impl;

import com.lyl.hystrix1helloservice.service.IHelloService;
import com.lyl.hystrix1helloservice.service.data.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloService implements IHelloService {

    @Autowired
    private ProviderService providerService;

    @HystrixCommand
    @Override
    public List<String> getProviderData() {
        return providerService.getProviderData();
    }


    @HystrixCommand
    @Override
    public String Hello(Integer id) {
        return providerService.getUserName(id);
    }

    @HystrixCommand(commandKey = "getUser")
    @Override
    public String getUserToCommandKey(Integer id) {
        return providerService.getUserName(id);
    }


    @CacheRemove(commandKey = "getUser")
    @HystrixCommand
    @Override
    public String updateUser(Integer id) {
        System.out.println("删除getUser缓存");
        return "update success";
    }
}
