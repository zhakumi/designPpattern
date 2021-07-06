package com.wangcan.design.pattern.command;

import com.sun.corba.se.pept.broker.Broker;

/**
 * @Author: wangcan
 * @Date: 2021/7/6 9:44
 *  直接掉方法-》 sell  改为 先掉execute execute->sell
 */
public class CommandTest {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Invoke invoke = new Invoke();
        invoke.add(buyStockOrder);
        invoke.add(sellStockOrder);

        invoke.placeOrders();
    }
}
