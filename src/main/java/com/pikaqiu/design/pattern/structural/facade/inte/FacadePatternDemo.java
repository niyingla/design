package com.pikaqiu.design.pattern.structural.facade.inte;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-10-17 16:45
 **/
public class FacadePatternDemo {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}