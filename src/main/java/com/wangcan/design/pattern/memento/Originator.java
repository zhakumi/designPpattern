package com.wangcan.design.pattern.memento;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 9:25
 * //发起人
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
