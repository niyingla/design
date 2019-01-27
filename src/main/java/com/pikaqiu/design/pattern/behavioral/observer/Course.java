package com.pikaqiu.design.pattern.behavioral.observer;

import lombok.Data;

import java.util.Observable;


/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:12
 *
 * Observable 被观察者类
 **/
@Data
public class Course extends Observable {

    public Course(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName());
        //设置被观察者动作变化为true
        setChanged();
        //提醒观察的人 //后面是参数
        notifyObservers(question);
    }
}
