package com.entity.app.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/
 * @Version: 1.0
 * @Description: TODO()
 */
@Component
@EnableConfigurationProperties({XssFilterConfig.class})
public class XssFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(XssFilter.class);
    @Autowired
    XssFilterConfig xssFilterConfig;

    public XssFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("======XssFilter======");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        List<String> whiteList = this.xssFilterConfig.getWhiteList();
        HttpServletRequest req = (HttpServletRequest)request;
        String requestUri = req.getRequestURI();
        if (this.xssFilterConfig.isEnabled() && (ListUtil.isEmpty(whiteList) || !whiteList.contains(requestUri))) {
            XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(req);
            chain.doFilter(xssRequest, response);
        } else {
            chain.doFilter(request, response);
        }

    }

    public void destroy() {

        log.info("=====destroy=====XssFilter======");
    }
}
