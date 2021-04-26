package com.entity.app.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 类说明 角色
 */
@Data
public class SysRole implements Serializable{

	private static final long serialVersionUID = -3591576507384897451L;
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;
	private String code ;
	private String name;

	private Date createTime;

	private Date updateTime;
	

	private Long userId;
}
