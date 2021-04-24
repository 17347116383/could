package com.huang.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient  //EnableEurekaClient只能使用Eureka做注册中心  EnableDiscoveryClient可以使用其他做注册中心
@EnableFeignClients
@SpringBootApplication
public class HzhLogApplication {


    public static void main(String[] args) {
        SpringApplication.run(HzhLogApplication.class, args);
    }

}
