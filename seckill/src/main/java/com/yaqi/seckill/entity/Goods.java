package com.yaqi.seckill.entity;

public class Goods {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Goods(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
