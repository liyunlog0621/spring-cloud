package com.lyl.springcloudeurekaorder.com.lyl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * # 在SpringCloud 中有两种方式调用 rest fegin
     * 订单服务调用会员服务
     */
    @RequestMapping("/getOrder")
    public String getOrder() {
        //有两种方式，一种是采用服务别名的方式调用  另一种是直接调用
//        String result = restTemplate.getForObject("http://127.0.0.1:8000/getMember", String.class);
//        result="订单服务调用会员服务result" + result;
//        System.out.println(result);
//        return result;
        String url = "http://member/getMember";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
        ServiceInstance member = loadBalancerClient.choose("YH-20161128LOBL:member");
        String str = "host:" + member.getHost() + ">>>>>>Port" + member.getPort() + ":" + member.getServiceId()+">>>>>>"+forObject;
        System.out.println(str);
        return forObject;
    }
}
