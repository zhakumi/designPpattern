package com.wangcan.design.pattern.factory.abs;

import com.sun.tracing.ProviderFactory;
import com.wangcan.design.pattern.factory.IJdbc;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:13
 */
public class AbstractFactoryTest {
    /**
     * 抽象工厂 相对于普通工厂 上面多了一层抽象工厂，用来创建工厂
     * @param args
     */
    public static void main(String[] args) {
        Provider provider = new EmailProviderFactory();
        ISender sender = provider.produce();
        sender.send();

        Provider smsProvider = new SmsProviderFactory();
        ISender sms = smsProvider.produce();
        sms.send();
    }
}
