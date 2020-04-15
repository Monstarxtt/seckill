package com.yaqi.seckill.entity;

public class User {
    private int id;
    private String name;
    private String mobile;
    private String password;




    public User(String mobile, String password) {
        this.name = null;
        this.mobile = mobile;
        this.password = password;
    }



    public String getName() {
        return name;
    }



}
