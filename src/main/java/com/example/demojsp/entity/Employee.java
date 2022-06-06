package com.example.demojsp.entity;

public class Employee {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "userName='" + userName + '\'' +
                '}';
    }
    public void  init(){
        System.out.print("初始化Student对象");
    }

    public void destroy(){
        System.out.print("销毁Student对象");
    }
}
