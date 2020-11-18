package com.pikaqiu.design.pattern.behavioral.observer.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * <p> UserService </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2020/11/18 14:37
 */
@Slf4j
@Service
public class UserService implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public void register(String name) {
    log.info("注册事件");
    UserRegisterEvent userRegisterEvent = new UserRegisterEvent(this, name);
    applicationEventPublisher.publishEvent(userRegisterEvent);
  }
}
