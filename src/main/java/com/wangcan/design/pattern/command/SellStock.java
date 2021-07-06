package com.wangcan.design.pattern.command;

/**
 * @Author: wangcan
 * @Date: 2021/7/6 9:29
 * 出库
 */
public class SellStock implements IOrder {

    private Stock sellStock;

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
