package com.wangcan.design.pattern.factory.build;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:34 抽象建造者，定义构建方法
 */
public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
