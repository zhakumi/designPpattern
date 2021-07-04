package com.wangcan.design.pattern.bridge;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:21
 * 抽象类 定义组合关系
 *  主体直接依赖 抽象
 */
public abstract class AbstractBag {

    IColor color;

    public AbstractBag(IColor color) {
        this.color = color;
    }

    public abstract void showName();
}
