package com.lyl.zuulfilter1zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * ClassName ThirdPreFilter
 * Author liyunlong
 * Data 上午 10:22
 * Version 1.0
 **/

public class ThirdPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 3;
    }

    /**
     * 判断此步骤是否可以执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        //从上一步获取是否需要继续执行第三步
        Boolean o = (Boolean) currentContext.get("logic-is-success");
        return o;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("第三步");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String b = request.getParameter("b");
        if (StringUtils.isBlank(b)) {
            //对该请求禁止路由，也就是禁止访问下游服务
            currentContext.setSendZuulResponse(false);
            //设定responseBody供PostFilter使用
            currentContext.setResponseBody("{\"status\":500,\"message\":\"b参数为空！\"}");
            //logic-is-success保存于上下文，作为同类型下游Filter的执行开关，假定后续还有自定义Filter当设置此值
            currentContext.set("logic-is-success", false);
            //到这里此Filter逻辑结束
            return null;
        }
        return null;
    }
}
