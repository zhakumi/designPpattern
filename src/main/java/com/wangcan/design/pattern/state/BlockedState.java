package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:42
 */
public class BlockedState extends AbstractThreadState {

    public BlockedState() {
        stateName = "block";
        print();
    }

    public void resume(ThreadContext context) {
        System.out.println("invoke block");
        if ("block".equals(stateName)) {
            context.setState(new RunnableState());
        } else {
            System.out.println("状态不对");
        }
    }
}