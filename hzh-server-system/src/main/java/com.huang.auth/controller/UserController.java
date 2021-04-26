package com.huang.auth.controller;

import com.huang.auth.entity.BaseRequest;
import com.huang.auth.entity.User;
import com.huang.auth.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.auth.controller
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestController
@RequestMapping("/user")
@Api(value = "IndexController测试接口")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userinfo")
    public String userinfo() {
        User user = userService.getUserById(1);
        return user.getId()+" "+ user.getUserName();
    }





    @RequestMapping(value = "/queryPolList", method = RequestMethod.POST)
    @ApiOperation(value = "查询", notes = "查询")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«User»")//,
           // @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String")
    })
    public String userinfo(@RequestBody BaseRequest<User> user) {

        User userS = userService.getUserById(1);
        return userS.getId()+" "+ userS.getUserName();
    }



    @RequestMapping(value = "/initAccountChange", method = RequestMethod.POST)
    @ApiOperation(value = "帐号变更初始化", notes = "帐号变更初始化")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«User»"),
            @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String"),
            @ApiImplicitParam(paramType = "header", name = "authToken", value = "请求authToken", required = false, defaultValue = "", dataType = "String"),
            @ApiImplicitParam(paramType = "header", name = "sign", value = "签名串", required = false, defaultValue = "", dataType = "String"),
            @ApiImplicitParam(paramType = "header", name = "requestId", value = "请求ID", required = true, defaultValue = "", dataType = "String")
    })

    public User initAccountChange(@RequestBody BaseRequest<User> request,
                                  @RequestHeader(value="token", defaultValue = "")String token,
                                  @RequestHeader(value="authToken", defaultValue = "")String authToken,
                                  @RequestHeader(value="sign", defaultValue = "")String sign) {


        return new User();
    }

}

