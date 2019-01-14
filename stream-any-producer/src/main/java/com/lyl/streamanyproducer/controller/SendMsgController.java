package com.lyl.streamanyproducer.controller;

import com.alibaba.fastjson.JSON;
import com.lyl.streamanyproducer.channel.SendMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName SendMsgController
 * Author liyunlong
 * Data 下午 4:53
 * Version 1.0
 **/
@RestController
public class SendMsgController {


    private static MessageChannel orderSetStartProduceChannel;

    @RequestMapping("sendMsg")
    public void sendOrderSetPrintMsg(String msg) {
        orderSetStartProduceChannel
                .send(MessageBuilder.withPayload(JSON.toJSONString(msg))
                        .setHeader("shopId", "my_sendMsg_channel")
                        .build());
    }
}
