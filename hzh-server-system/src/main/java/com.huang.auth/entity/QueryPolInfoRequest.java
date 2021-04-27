package com.huang.auth.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class QueryPolInfoRequest implements Serializable {


	@ApiModelProperty(value = "单号", position = 1)
	@NotBlank(message = "单号码不可以为空")
	private String polNo;



}
