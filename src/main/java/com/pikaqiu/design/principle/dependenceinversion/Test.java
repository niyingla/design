package com.pikaqiu.design.principle.dependenceinversion;

/**
 * 抽象更稳定 来搭建架构
 * 依赖倒置原则 抽象的目的制定好规范和契约 以便于以后扩展
 * 接口就是契约  总结 面向接口编程
 *
 * 实现新的逻辑根据现有规则扩展，需要修改原来的底层（接口，实现类）
 * 然后在新的高层中调用即可
 */
public class Test {

    //v1 耦合紧密
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//    }

    //v2 只有Geely和ICourse有耦合 具体实现交给应用层
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }


    //v3 构造器注入 获取实现
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }

    /**
     * v4 set注入实现 需要什么set什么
     *
     * @param args
     */
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();

    }


}
