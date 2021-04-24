package com.entity.app.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
public class BaseRequest<T> {

    @ApiModelProperty(value = "请求头信息", position = 0)
    @NotNull
    @JSONField(ordinal = 1)
    private Headers headers;

    @ApiModelProperty(value = "请求数据体",position = 0)
    @Valid
    @JSONField(ordinal = 2)
    private T request;


}
