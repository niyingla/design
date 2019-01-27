package com.pikaqiu.design.pattern.behavioral.observer;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:13
 **/
@Data
public class Teacher implements Observer {

    private String teacherName;

    /**
     * 动作修改方法
     * @param o 被观察的对象
     * @param arg 参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" +
                course.getCourseName() + "课程接收到一个" + question.getUserName());
    }
}
