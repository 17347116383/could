package com.haung.hzhuserserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.haung.hzhuserserver.controller
 * @ClassName: UserCoutroller
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/12/8 14:42
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestController
@Api(value = "IndexController测试接口")
public class UserCoutroller {



    @Value("${server.port}")
    public  String  port;

    @ApiOperation(value = "测试index接口", nickname = "测试IndexController的index接口")
    @GetMapping("/index")
    public String index() {




        return "测试IndexController的index接口...";
    }


    @RequestMapping(value = "/hzh/ribbon")
    @ApiOperation(value = "远程调用接口", nickname = "测试远程调用接口")
    @ResponseBody
    public   String  getLogin(String msg){
        System.out.println("----hzhuserserverhzhuserserver---  9001----"+msg);
        return  "masg"+port+msg;
    }



    /*@RequestMapping(value = "/hzh/ribbon")
    @ApiOperation(value = "远程调用接口", nickname = "测试远程调用接口")
    @ResponseBody
    public   String  get(String msg){
       System.out.println("----hzhuserserverhzhuserserver---  9001----"+msg);
        return  "masg"+port+msg;
    }*/


    @ApiOperation(value = "测试", nickname = "测index接口")
    @RequestMapping(value = "/hzh/ri")
    @ResponseBody
    public   String  getS(){
        System.out.println("-------9000---------ri------------------");
        return  "masg"+port;
    }




}
