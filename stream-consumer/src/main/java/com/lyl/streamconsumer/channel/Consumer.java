package com.lyl.streamconsumer.channel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * ClassName Consumer
 * Author liyunlong
 * Data 上午 9:16
 * Version 1.0
 **/
@Component
public class Consumer {
    @Value("${server.port}")
    private String serverPort;
    int counter = 1;

    //监听my_sendMsg_channel 的消息队列
    @StreamListener("my_sendMsg_channel")

    //该注解会消息处理完成之后，向responseMessage这个队列发送消息,消息内容就是该方法的返回值
    @SendTo("responseMessage")
    public String readMsg(String msg) {
        System.out.println("Received: " + msg + ", " + counter);
        if (counter == 3) {
            counter = 1;
            return "测试成功";
        } else {
            counter++;
            throw new RuntimeException("Message consumer failed!");
        }
    }
}
