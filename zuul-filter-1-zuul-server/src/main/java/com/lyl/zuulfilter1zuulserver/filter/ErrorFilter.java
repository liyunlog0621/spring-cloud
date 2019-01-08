package com.lyl.zuulfilter1zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ERROR_TYPE;

/**
 * ClassName ErrorFilter
 * Author liyunlong
 * Data 上午 10:29
 * Version 1.0
 **/
public class ErrorFilter extends ZuulFilter {
    /**
     * 判断Filter的类型
     *
     * @return
     */
    @Override
    public String filterType() {
        return ERROR_TYPE;
    }

    /**
     * 判断Filter的执行步骤
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return -1;
    }

    /**
     * 判断是否执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("这是ErrorFilter");
        return null;
    }
}
