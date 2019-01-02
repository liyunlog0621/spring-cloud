package com.lyl.springcloudfeignokhttpreplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignOkhttpReplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignOkhttpReplaceApplication.class, args);
    }

}

