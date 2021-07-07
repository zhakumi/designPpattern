package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:38
 */
public class China extends Country {


    public China(WTOMediator wtoMediator) {
        super(wtoMediator);
    }

    @Override
    public void show(String message) {
        System.out.println("china show" + message);
    }

    @Override
    public void send(String message, Country country) {
        wtoMediator.send(message, country);
    }
}
