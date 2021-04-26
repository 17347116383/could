package com.huang.log.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huang.log.entity.BaseRequest;
import com.huang.log.entity.BaseResponse;
import com.huang.log.entity.SystemLogRequest;
import com.huang.log.entity.SytemLogResponse;
import com.huang.log.mapper.SystemLogMapper;
import com.huang.log.service.SystemLogService;
import com.huang.log.service.vo.SystemLogReqService;
import com.huang.log.systemenum.CodeEnum;
import com.huang.log.systemenum.ResponseCodeEnum;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.beans.Transient;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.service.impl
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Service
public class SystemLogServiceImpl  implements SystemLogService {

    private static final Logger log = LoggerFactory.getLogger(SystemLogServiceImpl.class);

   @Resource
   private SystemLogMapper systemLogMapper;


    @Transactional(rollbackFor =RuntimeException.class )
    @Override
    public BaseResponse<SytemLogResponse> insertSystemLog(BaseRequest<SystemLogRequest> obj) {
        BaseResponse baseResponse = BaseResponse.success();
        SytemLogResponse systemlog=new SytemLogResponse();
        if (obj==null || obj.getRequest()==null){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
             return baseResponse;
         }
         SystemLogRequest objRequest = obj.getRequest();
         String serviceName = objRequest.getServiceName();
         String serviceRequest = objRequest.getServiceRequest();
        if (StringUtils.isEmpty(serviceName)||StringUtils.isEmpty(serviceRequest)){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        String uuid = UUID.randomUUID().toString();
        SystemLogRequest systemLogRequest = obj.getRequest();
        SystemLogReqService  systemLog=new SystemLogReqService();
        if (systemLogRequest!=null){
            BeanUtils.copyProperties(systemLogRequest ,systemLog);
        }
        systemLog.setSystemLogId(uuid);
        int itemLog = systemLogMapper.insertSystemLog(systemLog);
        if (itemLog!=1){
            systemlog.setCode(CodeEnum.SUCCESS.getCode());
            systemlog.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
            baseResponse.setResponse(systemlog);
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }

        systemlog.setCode(CodeEnum.SUCCESS.getCode());
        systemlog.setLogId(uuid);
        systemlog.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        baseResponse.setResponse(systemlog);
        baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
        baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        return baseResponse;
    }

    @Override
    public BaseResponse<SystemLogRequest> selectLog(BaseRequest<SystemLogRequest> obj) {


        BaseResponse baseResponse = BaseResponse.success();
        SytemLogResponse systemlog=new SytemLogResponse();
        if (obj==null || obj.getRequest()==null){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        SystemLogRequest objRequest = obj.getRequest();
        String serviceName = objRequest.getServiceName();
        String systemLogId = objRequest.getSystemLogId();
        if (StringUtils.isEmpty(systemLogId)){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        SystemLogReqService  systemLog=new SystemLogReqService();
        if (objRequest!=null){
            BeanUtils.copyProperties(objRequest ,systemLog);
        }
        SystemLogReqService systemLogReqService = systemLogMapper.selectLog(systemLog);
        if (systemLogReqService!=null){
            baseResponse.setResponse(systemLogReqService);
            baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
            baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
            return baseResponse;
        }
        baseResponse.setResponse(systemLogReqService);
        return baseResponse;
    }






    @Override
    public BaseResponse<PageInfo> selectLogList(BaseRequest<SystemLogRequest> obj) {
        BaseResponse baseResponse = BaseResponse.success();
        SytemLogResponse systemlog=new SytemLogResponse();
        if (obj==null || obj.getRequest()==null){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        SystemLogRequest objRequest = obj.getRequest();
        String serviceName = objRequest.getServiceName();
        if (StringUtils.isEmpty(serviceName)){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        SystemLogReqService  systemLog=new SystemLogReqService();
        if (objRequest!=null){
            BeanUtils.copyProperties(objRequest ,systemLog);
        }
        PageHelper.startPage(objRequest.getPageNum(), objRequest.getPageSize());
        PageInfo  pageInfo=new PageInfo(systemLogMapper.selectLogList(systemLog));
        List<SystemLogRequest> pageInfoList = pageInfo.getList();
        if (!pageInfoList.isEmpty()){
            baseResponse.setResponse(pageInfo);
            baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
            baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
            return baseResponse;
        }
        baseResponse.setResponse(pageInfo);
        return baseResponse;
    }


    /**
     *
     * @param obj
     * @return
     */
    @Transactional(rollbackFor =RuntimeException.class )
    @Override
    public BaseResponse<SytemLogResponse> updateLog(BaseRequest<SystemLogRequest> obj) {


        BaseResponse baseResponse = BaseResponse.success();
        SytemLogResponse syslog=new SytemLogResponse();
        if (obj==null || obj.getRequest()==null){
            baseResponse.setCode(ResponseCodeEnum.ERROR.getCode());
            baseResponse.setMessage(ResponseCodeEnum.ERROR.getMessage());
            return baseResponse;
        }
        SystemLogRequest objRequest = obj.getRequest();
        SystemLogReqService  systemLog=new SystemLogReqService();
        if (objRequest!=null){
            BeanUtils.copyProperties(objRequest ,systemLog);
        }
        int updateLog = systemLogMapper.updateLog(systemLog);
        if (updateLog==1){
            syslog.setLogId(systemLog.getSystemLogId());
            baseResponse.setResponse(syslog);
            baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
            baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
            return baseResponse;
        }
        baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
        baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        return baseResponse;
    }
}
