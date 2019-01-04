package com.lyl.hystrix1helloservice.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

import java.util.List;

public interface IHelloService {

    List<String> getProviderData();

    String Hello(Integer id);

    String getUserToCommandKey(@CacheKey Integer id);

    String updateUser(@CacheKey Integer id);

}
