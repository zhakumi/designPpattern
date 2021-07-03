package com.wangcan.design.pattern.factory.abs;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:09
 */
public class SmsProviderFactory implements Provider{

    @Override
    public ISender produce() {
        return new SmsSender();
    }
}
