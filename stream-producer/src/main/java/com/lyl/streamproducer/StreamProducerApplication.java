package com.lyl.streamproducer;

import com.lyl.streamproducer.channel.SendMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class)
public class StreamProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamProducerApplication.class, args);
    }


    //在rabbitMq中有交换机队列
    //默认以通道的名称创建交换机。消费者启动的时候会随机创建队列名称
}

