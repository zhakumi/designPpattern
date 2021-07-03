package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 10:16
 * 普通工厂
 */
public class JdbcFactory extends AbstractFactory {

    @Override
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

    /**
     * 抽象工厂 相对于普通工厂 上面多了一层抽象工厂，用来创建工厂
     * @param args
     */
//    public static void main(String[] args) {
//        // 通过抽象工厂 获取jdbc工厂
//        AbstractFactory factory = getFactory("jdbc");
//        // 通过jdbc执行查询
//        IJdbc jdbc = factory.getClient("mysql");
//        jdbc.query();
//    }


}
