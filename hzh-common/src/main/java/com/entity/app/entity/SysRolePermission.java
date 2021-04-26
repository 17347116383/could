package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**

* 类说明 	角色权限实体
*/
@Data


public class SysRolePermission implements Serializable{

	 
	private static final long serialVersionUID = 4105899775460060259L;
	
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long roleId;

	@JsonSerialize(using=ToStringSerializer.class)
    private Long permissionId;

}
