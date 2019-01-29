package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * 控制台日志输出
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