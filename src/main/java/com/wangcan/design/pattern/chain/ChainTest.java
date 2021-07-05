package com.wangcan.design.pattern.chain;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 9:21
 */
public class ChainTest {

    public static void main(String[] args) {

        AbstractLog error = new ErrorLog();
        AbstractLog info = new InfoLog();
        error.setNextLog(info);

        error.logMessage(1, "This is an information.");
    }
}
