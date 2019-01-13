package com.lyl.streamproducer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 创建 发送消息通道
 */
public interface SendMessageInterface {
    /**
     *
     * 创建发送消息的通道
     *
     */
    @Output("my_sendMsg_channel")
    SubscribableChannel sendMsg();
}
