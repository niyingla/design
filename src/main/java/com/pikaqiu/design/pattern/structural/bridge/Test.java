package com.pikaqiu.design.pattern.structural.bridge;

/**
 * 适用
 * 1 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展（例子 银行维度和账号维度）
 * 2 增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
 * 优点
 * 1、抽象和实现的分离。
 * 2、优秀的扩展能力。
 * 3、实现细节对客户透明。
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
