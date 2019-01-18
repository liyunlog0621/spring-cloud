package com.lyl.springcloudpatitionconsumer4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
@EnableDiscoveryClient
public class SpringCloudPatitionConsumer4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPatitionConsumer4Application.class, args);
    }

}

