package com.pikaqiu.design.principle.compositionaggregation;

/**
 * @author xiaoye
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
