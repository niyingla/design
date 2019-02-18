package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * 抽象的记录器类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:47
 **/
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    /**
     * 设置链上下一个元素
     * @param nextLogger
     */
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    /**
     * 日志信息处理
     * @param level
     * @param message
     */
    public void logMessage(int level, String message){
        //判断日志等级 是否满足条件
        if(this.level <= level){
            //满足  写日志
            write(message);
        }
        //调用链上 下一个对象处理消息
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 记录日志 具体实现叫交给实际实现元素
     * @param message
     */
    abstract protected void write(String message);
}
