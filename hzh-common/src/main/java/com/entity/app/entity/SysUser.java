package com.entity.app.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户类
 */
@Data

public class SysUser  implements Serializable {

	private static final long serialVersionUID = -5886012896705137070L;

	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;
	private String username;
	private String password;

	private String nickname;

	private String headImgUrl;
	private String phone;
	private Integer sex;
	private Boolean enabled;
	private String type;

	private Date createTime;

	private Date updateTime;
	

	private List<SysRole> roles;
	

	private String roleId;

	private String oldPassword;

	private String newPassword;

}
