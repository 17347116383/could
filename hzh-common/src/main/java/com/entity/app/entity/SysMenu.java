package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
* 类说明  菜单实体
*/
@Data
public class SysMenu implements Serializable {

	private static final long serialVersionUID = 749360940290141180L;
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long parentId;
	private String name;
	private String url;
	private String path;
	private String css;
	private Integer sort;

	private Date createTime;

	private Date updateTime;

	private Integer isMenu;
	private Boolean hidden;
	

	private List<SysMenu> subMenus;

	private Long roleId;

	private Set<Long> menuIds;



}
