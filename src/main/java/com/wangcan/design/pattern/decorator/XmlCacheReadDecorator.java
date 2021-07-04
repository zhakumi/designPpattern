package com.wangcan.design.pattern.decorator;

import static com.sun.corba.se.impl.util.RepositoryId.cache;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:38 带缓存读取装饰器
 */
public class XmlCacheReadDecorator extends CacheReadDecorator {

    public XmlCacheReadDecorator(IRead read) {
        super(read);
    }

    @Override
    public void read() {
        super.read();
        cache();
    }

    private void cache() {
        System.out.println("cache");
    }
}
