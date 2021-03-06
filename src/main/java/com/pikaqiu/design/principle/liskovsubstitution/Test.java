package com.pikaqiu.design.principle.liskovsubstitution;

/**
 * 里氏替换原则
 * 设计时避免继承泛滥，父子类行为不一致。
 * 对继承形成约束
 */
public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }
    public static void main(String[] args) {
        Square square = new Square();
//        square.setLength(10);
//        resize(square);
    }


}
