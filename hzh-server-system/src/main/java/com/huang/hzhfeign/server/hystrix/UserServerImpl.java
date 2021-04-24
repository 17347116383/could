package com.huang.hzhfeign.server.hystrix;

import com.huang.hzhfeign.server.UserServer;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.hzhfeign.server.hystrix
 * @ClassName: UserServerImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/12/8 20:13
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Component
public class UserServerImpl implements UserServer {


    /**
     * 熔断方法
     * @param msg
     * @return
     */
    public String getUser(String msg) {

        return "熔断器熔断"+msg;
    }
}
