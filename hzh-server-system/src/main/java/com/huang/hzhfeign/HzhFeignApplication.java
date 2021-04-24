package com.huang.hzhfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 *        消费feign
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: www.baidudu.com</p>
 * @author
 * @date 2019年
 * @version
 */
@SpringBootApplication
@EnableDiscoveryClient  //EnableEurekaClient只能使用Eureka做注册中心  EnableDiscoveryClient可以使用其他做注册中心
@EnableFeignClients
@EnableHystrixDashboard   //http://127.0.0.1:9001/hystrix   http://127.0.0.1:9001/hystrix
public class HzhFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhFeignApplication.class, args);
    }





}
