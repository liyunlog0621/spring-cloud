package com.lyl.zuulfilter1zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * ClassName SecondPreFilter
 * Author liyunlong
 * Data 上午 10:13
 * Version 1.0
 **/
public class SecondPreFilter extends ZuulFilter {
    /**
     * 判断该Filter的类型
     *
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 判断Filter的执行顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 2;
    }

    /**
     * 判断该Filter是否执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("自定义Filter：第二步");
        //从RequestContext获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //从上线文获取HttpServetRequest
        HttpServletRequest request = ctx.getRequest();
        //从request尝试获取a参数值
        String a = request.getParameter("a");
        //如果a参数为空则进入此逻辑
        if (null == a) {
            //对该请求禁止路由，也就是禁止访问下游服务
            ctx.setSendZuulResponse(false);
            //设定responseBody定制返回结果,供PostFilter使用
            ctx.setResponseBody("{\"status\":500,\"message\":\"a参数为空！\"}");
            //logic-is-success保存于上线文,作为同类型下游Filter的执行开关 若没有传入
            ctx.set("logic-is-success", false);
            //到这里此Filter逻辑结束
            System.out.println("第二步到这里此Filter逻辑结束");
            return null;
        }
        //设置避免报空
        ctx.set("logic-is-success", true);
        return null;
    }
}
