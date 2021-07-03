package com.wangcan.design.pattern.factory.prototype;

/**
 * @author: wangcan
 * @date: 2021/7/3 17:06
 */
public class Cap implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("帽子赋值陈宫！");
        return super.clone();
    }
}
