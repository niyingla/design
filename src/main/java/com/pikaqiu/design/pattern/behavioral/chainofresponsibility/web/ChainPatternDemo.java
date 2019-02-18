package com.pikaqiu.design.pattern.behavioral.chainofresponsibility.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:54
 **/
public class ChainPatternDemo {

    /**
     * 链上打印日志
     * @return
     */
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        //获取日志链
        AbstractLogger loggerChain = getChainOfLoggers();
        //链上打印日志
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}