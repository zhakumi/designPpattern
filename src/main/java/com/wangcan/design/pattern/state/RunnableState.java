package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:06
 */
public class RunnableState extends AbstractThreadState {

    public RunnableState() {
        stateName = "runnable";
        print();
    }

    public void runnable(ThreadContext context) {
        System.out.println("invoke runnable");
        if ("runnable".equals(stateName)) {
            context.setState(new RunningState());
        } else {
            System.out.println("状态不对");
        }
    }
}
