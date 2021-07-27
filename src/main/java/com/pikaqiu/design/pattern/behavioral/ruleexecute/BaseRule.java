package com.pikaqiu.design.pattern.behavioral.ruleexecute;

/**
 * <p> BaseRule </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2021/7/27 9:39
 */
// 规则抽象
public interface BaseRule {

  public static final String MATCH_ADDRESS_START= "北京";
  public static final String MATCH_NATIONALITY_START= "中国";

  boolean execute(RuleDto dto);
}
