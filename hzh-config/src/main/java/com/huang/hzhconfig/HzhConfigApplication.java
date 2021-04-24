package com.huang.hzhconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *         https://github.com/spring-cloud/spring-cloud-config
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: www.baidudu.com</p>
 * @author
 * @date 2019年
 * @version
 */
@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient//服务提供者
@EnableDiscoveryClient
public class HzhConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhConfigApplication.class, args);
    }

}
