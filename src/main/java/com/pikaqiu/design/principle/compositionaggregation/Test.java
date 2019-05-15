package com.pikaqiu.design.principle.compositionaggregation;

/**
 * 合成复用原则
 * 尽量使用对象的组合和聚合而不是继承达成复用
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
