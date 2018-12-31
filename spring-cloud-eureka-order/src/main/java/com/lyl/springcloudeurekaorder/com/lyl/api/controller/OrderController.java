package com.lyl.springcloudeurekaorder.com.lyl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    /**
     * 应该通过服务名调用服务
     * ### 服务的别名-服务注册到注册中心的名称
     * spring:
     *   application:
     *     name: member
     *     使用别名去注册中心获取对应的服务调用地址。
     *
     */
//TODO:多参数调用服务如何实现？
    /**
     * restTemplate 模板方式
     * 由SpringBoot web组件提供的 默认整合了Ribbon负载均衡器
     * rest 方式底层方式采用httpclient 技术
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * # 在SpringCloud 中有两种方式调用 rest fegin
     * 订单服务调用会员服务
     */
    @RequestMapping("/getOrder")
    public String getOrder() {
        // 有两种方式，一种是采用服务别名的方式调用  另一种是直接调用
        /**
         * 应该通过服务名调用服务
         * ### 服务的别名-服务注册到注册中心的名称
         * spring:
         *   application:
         *     name: member
         *     使用别名去注册中心获取对应的服务调用地址。
         *
         */
        //TODO:多参数调用服务如何实现？
        String url = "http://member/getMember";
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }
}
