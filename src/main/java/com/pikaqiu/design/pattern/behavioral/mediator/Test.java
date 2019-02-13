package com.pikaqiu.design.pattern.behavioral.mediator;

/**
 * 中介者模式测试类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 19:41
 **/
public class Test {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
