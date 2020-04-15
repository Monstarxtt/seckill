package com.yaqi.seckill.dao;


import com.yaqi.seckill.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    //应该是一个列表，暂时假设只有一件商品
    public Goods getAllGoodsDetail();

}
