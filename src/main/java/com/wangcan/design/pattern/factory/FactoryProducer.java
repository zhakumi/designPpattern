package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 10:49 工厂生产者
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "jdbc":
                return new JdbcFactory();
            default:
                return null;
        }
    }
}
