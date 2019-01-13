package com.lyl.streameurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class StreamEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamEurekaServerApplication.class, args);
    }

}

