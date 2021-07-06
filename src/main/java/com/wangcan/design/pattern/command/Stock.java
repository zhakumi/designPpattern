package com.wangcan.design.pattern.command;

/**
 * @Author: wangcan
 * @Date: 2021/7/6 9:30
 * 库存方法
 */
public class Stock {

   private String name;
   private int quantity=10;

    public void buy(){
        System.out.println("buy"+name+quantity);
    }
    public void sell(){
        System.out.println("sell"+name+quantity);
    }

}
