package com.pikaqiu.design.pattern.structural.flyweight;

/**
 * 享元模式
 * 复用已存在的对象
 * @author xiaoye
 */
public class Test {
    private static final String[] DEPARTMENTS = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = DEPARTMENTS[(int) (Math.random() * DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }
/*        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));

        System.out.println("c==d:"+(c==d));*/

    }
}
