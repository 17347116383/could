package com.hzh.com.hzhcom;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
//@ServletComponentScan(basePackages="com.hzh.com.hzhcom.filter")
@EnableDiscoveryClient
@SpringBootApplication
public class HzhComApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhComApplication.class, args);
    }




}
