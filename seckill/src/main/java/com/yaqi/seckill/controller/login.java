package com.yaqi.seckill.controller;

import com.yaqi.seckill.entity.Goods;
import com.yaqi.seckill.entity.User;
import com.yaqi.seckill.service.GoodsService;
import com.yaqi.seckill.service.UserService;
import com.yaqi.seckill.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class login {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String return_login() {
        //System.out.println("login html .../");
        return "login";
    }

    @RequestMapping("to_login")
    //@ResponseBody
    public String toLogin(@RequestParam("mobile") String mobile, @RequestParam("password") String password, HttpServletResponse response, Model model) {
        //未考虑密码是否正确
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            User newUser = new User(mobile, password);
            userService.insertUserToDb(newUser);
            //userService.insertUser(newUser);
        }
        //System.out.println("mobile:" + mobile + " \n" + "password:" + password);

        //add cookie
        String token = UUIDUtil.uuid();
        addCookie(response, token);

        //TODO  利用redis建立session表，将token和user关联起来，

        return "redirect:/goods/show_goods";
    }

    private void addCookie(HttpServletResponse response, String token) {
        Cookie cookie = new Cookie("token", token);

        //设置有效期
        cookie.setMaxAge(60 * 60 * 24);

        cookie.setPath("/");
        response.addCookie(cookie);
    }


}







