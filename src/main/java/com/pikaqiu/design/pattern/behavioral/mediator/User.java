package com.pikaqiu.design.pattern.behavioral.mediator;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-13 19:35
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 调用中介者进行统一交互或操作
     * @param message
     */
    public void sendMessage(String message) {
        // ***统一操作
        StudyGroup.showMessage(this, message);
    }
}
