package com.lyl.springcloudeurekaorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaOrderApplication.class, args);
    }
    /**
     * 解决RestTemplate 找不到原因 应该吧restTemplate注册到SpringBoot容器中。
     * @LoadBalanced 能够是让RestTemplate在请求的时候拥有客户端负载均衡的能力
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

