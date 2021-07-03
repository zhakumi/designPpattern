package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 10:16
 * 普通工厂
 */
public class JdbcFactory  {

    public IJdbc getClient(String jdbcType) {
        switch (jdbcType) {
            case "mysql":
                return new MysqlClient();
            case "oracle":
                return new OracleClient();
            default:
                return null;
        }
    }

    /**
     * 通过工厂获取对应 jdbc client 执行查询方法
     *
     * @param args
     */
    public static void main(String[] args) {
        JdbcFactory factory = new JdbcFactory();
        IJdbc jdbcClient = factory.getClient("mysql");
        IJdbc oracle = factory.getClient("oracle");
        jdbcClient.query();
        oracle.query();
    }
}
