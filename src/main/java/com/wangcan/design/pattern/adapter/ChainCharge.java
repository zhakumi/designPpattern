package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:47
 */
public class ChainCharge implements ICharge {

    @Override
    public void charge() {
        System.out.println("chain charge");
    }
}
