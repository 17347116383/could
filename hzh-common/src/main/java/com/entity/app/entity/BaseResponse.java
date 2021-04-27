package com.entity.app.entity;

import com.entity.app.utils.ResponseCodeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/7/4
 * @Version: 1.0
 * @Description: TODO()
 */
@Data
public class BaseResponse <T>{

    @ApiModelProperty(value = "流水号", position = 0)
    private String transId;
    @ApiModelProperty(value = "接口请求响应编码，0000000:处理成功; 其它异常请参考 '错误编码定义'", required = true, position = 1)
    private String code;
    @ApiModelProperty(value = "接口请求响应描述", position = 2)
    private String message;
    @ApiModelProperty(value = "业务id, 后台调用日志微服务使用", position = 3)
    private String bizId;
    @ApiModelProperty(value = "数据权限校验token", position = 4)
    private String authToken;
    @ApiModelProperty(value = "响应体", position = 5)
    private T response;
    @ApiModelProperty(value = "请求日期", example = "2020-2-1", position = 6)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reqDate;
    @ApiModelProperty(value = "请求时间", position = 7)
    private String reqTime;
    @ApiModelProperty(value = "响应日期", example = "2019-2-1", position = 8)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date rspDate;
    @ApiModelProperty(value = "响应时间", position = 9)
    private String rspTime;
    @ApiModelProperty(value = "是否阻断，0：否，1：是,定义在RspEnum枚举", position = 10)
    private String codeType;



    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(String code, String message, String bizId) {
        this.code = code;
        this.message = message;
        this.bizId = bizId;
    }

    public BaseResponse(String code, String message, String bizId, String transId) {
        this.code = code;
        this.message = message;
        this.bizId = bizId;
        this.transId = transId;
    }

    public  static BaseResponse getBaseResponse(){
        BaseResponse baseResponse =new BaseResponse();
        baseResponse.setCode(ResponseCodeEnum.SUCCESS.getCode());
        baseResponse.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        return  baseResponse;
    }
}
