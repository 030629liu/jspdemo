package com.example.demojsp.entity;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.print("姓名是："+name);
    }
}
