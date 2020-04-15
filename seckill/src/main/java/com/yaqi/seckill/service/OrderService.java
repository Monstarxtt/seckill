package com.yaqi.seckill.service;

import com.yaqi.seckill.dao.OrderMapper;
import com.yaqi.seckill.entity.Goods;
import com.yaqi.seckill.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void createOrder(String userName, Goods goods) {
        Order order = new Order();
        order.setUserName(userName);
        order.setGoodsId(goods.getId());
        order.setGoodsName(goods.getName());
        order.setCreateDate(new Date());
        orderMapper.insertOrderToDb(order);
    }
}
