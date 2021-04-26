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
public enum ResponseCodeEnum {



    SUCCESS("200","请求成功"),
    EMPTY("299","请求参数为空！"),
    ERROR("500","请求失败");


    private String code;
    private String message;

    private ResponseCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseCodeEnum getByCode(String code) {
        ResponseCodeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ResponseCodeEnum codeEnum = var1[var3];
            if (code.equals(codeEnum.getCode())) {
                return codeEnum;
            }
        }

        return null;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
