package com.pikaqiu.design.pattern.behavioral.mediator.web;

/**
 * 中介者模式
 * 使用 User 对象来显示他们之间的通信
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 11:49
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
