package com.lyl.springcloudmanyfeignprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudManyFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudManyFeignProviderApplication.class, args);
    }

}

