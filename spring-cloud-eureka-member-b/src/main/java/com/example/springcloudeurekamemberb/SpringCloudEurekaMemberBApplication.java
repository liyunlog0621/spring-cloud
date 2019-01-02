package com.example.springcloudeurekamemberb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaMemberBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaMemberBApplication.class, args);
    }

}

