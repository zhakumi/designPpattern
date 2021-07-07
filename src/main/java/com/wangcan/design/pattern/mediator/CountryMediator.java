package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:36
 * 抽象中介类
 *
 */
public abstract class CountryMediator {

    public abstract void send(String message, Country country);
}
