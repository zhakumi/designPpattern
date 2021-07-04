package com.wangcan.design.pattern.bridge;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:25
 */
public class BridgeTest {

    public static void main(String[] args) {
        IColor color=new Red();

        WalletAbstractBag bag=new WalletAbstractBag(color);
        bag.showName();

    }
}
