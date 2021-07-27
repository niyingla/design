package com.pikaqiu.design.pattern.behavioral.ruleexecute;

/**
 * <p> AddressRule </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2021/7/27 9:40
 */
// 具体规则- 例子1
public class AddressRule extends AbstractRule {

  @Override
  public boolean execute(RuleDto dto) {
    System.out.println("AddressRule invoke!");
    if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
      return true;
    }
    return false;
  }
}

