package com.huang.log.controller;


import com.github.pagehelper.PageInfo;
import com.huang.log.entity.BaseRequest;
import com.huang.log.entity.BaseResponse;
import com.huang.log.entity.SystemLogRequest;
import com.huang.log.entity.SytemLogResponse;
import com.huang.log.service.SystemLogService;
import com.huang.log.service.impl.SystemLogServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.controller
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestController
@RequestMapping(value = "/system")
@Api(description = "日志平台Api")
public class SystemLogController {

    private static final Logger log = LoggerFactory.getLogger(SystemLogController.class);


   @Resource
   private SystemLogService systemLogService ;
    /**
     *  请求日志
     * @param obj
     * @return
     */
    @RequestMapping(value = "/log" , method = RequestMethod.POST)
    @ApiOperation(value = "新增日志", notes = "新增日志")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«SystemLogRequest»")
            ,
            @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String")//,
           // @ApiImplicitParam(paramType = "header", name = "authToken", value = "请求authToken", required = false, defaultValue = "", dataType = "String"),
           // @ApiImplicitParam(paramType = "header", name = "sign", value = "签名串", required = false, defaultValue = "", dataType = "String"),
           // @ApiImplicitParam(paramType = "header", name = "requestId", value = "交易Id", required = true, defaultValue = "", dataType = "String")
    })
    @ResponseBody
    public BaseResponse<SytemLogResponse> increase(@RequestBody BaseRequest<SystemLogRequest> obj) {

        BaseResponse<SytemLogResponse> sytemLogResponseBaseResponse = systemLogService.insertSystemLog(obj);
        return sytemLogResponseBaseResponse;
    }


    /**
     *  查询日志
     * @param obj
     * @return
     */
    @RequestMapping(value = "/selectLog" , method = RequestMethod.POST)
    @ApiOperation(value = "查询日志(日志id)", notes = "查询日志")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«SystemLogRequest»"),
            @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String")
    })
    @ResponseBody
    public BaseResponse<SystemLogRequest> selectLog(@RequestBody BaseRequest<SystemLogRequest> obj) {

        BaseResponse<SystemLogRequest> sytemLogResponseBaseResponse = systemLogService.selectLog(obj);
        return sytemLogResponseBaseResponse;
    }

    /**
     *  查询日志
     * @param obj
     * @return
     */
    @RequestMapping(value = "/updateLog" , method = RequestMethod.POST)
    @ApiOperation(value = "日志修改", notes = "日志修改")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«SystemLogRequest»"),
            @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String")
    })
    @ResponseBody
    public BaseResponse<SytemLogResponse> updateLog(@RequestBody BaseRequest<SystemLogRequest> obj) {
        BaseResponse<SytemLogResponse> sytemLogResponseBaseResponse = systemLogService.updateLog(obj);
        return sytemLogResponseBaseResponse;
    }


    /**
     *  查询日志
     * @param obj
     * @return
     */
    @RequestMapping(value = "/selectLogList" , method = RequestMethod.POST)
    @ApiOperation(value = "根据服务项目查询日志", notes = "根据服务项目查询日志")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "request", value = "请求数据", required = true, defaultValue = "", dataType = "BaseRequest«SystemLogRequest»"),
            @ApiImplicitParam(paramType = "header", name = "token", value = "请求会话token", required = true, defaultValue = "", dataType = "String")
    })
    @ResponseBody
    public BaseResponse<PageInfo> selectLogList(@RequestBody BaseRequest<SystemLogRequest> obj) {
        BaseResponse<PageInfo> sytemLogResponseBaseResponse = systemLogService.selectLogList(obj);
        return sytemLogResponseBaseResponse;
    }
}




