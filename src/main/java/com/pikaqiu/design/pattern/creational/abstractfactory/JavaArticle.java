package com.pikaqiu.design.pattern.creational.abstractfactory;

/**
 * @author xiaoye
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
