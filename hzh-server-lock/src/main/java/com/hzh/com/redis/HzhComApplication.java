package com.hzh.com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class HzhComApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhComApplication.class, args);
    }




}
