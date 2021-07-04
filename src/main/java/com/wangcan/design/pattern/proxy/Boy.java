package com.wangcan.design.pattern.proxy;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:15
 */
public class Boy implements IPlay {

    @Override
    public void play() {
        System.out.println("boy play");
    }
}
