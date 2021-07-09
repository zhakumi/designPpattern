package com.wangcan.design.pattern.observe;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:15
 * 消息发送观察者 接口
 */
public interface IMessageSendObserve {

    void send(String message);
}
