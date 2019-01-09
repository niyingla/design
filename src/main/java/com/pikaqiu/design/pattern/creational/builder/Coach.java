package com.pikaqiu.design.pattern.creational.builder;

/**
 * 教练
 */
public class Coach {
    private CourseBuilder courseBuilder;

    /**
     * 设置建造工具类
     * @param courseBuilder
     */
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    /**
     * 动手建造
     * @param courseName
     * @param coursePPT
     * @param courseVideo
     * @param courseArticle
     * @param courseQA
     * @return
     */
    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
