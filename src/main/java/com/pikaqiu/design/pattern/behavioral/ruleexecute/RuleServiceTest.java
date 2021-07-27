package com.pikaqiu.design.pattern.behavioral.ruleexecute;

import java.util.Arrays;

/**
 * <p> RuleServiceTest </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2021/7/27 9:37
 */
public class RuleServiceTest {

  @org.junit.Test
  public void execute() {
    //规则执行器
    //优点：比较简单，每个规则可以独立，将规则，数据，执行器拆分出来，调用方比较规整
    //缺点：数据依赖公共传输对象 dto

    //1. 定义规则  init rule
    AgeRule ageRule = new AgeRule();
    NameRule nameRule = new NameRule();
    NationalityRule nationalityRule = new NationalityRule();
    AddressRule addressRule = new AddressRule();
    SubjectRule subjectRule = new SubjectRule();

    //2. 构造需要的数据 create dto
    RuleDto dto = new RuleDto();
    dto.setAge(5);
    dto.setName("张三");
    dto.setAddress("北京");
    dto.setSubject("数学");

    //3. 通过以链式调用构建和执行 rule execute
    boolean ruleResult = RuleService
        .create()
        .and(Arrays.asList(nationalityRule, nameRule, addressRule))
        .or(Arrays.asList(ageRule, subjectRule))
        .execute(dto);
    System.out.println("this student rule execute result :" + ruleResult);
  }
}
