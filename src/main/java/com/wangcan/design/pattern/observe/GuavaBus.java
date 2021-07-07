package com.wangcan.design.pattern.observe;

import com.google.common.eventbus.EventBus;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 17:17
 */
public class GuavaBus {

    public static final EventBus BUS = new EventBus();

    public static void register(IMessageEvent event) {
        if (event == null) {
            return;
        }
        BUS.register(event);
    }

    public static void question(QuestInfo info) {
        BUS.post(info);
    }
}
