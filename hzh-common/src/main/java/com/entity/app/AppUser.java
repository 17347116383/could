package com.entity.app;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import lombok.Data;
/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.entity.app
 * @ClassName: AppUser
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/25 20:51
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Data
public class AppUser implements Serializable {

    @ApiModelProperty(value = "名称")
    private String productName;
    @ApiModelProperty(value = "类型")
    private String bizFeeType;
    @ApiModelProperty(value = "金额")
    private String feeAmount;
}
