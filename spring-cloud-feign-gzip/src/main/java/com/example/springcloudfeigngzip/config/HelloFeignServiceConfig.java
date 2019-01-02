package com.example.springcloudfeigngzip.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloFeignServiceConfig {
    /**
     * Level的具体级别如下：
     * NONE：不记录任何信息
     * BASIC：仅记录请求方法
     * HEADERS：处理记录 BASIC级别的信息外，还会记录请求和响应的头信息
     * FULL：记录所有请求与响应的明细,包括头信息,请求体,元数据
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
