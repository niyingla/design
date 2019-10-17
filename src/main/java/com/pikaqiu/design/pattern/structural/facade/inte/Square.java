package com.pikaqiu.design.pattern.structural.facade.inte;

import com.pikaqiu.design.pattern.structural.decorator.inte.Shape;

/**
 * @program: design_pattern
 * @description: 门面内使用的类
 * @author: xiaoye
 * @create: 2019-10-17 16:44
 **/
public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("Square::draw()");
  }
}