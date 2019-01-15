package com.pikaqiu.design.pattern.behavioral.iterator;

/**
 * @author xiaoye
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
