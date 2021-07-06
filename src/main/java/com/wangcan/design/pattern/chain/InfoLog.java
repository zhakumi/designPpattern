package com.wangcan.design.pattern.chain;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 9:17
 */
public class InfoLog extends AbstractLog {

    public InfoLog() {
        this.level = 1;
    }

    @Override
    protected void write(String message) {
        System.out.println("info"+message);
    }
}
