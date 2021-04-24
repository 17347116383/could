package com.zhz.cloud.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.zhz.cloud.admin
 * @ClassName: AdminApplication
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/24 17:11
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
