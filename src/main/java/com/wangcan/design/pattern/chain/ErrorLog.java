package com.wangcan.design.pattern.chain;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 9:17
 */
public class ErrorLog extends AbstractLog {

    public ErrorLog() {
        this.level = 2;
    }

    @Override
    protected void write(String message) {
        System.out.println("error" + message);
    }
}
