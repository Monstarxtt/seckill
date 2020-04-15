package com.yaqi.seckill.dao;

import com.yaqi.seckill.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserById(int id);
    public User getUserByMobile(String mobile);
    public void insertUserToDb(User user);
    public void insertUser(User user);


}

