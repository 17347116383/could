package com.huang.auth.service.impl;

import com.huang.auth.entity.User;
import com.huang.auth.mapper.UserMapper;
import com.huang.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.auth.service.impl
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userDao;

    @Override
    public User getUserById(int id) {
        return userDao.getUerById(id);
    }
}
