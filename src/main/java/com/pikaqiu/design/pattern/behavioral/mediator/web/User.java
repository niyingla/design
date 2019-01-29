package com.pikaqiu.design.pattern.behavioral.mediator.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 11:48
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}