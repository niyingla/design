package com.pikaqiu.design.pattern.behavioral.ruleexecute;

/**
 * <p> AbstractRule </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2021/7/27 9:39
 */
// 规则模板
public abstract class AbstractRule implements BaseRule {

  protected <T> T convert(RuleDto dto) {
    return (T) dto;
  }

  @Override
  public boolean execute(RuleDto dto) {
    return executeRule(convert(dto));
  }

  protected <T> boolean executeRule(T t) {
    return true;
  }
}
