package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:52
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}