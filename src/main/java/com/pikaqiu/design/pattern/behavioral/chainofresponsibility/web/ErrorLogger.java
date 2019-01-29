package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * 错误日志输出
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