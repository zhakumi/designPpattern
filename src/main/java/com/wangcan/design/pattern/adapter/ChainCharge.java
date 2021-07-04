package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:47
 */
public class ChainCharge implements IChinaCharge {

    @Override
    public void chainCharge() {
        System.out.println("chain charge");
    }
}
