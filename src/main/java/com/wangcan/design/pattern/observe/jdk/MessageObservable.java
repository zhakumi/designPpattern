package com.wangcan.design.pattern.observe.jdk;

import java.util.Observable;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:35
 * 主题
 */
public class MessageObservable extends Observable {
    private String message;

    public String getMessage() {
        return message;
    }
    public void setNews(String message) {
        this.message = message;
        setChanged();  // 必须调用这个方法来通知Observer状态发生了改变
        notifyObservers("you");
    }

    public static void main(String[] args) {
        MessageObservable subject = new MessageObservable();
        EmailSendObserver observer1 = new EmailSendObserver();
        WechatSendObserve observer2 = new WechatSendObserve();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setNews("error");
    }
}
