package com.hzh.com.hzhcom.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
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
public class Headers implements Serializable {

    @ApiModelProperty("APP 版本号")
    @JSONField(ordinal = 1)
    private String appVersion;
    @ApiModelProperty("客户端IP")
    @JSONField(ordinal = 2)
    private String clientIp;
    @ApiModelProperty("运营商")
    @JSONField(ordinal = 3)
    private String carrier;
    @ApiModelProperty("网络名称")
    @JSONField(ordinal = 4)
    private String networkName;
    @ApiModelProperty("网络类型")
    @JSONField(ordinal = 5)
    private String networkType;
    @ApiModelProperty("设备ID")
    @JSONField(ordinal = 6)
    private String deviceId;
    @ApiModelProperty("设备Model")
    @JSONField(ordinal = 7)
    private String deviceModel;
    @ApiModelProperty("设备序列号")
    @JSONField(ordinal = 8)
    private String sn;
    @ApiModelProperty("物理地址")
    @JSONField(ordinal = 9)
    private String mac;
    @ApiModelProperty("设备品牌")
    @JSONField(ordinal = 10)
    private String brand;
    @ApiModelProperty("操作系统版本")
    @JSONField(ordinal = 11)
    private String osVersion;
    @ApiModelProperty("设备版本号")
    @JSONField(ordinal = 12)
    private String deviceVersion;
    @ApiModelProperty("处理器信息")
    @JSONField(ordinal = 13)
    private String cpu;
    @ApiModelProperty("存储内存")
    @JSONField(ordinal = 14)
    private String storageSize;
    @ApiModelProperty("屏幕尺寸")
    @JSONField(ordinal = 15)
    private String screenSize;
    @ApiModelProperty("分辨率")
    @JSONField(ordinal = 16)
    private String displayResolution;
    @ApiModelProperty("信号强弱")
    @JSONField(ordinal = 17)
    private String networkLevel;
    @ApiModelProperty("下载网速")
    @JSONField(ordinal = 18)
    private String loadSpeed;
    @ApiModelProperty("上传网速")
    @JSONField(ordinal = 19)
    private String uploadSpeed;
    @ApiModelProperty("经度")
    @JSONField(ordinal = 20)
    private String longitude;
    @ApiModelProperty("纬度")
    @JSONField(ordinal = 21)
    private String latitude;
    @ApiModelProperty("系统运行总内存")
    @JSONField(ordinal = 22)
    private String totalMemory;
    @ApiModelProperty("已使用内存")
    @JSONField(ordinal = 23)
    private String usedMemory;
    @ApiModelProperty("cpu使用率")
    @JSONField(ordinal = 24)
    private String totalCpu;
    @ApiModelProperty("应用cpu时间与 系统cpu时间占比")
    @JSONField(ordinal = 25)
    private String appCpu;
    @ApiModelProperty(value = "微信openid", notes = "非微信应用不是必传")
    @JSONField(ordinal = 26)
    private String openid;
    @ApiModelProperty("极光应用KEY")
    @JSONField(ordinal = 27)
    private String jpushAppKey;
    @ApiModelProperty("极光设备标识")
    @JSONField(ordinal = 28)
    private String jpushRegistrationId;
    @ApiModelProperty("流水号")
    @JSONField(ordinal = 29)
    private String transId;
    @ApiModelProperty(value = "请求日期", example = "2020-2-1")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(ordinal = 30)
    private Date reqDate;
    @ApiModelProperty("请求时间")
    @JSONField(ordinal = 31)
    private String reqTime;
    @ApiModelProperty(value = "后台使用, 对前端隐藏", hidden = true)
    @JSONField(ordinal = 32)
    private String token;
    @ApiModelProperty(value = "微信分享授权码，后台使用, 对前端隐藏", hidden = true)
    @JSONField(ordinal = 33)
    private String authCode;
}
