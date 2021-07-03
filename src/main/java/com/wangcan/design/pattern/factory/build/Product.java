package com.wangcan.design.pattern.factory.build;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:34 产品 里面有多个组件
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println(this.getPartA());
        System.out.println(this.getPartB());
        System.out.println(this.getPartC());
    }
}
