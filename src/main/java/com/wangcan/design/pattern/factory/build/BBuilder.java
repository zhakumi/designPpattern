package com.wangcan.design.pattern.factory.build;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:38
 * A 建造者 负责初始化组件
 */
public class BBuilder extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("B a");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B b");
    }

    @Override
    public void buildPartC() {
        product.setPartC("B c");
    }
}
