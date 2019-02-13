package com.pikaqiu.design.pattern.behavioral.state;

import lombok.Data;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 21:32
 **/
@Data
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

}
