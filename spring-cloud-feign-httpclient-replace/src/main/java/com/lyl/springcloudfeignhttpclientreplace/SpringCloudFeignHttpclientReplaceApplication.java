package com.lyl.springcloudfeignhttpclientreplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignHttpclientReplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignHttpclientReplaceApplication.class, args);
    }

}

