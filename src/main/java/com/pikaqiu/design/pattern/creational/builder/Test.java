package com.pikaqiu.design.pattern.creational.builder;

/**
 * 需要建造实际的课程
 */
public class Test {
    public static void main(String[] args) {
        //创建课程建设类
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        //根据实际的需要创建的对象设置建造类
        coach.setCourseBuilder(courseBuilder);

        //建造出的对象
        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
