package com.pikaqiu.design.pattern.structural.composite;

/**
 *  组合模式
 *  适合可以忽略层次差异的树状结构
 *  可以表示对象的全部或者部分层次
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);
        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);
        imoocMainCourseCatalog.print();
    }
}
