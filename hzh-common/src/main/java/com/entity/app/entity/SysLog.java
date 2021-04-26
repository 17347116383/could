package com.entity.app.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


/**
* @author 作者
* @version 创建时间：
* 类说明 日志实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SysLog  implements Serializable {

	private static final long serialVersionUID = -5398795297842978376L;
	@JsonSerialize(using=ToStringSerializer.class)
	private Long id;
	private String username; //	用户名
	private String module;	//	归属模块
	private String params;	//	执行方法的参数值
	private String remark;  //  备注
	private Boolean flag;	//	是否执行成功

	private Date createTime;
}
