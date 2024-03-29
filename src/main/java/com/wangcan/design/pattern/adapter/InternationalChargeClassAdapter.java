package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:49
 * 类适配器模式  继承
 * 适配器 依赖抽象
 *
 */
public class InternationalChargeClassAdapter extends ChainCharge implements ICharge {


    @Override
    public void charge() {
        System.out.println("change international -> chain");
        super.charge();
    }

    public static void main(String[] args) {
        InternationalChargeClassAdapter adapter=new InternationalChargeClassAdapter();
        adapter.charge();
    }
}
