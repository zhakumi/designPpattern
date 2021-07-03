package com.wangcan.design.pattern.factory.build;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:39
 */
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
