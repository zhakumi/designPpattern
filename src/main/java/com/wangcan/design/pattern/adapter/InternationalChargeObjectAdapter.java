package com.wangcan.design.pattern.adapter;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:49 对象适配器模式  组合
 */
public class InternationalChargeObjectAdapter implements ICharge {

    private ICharge iChinaCharge;

    public InternationalChargeObjectAdapter(ICharge iChinaCharge) {
        this.iChinaCharge = iChinaCharge;
    }

    @Override
    public void charge() {
        System.out.println("change international -> chain");
        iChinaCharge.charge();
    }

    public static void main(String[] args) {
        ICharge charge = new ChainCharge();
        InternationalChargeObjectAdapter adapter = new InternationalChargeObjectAdapter(charge);
        adapter.charge();
    }
}
