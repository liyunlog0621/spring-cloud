package com.lyl.springcloudmanyfeignconsumer.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName FeignTokenInterceptor
 * Author liyunlong
 * Data 上午 9:29
 * Version 1.0
 * Feign统一的Token拦截器
 **/
@Component
public class FeignTokenInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {

        if (null == getHttpServletRequest()) {
            //此处省略日志记录
            return;
        }
        //将获取Token对应的值往下面传
        requestTemplate.header("oauthtoken", getHeaders(getHttpServletRequest()).get("oauthtoken"));
    }

    private HttpServletRequest getHttpServletRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private Map<String, String> getHeaders(HttpServletRequest request) {
        Map<String, String> map = new LinkedHashMap<>();
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String keys = enumeration.nextElement();
            String value = request.getHeader(keys);
            map.put(keys, value);
        }
        return map;
    }

}
