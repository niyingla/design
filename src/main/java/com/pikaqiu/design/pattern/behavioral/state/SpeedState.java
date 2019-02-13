package com.pikaqiu.design.pattern.behavioral.state;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 21:36
 **/
public class SpeedState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进视频状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
