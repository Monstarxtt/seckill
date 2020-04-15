package com.yaqi.seckill.entity;

import java.util.Date;

public class Order {
    private int id;
    //private int userId;
    private String userName;
    private int goodsId;
    private String goodsName;
    //private double goodsPrice;
    private Date createDate;
    //private Date payDate;

    public void setId(int id){
        this.id = id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


}


