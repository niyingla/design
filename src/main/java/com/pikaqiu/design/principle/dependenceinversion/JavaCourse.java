package com.pikaqiu.design.principle.dependenceinversion;

/**
 * @author xiaoye
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
