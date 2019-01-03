package com.lyl.hystrix1eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hystrix1EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix1EurekaServerApplication.class, args);
    }

}

