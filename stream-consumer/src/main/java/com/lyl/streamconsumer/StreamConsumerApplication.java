package com.lyl.streamconsumer;

import com.lyl.streamconsumer.channel.ReadMsgInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReadMsgInterface.class)
public class StreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }

}

