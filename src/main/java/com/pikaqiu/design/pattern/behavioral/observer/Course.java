package com.pikaqiu.design.pattern.behavioral.observer;

import lombok.Data;

import java.util.Observable;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:12
 **/
@Data
public class Course extends Observable {

    public Course(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName());
        setChanged();
        notifyObservers(question);
    }
}

