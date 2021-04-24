package com.huang.hzhfeign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   http://127.0.0.1:9001/hystrix.strcam
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.hzhfeign.config
 * @ClassName: HystrixDashboardConfig
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/12/8 20:29
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Configuration
public class HystrixDashboardConfig {

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean =new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.strcam");
        registrationBean.setName("ServletRegistrationBean");
        return registrationBean;

    }
}
