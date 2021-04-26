package com.haung.hzhuserserver.mapper;

import com.haung.hzhuserserver.entity.User;
import org.mapstruct.Mapper;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.mapper
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Mapper
public interface UserMapper {


  public  int   insertUser(User user);
}
