package com.haung.hzhuserserver.controller;


import com.haung.hzhuserserver.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @projectName
 * @description:
 * @date
 */
@Api(value = "帐号变更Api", tags = {"帐号变更Api"})
@RestController
public class AccountChangeController  {

  //Logger log = LoggerFactory.getLogger(AccountChangeController.class);


  @RequestMapping(value = "/initAccountChange", method = RequestMethod.POST)
  @ApiOperation(value = "帐号变更初始化", notes = "帐号变更初始化")
  @ApiImplicitParams({
          @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«User»"),
          @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String"),
          @ApiImplicitParam(paramType = "header", name = "authToken", value = "请求authToken", required = false, defaultValue = "", dataType = "String"),
          @ApiImplicitParam(paramType = "header", name = "sign", value = "签名串", required = false, defaultValue = "", dataType = "String"),
          @ApiImplicitParam(paramType = "header", name = "requestId", value = "请求ID", required = true, defaultValue = "", dataType = "String")
  })
  //@MssAnnotation(bizLockFlag = false, tamperVerf = false, funVerf = false, dataVerf = false, appVerVerf = false)
  public User initAccountChange(@RequestBody User request,
                                              @RequestHeader(value="token", defaultValue = "")String token,
                                              @RequestHeader(value="authToken", defaultValue = "")String authToken,
                                              @RequestHeader(value="sign", defaultValue = "")String sign) {


    return new User();
  }
















}
