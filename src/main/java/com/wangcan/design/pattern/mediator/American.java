package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:38
 */
public class American extends Country {

    public American(WTOMediator wtoMediator) {
        super(wtoMediator);
    }
    @Override
    public void show(String message) {
        System.out.println("american show" + message);
    }

    @Override
    void send(String message,Country country) {
        wtoMediator.send(message,country);
    }
}
