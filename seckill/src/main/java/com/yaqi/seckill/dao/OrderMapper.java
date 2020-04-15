package com.yaqi.seckill.dao;

import com.yaqi.seckill.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    public void insertOrderToDb(Order order);
}
