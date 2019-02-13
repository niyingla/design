package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

import com.pikaqiu.design.pattern.behavioral.chainofresponsibility.Approver;
import com.pikaqiu.design.pattern.behavioral.chainofresponsibility.ArticleApprover;
import com.pikaqiu.design.pattern.behavioral.chainofresponsibility.Course;
import com.pikaqiu.design.pattern.behavioral.chainofresponsibility.VideoApprover;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 20:50
 **/
public class Test {
    public static void main(String[] args) {
        //责任对象
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        //通过责任的对象
        Course course = new Course();
        course.setName("java设计模式 --肖烨");
        course.setArticle("java设计模式的手记");
        course.setVideo("java设计模式的视频");

        //设置到链上下一个元素
        articleApprover.setNextApprover(videoApprover);
        //调用
        articleApprover.deploy(course);

    }
}
