package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:42
 */
public class DeadState extends AbstractThreadState {

    public DeadState() {
        stateName = "dead";
        print();
    }
}