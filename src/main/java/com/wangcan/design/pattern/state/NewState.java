package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:06
 */
public class NewState extends AbstractThreadState {

    public NewState() {
        stateName = "new";
        print();
    }

    public void start(ThreadContext context) {
        System.out.println("invoke start");
        if ("new".equals(stateName)) {
            context.setState(new RunnableState());
        } else {
            System.out.println("状态不对");
        }
    }
}
