package com.lyl.springcloudfeignuploadprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName OrderProviderController
 * Author liyunlong
 * Data 上午 11:03
 * Version 1.0
 **/
@RestController
public class OrderProviderController {

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String hello() {
        return "hello,feign";
    }
}
