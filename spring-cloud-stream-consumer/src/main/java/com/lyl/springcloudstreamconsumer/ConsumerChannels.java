package com.lyl.springcloudstreamconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * ClassName ConsumerChannels
 * Author liyunlong
 * Data 下午 3:17
 * Version 1.0
 **/
public class ConsumerChannels {
    String DIRECTED = "directed";
    String BROADCASTS = "broadcasts";

    // <1>
    @Input(DIRECTED)
    SubscribableChannel directed();

    @Input(BROADCASTS)
    SubscribableChannel broadcasts();
}
