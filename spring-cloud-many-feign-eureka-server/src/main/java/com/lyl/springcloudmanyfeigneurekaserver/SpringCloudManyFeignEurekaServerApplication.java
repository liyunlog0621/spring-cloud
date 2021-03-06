package com.lyl.springcloudmanyfeigneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudManyFeignEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudManyFeignEurekaServerApplication.class, args);
    }

}

