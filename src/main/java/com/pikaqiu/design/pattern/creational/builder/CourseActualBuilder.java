package com.pikaqiu.design.pattern.creational.builder;

/**
 * @author xiaoye
 */
public class CourseActualBuilder extends CourseBuilder {

    //建造者模式 初始化建造对象   每个建造类可以是不同的对象
    private Course course = new Course();


    /**
     * 调用建造者模式的方法
     * 给需要建造的对象设置属性
     * @param courseName
     */
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
