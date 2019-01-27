package com.pikaqiu.design.pattern.behavioral.observer;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:13
 *
 * Observer 观察者接口
 **/
@Data
public class Teacher implements Observer {

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    private String teacherName;

    /**
     * 被观察者动作变化后调用的方法
     *
     * @param o   被观察的对象
     * @param arg 参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" +
                course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的一个问题");
    }
}
