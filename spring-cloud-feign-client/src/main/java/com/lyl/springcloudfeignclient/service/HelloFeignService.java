package com.lyl.springcloudfeignclient.service;

import com.lyl.springcloudfeignclient.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName HelloFeignService
 * Author liyunlong
 * Data 下午 4:55
 * Version 1.0
 **/
@FeignClient(name = "client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {
    /**
     * @param queryStr
     * @return
     * @FeignClient 注解手动指定url=https://api.github.com 该调用地址会根据传入字符串搜索GitHub上相关的仓库信息
     * HelloFeignService 会根据指定的Url和@ResuqetsMapping对应的方法，转换成最终的请求地址
     * eg：https://api.github.com/search/repositories?q=spring-cloud-dubbo
     */
    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);

}
