package com.pikaqiu.design.pattern.creational.builder.v2;

/**
 * 建造者模式 经常被运用在初始化配置
 *
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    //question & answer
    private String courseQA;

    /**
     * 初始化构造器
     * @param courseBuilder
     */
    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }


    /**
     * 类的建造者就是类中
     */
    public static class CourseBuilder{
        //构造参数 可以有默认值 通过buid方法重新设置
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        //question & answer
        private String courseQA;

        /**
         * 链式调用  返回本身
         * @param courseName
         * @return
         */
        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }


        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            //构造创建外部实例
            return new Course(this);
        }
    }
}
