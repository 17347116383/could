package com.huang.log.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
@ApiModel(value="SystemLogRequest对象", description="日志对象")
public class SystemLogRequest implements Serializable {

    @ApiModelProperty(value = "ID")
    private String      systemLogId;
    //服务名称
    @ApiModelProperty(value = "服务名称")
    private String     serviceName;
    //服务id
    @ApiModelProperty(value = "服务id")
    private String     serviceId;
    //请求体
    @ApiModelProperty(value = "请求体")
    private String     serviceRequest;
    //响应内容
    @ApiModelProperty(value = "响应内容")
    private String   serviceResponse;
    //日志类型，dblink, ocr, ws 等
    @ApiModelProperty(value = "日志类型，dblink, ocr, ws 等")
    private String logType;
   //关联ID
   @ApiModelProperty(value = "关联ID")
    private  String relaId;
    //关联表名
    @ApiModelProperty(value = "关联表名")
    private  String relaTable;
    //请求目标
    @ApiModelProperty(value = "请求目标")
    private String reqTarget;
    //请求报文摘要
    @ApiModelProperty(value = "请求报文摘要")
    private String reqMsgMemo;
    //IP地址
    @ApiModelProperty(value = "IP地址")
    private String ipAddress;
   //服务方:producer， 消费方:consumer；
   @ApiModelProperty(value = "服务方:producer， 消费方:consumer；")
   private String serviceRole;
   //系统名称
   @ApiModelProperty(value = "系统名称")
   private String sysName;
   //取服务名
   @ApiModelProperty(value = "取服务名")
   private String sysNo;
    //应用cpu时间与 系统cpu时间占比
    @ApiModelProperty(value = "应用cpu时间与 系统cpu时间占比")
    private String appCpu;
    //设备品牌
    @ApiModelProperty(value = "设备品牌")
    private String brand;
    //运营商
    @ApiModelProperty(value = "运营商")
    private String carrier;
    //客户端IP
    @ApiModelProperty(value = "客户端IP")
    private String clientIp;
    //处理器信息
    @ApiModelProperty(value = "处理器信息")
    private String cpu;
   //设备ID
   @ApiModelProperty(value = "设备ID")
   private String deviceId;
    //设备Model
    @ApiModelProperty(value = "设备Model")
    private String deviceModel;
   //设备版本号
   @ApiModelProperty(value = "设备版本号")
   private String deviceVersion;
    // 分辨率
    @ApiModelProperty(value = "分辨率")
    private String displayResolution;
    //纬度
    @ApiModelProperty(value = "名称")
    private String latitude;
    //下载网速
    @ApiModelProperty(value = "下载网速")
    private String loadSpeed;
    //经度
    @ApiModelProperty(value = "经度")
    private String longitude;
    //物理地址
    @ApiModelProperty(value = "物理地址")
    private String mac;
    //信号强弱
    @ApiModelProperty(value = "信号强弱")
    private String networkLevel;
    //网络名称
    @ApiModelProperty(value = "网络名称")
    private String networkName;
    //网络类型
    @ApiModelProperty(value = "网络类型")
    private String networkType;
    //操作系统版本
    @ApiModelProperty(value = "操作系统版本")
    private String osVersion;
    //屏幕尺寸
    @ApiModelProperty(value = "屏幕尺寸")
    private String screenSize;
    // 设备序列号
    @ApiModelProperty(value = "设备序列号")
    private String sn;
    //存储内存
    @ApiModelProperty(value = "存储内存")
    private String storageSize;
    //cpu使用率
    @ApiModelProperty(value = "cpu使用率")
    private String totalCpu;
    //系统运行总内存
    @ApiModelProperty(value = "系统运行总内存")
    private  String totalMemory;
    //上传网速
    @ApiModelProperty(value = "上传网速")
    private String uploadSpeed;
    //已使用内存
    @ApiModelProperty(value = "已使用内存")
    private String usedMemory;

    private String      createdate;
    private String      createtime;
    private String      createuser;
    private String      modifydate;
    private String      modifytime;
    private String      modifyuser;
    @ApiModelProperty(value = "页码")
    private int  pageNum;
    @ApiModelProperty(value = "页大小")
    private int pageSize;
}
