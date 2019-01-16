package com.lyl.streamconsumer;

import com.lyl.streamconsumer.channel.ReadMsgInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


//消费者
@SpringBootApplication
@EnableBinding(ReadMsgInterface.class)
public class StreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }
    //消费者队列？
    // 底层会自动创建一个队列并且绑定交换机
}

