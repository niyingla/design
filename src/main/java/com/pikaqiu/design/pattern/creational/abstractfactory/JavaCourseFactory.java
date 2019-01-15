package com.pikaqiu.design.pattern.creational.abstractfactory;

/**
 * @author xiaoye
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
