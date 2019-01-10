package com.lyl.springcloudstreamproducer.gateway;

import com.lyl.springcloudstreamproducer.ProducerChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName StreamProducer
 * Author liyunlong
 * Data 下午 2:54
 * Version 1.0
 **/
@SpringBootApplication
/**
 * <1>
 * @EnableBinding 注解启动Spring cloud Stream
 */
@EnableBinding(ProducerChannels.class)
@IntegrationComponentScan
/**
 * <2>
 *  spring框架注册自定义组件的构造型注释，但是Spring Integration也可以将接口定义
 *  转换为bean，所以我们需要一个自定义注释来激活spring Integration的组件扫描
 *  从而来找到我们的声明行的基于接口的消息传递网关
 */
public class StreamProducer {
    public static void main(String args[]) {
        SpringApplication.run(StreamProducer.class, args);
    }

    /**
     *<3>
     *  @MesagingGateway 是spring Integration支持的许多消息传递端点之一（作为迄今为止使用java Dsl的替代方案）
     *  网关中的每个方法都需要@Gateway注释，在参数值红指定按个消息通道应该继续
     */
    @MessagingGateway
    interface GreetingGateway {

        @Gateway(requestChannel = ProducerChannels.BROADCAST)
        void broadcastGreet(String msg);

        @Gateway(requestChannel = ProducerChannels.DIRECT)
        void directGreet(String msg);
    }

    @RestController
    class GreetingProducer {

        private final GreetingGateway gateway;

        // <4>
        @Autowired
        GreetingProducer(GreetingGateway gateway) {
            this.gateway = gateway;
        }

        @RequestMapping(method = RequestMethod.GET, value = "/hi/{name}")
        ResponseEntity<?> hi(@PathVariable String name) {
            String message = "Hello, " + name + "!";
            this.gateway.directGreet("Direct: " + message);
            this.gateway.broadcastGreet("Broadcast: " + message);
            return ResponseEntity.ok(message);
        }
    }
}
