package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:49 对象适配器模式  组合
 */
public class InternationalChargeObjectAdapter implements ICharge {

    private final ICharge iCharge;

    public InternationalChargeObjectAdapter(ICharge iCharge) {
        this.iCharge = iCharge;
    }

    @Override
    public void charge() {
        System.out.println("change international -> chain");
        iCharge.charge();
    }

    public static void main(String[] args) {
        ICharge charge = new ChainCharge();
        InternationalChargeObjectAdapter adapter = new InternationalChargeObjectAdapter(charge);
        adapter.charge();
    }
}
