package com.wangcan.design.pattern.factory.abs;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:05
 */
public class SmsSender implements ISender{

    @Override
    public void send() {
        System.out.println("this is sms!");
    }
}
