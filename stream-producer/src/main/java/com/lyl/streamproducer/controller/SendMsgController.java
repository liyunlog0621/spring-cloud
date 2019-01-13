package com.lyl.streamproducer.controller;


import com.lyl.streamproducer.channel.SendMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendMsgController {
    @Autowired
    private SendMessageInterface sendMessageInterface;
    /**
     * 生产者流程
     * 1.创建发送消息通道
     * 2.生产投递消息
     * 3.开启绑定
     */

    @RequestMapping("sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        Message<byte[]> build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "当前产生的UUID：" + msg;
    }

}
