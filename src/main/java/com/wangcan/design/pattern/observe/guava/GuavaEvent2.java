package com.wangcan.design.pattern.observe.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 17:16
 */
public class GuavaEvent2 implements IMessageEvent {

    @Subscribe
    public void subscribe(QuestInfo info) {
        System.out.println("观察者2" + info.getName() + info.getQuestion());
    }

    @Subscribe
    public void subscribe1(QuestInfo info) {
        System.out.println("观察者3" + info.getName() + info.getQuestion());
    }
}
