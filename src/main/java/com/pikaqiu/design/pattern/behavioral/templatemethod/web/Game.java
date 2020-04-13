package com.pikaqiu.design.pattern.behavioral.templatemethod.web;

/**
 * @program: design_pattern
 * @description: 假设这是一个游戏模板
 * @author: xiaoye
 * @create: 2020-04-13 11:41
 **/
public abstract class Game {
  abstract void initialize();
  abstract void startPlay();
  abstract void endPlay();
  public void start(){
    System.out.println("-游戏开始");
  }
  public void end(){
    System.out.println("-游戏结束");
  }

  //模板
  public final void play(){
    start();
    //初始化游戏
    initialize();

    //开始游戏
    startPlay();

    //结束游戏
    endPlay();
    end();
  }
}
