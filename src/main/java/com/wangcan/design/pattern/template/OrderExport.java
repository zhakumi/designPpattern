package com.wangcan.design.pattern.template;

import java.util.List;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 20:27
 */
public class OrderExport extends AbstractExport{


    @Override
    public void getData() {
        System.out.println("load order data");
    }


    public static void main(String[] args) {
        AbstractExport export=new OrderExport();
        export.export();
    }
}
