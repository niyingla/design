package com.pikaqiu.design.principle.dependenceinversion;

/**
 * @author xiaoye
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
