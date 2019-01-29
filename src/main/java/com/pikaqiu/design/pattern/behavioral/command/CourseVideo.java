package com.pikaqiu.design.pattern.behavioral.command;

import lombok.Data;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-28 22:11
 **/

@Data
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "视屏开放");
    }

    public void close() {
        System.out.println(this.name + "视屏关闭");
    }
}
