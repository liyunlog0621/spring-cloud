package com.lyl.zuul1clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Zuul1ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zuul1ClientAApplication.class, args);
    }

}

