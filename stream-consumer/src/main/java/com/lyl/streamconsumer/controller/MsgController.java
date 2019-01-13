package com.lyl.streamconsumer.controller;

import com.lyl.streamconsumer.channel.ReadMsgInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsgController {

    @Autowired
    private ReadMsgInterface readMsgInterface;

    @RequestMapping("getMsg")
    public String sendMsg() {
        String msg = readMsgInterface.readMsg().toString();
        return "获得到的消息队列名称：" + msg;
    }
}
