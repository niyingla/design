package com.pikaqiu.design.pattern.behavioral.observer.web;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * <p> UserRegisterEvent </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2020/11/18 11:43
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {

  private String name;

  public UserRegisterEvent(Object source) {
    super(source);
  }

  public UserRegisterEvent(Object source, String name) {
    super(source);
    this.name = name;
  }

}
