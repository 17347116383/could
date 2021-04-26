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
public class SystemLogReqService implements Serializable {


    private String      systemLogId;
    //服务名称
    private String     serviceName;
    //服务id
    private String     serviceId;
    //请求体
    private String     serviceRequest;
    //响应内容
    private String   serviceResponse;
    //日志类型，dblink, ocr, ws 等
    String logType;
   //关联ID
    String relaId;
    //关联表名
    String relaTable;
    //请求目标
    String reqTarget;
    //请求报文摘要
    String reqMsgMemo;
    //IP地址
    String ipAddress;
   //服务方:producer， 消费方:consumer；
    String serviceRole;
   //系统名称
    String sysName;
   //取服务名
    String sysNo;
    //应用cpu时间与 系统cpu时间占比
    String appCpu;
    //设备品牌
    String brand;
    //运营商
    String carrier;
    //客户端IP
    String clientIp;
    //处理器信息
    String cpu;
   //设备ID
    String deviceId;
    //设备Model
    String deviceModel;
   //设备版本号
    String deviceVersion;
    // 分辨率
    String displayResolution;
    //纬度
    String latitude;
    //下载网速
    String loadSpeed;
    //经度
    String longitude;
    //物理地址
    String mac;
    //信号强弱
    String networkLevel;
    //网络名称
    String networkName;
    //网络类型
    String networkType;
    //操作系统版本
    String osVersion;
    //屏幕尺寸
    String screenSize;
    // 设备序列号
    String sn;
    //存储内存
    String storageSize;
    //cpu使用率
    String totalCpu;
    //系统运行总内存
    String totalMemory;
    //上传网速
    String uploadSpeed;
    //已使用内存
    String usedMemory;

    private String      createdate;
    private String      createtime;
    private String      createuser;
    private String      modifydate;
    private String      modifytime;
    private String      modifyuser;
}
