package com.pikaqiu.design.pattern.behavioral.state;

/**
 * 状态测试类
 * @program: design_pattern
 * @description: 如果想加一个状态类，直接new就行
 * @author: xiaoye
 * @create: 2019-02-13 22:06
 **/
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
    }
}
