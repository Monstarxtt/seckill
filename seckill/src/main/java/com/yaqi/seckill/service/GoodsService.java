package com.yaqi.seckill.service;

import com.yaqi.seckill.dao.GoodsMapper;
import com.yaqi.seckill.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public Goods getAllGoodsDetail() {
        return goodsMapper.getAllGoodsDetail();
    }
}
