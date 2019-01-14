package com.lyl.springcloudfeignuploadconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.Response;

/**
 * ClassName UserFeignService
 * Author liyunlong
 * Data 上午 11:08
 * Version 1.0
 **/
@FeignClient(name = "provider")
public interface UserFeignService {

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    String helloFeign();

    /**
     * 生成图片验证码
     *
     * @param imagekey
     * @return
     */
    @RequestMapping(value = "createImagesCode")
    Response createImageCode(@RequestParam("imagekey") String imagekey);
}
