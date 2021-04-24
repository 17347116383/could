package com.huang.hzhfeign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.hzhfeign.controller
 * @ClassName: Ceishi
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/2/2 20:51
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestController
public class Ceishi {

    @RequestMapping(value = "/ceishi/sd")
    @ResponseBody
    public  String getUser(){
        System.out.println("----900000--Ceishi-----");
        return "sssssssssss000000000000";
    }




}
