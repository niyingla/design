package com.pikaqiu.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author xiaoye
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    /**
     * 位置默认 0
     */
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }

    /**
     * 获取下一个元素
     * @return
     */
    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        // 从长度判断是否是最后一个元素
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}
