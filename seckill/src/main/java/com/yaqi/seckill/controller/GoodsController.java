package com.yaqi.seckill.controller;

import com.yaqi.seckill.entity.Goods;
import com.yaqi.seckill.entity.User;
import com.yaqi.seckill.service.GoodsService;
import com.yaqi.seckill.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("show_goods")
    public String showGoods(Model model) {
        Goods goods = goodsService.getAllGoodsDetail();
        System.out.println(goods.getName());
        model.addAttribute("goodsName", goods.getName());
        model.addAttribute("goodsPrice", goods.getPrice());
        model.addAttribute("goodsStock", goods.getStock());

        return "show_seckill_goods";
    }

    @RequestMapping("buy")
    @ResponseBody
    public String goodsBuy(HttpServletRequest request, HttpServletResponse response) {
        //TODO  提取token 在session表中找到登陆的用户信息 先假定生成一个用户
        String userName = "user_name";
        Goods goods = new Goods(1,"hat", 45.5, 10);

        orderService.createOrder(userName, goods);
        return "buy success..";
    }

}
