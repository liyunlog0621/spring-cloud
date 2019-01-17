package com.lyl.springcloudpartitionprovider;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * InterfaceName MySink
 * Author liyunlong
 * Data 上午 9:29
 * Version 1.0
 **/
public interface MySink {

    String PARTITION_CHANNEL = "partition-channel";

    @Output(PARTITION_CHANNEL)
    SubscribableChannel partitionInput();


}
