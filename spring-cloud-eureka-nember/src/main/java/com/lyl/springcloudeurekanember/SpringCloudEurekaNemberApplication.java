package com.lyl.springcloudeurekanember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaNemberApplication {
    /**
     * @param args
     * @EnableEurekaClient 将当前服务注册到eureka上
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaNemberApplication.class, args);
    }

}

