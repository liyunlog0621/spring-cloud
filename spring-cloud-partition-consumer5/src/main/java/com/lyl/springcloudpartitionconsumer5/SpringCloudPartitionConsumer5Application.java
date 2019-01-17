package com.lyl.springcloudpartitionconsumer5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class SpringCloudPartitionConsumer5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPartitionConsumer5Application.class, args);
    }

}

