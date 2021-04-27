package com.huang.auth.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class QueryPolInfoResponse implements Serializable {

	@ApiModelProperty(value = "单号")
	private String polNo;
	@ApiModelProperty(value = "名称")
	private String mainRiskName;
	@ApiModelProperty(value = "费合计")
	private String sumPeriodPrem;
	@ApiModelProperty(value = "投保人")
	private String appntName;
	@ApiModelProperty(value = "被保人")
	private String insuredName;
	@ApiModelProperty(value = "保单状态")
	private String polStatus;
	@ApiModelProperty(value = "开户行名称")
	private String bankname;
	@ApiModelProperty(value = "银行账号")
	private String bankAccount;
	@ApiModelProperty(value = "保单所属机构")
	private String comName;
	@ApiModelProperty(value = "保单所属渠道")
	private String chnlName;
	@ApiModelProperty(value = "承保日期")
	private String uwDate;
	@ApiModelProperty(value = "保单生效日期")
	private String validateDate;
	@ApiModelProperty(value = "保单发放类型")
	private String polProvideType;
	@ApiModelProperty(value = "是否挂失")
	private String lossRptFlag;
	@ApiModelProperty(value = "回执签收日期")
	private String receiptSignDate;
	@ApiModelProperty(value = "保单服务人员姓名")
	private String polServiceStaffName;
	@ApiModelProperty(value = "保单服务人员联系电话")
	private String polServiceStaffPhoneNo;

}
