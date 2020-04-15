package com.yaqi.seckill.controller;

import com.yaqi.seckill.service.UserService;
import com.yaqi.seckill.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("get_user")
    public String showName() {
        int id = 2;
        return userService.getUserById(id).getName();
    }

    @RequestMapping("insert_user")
    public String insertUserToDb() {

        return "insert success!";
    }
}
