package com.wangcan.design.pattern.memento;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 9:24
 * 备忘录
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
