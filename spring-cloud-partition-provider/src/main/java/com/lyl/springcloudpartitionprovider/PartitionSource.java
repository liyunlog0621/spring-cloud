package com.lyl.springcloudpartitionprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName PartitionSource
 * Author liyunlong
 * Data 上午 10:12
 * Version 1.0
 **/

@EnableBinding(value = MySink.class)
public class PartitionSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartitionSource.class);

    @Bean
    @InboundChannelAdapter(value = MySink.PARTITION_CHANNEL, poller = @Poller(fixedRate = "1000", maxMessagesPerPoll = "1"))
    public MessageSource<User> partitionMessageSource() {
        return () -> {
            Double value = Math.random() * 10 % 5;
            int age = value.intValue();
            LOGGER.info("随机到的年龄 : {}", age);
            Map<String, Object> headers = new HashMap<>();
            headers.put("router", age);
            User user = new User();
            user.setUsername("年纪大小为" + age);
            user.setAge(age);
            user.setId(age);
            return new GenericMessage<>(user, headers);
        };
    }
}
