package com.wangcan.design.pattern.nullobject;

/**
 * @Author: wangcan
 * @Date: 2021/7/9 9:32
 */
public class ObjectFactory {

    public static IObject getByName(String name){
        if("a".equals(name)){
            return new AObject();
        }
        return new NullObject();
    }


    public static void main(String[] args) {
        ObjectFactory.getByName("a").show();
        ObjectFactory.getByName("b").show();
    }
}
