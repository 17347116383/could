package com.haung.hzhuserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
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

@EnableDiscoveryClient  //EnableEurekaClient只能使用Eureka做注册中心  EnableDiscoveryClient可以使用其他做注册中心
@EnableFeignClients
@SpringBootApplication
public class HzhUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhUserServerApplication.class, args);
    }



}
