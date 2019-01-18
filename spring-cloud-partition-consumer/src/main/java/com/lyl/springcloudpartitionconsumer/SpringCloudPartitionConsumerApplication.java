package com.lyl.springcloudpartitionconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
@EnableDiscoveryClient
public class SpringCloudPartitionConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPartitionConsumerApplication.class, args);
    }

}

