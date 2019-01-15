package com.pikaqiu.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        //常用的链式调用
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲").buildCoursePPT("Java设计模式精讲PPT").buildCourseVideo("Java设计模式精讲视频").build();
        System.out.println(course);

    //                                      创建建造者  通过建造者提供的方法建造值  建造需要构建的对象
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();

        System.out.println(set);
    }
}
