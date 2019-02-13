package com.pikaqiu.design.pattern.behavioral.state;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 21:37
 **/
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    /**
     * 当前状态下不能进行此操作
     */
    @Override
    public void speed() {
        System.out.println(" ERROR 停止状态不能快进！！！");
    }

    /**
     * 当前状态下不能进行此操作
     */
    @Override
    public void pause() {
        System.out.println(" ERROR 停止状态不能暂停 ！！！");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频状态");
    }
}
