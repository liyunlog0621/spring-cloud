package com.lyl.springcloudstreamproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * InterfaceName ProducerChannels
 * Author liyunlong
 * Data 上午 11:21
 * Version 1.0
 **/
public interface ProducerChannels {
    /**
     * 默认情况下：流的名称
     */
    String DIRECT = "directGreetings";
    String BROADCAST = "broadcastGreetings";

    /**
     *  @Output:高速springcloudstream放入通道的消息将被发送出去
     *
     * @return
     */
    @Output(DIRECT)
    MessageChannel directGreetings();

    @Output(BROADCAST)
    MessageChannel broadcastGreetings();
}
