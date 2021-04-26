package com.haung.hzhuserserver.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.service.vo
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Data
public class UserService  implements Serializable {


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
}
