package com.lyl.zuulfilter1zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * ClassName FirstPreFilter
 * Author liyunlong
 * Data 上午 10:04
 * Version 1.0
 **/
public class FirstPreFilter extends ZuulFilter {
    /**
     * 使用返回值设定Filter的类型。
     * 可以设置为pre/route/post/error类型
     *
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 使用返回值设定Filter执行顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 使用返回值设定该filter是否执行，可以作为开关使用
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Filter里面的核心执行逻辑，业务处理再次编写
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("自定义ZuulFilter：第一步");
        return null;
    }
}
