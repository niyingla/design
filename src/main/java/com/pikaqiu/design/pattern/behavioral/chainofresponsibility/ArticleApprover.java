package com.pikaqiu.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 20:44
 **/
public class ArticleApprover extends Approver {
    /**
     * 部署课程
     *
     * @param course
     */
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (nextApprover != null) {
                nextApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含手记，不批准");
            return;
        }
    }
}
