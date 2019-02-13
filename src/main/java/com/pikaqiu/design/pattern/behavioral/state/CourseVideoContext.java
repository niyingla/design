package com.pikaqiu.design.pattern.behavioral.state;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 21:33
 **/
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.getCourseVideoState().play();
    }

    public void speed() {
        this.getCourseVideoState().speed();
    }

    public void stop() {
        this.getCourseVideoState().stop();
    }

    public void pause() {
        this.getCourseVideoState().pause();
    }
}
