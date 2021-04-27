package com.haung.hzhuserserver.service.impl;

import com.haung.hzhuserserver.entity.User;
import com.haung.hzhuserserver.mapper.UserMapper;
import com.haung.hzhuserserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.service.impl
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        int insertUser =userMapper.insertUser(user);
        return insertUser;
    }
}
