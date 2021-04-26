package com.huang.auth.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.auth.entity
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Data
@ApiModel(value = "用户模型")
public class User {
    @ApiModelProperty(value="用户ID" ,required= true,example = "124")
    private Integer id;
    @ApiModelProperty(value="用户名称" ,required= true,example = "124")
    private String userName;

}
