package com.lyl.zuul1clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Zuul1ClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zuul1ClientBApplication.class, args);
    }

}

