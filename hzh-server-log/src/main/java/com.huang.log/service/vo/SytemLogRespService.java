package com.huang.log.service.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.entity
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Data
public class SytemLogRespService implements Serializable {

    /**
     * 响应编码
     */
    private int code;
    /**
     * 日志ID
     */
    private String logId;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应状态
     */
    private boolean responseStatus;
    /**
     * 响应头
     */
    private String responseHeaders;
}
