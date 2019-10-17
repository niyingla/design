package com.pikaqiu.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂模式
 * 工厂模式提供的是海尔洗衣机 美的洗衣机的 工厂
 * 抽象工厂模式 提供的是 海尔洗衣机工厂 海尔冰箱工厂 海尔电视机工厂
 * 获取mysqlSqlSessionFactory或者获取sqlServerSqlSessionFactory都是mybatis下的同一产品
 * 里面都会提供mybatis对应的各种产品
 *
 * 抽象工厂一开始就定义好有哪些产品 然后需要的子类直接实现
 */
public class Test {
    public static void main(String[] args) {
        //提供某一类  固定特征对象的创建
        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
        
        CourseFactory courseFactory1 = new JavaCourseFactory();
        Video video1 = courseFactory1.getVideo();
        Article article1 = courseFactory1.getArticle();
        video1.produce();
        article1.produce();
    }
}
