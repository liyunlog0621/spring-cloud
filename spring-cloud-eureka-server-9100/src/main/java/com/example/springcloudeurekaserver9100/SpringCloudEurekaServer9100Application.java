package com.example.springcloudeurekaserver9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer9100Application.class, args);
    }

}

