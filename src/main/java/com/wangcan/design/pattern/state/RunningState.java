package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:06
 */
public class RunningState extends AbstractThreadState {

    public RunningState() {
        stateName = "running";
        print();
    }


    public void suspend(ThreadContext hj) {
        System.out.println("invoke suspend");
        if ("running".equals(stateName)) {
            hj.setState(new BlockedState());
        } else {
            System.out.println("状态不对");
        }
    }
    public void stop(ThreadContext hj) {
        System.out.println("invoke stop");
        if ("running".equals(stateName)) {
            hj.setState(new DeadState());
        } else {
            System.out.println("状态不对");
        }
    }
}
