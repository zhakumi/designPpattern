package com.wangcan.design.pattern.observe;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:16
 * 微信观察者
 */
public class WchatSendObserve implements IMessageSendObserve {

    @Override
    public void send(String message) {
        System.out.println("wchat");
    }
}
