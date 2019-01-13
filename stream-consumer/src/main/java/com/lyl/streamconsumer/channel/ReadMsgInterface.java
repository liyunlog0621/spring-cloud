package com.lyl.streamconsumer.channel;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReadMsgInterface {

    
    @Input("my_sendMsg_channel")
    SubscribableChannel readMsg();
}
