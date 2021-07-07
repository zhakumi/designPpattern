package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:38
 *  国家持有wto 中介类 利用中介类发送消息
 */
public abstract class Country {

     WTOMediator wtoMediator;

    public Country(WTOMediator wtoMediator) {
        this.wtoMediator = wtoMediator;
    }

    abstract void show(String message);

    abstract void send(String message,Country country);
}
