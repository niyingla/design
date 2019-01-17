package com.pikaqiu.design.principle.compositionaggregation;

/**
 * @author xiaoye
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
