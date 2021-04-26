package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
* 类说明  角色菜单实体
*/
@Data
@Builder


public class SysRoleMenu  implements Serializable{

	private static final long serialVersionUID = 64240478379218861L;
	 
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long roleId;

	@JsonSerialize(using=ToStringSerializer.class)
    private Long menuId;

}
