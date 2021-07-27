package com.pikaqiu.design.pattern.behavioral.ruleexecute;

/**
 * <p> NationalityRule </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2021/7/27 9:39
 */
// 具体规则- 例子2
public class NationalityRule extends AbstractRule {

  @Override
  protected <T> T convert(RuleDto dto) {
    NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
    if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
      nationalityRuleDto.setNationality(MATCH_NATIONALITY_START);
    }
    return (T) nationalityRuleDto;
  }


  @Override
  protected <T> boolean executeRule(T t) {
    System.out.println("NationalityRule invoke!");
    NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
    if (nationalityRuleDto.getNationality().startsWith(MATCH_NATIONALITY_START)) {
      return true;
    }
    return false;
  }
}
