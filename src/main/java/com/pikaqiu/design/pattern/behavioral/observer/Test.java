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
        Teacher teacher1 = new Teacher("小肖烨");
        Teacher teacher2 = new Teacher("小微笑");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑
        Question question = new Question();
        //设置课程问题
        question.setQuestionContent("函数如何编写");
        //设置提问者
        question.setUserName("皮卡丘");
        //调用课程提问方法
        course.produceQuestion(course, question);
    }
}
