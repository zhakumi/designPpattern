package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:06 线程状态
 */
public abstract class AbstractThreadState {


    protected String stateName;

    public void print() {
        System.out.println("now:" + stateName);
    }
}
