package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:49
 * 对象适配器模式  继承
 */
public class InternationalChargeAdapter extends ChainCharge implements IInternationalCharge {


    @Override
    public void charge() {
        System.out.println("change international -> chain");
        super.chainCharge();
    }

    public static void main(String[] args) {
        InternationalChargeAdapter adapter=new InternationalChargeAdapter();
        adapter.charge();
    }
}
