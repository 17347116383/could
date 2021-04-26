package com.huang.log.systemenum;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.systemenum
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public enum CodeEnum {


    SUCCESS(200,"请求成功"),
    EMPTY(299,"请求参数为空！"),
    ERROR(500,"请求失败");


    private int  code;
    private String message;

     CodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
