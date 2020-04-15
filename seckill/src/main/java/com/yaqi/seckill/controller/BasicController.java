package com.yaqi.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BasicController {
    @RequestMapping("/main_page")
    public String showMainPage() {
        return "MainPage";
    }

    @RequestMapping("index")
    public String showIndex(Model model) {
        model.addAttribute("name", "yaqi");
        return "MainPage";
    }

}













