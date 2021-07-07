package com.wangcan.design.pattern.observe;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 17:16
 */
public class GuavaEvent implements IMessageEvent {

    @Subscribe
    public void subscribe(QuestInfo info) {
        System.out.println("观察者1" + info.getName() + info.getQuestion());
    }

    public static void main(String[] args) {
        GuavaEvent event = new GuavaEvent();
        GuavaEvent2 event2 = new GuavaEvent2();
        GuavaBus.register(event);
        GuavaBus.register(event2);
        QuestInfo info = new QuestInfo();
        info.setName("zhangsan");
        info.setQuestion("吃了吗");
        GuavaBus.question(info);
    }
}
