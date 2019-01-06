package com.pikaqiu.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂模式
 * 工厂模式提供的是海尔洗衣机 美的洗衣机的 工厂
 * 抽象工厂模式 提供的是 海尔洗衣机 海尔冰箱 海尔电视机
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
