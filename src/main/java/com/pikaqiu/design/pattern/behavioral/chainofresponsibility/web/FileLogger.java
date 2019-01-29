package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:53
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}