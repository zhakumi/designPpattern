package com.wangcan.design.pattern.observe;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:16
 * 邮件观察者
 */
public class EmailSendObserve implements IMessageSendObserve {

    @Override
    public void send(String message) {
        System.out.println("email");
    }
}
