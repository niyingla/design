package com.pikaqiu.design.pattern.behavioral.mediator.web;

import java.util.Date;

/**
 * 中介类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 11:48
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}