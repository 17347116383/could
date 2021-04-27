package com.huang.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.auth
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@EnableDiscoveryClient  //EnableEurekaClient只能使用Eureka做注册中心  EnableDiscoveryClient可以使用其他做注册中心
@EnableFeignClients
@SpringBootApplication
public class HzhAuthApplication  {


    public static void main(String[] args) {
        SpringApplication.run(HzhAuthApplication.class, args);
    }


}
