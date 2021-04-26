package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
* 类说明  用户角色实体
*/
@Data

public class SysUserRole  implements Serializable{

	private static final long serialVersionUID = 2096687235759960875L;
	
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long userId;

	@JsonSerialize(using=ToStringSerializer.class)
    private Long roleId;

}
