package com.lyl.zuulfilter1clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulFilter1ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulFilter1ClientAApplication.class, args);
    }

}

