package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 10:37
 */
public abstract class AbstractFactory {

    /**
     * 获取工厂
     *
     * @param type
     * @return
     */
    public abstract IJdbc getClient(String type);
}
