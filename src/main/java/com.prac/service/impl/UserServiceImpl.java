package com.prac.service.impl;

import com.prac.dao.UserDao;
import com.prac.pojo.User;
import com.prac.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}