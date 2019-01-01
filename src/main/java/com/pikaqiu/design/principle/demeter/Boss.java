package com.pikaqiu.design.principle.demeter;


/**
 * Created by geely
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
