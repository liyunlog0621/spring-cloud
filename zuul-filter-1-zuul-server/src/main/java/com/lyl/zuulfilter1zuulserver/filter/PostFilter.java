package com.lyl.zuulfilter1zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

/**
 * ClassName PostFilter
 * Author liyunlong
 * Data 上午 10:26
 * Version 1.0
 * <p>
 * 主要用来检测有无定制ResponseBody以及设置响应字符集，避免中文乱码
 * 此外还设定了Http状态码
 **/
public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("这个是POSTFilter");
        //获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //处理返回中文乱码
        currentContext.getResponse().setCharacterEncoding("UTF-8");
        //获取上下文中保存的responseBody
        String responseBody = currentContext.getResponseBody();
        //如果responseBody不为空，则说明流程有异常发生
        if (null != responseBody) {
            //设定返回状态码
            currentContext.setResponseStatusCode(500);
            //替换响应报文
            currentContext.setResponseBody(responseBody);
        }
        return null;
    }
}
