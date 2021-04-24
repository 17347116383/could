package com.huang.hzhzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;
/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: www.baidudu.com</p>
 * @author
 * @date 2020年
 * @version
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class HzhZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzhZipkinApplication.class, args);
    }

}
