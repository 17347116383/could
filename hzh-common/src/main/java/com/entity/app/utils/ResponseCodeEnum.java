package com.entity.app.utils;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.entity.app.utils
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/27
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public enum ResponseCodeEnum {


    SUCCESS ("200","请求成功！"),
    asd("201","");

    private String code;
    private String message;

    private ResponseCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }}
