package com.wangcan.design.pattern.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: wangcan
 * @Date: 2021/7/6 9:29
 * 进货
 */
public class BuyStock implements IOrder {

    private Stock buyStock;

    public BuyStock(Stock buyStock) {
        this.buyStock = buyStock;
    }

    @Override
    public void execute() {
        buyStock.buy();
    }
}
