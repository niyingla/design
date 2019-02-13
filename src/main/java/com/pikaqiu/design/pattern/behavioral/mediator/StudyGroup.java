package com.pikaqiu.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 中介类 进行统一交互
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 19:36
 **/
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
