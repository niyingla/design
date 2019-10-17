package com.pikaqiu.design.pattern.structural.decorator.inte;

/**
 * @program: design_pattern
 * @description: 被装饰类
 * @author: xiaoye
 * @create: 2019-10-17 16:08
 **/
public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Shape: Rectangle");
  }
}