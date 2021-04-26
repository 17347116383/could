package com.huang.log.mapper;

import com.huang.log.service.vo.SystemLogReqService;
import com.huang.log.service.vo.SytemLogRespService;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.mapper
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Mapper
public interface SystemLogMapper {


    public  int insertSystemLog(SystemLogReqService systemLog);


    public   SystemLogReqService  selectLog  (SystemLogReqService systemLog);

    public List<SystemLogReqService> selectLogList  (SystemLogReqService systemLog);

    public int updateLog  (SystemLogReqService systemLog);
}
