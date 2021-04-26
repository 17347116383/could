package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


/**

 * 类说明 权限标识
 */
@Data
public class SysPermission  implements Serializable {

	private static final long serialVersionUID = 1389727646460449239L;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;
	private String permission;
	private String name;

	private Date createTime;

	private Date updateTime;

	private Long roleId;
	
	

	private Set<Long> authIds;

}
