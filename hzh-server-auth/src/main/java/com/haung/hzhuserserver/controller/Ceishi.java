package com.haung.hzhuserserver.controller;

import com.haung.hzhuserserver.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.haung.hzhuserserver.controller
 * @ClassName: Ceishi
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/2/2 21:10
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Api(value = "用户接口")
@RestController
public class Ceishi {


    @ApiOperation(value = "/ceishi/i", nickname = "根据")
    @RequestMapping(value = "/ceishi/i")
    @ResponseBody
    public   String  getS(){
        System.out.println("-----ceishi 9000------------------");
        return  "ceishi 9000";
    }



    @ApiOperation(value = "获取用户信息接口", nickname = "根据用户ID获取用户相关信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    @PostMapping("/postMember")
    public User postMember(@RequestParam Integer id) {
        User userEntity = new User();
        userEntity.setId(id);
        userEntity.setName("admin");
        return userEntity;
    }


    @ApiOperation(value = "添加用户接口1", nickname = "添加用户接口1", notes = "入参是复杂对象", produces = "application/json")
    @PostMapping("/postUser")
    @ResponseBody
    @ApiImplicitParam(paramType = "query", name = "userId", value = "用户id", required = true, dataType = "int")
    public User postUser(@RequestBody User user, @RequestParam("userId") int userId) { // 这里用包装类竟然报错
        System.out.printf(user.toString());
        if (user.getId() == userId) {
            return user;
        }
        System.out.printf(user.toString());
        return new User();
    }


    @ApiOperation(value = "添加用户接口2", nickname = "添加用户接口2", notes = "入参是简单对象", produces = "application/json")
    @PostMapping("/addUser/id")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userName", value = "用户姓名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "id", value = "用户id", required = true, dataType = "int")})
    public User addUser(@RequestParam("userName")String userName, @RequestParam("id")int id) {
        User user = new User();
        user.setName(userName);
        user.setId(id);
        System.out.printf(user.toString());
        return user;
    }
}
