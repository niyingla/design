package com.pikaqiu.design.principle.dependenceinversion;

/**
 * @author xiaoye
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
