package com.huang.log.service;

import com.github.pagehelper.PageInfo;
import com.huang.log.entity.BaseRequest;
import com.huang.log.entity.BaseResponse;
import com.huang.log.entity.SystemLogRequest;
import com.huang.log.entity.SytemLogResponse;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.service
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public interface SystemLogService {


    public BaseResponse<SytemLogResponse> insertSystemLog(BaseRequest<SystemLogRequest> obj);


    public BaseResponse<SystemLogRequest> selectLog( BaseRequest<SystemLogRequest> obj);

    public BaseResponse<PageInfo> selectLogList(BaseRequest<SystemLogRequest> obj);

    public BaseResponse<SytemLogResponse> updateLog( BaseRequest<SystemLogRequest> obj);
}
