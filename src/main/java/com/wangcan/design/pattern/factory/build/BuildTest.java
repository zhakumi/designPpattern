package com.wangcan.design.pattern.factory.build;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:40
 */
public class BuildTest {

    public static void main(String[] args) {
        // 建造者
        AbstractBuilder builder = new ABuilder();
        // 指挥者
        Director director = new Director(builder);
        // 构建产品
        Product product = director.construct();
        product.show();

        AbstractBuilder bBuilder = new BBuilder();
        Director bDirector = new Director(bBuilder);
        Product bProduct = bDirector.construct();
        bProduct.show();
    }
}
