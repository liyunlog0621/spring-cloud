package com.lyl.streamproducer.controller;

import com.lyl.streamproducer.channel.SendMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * ClassName SendMsgController
 * Author liyunlong
 * Data 上午 9:10
 * Version 1.0
 **/
@RestController
public class SendMsgController {

    @Autowired
    private SendMessageInterface sendMessageInterface;

    @RequestMapping("sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        Message<byte[]> build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "当前生产的UUID：" + msg;

    }
}
