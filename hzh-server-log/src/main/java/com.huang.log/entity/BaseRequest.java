package com.huang.log.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
public class BaseRequest<T> implements Serializable {

    @ApiModelProperty(value = "请求头信息", position = 0)
    @NotNull
    @JSONField(ordinal = 1)
    private Headers headers;

    @ApiModelProperty(value = "请求数据体",position = 0)
    @Valid
    @JSONField(ordinal = 2)
    private T request;


}
