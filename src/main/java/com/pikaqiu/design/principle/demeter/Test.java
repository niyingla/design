package com.pikaqiu.design.principle.demeter;

/**
 * 最少知道原则 成员变量算强依赖
 * 类内部高内聚 类外部低耦合
 * 少和其他类产生依赖
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
