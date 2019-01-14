package com.lyl.streamconsumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * ClassName ReadMsgInterface
 * Author liyunlong
 * Data 上午 9:18
 * Version 1.0
 **/
public interface ReadMsgInterface {
    @Input("my_sendMsg_channel")
    SubscribableChannel readMsg();
}
