package com.lyl.hystrix1clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class Hystrix1ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix1ClientServiceApplication.class, args);
    }

}

