package com.entity.app.entity;


import com.entity.app.utils.ResponseCodeEnum;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

/**
 * 响应对象工具类
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/7/4
 * @Version: 1.0
 * @Description: TODO()
 */
public class ResponseUtils {

    /**
     * 初始化响应对象
     */
    public static BaseResponse initResponse(BaseRequest request) {
        BaseResponse response = new BaseResponse();
        response.setCode(ResponseCodeEnum.SUCCESS.getCode());
        response.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        response.setCodeType("0");
        response.setTransId(request.getHeaders().getTransId());
        response.setReqDate(DateTime.now().toDate());
        response.setReqTime(DateTime.now().toString(ISODateTimeFormat.hourMinuteSecond()));
        return response;
    }

    /**
     * 设置响应时间
     */
   public static void setResponseTime(BaseResponse response) {
        response.setRspDate(DateTime.now().toDate());
        response.setRspTime(DateTime.now().toString(ISODateTimeFormat.hourMinuteSecond()));
    }


}
