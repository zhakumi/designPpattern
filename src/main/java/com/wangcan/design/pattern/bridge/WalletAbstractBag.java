package com.wangcan.design.pattern.bridge;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:22 挎包
 */
public class WalletAbstractBag extends AbstractBag {

    public WalletAbstractBag(IColor color) {
        super(color);
    }

    @Override
    public void showName() {
        System.out.println(color.color() + " walle bag");
    }
}
