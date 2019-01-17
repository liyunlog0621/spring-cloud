package com.lyl.springcloudpartitionconsumer3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * ClassName Consumer
 * Author liyunlong
 * Data 上午 9:31
 * Version 1.0
 **/
@Component
public class Consumer {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.cloud.stream.instanceIndex}")
    private String index;
    @StreamListener(MySink.PARTITION_CHANNEL)
    public void partitionReceiver(@Payload User user) {
        System.out.println("端口号:" + serverPort + "分区坐标：" + index + "请求到的数据：" + user.getAge());
    }
}
