package com.lyl.springcloudfeignuploadconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName CoreAutoConfiguration
 * Author liyunlong
 * Data 上午 11:05
 * Version 1.0
 **/
@Configuration
public class CoreAutoConfiguration {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public FeignRequestInterceptor charlesRequestInterceptor() {
        return new FeignRequestInterceptor();
    }
}
