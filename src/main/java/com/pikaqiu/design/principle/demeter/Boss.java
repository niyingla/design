package com.pikaqiu.design.principle.demeter;


/**
 * @author xiaoye
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
