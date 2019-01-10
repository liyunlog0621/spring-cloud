package com.lyl.springcloudstreamproducer.controller;

import com.lyl.springcloudstreamproducer.ProducerChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName GreetingProducer
 * Author liyunlong
 * Data 上午 11:42
 * Version 1.0
 **/
@RestController
public class GreetingProducer {

    private final MessageChannel broadcast, direct;

    /**
     * 注入ProducerChannels,然后在构造函数中解引用所需的通道，这样当有人向/hi/{name发送数据
     *
     * @param channels
     */
    @Autowired
    GreetingProducer(ProducerChannels channels) {
        this.broadcast = channels.broadcastGreetings();
        this.direct = channels.directGreetings();
    }

    @RequestMapping("/hi/{name}")
    ResponseEntity<String> hi(@PathVariable String name) {
        String message = "Hello, " + name + "!";

        // <3>
        this.direct.send(MessageBuilder.withPayload("Direct: " + message)
                .build());

        this.broadcast.send(MessageBuilder.withPayload("Broadcast: " + message)
                .build());
        return ResponseEntity.ok(message);
    }

}
