package com.wangcan.design.pattern.decorator;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:38 带缓存读取装饰器
 */
public class CacheReadDecorator implements IRead {

    private final IRead read;

    public CacheReadDecorator(IRead read) {
        this.read = read;
    }

    @Override
    public void read() {
        read.read();
    }
}
