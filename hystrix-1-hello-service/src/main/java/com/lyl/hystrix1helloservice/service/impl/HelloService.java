package com.lyl.hystrix1helloservice.service.impl;

import com.lyl.hystrix1helloservice.service.IHelloService;
import com.lyl.hystrix1helloservice.service.data.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloService implements IHelloService {

    @Autowired
    private ProviderService providerService;

    @Override
    public List<String> getProviderData() {
        return providerService.getProviderData();
    }
}
