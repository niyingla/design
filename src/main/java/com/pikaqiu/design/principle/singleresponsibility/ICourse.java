package com.pikaqiu.design.principle.singleresponsibility;

/**
 * @author xiaoye
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
