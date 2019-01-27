package com.pikaqiu.design.pattern.behavioral.iterator;

/**
 * 迭代器模式  很少自己手动实践 一般都用现成的
 * @author xiaoye
 */
public class Test {


    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);

        //操作数据
        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }


    /**
     * 打印所有课程
     * @param courseAggregate
     */
    public static void printCourses(CourseAggregate courseAggregate){
        //获取课程迭代器
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        //判断是否是最后一个
        while(!courseIterator.isLastCourse()){
            //获取下一个
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }


}
