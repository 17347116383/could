package com.haung.hzhuserserver.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.entity
 * @ClassName: User
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/25 21:25
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@ApiModel(value = "用户模型")
public class User {
    //@ApiModelProperty(value="id" ,required= true,example = "123")
    @ApiModelProperty(value = "名称")
    private String productName;
    @ApiModelProperty(value = "类型")
    private String bizFeeType;
    @ApiModelProperty(value = "金额")
    private String feeAmount;
    @ApiModelProperty(value="id" ,required= true,example = "123")
    private int  id;
    @ApiModelProperty(value="用户名称" ,required= true,example = "124")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBizFeeType() {
        return bizFeeType;
    }

    public void setBizFeeType(String bizFeeType) {
        this.bizFeeType = bizFeeType;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }
}
