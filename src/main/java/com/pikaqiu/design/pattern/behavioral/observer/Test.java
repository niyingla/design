package com.pikaqiu.design.pattern.behavioral.observer;

import javax.swing.undo.CannotUndoException;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:23
 **/
public class Test {
    public static void main(String[] args) {

        Course course = new Course("java设计模式");
        Teacher teacher = new Teacher("小肖烨");
        course.addObserver(teacher);

        //业务撮箕
        Question question = new Question();
        question.setQuestionContent("函数如何编写");
        question.setUserName("皮卡丘");

        course.produceQuestion(course, question);
    }
}
