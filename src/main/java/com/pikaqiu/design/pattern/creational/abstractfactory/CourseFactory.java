package com.pikaqiu.design.pattern.creational.abstractfactory;


/**
 * 同一类型创建的工厂
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();

}
