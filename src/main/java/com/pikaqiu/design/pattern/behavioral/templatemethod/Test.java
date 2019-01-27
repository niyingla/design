package com.pikaqiu.design.pattern.behavioral.templatemethod;

/**
 * 定义好 模板的内容
 * 具体需要实现的方法  开放给子类
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式课程start---");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


    }
}
