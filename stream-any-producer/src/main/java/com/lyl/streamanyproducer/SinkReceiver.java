package com.lyl.streamanyproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * ClassName SinkReceiver
 * Author liyunlong
 * Data 下午 4:01
 * Version 1.0
 **/
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("输出：" + payload);
    }

}
