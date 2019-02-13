package com.pikaqiu.design.pattern.behavioral.state;

/**
 * @program: design_pattern
 * @description: 、
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

    }
}
