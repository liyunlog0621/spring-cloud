package com.example.springcloudeurekaserver9200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer9200Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer9200Application.class, args);
    }

}

