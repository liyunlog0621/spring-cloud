package com.lyl.hystrix1providerservice.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello-service")
public interface ConsumerService {

    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
     String getHelloServiceData();
}
