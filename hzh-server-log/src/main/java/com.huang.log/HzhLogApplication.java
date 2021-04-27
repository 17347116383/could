package com.huang.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;

@EnableDiscoveryClient  //EnableEurekaClient只能使用Eureka做注册中心  EnableDiscoveryClient可以使用其他做注册中心
@EnableFeignClients
@SpringBootApplication
public class HzhLogApplication  {


    public static void main(String[] args) {
        SpringApplication.run(HzhLogApplication.class, args);
    }




}
