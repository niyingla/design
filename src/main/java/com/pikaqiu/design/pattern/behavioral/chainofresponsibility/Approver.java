package com.pikaqiu.design.pattern.behavioral.chainofresponsibility;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 20:38
 **/
public abstract class Approver {

    /**
     * 自己类型的下一个执行对象
     */
    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void deploy(Course course);
}
