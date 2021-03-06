package com.lyl.springcloudmanyfeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudManyFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudManyFeignConsumerApplication.class, args);
    }

}

