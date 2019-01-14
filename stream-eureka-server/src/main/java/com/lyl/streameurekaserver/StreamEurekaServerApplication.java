package com.lyl.streameurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StreamEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamEurekaServerApplication.class, args);
    }

}

