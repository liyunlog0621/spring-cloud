package com.lyl.streamanyproducer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * ClassName SendMessageInterface
 * Author liyunlong
 * Data 上午 9:08
 * Version 1.0
 **/
@Component
public interface SendMessageInterface {



    /**
     * 创建发送消息的通道
     *
     * @return
     */
    @Output("my_sendMsg_channel")
    MessageChannel sendMsg();
}
