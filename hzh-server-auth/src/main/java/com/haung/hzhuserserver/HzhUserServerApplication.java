package com.haung.hzhuserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;

/**
 *  服务端
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: www.baidudu.com</p>
 * @author
 * @date 2019年
 * @version
 */
@ConditionalOnClass(SpringfoxWebMvcConfiguration.class)
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.*.*.mapper"})
public class HzhUserServerApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(HzhUserServerApplication.class, args);
    }


    /**
     * 添加访问路径
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
   }
}
