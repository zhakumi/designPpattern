package com.wangcan.design.pattern.decorator;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:37
 */
public class XmlRead implements IRead {

    @Override
    public void read() {
        System.out.println("xml reading");
    }
}
