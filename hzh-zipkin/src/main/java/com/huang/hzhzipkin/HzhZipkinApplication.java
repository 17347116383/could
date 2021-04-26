package com.huang.hzhzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;
/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.mapper
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class HzhZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhZipkinApplication.class, args);
    }

}
