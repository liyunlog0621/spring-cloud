package com.lyl.springcloudeurekamember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaMemberApplication.class, args);
    }

}

