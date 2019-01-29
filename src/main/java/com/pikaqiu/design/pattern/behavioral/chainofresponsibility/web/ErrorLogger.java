package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:53
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}