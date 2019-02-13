package com.pikaqiu.design.pattern.behavioral.state;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 21:36
 **/
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
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
