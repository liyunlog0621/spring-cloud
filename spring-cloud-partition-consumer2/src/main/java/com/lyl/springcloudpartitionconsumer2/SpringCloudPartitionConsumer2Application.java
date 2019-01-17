package com.lyl.springcloudpartitionconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class SpringCloudPartitionConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPartitionConsumer2Application.class, args);
    }

}

