package com.lyl.springcloudpartitionconsumer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class SpringCloudPartitionConsumer3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPartitionConsumer3Application.class, args);
    }

}

