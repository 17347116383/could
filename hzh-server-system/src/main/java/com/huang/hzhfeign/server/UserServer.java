package com.huang.hzhfeign.server;

import com.huang.hzhfeign.server.hystrix.UserServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.hzhfeign.server
 * @ClassName: UserServer
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/12/8 19:02
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
//url="http://127.0.0.1:9000",
@FeignClient(value = "hzh-userServer",fallback = UserServerImpl.class)
public interface UserServer {

    @RequestMapping(value = "/hzh/ribbon")
    public  String getUser(@RequestParam(value = "msg")String msg);
    //public  String get( String msg);
}
