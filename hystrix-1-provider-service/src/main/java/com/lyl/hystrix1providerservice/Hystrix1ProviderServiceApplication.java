package com.lyl.hystrix1providerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class Hystrix1ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix1ProviderServiceApplication.class, args);
    }

}

