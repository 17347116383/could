package com.hzh.com.hzhcom.HzhHandlerInterceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.filter
 * @ClassName: RequestHandlerInterceptor
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/2/1 12:07
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Component
public class RequestHandlerInterceptor implements HandlerInterceptor {

    /**
     *在请求处理之前进行调用 Controller方法调用之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Enumeration<String> headerNames = request.getHeaderNames();
        String contentType = request.getContentType();

        //1, 获取登陆请求信息


        //2，判断参数是否正确
        //3, 获取缓存信息
        //4，如果未登陆跳转到登陆注册服务去登陆注册

        //5 ，登陆成功后获取锁
        //6， 转到指定的服务





        return true;
    }

    /**
     *请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    /**
     *在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
