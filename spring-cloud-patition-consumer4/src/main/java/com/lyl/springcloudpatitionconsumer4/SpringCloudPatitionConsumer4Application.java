package com.lyl.springcloudpatitionconsumer4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class SpringCloudPatitionConsumer4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPatitionConsumer4Application.class, args);
    }

}

