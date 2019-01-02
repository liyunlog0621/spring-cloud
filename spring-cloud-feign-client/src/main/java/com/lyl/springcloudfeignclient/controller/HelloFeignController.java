package com.lyl.springcloudfeignclient.controller;

import com.lyl.springcloudfeignclient.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloFeignController
 * Author liyunlong
 * Data 下午 4:56
 * Version 1.0
 **/
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    /**
     *服务消费者对位提供的服务
     */
    @GetMapping(value = "/search/github")
    public ResponseEntity<byte[]> searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }
}
