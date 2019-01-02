package com.lyl.springcloudfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients 表示当程序启动的时候, 会进行包扫描，扫描所有带@FeignCleint的注解的类并进行处理
 */
@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignClientApplication.class, args);
    }

}

