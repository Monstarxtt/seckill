package com.yaqi.seckill.service;

import com.yaqi.seckill.dao.UserMapper;
import com.yaqi.seckill.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public User getUserByMobile(String mobile) {
        return userMapper.getUserByMobile(mobile);
    }

    public void insertUserToDb(User user) {
        userMapper.insertUserToDb(user);
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
