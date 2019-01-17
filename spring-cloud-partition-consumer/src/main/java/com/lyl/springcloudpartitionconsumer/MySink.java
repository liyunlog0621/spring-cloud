package com.lyl.springcloudpartitionconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * InterfaceName MySink
 * Author liyunlong
 * Data 上午 9:29
 * Version 1.0
 **/
public interface MySink {

    String PARTITION_CHANNEL = "partition-channel";

    @Input(PARTITION_CHANNEL)
    SubscribableChannel partitionInput();


}
