package com.wangcan.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangcan
 * @Date: 2021/7/6 9:43
 */
public class Invoke {

    private List<IOrder> orderList = new ArrayList<IOrder>();

    public void add(IOrder order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (IOrder order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
