package com.hzh.com.hzhcom.entity;



import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

/**
 * 响应对象工具类
 *
 * @author Chandler
 * @date 2020/4/23
 */
public class ResponseUtils {

    /**
     * 初始化响应对象
     */
    public static BaseResponse initResponse(BaseRequest request) {
        BaseResponse response = new BaseResponse();
        response.setCode("200");
        response.setMessage("成功");
        //response.setCodeType(ResponseEnum.UNBLOCK.getCode());
        response.setTransId("1");
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
